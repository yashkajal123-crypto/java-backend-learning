// LVTI, introduced in Java 10, allows the compiler to infer the type of a local variable from its initializer, using the reserved type name var ,, 
// instead of requiring the programmer to write the type explicitly.

import java.util.ArrayList;

// error : var is reserved keyword cannot used for declare class names 
// class var{

// }


public class LVTI {
    
    public static void main(String[] args) {
        
        // what is var ? 

            int a = 10 ; 
            var b = 10 ; 
            System.out.println( a + b );


        // 1.

            int c ;    // any other data type can be cannot be initialised when declared 
            // var d ;   // error bcz var must be initialised 
            var d = 10 ; 
            c = d ; 

            System.out.println( c );
            

        // 2. 
        
            var count = 10;                          // inferred as int
            var name = "Yash";                       // inferred as String
            var list = new ArrayList<String>();      // inferred as ArrayList<String>

            list.add(name + " " + count ) ; 
            System.out.println(list);

        // 3. 

            var message = "Learning LVTI";          // inferred: String
            var number = 42;                        // inferred: int
            var lists = new ArrayList<Integer>();   // inferred: ArrayList<Integer>

            lists.add(number);
            lists.add(100);

            for (var item : list) {                 // inferred: Integer
                System.out.println(message + " -> " + item);
            }


    }
}


/* 
notes on LVTI => => 
    
    var can only be used for:

        # local variables with an initializer
        # enhanced for-loop indices
        # resources in try-with-resources
        # loop variables in traditional for loops


    var cannot be used for:
    
       #  class fields (instance or static)
       #  method parameters
       #  method return types
       #  a variable without an initializer (var x; is illegal)
       #  a variable initialized to null directly (var x = null; is illegal — compiler can't infer a type from null)
       #  array declarations using the var arr[] = ... bracket-after-name form (must use var arr = new int[5];)


*/