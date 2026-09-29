// topic is => interfaces -> it a design [ abstract one => methods are public abastract ] and can be implemented using classes with  ->  ->   implement keyword 
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


// INTERFACE DEFINATION => An interface is a reference type in Java — similar to a class — that defines a contract of behavior
interface father {

    // interface variables : always static and final ...
    int age = 43 ; 
    String location = "Delhi" ;

    // interface methods : always public abstract by default .... 
    void smile() ; 
    void work() ; 

}

// INTERFACE IS ABSTRACT -  by default 
interface man {

    void teaches() ; 

}


// one class implements [ concrete class ] the multiple methods() of multiple interfaces at once 
// if this class don't implement all the methods then it automatically makes as a  ABSTRACT CLASS ****** 
class supergood implements father,man {

    public void smile(){
        System.out.println("he is smiling... ");
    }

    public void work(){
        System.out.println("he is working... ");
    }

    public void teaches(){
        System.out.println("he is a teacher... ");
    }

}


public class INTERFACES {

    public static void main(String[] args) {
        
        // interface 1 [ father ]
            father object ; // object is a reference variable with reference type as interface !!! { imp }
            object = new supergood() ; 
           
            object.smile(); 
            object.work();
            // object.teaches() ;  // not work : beacuse object is a reference to interface father only ********* 

            System.out.println(father.age); // static variables can be used directly using its class name 
            System.out.println(father.location);


        // interface 2 [ man ] implemenatation using object creation on class supergood !!!
            man object1 ; 
            object1 = new supergood() ; 

            object1.teaches(); 

    }
    
    
}

