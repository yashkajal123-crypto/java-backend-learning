// topic -> static constructors and static block  in java 
// MOST IMPORTANT TOPIC ************* 

class Moblie{

    // instance variables 
    String brand ;
    int price ;
    static String name ;

    // static block -> initialise the static variables 
    static{

        name = "phone" ;
        System.out.println("in static block") ;

    }

    // default constructor -> initialise the instance variables 
    public Moblie(){

        brand = "" ;
        price = 1000 ;
        System.out.println( "in constructor ") ;

    }


    // non-static methods 
    public void show(){
        System.out.println( brand + " : " + price + " : " + name ) ;
    }


};


public class oops_part5 {
    public static void main(String[] args) {
        
        // objects creation on class mobile .......
        
            Moblie obj1 = new Moblie() ;
            obj1.brand = "samsung" ;
            obj1.price = 1500 ;
            // obj1.name = "smartphone" ; // can used that too [ but, it is bad practice using the object name on static variable to access ]
            Moblie.name = "smartphone" ; // static member access using class name [ good practice ] -> static block also called here !! 
        

        // SYNTAX to access the non-static methods in which static variables are used with non-static variables 
            obj1.show();


        // notes -> 
            // case i ==>> by default , first class loads and thus static block with it , then object created in that and constructor is called 
            // case ii ==>> if no object is created -> no constructir is called + here no class is loaded in jvm too -> no static block called 

            // special case ==>> when only class loads [ we need to do that explicitly ] , and so the static block 
            // Class.forName("Moblie" ) ; 
            
    }
}


  
 
