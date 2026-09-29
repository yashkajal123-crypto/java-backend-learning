// topic is SETS  in java ...........

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

// treeset is used to print the elements in sorted order 
// hashset prints the elements in any order 
// set has only unique elements in it 


public class collections_2{
    
    public static void main(String[] args) {
        
        // Set<Integer> nums = new HashSet<Integer>() ; 
        // Set<Integer> nums = new TreeSet<Integer>() ; 
        Collection<Integer> nums = new TreeSet<Integer>() ; 


        nums.add(9) ; 
        nums.add(8) ; 
        nums.add(3) ; 
        nums.add( 5) ; 
        nums.add(5) ; // set don't  support duplicate values !! 

        // nums.add("4") ; // it gives compile time error as nums only contains values of data type specified using generic here { i.e integer only !! } 


        // to print the elements of set created above 
        Iterator<Integer> values = nums.iterator() ; 

        while( values.hasNext() ){
            System.out.println( values.next() );
        }

      
    }
}
