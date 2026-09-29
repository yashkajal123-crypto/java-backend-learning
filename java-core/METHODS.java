class computer{
    public void playMusic(){
        System.out.println( "music playing") ;
    }

    public String GetMeApen( int cost ){

        if( cost >= 10 ){
            return "pen" ;
        }
        return "nothing" ;
        
    }
};




// type of COMPILE-TIME POLYMORPHISM .............
// study, METHOD OVERLOADING HERE .......
   /*   Rules for Method Overloading -->>
        1. Same method name
        2. Different parameter list:
            Different number of parameters
            Different data types
            Different order of data types

        Invalid Overloading -->>>
            Changing only the return type -->> [ like  int add() ;   and   double add();  ] -->> is not method overloading.........
            This causes a compile-time error:
    */
class calculator{

    // instance variable .....stored in heap memory 
    int num = 10 ;

    // a,b,c passed in add method are actually local variables of that add method -> stores in add's stack memory 
    public int add( int a , int b , int c ){
        System.out.println( num ) ;       
        return a + b + c ;
    }

    public int add( int a , int b ) {
        return a + b ;
    }

    public double add( double a , int b ) {
        return a + b ; 
    }

};


public class METHODS {
    
    public static void main(String[] args) {
    
        // exercise 1-> 
            // int data = 19 ; 
            // System.out.println(data) ;  // local variable of main function -> stored in stack memory 


        // exercise 2 -> 
            // computer obj = new computer() ;
            // obj.playMusic(); 

            // String str = obj.GetMeApen( 40 ) ;
            // System.out.print( str ) ; 
            

        // exercise 3 ->
            // calculator object = new calculator() ; // object : here is a reference variable to object created [ new calculator() ]
            // // this object created is stored in heap memory actually .....................[important]

            // int result1 =  object.add( 11 , 14 ) ;  //result1 - > is a local variable of main function -> stores in stack memory
            // //  and [ result2 , result3 are likewise of result1 here  ]
            // System.out.println( result1 ) ;

            // int result2 =  object.add( 11 , 14 , 54 ) ;
            // System.out.println( result2 ) ;

            // int result3 =  object.add( 11 , 14 ) ;
            // System.out.println( result3 ) ;


        // exercise 4 -> 

            // here we do create two objects on class calculator that stores in heap memory and having reference address stores 
            // in different [referene variables like -> object1 and object2 ] on stack memory 

            // so , changes in instance variable of one object and print that shows objects created stores separately on heap memory
            //  and thier variables can be accessed independently of each other 

            
            calculator object1 = new calculator() ;
            calculator object2 = new calculator() ;

            System.out.println( object1.num ) ;
            System.out.println( object2.num ) ;

            object2.num = 20 ;

            System.out.println( object1.num ) ;
            System.out.println( object2.num ) ;

    }
}
