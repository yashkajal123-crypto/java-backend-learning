// topic is => map , filter , reduce use and implementation explained in detail here !! 
import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamsAPI_3{
    public static void main(String[] args){   
    	
        // example 1-> 

            // List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
                
            // // 1. working of filter() in streams ............. 
 
            //     // way 1 => using anonymous class implementation -> 
            //         // Predicate<Integer> p= new Predicate<Integer>() {
            //         //     public boolean test(Integer n) {
            //         //         if( n % 2 == 0 )
            //         //         return true ;
            //         //         else  
            //         //             return false ;  
            //         //     }
            //         // };

            //     // way 2 -> using lamda expression -> 
            //         Predicate<Integer> p=  n -> n % 2 == 0 ; 
            //         // or shortcut of this we directly use this expression in filter method no need to store in reference variable first so , 

        
            // // 2. working of map() in streams .................

            //     // way 1 -> using anonymous class implementation -> 
            //         // Function<Integer,Integer> fun = new Function<Integer , Integer>() {

            //         //     public Integer apply(Integer n) {
            //         //     return n*2 ; 
            //         //     }
        
            //         // };

            //     // way 2 -> using lambda expression -> 
            //         Function<Integer,Integer> fun =  n -> n*2 ;
            //         // or shortcut of this we directly use this expression in map method no need to store in reference variable first so , 
        

            // int result=nums.stream()
            //                 .filter(p)            // to demonstrate working above in 2 ways  !! 
            //                 .filter(n -> n % 2 == 0)
            //                 .map(fun)             // to demonstrate working above in 2 ways !! 
            //                 .map(n->n*2)
            //                 .reduce(0, (c,e)-> c+e);
            // System.out.println(result);


        // example 2 -> 


            List<Integer> nums=Arrays.asList(4,5,7,3,2,6); 

            Stream<Integer> Sortedvalues = nums.stream()
                                            .filter(n -> n%2 == 0 ) // only even numbers in list 
                                            .sorted() ; // sort the numbers 

            Sortedvalues.forEach( n -> System.out.println(n) ) ;   // apply foreach on each term of stream one by one ! 


       
    }
}