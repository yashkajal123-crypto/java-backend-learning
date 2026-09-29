public class TYPECASTING {
    
    public static void main(String[] args) {
        
        // ex -1 

            // type conversion -- means we do implicit type conversion ( store smaller value into larger -->> here , byte into int data type variable )
            byte p = 124 ;
            int q = 13  ;

            q = p ;  // implicit conversion of byte into int here 
            System.out.println( q ) ;


            // type casting -- means we do explicit type conversion ( store larger value into smaller -->> here , int into byte data type variable )
            // syntax used is of type casting here 
            // MODULUS OPERATOR USED to perform type casting [ when a has value >> byte's range ]  ------ imp. 

            byte b = 123 ; 
            // int a = 12 ; 
            // int a = 256 ; 
            int a = 257;

            b = (byte)a ; 
            System.out.println( b ) ;

            // inputs in above -->>
            /* 
                a = 12 -> runs fine 
                a = 256 -> return 0 [ as 256 % 256 == 0 ] 
                a = 257 -> return 1 [ as 257 % 256 == 1 [ a remainder ] ]
            */

        // ex - 2
        
            float f = 42.23f ;
            int w = ( int )f ;

            // type casting is done [ convert the float value into int explicitly -->> returns w = 42 in this case ]
            System.out.println( w ) ;



        // ex - 3

            // int x = 12 ;     // returns 12 as this value is in byte's range 
            int x = 258 ;      // returns 2 in terminal as [ modulus operator returns 2 as remainder in this case ]

            // byte by = x ;  // cannot do that [ storinh int into byte need type casting syntax ]
            // so , SYNTAX MUST BE ...........
            byte by = (byte) x ; 

            System.out.println( by ) ;

        // ex - 4

            // type promotion .... 

            byte t = 10 ;
            byte v = 30 ;

            int result = t*v ;

            System.out.print( result ); 

    }
}
