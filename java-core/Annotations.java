// topic is ANNOTATIONS IN JAVA .......... 
    // An annotation in Java is a form of metadata — information about the code — attached to program elements 
    // (classes, methods, fields, parameters, variables, packages) using the @ syntax. Introduced in Java 5, annotations do not directly
    // change program logic; instead, they provide information that tools, the compiler, or the runtime (via reflection) can act upon.

// ILLUSTRATION 1 -> self vali 

    // class building{

    //     public void ThisBuildingIsOurs(){
    //         System.out.println("i am at building method");
    //     }

    // }

    // class home extends building{

    //     @Override            // annotation here !! 
    //     public void ThisBuildingIsOurs(){
    //         System.out.println("i am at home method");
    //     }
        
    // }

    // public class Annotations {
    //     public static void main(String[] args) {
            
    //         building google = new home() ; // upcasting here !! 
    //         google.ThisBuildingIsOurs() ; 

    //     }
    // } 


// ILLUSTRATION 2 - > claude vali 

    import java.lang.annotation.*;
    import java.lang.reflect.*;

    // Step 1: Define a custom annotation
    @Retention(RetentionPolicy.RUNTIME) // must be RUNTIME to read via reflection
    @Target(ElementType.METHOD)
    @interface Testable {
        String author() default "unknown";
    }

    // Step 2: Apply it
    class Calculator {
        @Testable(author = "Priya")
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) { // not annotated
            return a - b;
        }
    }

    // Step 3: Read it via reflection
    public class Annotations {
        public static void main(String[] args) throws Exception {
            for (Method method : Calculator.class.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Testable.class)) {
                    Testable t = method.getAnnotation(Testable.class);
                    System.out.println(method.getName() + " is testable, author: " + t.author());
                }
            }
        }
    }
