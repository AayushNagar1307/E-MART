# E-MART
It is a E-commerce application,  where user can purchase Electronic gadgets from this application. It is a Full stack application using java.


Project Set-Up:-
================

1. Create the Project
Open NetBeans IDE.

Go to File → New Project → Java → Java Application.

Name your project, e.g., E_MartApp.

Click Finish.

2. Organize Project Structure
Typical folder structure:

E_MartApp/
├── src/
│   ├── model/         (Java classes for Product, User, Orders, etc.)
│   ├── view/          (GUI forms or Swing windows)
│   └── controller/    (Logic to manage flow between view and model)
└── database/          (Database setup files or connection helpers)

3. Design the GUI (Frontend)
Use Swing GUI Builder (in NetBeans) or manually design with JFrame, JPanel, etc.

Create forms for:

Login/Register

Product Listing

Add to Cart

Checkout

Admin Panel (optional)

4. Database Integration
Use MySQL or SQLite.

Tables needed:

users (id, name, email, password, role)

products (id, name, description, price, stock)

cart (id, user_id, product_id, quantity)

orders (id, user_id, total_price, order_date)

Connect using JDBC format

5. Write Backend Logic
Validate login.

Fetch product list from DB.

Add to cart logic.

Order processing.

Stock management.


Working of the project :-
============================


1. User Registration/Login

New users can register and store their details in the users table.

On login, user credentials are checked and role is identified (admin/customer).

2.  Product Browsing

After login, the user sees available products pulled from the products table.

3.  Cart and Checkout

Users can add products to a cart.

When checking out, the order is placed, stock is updated, and data is stored in the orders table.

4.  Admin Functions (Optional)

Admin can add/edit/delete products.

Admin can view all orders and manage inventory.

