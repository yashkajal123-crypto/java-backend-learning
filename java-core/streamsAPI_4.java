// topic is parallel streams and mapToInt ..............
// parallelStream() — creates a Stream that can process elements concurrently across multiple threads (using the common ForkJoinPool) instead of sequentially on one thread.
// mapToInt() — an intermediate stream operation that converts a Stream<T> into an IntStream by applying a function that extracts/converts each element to a primitive int.


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class streamsAPI_4 {
    
    public static void main(String[] args) {
        
        // example 1 => STREAM VS PARALLEL  STREAM !! 

            // int size = 100_00 ; 
            // List<Integer> nums = new ArrayList<>() ; 

            // // to generate random integer values with upper limit as size mentioned !! 
            // Random ran = new Random() ; 

            // for( int i = 0 ; i <= size  ; i++ ) {
            //     nums.add( ran.nextInt() ) ;
            // }

            // int sum1 = nums.stream() 
            //             .map(i -> i*2 ) 
            //             .reduce( 0 , (c,e) -> c  + e ) ;
            
            // // sequential stream 
            // int sum2 = nums.stream() 
            //             .map(i -> i*2 ) 
            //             .mapToInt( i -> i )
            //             .sum() ; 
            // // parallel stream 
            // int sum3 = nums.parallelStream()
            //             .map(i -> i*2 ) 
            //             .mapToInt( i -> i )
            //             .sum() ; 

            // System.out.println( sum1 + " " + sum2 + " " + sum3  ) ;



        // example 2 => ADDING TIMESTAMPS IN BOTH TO SEE WHICH IS FASTER IN EXECUTION HERE !! -> it will take time so wait after run this code 
             
            int size = 100_00 ; 
            List<Integer> nums = new ArrayList<>() ; 
            Random ran = new Random() ; 

            for( int i = 0 ; i <= size  ; i++ ) {
                nums.add( ran.nextInt() ) ;
            }

            // sequential stream WITH TIMESTAMPS 
                long startSeq = System.currentTimeMillis() ; 

                int sum2 = nums.stream() 
                            .map(i -> {
                                try{
                                    Thread.sleep(1);
                                }
                                catch(Exception e ){
                                } 
                                return i*2 ;
                            }) 
                            .mapToInt( i -> i )
                            .sum() ; 

                long endSeq = System.currentTimeMillis() ; 

            // parallel stream WITH TIMESTAMPS 
                long startPara = System.currentTimeMillis() ; 

                int sum3 = nums.parallelStream()
                           .map(i -> {
                                try{
                                    Thread.sleep(1);
                                }
                                catch(Exception e ){
                                } 
                                return i*2 ;
                            }) 
                            .mapToInt( i -> i )
                            .sum() ; 
                            
                long endPara= System.currentTimeMillis() ; 

            System.out.println(  sum2 + " " + sum3  ) ;
            System.out.println("seq : " + ( endSeq - startSeq ));
            System.out.println( "para : "  + ( endPara - startPara ) );

        
    }
}
