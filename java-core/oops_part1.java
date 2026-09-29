
// class creation [ a custom data type to create a object ]
class calculator{

    //properties or variables 
    int a; 

    // behavior or methods / functions in cpp 
    public int add( int n1 , int n2 ){   // public -> is a access determinator of class variables and  methods
        int r = n1 + n2 ;
        return r ;
    }

};


class A{

    // constructor 
    public A(){
        System.out.println("in a constructor");
    }

    // methods 
    public void show(){
        System.out.println("in an show");
    }

};


public class oops_part1 {
    public static void main(String[] args) {

        // illustration 1 -> 
            // local variables 
            int num1 = 3 ;
            int num2 = 4 ;
            // syntax to create a object -------->>>>>>>
            calculator calc = new calculator() ;    // here calculator() is object created dynamically using NEW keyword of data type [ calculator - A CLASS ]
            //  and stored in reference variable named [ calc ] of same data type [ calculator - a class ]

            int result = calc.add( num1 , num2 ) ;
            System.out.println( result );


        // illustration 2 

            new A().show()  ;  // anonymous objects [ means object A is created on heap but don't have an reference in stack memory to read and access it ]
            // means , anonymous objects ONLY CREATED ONCE IT'S DATA CANNOT BE MODIFIED OR ALTERED but can be used once 

            // now , 
            new A().show(); // here ist object is not reused but a new object is created on heap !!! [ i.e constructor called twice --> PROOF *** ]

    }
}
 