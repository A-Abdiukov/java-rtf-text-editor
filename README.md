# rtf-text-editor
### A text editor that can modify .rtf files. 

To start using the application, the user should create a new account or log in to an existing account. Log in authentification is handled by the MySQL database. 

After logging in, the user can open one of the existing .rtf files or create a new one. Afterward, the user can modify the file and save it.

Other features include:
- A logging functionality - the application logs errors into log files.
- The application uses stored procedures only.

## How to set up:

1. Create a MySQL instance with username "root" and password "root".
2. Create the database from the "Create-DB-MYSQL.sql" file. 
3. Log in. Username = "admin". Password = "password".

## Credits

- Icons for text editor buttons - > https://commons.wikimedia.org/wiki/Crystal/64/Mimetypes by Everaldo Coelho. GNU Lesser General Public License Version 2.1.
- DatePicker -> https://github.com/LGoodDatePicker/LGoodDatePicker by LGoodDatePicker. MIT License.
- MySQL connector -> https://github.com/mysql/mysql-connector-j by Oracle and/or its affiliates. GNU Lesser General Public License Version 2.1.
