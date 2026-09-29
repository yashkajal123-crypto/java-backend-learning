// topic is stream api 
// Stream API: Used to process and transform collections easily using operations like filter(), map(), sort(), collect() etc ... 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamsAPI_2{
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
            
        // Filter + map + reduce ..........
        // stream created can only be used once and not be repeated 
        // but one stream can be used in another stream operation 
         
        // implementation 1 -> 

            Stream<Integer> s1=nums.stream();
            // s1.forEach(n-> System.out.println(n));


            Stream<Integer> s2= s1.filter(n ->n%2==0);
            // s2.forEach(n -> System.out.println(n));


            Stream<Integer> s3= s2.map(n->n*2);
            int result=s3.reduce(0,(c,e)->c+e);
            // s3.forEach(n -> System.out.println(n));
            System.out.println(result);
            
        
            
        // implementation 2 -> gives the same result as of s3 here....  but syntax is much easier !! 
            int result1=nums.stream()
                            .filter(n-> n%2==0)
                            .map(n->n*2)
                            .reduce(0, (c,e)-> c+e);

            System.out.println(result1);
            
    	
    }
}