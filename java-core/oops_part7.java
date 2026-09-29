// topic is -> SUPER() METHOD IMPLEMENATION WITH INHERITENCE APPLIED ......

// In Java, super() is a special method call used inside a subclass constructor to invoke the constructor of its immediate parent class. 

// in java , every class extends to object class ->> means 
// calling super() in constructor of B => INVOKES DEFAULT CONSTRUCTOTR OF A [ immediate parent class of B ] ******** 
// calling super() in constructor of A => INVOKES DEFAULT CONSTRUCTOR OF object class *********** 

// topic => this() -> is a special syntax used to call one constructor from another within the same class. This practice is known as constructor chaining

// this() or super() => only any one of these can be called inside the constructor of any class 


    class A{

        // default constructor 
        public A(){
            super() ;
            System.out.println("in A");
        }

        // parameterised constructor 
        public A(int n ){
            super() ;
            System.out.println("in A int");
        }

    };


    class B extends A{

        public B(){
            super(2 ) ;   // it calls the parameterised constructor of parent class -> for object1 case !! 
            System.out.println("in B") ;
        }

        public B( int n ) {
            super(n) ;          // explicilty called the A's parameterised constructor by passing parameter in super() of child's paramterised constructor 
            System.out.println("in B int ");
        }

    };

    // public class oops_part7 {
        
    //     public static void main(String[] args) {
            
    //         B obj = new B() ;  // a object created hence  B's default constructor is called -> in which super() -> calls the default  constructor of A
    //         System.out.println();
            
    //         B obj1 = new B() ;  // a object created hence  B's default constructor is called -> in which super(5) -> calls the parameterised constructor of A
    //         System.out.println();
            
    //         B obj2 = new B(3) ;  // a object created hence  B's parameter constructor is called -> in which super(n) -> calls the parameterised constructor of A
    //         System.out.println();
            
    //     }
    // }

