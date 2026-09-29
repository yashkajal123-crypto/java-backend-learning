public class LOOPS {
    
    public static void main(String[] args) {
        
        //  while loop and nested while loop.............

            // int i = 1 ;
            // while( i<= 5 ) {
            //     System.out.println( "hi " + i ) ; // + is used to concatenate two values 

            //     int j = 1 ;                       // we need different variable to iterate the inner loop 
            //     while ( j <= 4) {
            //         System.out.println( "hello " + j ) ;
            //         j++ ; 
            //     }

            //     i++ ;
            // }
            // System.out.println( "bye " + i) ;



        // do while loops -->> used when you want to print once as must case ,,  before checking condition [true or false ] to iterate further 

            // int i = 2;
            // // int i = 11 ;

            // do{
            //     System.out.println( "hi " + i ) ;
            //     i++ ;
            // } while( i <= 10) ;

            // System.out.println( "bye " ) ;


        // for loop -->> when we know when to initialise , how to iterate [ increment or decrement ] , at what condition to iterate all->>  before hand
        // it is most widely used loop -> with compact syntax ........FOR( INITIALIZATION ; CONDITION CHECK ; INCR / DECR ) ; ............

            // ex 1 - 

                // int i ;
                // for ( i = 1 ; i<= 10 ; i++ ) {
                //     System.out.println( "hello " + i ) ;
                // }

                // System.out.println( "bye " + i  );
    

            // ex 2 - create a time-table    [ of 9 hrs per day ]    using nested for loop 

                // // outer loop for no. of days in a week 
                // // inner loop for iterating the hours which need to set on schedule 

                // // NOTE -> in coding we generally start our counting from zero !!!! 

                // for( int i = 1 ; i <= 7 ; i++ ){

                //     System.out.println( "day " + i ) ;

                //     for( int j = 1 ; j <= 9 ; j++ ) {
                //         System.out.println( "    " + (j+8) + "-" + (j+9)) ;
                //     }   

                // }


            // ex 3 -> we can use for loop's initialization and inc. like normal manner  -> but we must use the for loop syntax clearly the same for [ condition check !!]
                
                //  for loop ==>>  seemed as while loop -->> in this example but for loop's syntax must remain same !! 
                int i = 0 ;

                for( ; i< 10 ; ){
                    System.out.println( "hello " + i ) ;
                    i++ ;
                }


        //  TOPIC -> WHEN TO USE WHICH LOOP { FOR LOOP , WHILE LOOP , DO WHILE LOOP , NESTED LOOPS }

            // For loop:-
            // If you know how many iterations you want to go for loop
            // (intiliazing vaue, condition, increment or decrement)

            // While loop:-
            // When you need to read the file go for while loop, if the number of iterations is not known.

            // - For loop can also be used as a while.
            
            // Do While Loop:-
            // If you condition get false but you want to exceute the code at least once.


    }

}
