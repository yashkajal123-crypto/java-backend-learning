// MOST IMP. => TOPIC IS => THROW KEYWORD !! 
// custom exception creation using classes and [ throw ] keyword is used to create instance of that exception inside try block 
// and then catch block handle that exception which passes that class's variable as parameter !!

// defination => 
    // throw is a Java keyword used to explicitly create and hand off an exception object at a specific point in code, interrupting normal execution
    //  and passing control to the nearest matching catch block (or up the call stack if none exists in the current method).


// custom exception creation using child class that extends parent class [ any of exception handling heirarchy classes exists in java ]
class MyException extends Exception{

    public MyException(String string ) {

        super(string) ; //  to update the constructor of parent class !!

    }
}


public class Throw {
    public static void main(String[] args) {
        
        // int i = 0   ;   // behave differently for that case [ solution put the if( j== 0 ) check point above j = 18/i in try block to execute the exception safely !! ]  
        int i = 20 ;  
        int j = 0 ;

        // write risky code iside try block always !!  
        try {
            j = 18 / i ;   // can;t divide by zero exception when i = 0 

            if( j == 0 )
            // throw new ArithmeticException("i don't want to print the zeroes ") ;  // the message here is in constructor !! 

            // comment above to excete this one 
            throw new MyException("i don't want zeroes ") ; 
           
        } 

        // custom exception creation !! => when i can't divide 18 then this block is called else jumps at last of all catch blocks 9 important 
            catch( MyException e ) {

                // System.out.println("cannot divide by zero... " );  // bad message or practice 

                j = 18 / 1 ; 
                System.out.println("that's the default output" + e  );

            }


        // using the throw keyword get your own exception !! 
            catch(ArithmeticException e ) {

                j = 18 / 1 ; 
                System.out.println("that's the default output" + e  );

            }


        // based on exception hierarchy -> USE THE EXCEPTION CLASS AT THE LAST 
        catch( Exception e ){
            System.out.println("something went wrong" + e );   
        }

        System.out.println(j);
        System.out.println("bye..");
        
    }
}
