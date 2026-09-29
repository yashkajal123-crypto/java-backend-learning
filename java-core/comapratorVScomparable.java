// Comparable = the class says "I know how to compare myself to others." (built into the class)
// Comparator = an outsider says "I'll define the comparison rule myself." (external, pluggable)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// class student implements Comparable<student>  // means class student implements comparable that compares student type of data !! 
class student{

    public 
    int age ; 
    String name ;

    public student(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }


    // public int compareTo(student that ) {


    //     // if( this.age > that.age ) 
    //     //     return 1 ; 
    //     // else 
    //     //     return -1 ; 

    //     // or using ternary operator here 
    //     return this.age > that.age ? 1:-1 ; 


    // } 


}



public class comapratorVScomparable {
    public static void main(final String[] args) {
        


        // ist one ->>> Comparator is a interface and implemented using anonymous class here to make self build logic !! 
            // Comparator<Integer> com = new Comparator<Integer>() {
                
            //     public int compare( Integer i , Integer j ){    // int is not used but wrapper class[ integer ] is used to specify the data type of parameter passed here 

            //         if( i%10 > j%10 )
            //             return 1 ; 
            //         else
            //             return -1 ; 

            //     }

            // };



        // 2nd one =>> comaprator to implement the stud list created and compare the students by age and generics is student class !! imp. 
        // for stings collection.sort => not possible so comparator is used to build that logic by self or externally 

             // 1. using anonymous class................

                // Comparator<student> com = new Comparator<student>() {
                    
                //     public int compare( student i , student j ){  

                //         if( i.age  > j.age   )
                //             return 1 ; 
                //         else
                //             return -1 ; 

                //     }

                // };


            // 2. using lambda expressions as comparator is a functional interface ........... 

                Comparator<student> com = ( final student i , final student j ) ->  i.age > j.age ? 1 : -1 ; 



                

        // example 1 -> usecase of comaparator ..........
            // arraylist created on list interface which is sub-interface of collection<E>
            // List<Integer> nums = new ArrayList<>() ; 

            // // predefined method of collections class => use for sorting elements .........
            //     // nums.add(5) ; 
            //     // nums.add(12) ; 
            //     // nums.add(51) ; 
            //     // nums.add(15) ;  
            //     // nums.add(14) ; 
            
            //     // Collections.sort( nums); 
            //     // System.out.println(nums);

                
            // System.out.println();
            // // self build comparator is build with my logic of sort implementation here ......
            //     nums.add(55) ; 
            //     nums.add(12) ; 
            //     nums.add(51) ; 
            //     nums.add(19) ; 
            //     nums.add(16) ; 
            //     Collections.sort( nums , com ) ;  // logic of com is sort as per unit digit !! 
            //     System.out.println( nums );




        // EXAMPLE 2 usecase of comparable and then comparable vs comparator !! 

            final List<student> stud = new ArrayList<>() ; 

            // add elements in list created of data type [student class ]
            stud.add( new student(13 , "yash" ) ) ;
            stud.add( new student(54 , "mohit" ) ) ; 
            stud.add( new student(24, "arun" ) ) ; 
            stud.add( new student(65 , "sushila" ) ) ;  


            // print the list created using enhanced loop -> stud list me se ek ek karke print kardo element of type student class [ custom data type created by self ]
                for( final student s : stud ){
                System.out.println(s);
                }
                System.out.println();




            // call list that used element of type student class that implement comparable  to sort........ then print the sorted list here !! 

                // Collections.sort( stud ) ;   // not possible in java but it works if class implements comparable 

                // for( final student s : stud ){
                // System.out.println(s);
                // }



            // call comparator to sort........ then print the sorted list here !! 
                
                Collections.sort( stud , com ) ;  // comparator implementation is needed 

                for( final student s : stud ){
                System.out.println(s);
                }
            


    }
}
