import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally_TryWirhResources {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        // try-finally block code example [ catch is not mandatory with try block here !! ]

            // int num = 0 ;

            // // created object outside of block so that it can be used in fianlly block too 
            // BufferedReader bf = null ; 

            // try{

            //     // way 1 of syntax here 
            //         // InputStreamReader in = new InputStreamReader(System.in) ; 
            //         // bf = new BufferedReader(in) ;
                
            //     // way 2 of syntax here  
            //         bf = new BufferedReader( new InputStreamReader(System.in) ) ; // no need to make refrenence for InputStreamReader object 
                
            //     System.out.println("enter a number: ") ;     
            //     num = Integer.parseInt(bf.readLine()) ; 
            //     System.out.println(num); 

            // }
            // finally{           // this block is used to close the resources used in try block manually 

            //     bf.close() ;
                
            // }



        // try with resources ... no need of finally block => shortcut code !!  => autonmatically closes 
        // this code shortens the same code above !! 

            try( BufferedReader bf = new BufferedReader( new InputStreamReader(System.in) ) ){

                System.out.println("enter a number : ");
                int num = Integer.parseInt(bf.readLine()) ; 
                System.out.println(num);

            }


            
    }
}
