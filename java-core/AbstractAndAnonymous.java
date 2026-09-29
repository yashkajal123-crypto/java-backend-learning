// topic is => we use both concepts of abstract class and methods and the anonymous inner class here !!! 


abstract class chota{

    public abstract  void ladoo() ;  // undefined just declared method using absract keyword 

}

// method 1 [ and method 2 is alternative of method 1 { better one *********** }   ]
class bheem extends chota{

    public void ladoo(){
        System.out.println("ladoo khalo guys!! ");
    }

}


public class AbstractAndAnonymous {
    public static void main(String[] args) {
        
        // method -1 => using concrete class creation[ subclass ] on abstract parent class's abstract method()  to implement !!  
            chota object1 = new bheem() ; 
            object1.ladoo(); 


        // method 2 => using anonymous inner class creation to overide the undefined abstract method() of abstract parent class{}... here !! 
            chota object = new chota() {
                 
                public void ladoo(){
                    System.out.println( "ladoo khalo guys inside inner class !! ") ;
                }

            };
            object.ladoo() ; 


    }
    
}
