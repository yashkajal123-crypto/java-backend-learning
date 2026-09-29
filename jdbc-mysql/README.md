# JDBC with MySQL

Step-by-step JDBC workflow: load driver, open connection, create statement, execute, process result, close.

- `LaunchApp1.java` inserts a row into a `studentInfo` table.
- `LaunchClassFornameEx.java` shows how `Class.forName` triggers static blocks and driver registration.

## Setup
1. Download **MySQL Connector/J** from the MySQL site and add the jar to the project classpath (jars are not committed).
2. Create the database and table:
```sql
CREATE DATABASE jdbclearning;
USE jdbclearning;
CREATE TABLE studentInfo (
  id INT PRIMARY KEY,
  sname VARCHAR(50),
  sage INT,
  scity VARCHAR(50)
);
```
3. Provide credentials through environment variables (never hardcode them):
```bash
export DB_USER=root
export DB_PASSWORD=your_password
# optional: export DB_URL=jdbc:mysql://localhost:3306/jdbclearning
```
