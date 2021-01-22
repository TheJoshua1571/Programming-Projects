# How to create SQL Database using MySQL for use of this Java Application

In order to create the database and connect successfully with the Java application, you must create a database with the appropriate database name, table name, and column names. In the same folder as this README document, there is a .sql and a .csv file, which will build the database for you. 
(You must have MySQL Workbench installed and configured in order to continue)

*Double click the SQL Script located in the same folder as this README file. (This will create the database, table and columns.
*Refresh your schemas.
*Expand the new "company" database, expand Tables, and right click on the "employees table"
*Click on Table Data Import Wizard
*When prompted for the File Path for the data itself, Browse and select the .csv file located in the same folder as this README file. 
*Once this is done, the database will be created and the tbale filled with the correct information for this application to work.

# How to ensure Java is using the correct path to the MySQL database. 

Another key aspect of the connection between this Java app and the SQL Database in the background, is that the connection itself must be pointing towards the correct path. If you are expiriencing connection issues to the database, follow  these steps below in order to troubleshoot it.

*Open MySQL Workbemch and look for the Hostname and Port. (default configured for this app is localhost:3306)
*If your Hostname and Port are different than this, open the Employee.java file, and edit line 20 of this Java code file.
*Edit only the portion between the //******/.
*Now you have selected the correct path to the MySQL Database and the application will work properly.
*