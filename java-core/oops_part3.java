// topic -> CONSTRUCTORS 

class Human{

    //instance variables 
    int age ;
    String name ;

    // default constructor -> used to initialise current object values ....
    public Human(){
        // System.out.println("i am inside the constructor ");   // called once when object is created in main method 
        age = 21 ;
        name = "isha" ;
    }

    // concept of method overloading in constructors
       
        // this keyword represents the current object -> object2 here !!! 
        // parameterised constructor 1 =>>> 
        public Human(int age , String name ){
            this.age = age ;
            this.name = name ; 
        }

        // parameterised constructor 2 =>>
        public Human(String name ){
            this.age = 12;                // need to explicitly initialised the value not passed as parameter here !! -> just like in defalut constructor 
            this.name = name ; 
        }

};



public class oops_part3 {

    public static void main(String[] args) {
        // how to access constructor values -> 

        // default constructor called itself when object1 created on heap 
        Human obj1 = new Human( ) ;
        
        // parameterised constructor 1 takes input in below syntax and initialsed that object2 with those values 
        Human obj2 = new Human( 22 , "yash") ;

        // parameterised constructor 2 takes input in below syntax and initialsed that object3  with those values 
        Human obj3 = new Human(  "yashika") ;


        System.out.println( obj1.name + " : " + obj1.age );

        System.out.println( obj2.name + " : " + obj2.age ); 

        System.out.println( obj3.name + " : " + obj3.age ); 

    }

}
