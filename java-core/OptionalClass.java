// Optional<T> is a container object introduced in Java 8 (java.util.Optional) that may or may not hold a non-null value. 
// It is designed to represent the presence or absence of a value explicitly, as an alternative to returning null.[resolve the null pointer exception case ]

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("yash" , "sushila" , "gyan" , "muskan" ) ; 

        // 1. handle the null pointer exception without using the optional class and its methods!! 

            String  name = names.stream()
                            .filter(str -> str.contains( "s"))
                            .findFirst()
                            .orElse("not found") ; 

            System.out.println(name);


        // 2. handle the same exception using the optional class syntax !! 

            Optional<String>  name1 = names.stream()
                            .filter(str -> str.contains( "s"))
                            .findFirst() ; 
                          
            System.out.println(name1.orElse("not founded"));


    }
    
}
 