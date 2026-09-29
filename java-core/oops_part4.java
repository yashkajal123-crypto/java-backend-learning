// topic -> static keyword members { variables , methods }
// MOST IMPORTANT TOPIC ************* 

class Moblie{

    // instance variables 
    String brand ;
    int price ;

    // static variables / members ->  shared by different objects and classname is used to access them in syntax .....
    static String name ;

    // non - static methods ->  we can use static variable[ name ] in it along with non-static variables[ brand , price ]    *** ( imp. )
        public void show(){
            System.out.println( brand + " : " + price + " : " + name ) ;
        }

    // static methods -> we can use static variables in it , but cannot use the non-static variables[ brand , price ] alongwith   ***( imp.)
        public static void show1(){
            // System.out.println( brand + " : " + price + " : " + name );  // not possible directly ..........
            System.out.println( name ); 
        }

    // explicitly use the non-static variables in static methods [ by passing the object reference as parameter ] 
        public static void show1( Moblie object ) {

                System.out.println( object.brand + " : " + object.price + " : " + name );  // object referene with non-static variables allows them to used them inside static methods !!
        }


};


public class oops_part4 {
    public static void main(String[] args) {
        
        // objects creation on class mobile .......
            Moblie obj1 = new Moblie() ;
            obj1.brand = "samsung" ;
            obj1.price = 1500 ;
            // obj1.name = "smartphone" ; // can used that too [ but, it is bad practice ]
            Moblie.name = "smartphone" ; // static member access using class name

            Moblie obj2 = new Moblie() ;
            obj2.price = 1500 ;
            obj2.brand = "redmi" ;
            Moblie.name = "smartphone" ;

        // static variable access and modification using class name -->> 

            Moblie.name = "phone" ;  // change in static varibale showed in all objects created on that class [ hence , static variables are class members not object ones *** ]
        

        // SYNTAX to access the non-static methods in which static variables are used with non-static variables 
            System.out.println("access the contents of non-static method[ show ] :: ");
            obj1.show();
            obj2.show(); 

            System.out.println();   
        // SYNTAX to access the static methods in which non-static variables are used explicitly with static variables 
            System.out.println("access the contents of static method[ show1 ] :: ");   
            Moblie.show1( obj1 ); 
            Moblie.show1( obj2 ); 

    
    }
}

// terminal output of this code ----->>>

// 1st -> when static nhi kiya name variable ko ......

    // PS D:\yash hp data\data\JAVA> cd "d:\yash hp data\data\JAVA\" ; if ($?) { javac oops_part4.java } ; if ($?) { java oops_part4 }
    // access the contents of non-static method[ show ] :: 
    // samsung : 1500 : smartphone
    // redmi : 1500 : smartphone

    // access the contents of static method[ show1 ] :: 
    // samsung : 1500 : smartphone
    // redmi : 1500 : smartphone



//2nd -> when static kar diya name variable ko .......

    // PS D:\yash hp data\data\JAVA> cd "d:\yash hp data\data\JAVA\" ; if ($?) { javac oops_part4.java } ; if ($?) { java oops_part4 }
    // access the contents of non-static method[ show ] :: 
    // samsung : 1500 : phone
    // redmi : 1500 : phone

    // access the contents of static method[ show1 ] :: 
    // samsung : 1500 : phone
    // redmi : 1500 : phone
  
