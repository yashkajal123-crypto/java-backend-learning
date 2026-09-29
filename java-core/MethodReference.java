// A method reference is a shorthand syntax (introduced in Java 8, using ::) for referring to an existing method or constructor and using it directly 
// wherever a functional interface is expected — instead of writing a full lambda expression that just calls that method.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Student{

    private String name ; 
    private int age ;

    public Student() {
        
    }


    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}



public class MethodReference {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList( "yash" , "aniket" , "arun"  ) ; 

        // example 1 => 

            // way 1 => using the lambda expression for variables passed in method of stream created on list class here !! 

                // List<String> Unames = names.stream()
                //                     .map( str -> str.toUpperCase())
                //                     .toList() ;   // this syntax copy the mapped stream to original list !! 

                // System.out.println(Unames);

            // way 2 => using the method reference here !! 

                List<String> Unames = names.stream()
                                        .map( String :: toUpperCase)    // method reference method 
                                        .toList() ;   // this syntax copy the mapped stream to original list !! 

                System.out.println(Unames);
          


        // EXAMPLE 2 =>
            
            // way 1 -> 
            // names.forEach(i -> System.out.println(i) );    

            // or 

            // way 2 -> 
            names.forEach( System.out :: println);


        // example 3 => constructor reference usecase ...........

            List<Student> Students  = new  ArrayList<>() ; 

            // way 1 -> uisng loop 

                for( String name : names ){

                    Students.add(new Student( name ) ) ; 

                }

                
                System.out.println(Students);


            // way 2 -> using streams with lambda expresssions 

                Students = names.stream()
                            .map( name -> new Student( name ) ) 
                            .toList() ; 

                System.out.println(Students);


            // way 3 => constructor reference [ shortcut for way 2 ]

                Students = names.stream()
                            .map(Student :: new )
                            .toList() ; 

                System.out.println(Students);


    }
}
