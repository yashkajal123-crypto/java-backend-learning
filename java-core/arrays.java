public class arrays {
    
    public static void main(String[] args) {
        
        // ex 1- >>  implement the static 1-d array of fixed size [ used when values to allocate memory are known before-hand ]..........

                // int nums[] = { 3,1,34 } ;
                // int n = 3 ;
                
                // // print the array 
                // for( int i = 0 ; i < n ; i++ ) {
                // System.out.println( nums[i] );
                // }
        


        // ex 2->> implement the dynamic 1-d array [ used when values are added on run-time and cannot be known before-hand ]
                // here we fix the size of array already in syntax ...............{ important }............


                // int nums1[] = new int[4] ; // means , nums1[] is a refrence variable stores address of array[ of int data type ] created dynamically on heap using new keyowrd 
                // // all values in array initialsed to ZERO when array created dynamically \

                // // input values in array manually 
                // nums1[0] = 3 ;
                // nums1[1] = 43 ; 
                // nums1[2] = 34 ;
                // nums1[3] = 75 ;

                // // // way 1 ->> print the array manually 
                // // System.out.println( nums1[0] ) ;
                // // System.out.println( nums1[1] ) ;
                // // System.out.println( nums1[2] ) ;
                // // System.out.println( nums1[3] ) ;

                // // way 2 ->>> using for loop , print the array created dynamically 
                // for( int i = 0 ; i< 4 ; i++ ){
                //     System.out.println( nums1[i] ) ;
                // }
            



        // ex 3 -> 2-d array implementation [ type of multi-dimensional array -> called as ' array of arrays ' in general ] ................

                // // dynamic creation 
                // // we must fixed the size of array before-hand in syntax while creeted dynamically !! 

                // int a[][] = new int[3][4] ;     // here , we create a array of 3 rows ; in each row there is array of size 4 ......

                // // print uninitialised[    all values must be print == 0    ] 2d array created USING NESTED LOOPS  
                // System.out.println("print the uninitialised 2d array : " )  ;
                // for( int i =0 ; i<3 ; i++ ) {

                //     for( int j = 0; j<4 ; j++ ) {

                //         System.out.print( a[i][j] + " " ) ;  // print is used and not println [ to design a 2d array here ]

                //     }
                //     System.out.println() ;  // use that syntax to go to newline ***** 
                // }
                // System.out.println() ;  // to go to next line ....


                // // assign RANDOM values to all places in 2d array and acces using nested loops again 
                // // random values assignimg 
                // for( int i =0 ; i<3 ; i++ ) {

                //     for( int j = 0; j<4 ; j++ ) {

                //         a[i][j] = (int)(Math.random() * 100 ) ; 
                    
                //     }

                // }

                //  print the initialised 2d array -> basic for loop .......
                // System.out.println("print the 2d array using basic loop :");
                // for( int i =0 ; i<3 ; i++ ) {

                //     for( int j = 0; j<4 ; j++ ) {

                //         System.out.print( a[i][j] + " " ) ; 

                //     }
                //     System.out.println() ;  
                // }
                // System.out.println( ) ;

                //  print the initialized 2d array -> advanced for loop ..........
                //     // creating a array of arrays of int  ->> using advanced for loop 
                //     // means : a is array stores arrrays of type ( int n[] ) inside which [ each array stores element  of type int m ] -> then print m for each place ......
                // System.out.println( "print the 2d array using advanced loop : ") ;
                // for( int n[] : a ){

                //     for( int m : n ){

                //         System.out.print( m + " " ) ;

                //     }
                //     System.out.println() ;
                // }


        // ex 4 -> // jagged 2d array and access using enhanced for loop -->>   ............ ( IMPORTANT TOPIC ) ..............
                
                // creation ... here heap memory for array b of size 3 is allocated 
                int b[][] = new int[4][] ; 

                b[0] = new int[4] ;  // for row 1 of array b : array of size 4 is created dynamically on heap memory 
                b[1] = new int[2] ;  // for row 2 of array b : array of size 2 is created dynamically on heap memory 
                b[2] = new int[3] ;  // for row 3 of array b : array of size 3 is created dynamically on heap memory 
                b[3] = new int[1] ;  // for row 4 of array b : array of size 1  is created dynamically on heap memory 

                // assign random values in jagged array 
                for( int i = 0 ; i< b.length ; i++ ) {

                    for( int j = 0 ; j < b[i].length ; j++ ) {

                        b[i][j] = (int)(Math.random() * 100 ) ;

                    }
                    System.out.println() ;

                }

                // print the jagged 2d array -> using basic loop 
                System.out.println( "print array using the basic loop : ") ;

                // b.length -> gives the size of array b
                // b[i].length -> gives the size of element stored in each row of b [ here , element is array of different length -> so returns that !! ]
                 for( int i = 0 ; i< b.length ; i++ ) {

                    for( int j = 0 ; j < b[i].length ; j++ ) {

                       System.out.print( b[i][j] + " " ) ;

                    }
                    System.out.println() ;

                }
                System.out.println() ; 

                // print the jagged 2d array -> using enhanced loop 
                System.out.println( "print array using the enhanced loop : ") ;
                for( int n[] : b ) {

                    for( int m : n ) {

                        System.out.print( m + " " ) ;

                    }
                    System.out.println() ;
                }


    }
}

// note that -> INDEX of array starts from ZERO !!! 