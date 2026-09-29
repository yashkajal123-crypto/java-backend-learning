public class OPERATORS {
    
    public static void main(String[] args) {

        // BINARY OPERATORS ..........

            // // ex 1 - 
            //     int num1 = 12 ;
            //     int num2 = 12 ;

            //     int result1 = num1 + num2 ;
            //     System.out.println( result1 ) ;

            // // ex 2 -
            //     int num3 = 12 ;
            //     int num4 = 12 ;

            //     int result2 = num3 - num4 ;
            //     System.out.println( result2 ) ;

            // // ex 3 - 
            //     int num5 = 12 ;
            //     int num6 = 12 ;

            //     int result3 = num5 * num6 ;
            //     System.out.println( result3 ) ;


            // // ex 4 - 
            //     int num7 = 12 ;
            //     int num8 = 12 ;

            //     // division operator -> returns only quotient value [ that is 1 here ]
            //     int result4 = num7 / num8 ;
            //     System.out.println( result4 ) ;

            //     // modulus operator -> returns only remainder value [ that is 0 here ]
            //     int result5 = num7 % num8 ;
            //     System.out.println( result5 ) ;


        // UNARY OPERATORS ..........

            // // EX 1 - 
            //     int num = 12 ;

            //     // similar syntaxes on num , but not the same -->>> 

            //     // num = num + 1 ;
            //     // num += 1 ; // shortcut for above line 

            //     // num++ ; // post - increment operator on num 
            //     // ++num ; // pre - increment operator on num 
            //     System.out.println( num );


            //     // note that -> pre and post operators behave differenty when do ASSIGNING the value else , both increment the value 

            //     // so , i. -> [ gives 13 as output i.e first increment then print / fetch the value  ]
            //     // int result = ++num ;
            //     // System.out.println( result );

            //     // ii. -> [ gives 12 as output i.e first fetch  and print the value then increment  ]
            //     int result2 = num++ ;
            //     System.out.println( result2 ) ;


        // RELATIONAL and BOOLEAN OPERATORS..........
            
            // EX 1 - WE do compare the x and y variale values using relational operators and stores in boolean variable to get [ true or false ] as output --- IMP. 

                // int x = 6 ; 
                // int y = 6 ; 

                // boolean result = x < y ;
                // System.out.println( result ) ; 

                // boolean result1 = x > y ;
                // System.out.println( result1 ) ; 

                // boolean result2 = x <= y ;
                // System.out.println( result2 ) ; 

                // boolean result3 = x >= y ; 
                // System.out.println( result3 ) ; 

                // boolean result4 = x != y ;    // check for not equal to 
                // System.out.println( result4 ) ; 

                // boolean result5 = x == y ;    // check for equal to 
                // System.out.println( result5 ) ; 


            // EX 2 - on double data type values perform the same operators as on ex 1 ....

                // double  x = 6.6 ; 
                // double  y = 6.6  ; 

                // boolean result = x < y ;
                // System.out.println( result ) ; 

                // boolean result1 = x > y ;
                // System.out.println( result1 ) ; 

                // boolean result2 = x <= y ;
                // System.out.println( result2 ) ; 

                // boolean result3 = x >= y ; 
                // System.out.println( result3 ) ; 

                // boolean result4 = x != y ;    // check for not equal to 
                // System.out.println( result4 ) ; 

                // boolean result5 = x == y ;    // check for equal to 
                // System.out.println( result5 ) ; 



        // LOGICAL OPERATORS and short-circuit operators --> used for checking combined output of two or more than two types of operators ,like [ relational and arithatic operators ] ( defination )

            //  AND operator ( && )            // OR operator ( || )

                /* truth table is ->            /* truth table is  
                    T && T = T                        T || T = T
                    T && F = F                        T || F = T
                    F && T = F                        F || T = T 
                    F && F = F                        F || F = F     */

                // ex 1 - 
                int a = 8 ; 
                int b = 13 ;
                int x = 12 ;
                int y = 15 ;

                // and operator 
                System.out.println( x > y && a < b );   // gives false 
                // or operator 
                System.out.println( x > y || a < b );   // gives true 

                // ex 2 
                int c = 13 ; 
                int d = 14 ; 
                boolean result = c != d ;
                System.out.println( result ) ;  // gives true 


                

                

                





     }
}
