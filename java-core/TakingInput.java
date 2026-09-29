import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        
        // way 1 => direct input **

            // System.out.println("enter a number : ") ; 
            // int nums = System.in.read() ; // read method takes asc value to string equaivalent imput ***  
            // System.out.println( nums - 48 ); // to get the imteger value as output 


        // taking input in java way 2 => [ bufferReader ].... this method gives exception which is handled by IOEXCEPTION used on main method *** 

            System.out.println("enter a number : ");

            InputStreamReader in = new InputStreamReader(System.in) ;
            BufferedReader bf = new BufferedReader(in) ; // input is string value here 

            String line = bf.readLine() ;           // throws exception here !! 
            int num = Integer.parseInt( line ) ;   // readline returns the asc value of string passed as imput then method used to get the integere equivalent  
            System.out.println(num );

            bf.close(); 

 
        // taking input in java way 3 => best way .... [ Scanner class ]

            System.out.println("\n enter a number : ");

            Scanner sc = new Scanner(System.in) ; 

            int num2 = sc.nextInt() ;  // method used  to get the integer equivalent 
            System.out.println(num2);

            sc.close(); 

    }
}
