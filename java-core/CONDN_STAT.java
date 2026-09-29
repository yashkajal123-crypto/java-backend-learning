public class CONDN_STAT {
    

    public static void main(String[] args) {
        

        // ex 1- if and then if with else ........

            //if-else statements .......
            // int x = 12 ;
            // if( x > 10 && x <= 20 ) { // x: 11 to 20 here 
            //     System.out.println( "valid input , so if works");
            // }
            // else{
            //     System.out.println("not a valid input, so if not works");
            // }


        // ex 2 -  if-else ......

            // int x = 12 ;
            // int y = 2 ;
    
            // // to print the max out of two integers [ x and y ] -> use if-else statements 
            // if( x > y ) {
            //     System.out.println( x ) ;
            //     System.out.println("thank you");
            // }
            // else 
            //     System.out.println( y ) ;
            

        // ex 3 - if-else-if .......

            // int x = 12 ;
            // int y = 2 ;
            // int z =14 ;

            // // to print the max out of three integers [ x , y , z ] -> use if-elseif-else statements .........
            // if( x > y && x > z ) {
            //     System.out.println( x ) ;
            //     System.out.println("thank you");
            // }
            // else if( y > x && y > z ){
            //     System.out.println( y ) ;
            //     System.out.println("thank you so much") ;
            // }
            // else{
            //     System.out.println( z ) ;
            //     System.out.println("got max number at last !") ;
            // }


        // ex 4 - TERNARY OPERATOR 

            // int n = 12 ; 
            // int result = 0 ; // to do -> if n is even update result , if not then too update result 

            // // way 1 -> if-else statement......

            //     // if( n % 2 == 0)
            //     //     result = 10 ; 
            //     // else
            //     //     result = 20 ;

            //     // System.out.println( result ) ;


            // // way 2 -> ternary operator ........[ TO MAKE SYNTAX SMALL ]

            //     // ? MEANS -> check 1st condition 
            //     // : means -> check 2nd condition when 1st one is false 

            //     result = n % 2 == 0 ? 10 : 20 ;
            //     System.out.println( result ); 



        // ex 5 - SWITCH CASE STATEMENT ........
            
            // way -1 

                int n = 10 ;
                
                // if( n == 1) 
                // System.out.println("monday") ;
                // else if( n == 2 )
                // System.out.println("tuesday") ;
                // else if( n == 3 )
                // System.out.println("wednesday") ;
                // else if( n == 4 )
                // System.out.println("thrusday") ;
                // else if( n == 5 )
                // System.out.println("friday") ;
                // else if( n == 6 )
                // System.out.println("saturday") ;
                // else 
                // System.out.println("sunday") ;
                

            // way 2 -> switch statement ....
                // we need to put break in each case inside switch so that after processing that case , we get jump out of switch block 
                // order of cases write in code can be random .... because switch just jump to the case called immediately
                // DEFAULT -> used when input in switch case statemnet don'y match with value of any defined case -> we jump out of block 
            switch ( n ) {
                case 1:
                     System.out.println("monday") ;
                    break;

                case 2:
                    System.out.println("tuesday") ;
                    break;

                case 3:
                     System.out.println("wednesday") ;
                    break;

                case 4:
                     System.out.println("thrusday") ;
                    break;

                case 5:
                     System.out.println("friday") ;
                    break;

                case 6:
                     System.out.println("saturday") ;
                    break;

                case 7:
                     System.out.println("sunday") ;
                    break;

                default:
                    System.out.println("enter a valid number") ; 
                    break;
            }
              
             
    }
}
