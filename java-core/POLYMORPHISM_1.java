// topic ->  dynamic method dispach to achieve run-time polymorphism 
    // only possible when inheritence exists in code 
    // this run-time polymorphism is different from method overriding , it shows different behavioor for same method calls 
    // like parent class type refers to object of child class etc ... 

// parent 
class hero{

    public void show(){
        System.out.println("show all hero data :");
    }
};


//child 1 
class ironman extends hero {

    public void show(){
        System.out.println("ironman is here :");
    }
};


// child 2 
class ironman_doomsday extends ironman{

    public void show(){
        System.out.println("i am at doomsday :");
    }
};


// note that -> object created on child class can be refered using reference type of parent class 


 // concept => =>   DYNAMIC METHOD DISPATCH 
public class POLYMORPHISM_1 {

    public static void main(String[] args) {
        
        // 1. calling show method of object on parent class  -> standart syntax ****
        hero object = new hero() ; 
        // hero object =  new ironman() ; // dynamic mehtod dispatch concept !! 
        
        object.show() ;


        // 2. calling same object created on child1 using refrence type of parent class [ valid syntax -> shows polymorphism at runtime ]
        object = new ironman() ; 
        object.show() ;


        // 3. calling same object created on child2 using 
        object = new ironman_doomsday() ;
        object.show() ; 
        
        
        // conclusion -> here same  method calling [ object.show ] behaving different for different objects => run-time polymorphism achieved !!!
        // [ using -> DYNAMIC METHOD DISPATCH  ].................[IMP.]

        // hence , runtime polymorphism is decided [ by type of what object you used ].... and not on what object type you refered [ here parent class in all cases ]
 
        // THIS behavior don't decide at compile time and only shown in runtime => so called runtime polymorphism 

    }
    
}
