package com.telusko.jdbclearning;

// steps to developing the jdbc application =>
// step 1.....
import java.sql.* ;

public class LaunchApp1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 2.   load and register the driver from the db vendor used ( here -> mysql )
             // here using forName method -> class is loads only -> static block executes when even no object creation is needed
            // within that static block code to register Driver  provided
             Class.forName( "com.mysql.cj.jdbc.Driver" ) ;


        // 3.  establish the connection
            String url = System.getenv().getOrDefault("DB_URL", "jdbc:mysql://localhost:3306/jdbclearning");
            String user = System.getenv().getOrDefault("DB_USER", "root");
            String password = System.getenv("DB_PASSWORD"); // never hardcode credentials

            // connection is a parent interference type used fot reference the  DriverManager class's method ()
           Connection connect =  DriverManager.getConnection( url , user , password ) ;


        // 4.   creating the statement
            Statement statement = connect.createStatement();


        // 5 and 6 .  execute the query & process the query
            String sql = "insert into studentInfo( id , sname , sage , scity ) values( 1 , 'yash' , 17 , 'Bengaluru' )"  ;

            int rowAffected = statement.executeUpdate(sql) ; // returns the integer value

            if( rowAffected == 0 )
                System.out.print(" unable to update or insert the data ");
            else
                System.out.print("data updated successfully");



        // 7.  close
            statement.close();
            connect.close();

    }
}
