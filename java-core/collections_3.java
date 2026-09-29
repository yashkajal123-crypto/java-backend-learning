// topic is  MAPS...........

import java.util.HashMap;
import java.util.Map;


// note -> 
// we have hashtable => it is synchronized 
// we have hashmap => it is unsynchronized 
public class collections_3 {
    
    public static void main(String[] args) {
        
        // here in map [ key is set and value is list ] always ********* imp. analogy to learn 
        // so key must be unique consider last assign value always  and values can be duplicate 

        Map< String , Integer > students = new HashMap<>() ; 


        // insert elements of map [ key-value pair] using the put() method .......... 
        // put is used and not add() reason is -> put allows only unique values and replace the old value to particulr key if already exists 
        students.put( "yash", 77) ; 
        students.put( "arun", 54) ;
        students.put( "aniket", 74) ;
        students.put( "sourabh", 44) ;

        students.put( "yash", 47) ;


        // to print the map .......
        System.out.println( students );

        // to print the value corresponding to any key .........
        System.out.println(students.get( "yash"));


        // to print all the elements of map using for loop...........
        
            // get all the keys first 
            System.out.println(students.keySet() );

            // iterate that keyset and print values corresponding it too USING GET method 
            for ( String key  : students.keySet() ) {
                System.out.println( key  + ":" + students.get( key ));
            }




    }
}

    
