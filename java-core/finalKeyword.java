// topic is -> final keyword......................


// usecase 2 -> final keyword on class 

    // final class Calc{

    //     public void show(){
    //         System.out.println("in a show ");
    //     }

    //     public void add( int a , int b ){
    //         System.out.println( a + b );
    //     }

    // };

    // // using final keyword on class Calc makes inheritence not possible in subclass AdvCalc **** 
    // // class AdvCalc extends Calc{

    // // };



// usecase 3 -> final keyword on methods 

    class Calc{

        public final void show(){
            System.out.println("in calc's show ");
        }

        public void add( int a , int b ){
            System.out.println( a + b );
        }

    };

    // // using final keyword on method [ show() ]  makes it overriding not possible on subclass AdvCalc **** ...i.e parent's method implementation is final then !!! 
    class AdvCalc extends Calc{

        // public void show(){
        //     System.out.println("in advcalc's show ");
        // }

    };



public class finalKeyword {
    
    public static void main(String[] args) {
        
        // usecase of final keyword => on variables means ; you cannot change the value of that variable 
            // final int num = 8 ;
            // System.out.println(num);

        // usecase of final keyword on class means ; you stops inheritence or that class is not been extends in any subclasses 
            // Calc object = new Calc() ;
            // object.show() ;
            // object.add(8 , 9 );

        // usecase of final keyword on methods means ; you stop METHOD OVERRIDING [ imolementation of parent method is final while inherited to child and object created on child too ]
            AdvCalc object1 = new AdvCalc() ; 
            object1.show() ;  // object creatd on child => implements the show() inherited from parent only ; no overriding possible due to final keyword used !!! 

            
    }
}
