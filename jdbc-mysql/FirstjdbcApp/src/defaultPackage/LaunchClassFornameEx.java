package defaultPackage;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchClassFornameEx {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, SQLException {

        // ex 1
            // Demo d = new Demo() ; // here when class loads -> static block only once at start loads then the nonstatic code runs !!

//    Class.forName("Demo").newInstance()  ;         // old syntax

        // ex 2
//        Class.forName("Demo") ;
//        DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver() );

        // alternate of ex 2 -> shorthand syntax for the same
            // we do paste the path directly in forName method () ......
            Class.forName("com.mysql.cj.jdbc.Driver") ;


    }
}


class Demo{

    static {
        System.out.println( " static block ");
    }

    // nonstatic block -> self created as when class is created itself
    {
        System.out.println(" instance block -> non static ");
    }
}