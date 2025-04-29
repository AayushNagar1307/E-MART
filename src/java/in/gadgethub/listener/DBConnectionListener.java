package in.gadgethub.listener;

import in.gadgethub.utility.DBUtil;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBConnectionListener implements ServletContextListener{
    
    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext ctxt = sce.getServletContext();
        String url = ctxt.getInitParameter("url");
        String pass = ctxt.getInitParameter("password");
        String username = ctxt.getInitParameter("username");
        DBUtil.openConnection(url, username, pass);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       DBUtil.closeConnection();
    }
    
}