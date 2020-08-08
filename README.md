# library_management__system

JDBC,JAVA,SWITCH CASE STATEMENT , CONSOLE BASED OPERATION




Core Java Case Study
Subject – Core Java Programming
Library Management SYSTEM

Problem Statement
This menu driven program on LIBRARY MANAGEMENT SYSTEM has book class with data members like book id, book name, book author, quantity etc. Book details are stored in a database. A library user can issue book for few days (at the max 15). User is charged Rs. 5/- per day per book issued. Only the Administrator can add the books in a Book list. User is able to see the book list and according to book id, user will issue books. Amount for issued books is debited from user’s balance of library account.
The primary functionality of this system would be as follows:
•	Login as an Administrator.
o	Add/Remove books to library
o	Get list of books issued by particular user
o	       Get balance amount of particular user
o	      Close (Delete) user account from library system

•	Login as a User.
o	        Issue books from library
o	        Get list of books by particular author
o	        Check available balance in library account

Note that methods should communicate error conditions via user defined exceptions.
Feel free to add your own classes and methods if required.

Use oracle/mysql/postgresql database to store tables of necessary classes.

Make use of layered architecture in your code.


Note=guys...it would be good if you maintain some primary key for tables to identify each record uniquly....for example while creating book table make id as primary key....you can do by using query.....create table book(id int primary key, name char(20), cost double); guys...it would be good if you maintain some primary key for tables to identify each record uniquly....for example while creating book table make id as primary key....you can do by using query.....create table book(id int primary key, name char(20), cost double);
like IServiceAdmin, ServiceAdminImpl and IUserService. UserServiceImpl
IDaoAdmin, DaoAdminImpl and IDaoUser, DaoUserImpl etc...etc...

