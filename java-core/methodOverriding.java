// topic -> method overriding -> a run-time polymorphism .....
    // Method overriding is when a subclass provides its own implementation of a method that is already defined in its superclass, 
    // using the same method signature (same name, same parameter list, and a compatible return type).


    
// illustration 1 ............
    class A{

        public void show(){
            System.out.println("in A show");
        }

        public void config(){
            System.out.println("in A config");
        }

    };

    // method overriding : 
    // class B INHERIT  ALL FEATURES OF PARENT CLASS A , except i want new defination / implemetation of method show() in B 
    // // OVERRIDING THE METHOD OF PARENT CLASS IN CHILD CLASS **************** [imp.]
    class B extends A{

        @override   // catches the mistakes at compile time ****
        public void show(){
            System.out.println("in B show");
        }

    };



// illustration 2 .............

    // parent class 
    class Calc{

        public int add( int a , int b ) {
            return a + b ;
        }

    };


    // child class : add() function -> -> self behaviour [ not the inherited one ] => " method overriding "
    // unlike method overloading , here paramenter passed type and no. of parameter passed is same in parent and child methods => but change in thier BEHAVIOUR ****
    // compile-time polymorphism => method overloading 
    // run-time polymorphism => method overriding 
    class AdvCalc extends Calc{

        public int add( int a , int b ) {
            return a + b + 1 ;
        }

    };




public class methodOverriding {

  public static void main(String[] args) {
    
    // implematation of illustration 1 ....
        // OBJECT CREATION 
        B obj = new B() ;
        obj.show() ;   // give child's own implementation [ method override ]
        obj.config();  // gives child's inherited implementation from parent class 
      

    // implementation of illustrtaion 2 ......

        // types to create a object when inheritence is applied in code ....
        
            // way 1 -> same class type reference is created 
             // AdvCalc object = new AdvCalc() ;

            // parent or super class reference is created 
            Calc object = new AdvCalc() ; 


        int r1 =  object.add( 4 , 5 ) ; // child's method behavior overrides the parent's method behaviour 
        System.out.println( "overriding result of calling add() method in child class  : " + r1 ); 


  }
}
