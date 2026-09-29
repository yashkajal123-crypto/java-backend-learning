// topic is -> INHERITENCE using example of calculator ..........

// superclass / parent / base class 
 class Calc{

    public int addition(int a , int b ){
        return a + b ;
    }

    public int substraction( int a , int b ) {
        return a - b ;
    }

};

// SINGLE level inheritence 
// subclass / child / derived class 
class AdvCalc extends Calc{     // advanced class is inherited from calculator class [ AdvCalc is a child of Calc. ]

    public int multiplication( int a , int b ) {
        return a * b ;
    }

    public int division( int a , int b ) {
        return a / b ;
    }

};

class AdvCalc2 extends Calc{

    public int remainder( int a , int b ){
        return  a % b ; 
    }
}

// multi-level inheritence [ this class is a child of AdvCalc which is child of Calc ==>>> so , it has features of both class , so multi-level inheritence ]
class VeryAdvcalc extends AdvCalc{

    public double power( int a , int b ) {
        return Math.pow( 2 , 4 ) ;      // POW function -> returns the double value so data type must be double 
    }

};


// very important ********** // 
// multiple inheritence means [ 2 parent has 1 child ] is not possible in java ........( imp )= > = > due to problem of ambiguity **** // 


public class oops_part6 {
    public static void main(String[] args) {
        
        AdvCalc object = new AdvCalc() ; 

        AdvCalc2 object1 = new AdvCalc2() ;  // hence , 1 parent class and more than 1 children class of it is possible in java .... ( tree or hierarichal inheritence in java )

        int r1 = object.multiplication( 4 , 5 ) ;
        int r2 = object.addition( 4 , 5 ) ;
        int r3 = object.substraction( 4 , 5 ) ;
        int r4 = object.division( 4 , 5 ) ;

        int r5 = object1.remainder( 5 , 1 ) ; 

        System.out.println( r1 + " " + r2 + " " + r3 + " "  +  r4 );  

        System.out.println( r5 );

    }
}
