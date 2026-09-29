public class Exceptions {
    public static void main(String[] args) {
        
        // int i = 0 ;      // when exception is got and handled using try and catch 
        int i = 2 ;  //when no exception is got 
        int j = 0 ; 

        int nums[] = new int[5] ;  // indexing start from 0 

        // String str = null  ; 
    
        // exception handling [ try and catch ****** ]
        
        // write risky code iside try block always !!  
        try {
            j = 18 / i ;   // can;t divide by zero exception when i = 0 
            System.out.println(nums[2]); // gives value = 0 as array is created with new keyword here !! 
            // System.out.println(nums[5]);  // out of bound exception 

            // we need to comment above exception case to execute this exception as otherwise [ try exists and overpass all other catch blocks and this exception gets missed to handle ]
            // System.out.println(str.length());
        } 

        catch(ArithmeticException e ) {
            System.out.println("cannot divide by zero... " );
        }

        catch( ArrayIndexOutOfBoundsException e ) {
            System.out.println("stay in your limits..");
        }

        // based on exception hierarchy -> USE THE EXCEPTION CLASS AT THE LAST [ PARENT CLASS *** ] so that above two exception class can work inside catch block 
        catch( Exception e ){
            System.out.println("something went wrong" + e );   // handle null pointer exception got in string case !! 
        }


        System.out.println(j);
        // when i = 0 ; 
        // OUTPUT OF ABOVE => Exception in thread "main" java.lang.ArithmeticException: / by zero ..at Exceptions.main(Exceptions.java:7)

        System.out.println("bye..");
        


    }
}
