// topic is -> need of stream api and usecase of foreach method !! 
// Need of Stream API: It makes collection processing shorter, cleaner, and more readable, especially for filtering and transforming large amounts of data.
// forEach(): Used to perform an action on each element of a collection.


// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class streamsAPI_1 {
    public static void main(String[] args) {

        // we don't perform the operations on elements of list here in this implementation so ,,
            // List<Integer> nums = new ArrayList<>() ; 
            // nums.add(54) ;
            // nums.add(54) ;
            // nums.add(54) ;
            // nums.add(54) ;


        // or we use below implemantation in which we do perform operations on elements of the list created  ,
            List<Integer> nums1 = Arrays.asList(1,4,21,64,12,65,12) ; 

            // ex -1 => printing the elements of list created => => => 

            // 1. simple for loop.....
                // for( int i = 0 ; i< nums1.size() ; i ++ ){
                //     System.out.println( nums1.get(i) ); 
                // }

            // 2. enhanced for loop .....
                // for( int n : nums1 ){
                //     System.out.println(n);
                // }


            // 3. forEach() method of list interface ......... usecase later , explaination first -> -> 

                // implementation 1 => 
                    // Consumer<Integer> con = new  Consumer<Integer>() {

                    //     // this is  only method in consumer interface => means consumer is a functional interface !! 
                    //     // accept() method is use to accept value of any type and we can perform any task**** with that value -> ex --> here i print it !! 
                    //     public void accept(Integer n) {
                    //     System.out.println(n);
                    //     }
                        
                    // };
                    // // implement foreach method () that accepts only object created on consumer interface in java !! 
                    // nums1.forEach(con) ; 



                // implemetation 2 => lamda expression ........
                    // Consumer<Integer> con = n->  System.out.println(n);
                    // nums1.forEach(con);

                    // or shortcut of above syntax !! 

                    nums1.forEach( n -> System.out.println(n) ) ;  // we can perform any task not just print here ********remember that 
                    




            // EX - 2 ->  sum of even numbers in above list 
                // int sum = 0 ; 
                // for( int n : nums1 ){
                //     if( n%2 == 0 ){
                //         n *= 2 ; 
                //         sum += n ;
                //     }
                // }
                // System.out.println(sum);
        
    }
}
