// topic is lists in java 

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;


public class collections_1 {
    
    public static void main(String[] args) {
        
        // integer is a generic here and collection is a interface which is implemented using list[ sub type interface => then it's class named ArrayList ]
        // collection don't have indexing so we must use LIST instead of collection [ as arraylsit is a class that implements list interface in real ]

        // Collection nums = new ArrayList() ;
        // Collection<Integer> nums = new ArrayList<Integer>() ;    // indexing not possible 
        List<Integer>  nums = new ArrayList<Integer>() ;            // indexing is possible 
    
        nums.add(9) ; 
        nums.add(8) ; 
        nums.add(3) ; 
        nums.add( 5) ; 
        nums.add(5) ; // list support duplicate values !! 

        // nums.add("4") ; // it gives compile time error as nums only contains values of data type specified using generic here { i.e integer only !! } 


        // way 1 => simple loop 
            // object here is a superclass 
            for( Object n : nums ){

                int num  = (Integer)n ;  // manual conversion or typecasting !! 
                System.out.println(num);

            }

        // way 2 => enhanced loop 
            for( int n : nums ){
            System.out.println(n) ;
            }
        


        // indexing operations on interface LIST used ............

            // System.out.println( nums.get( 3 )); 
            // System.out.println( nums.indexOf(3));    // hence nums is a object and all its values are object but using generic convert to integer data type here 

    }
}
