// topic is => ABSTRACT KEYWORD AND ITS USE CASES 
    // usecase 1 => same class and its methods -> make them abstract 
    // usecase 2 => using inheritence to create a concrete class 

    
// defination of ABSTRACT KEYWORD -->> 
// abstract is a keyword that marks a class or method as incomplete by design. An abstract class cannot be instantiated on its own,
// and an abstract method has no body — it only declares a signature that subclasses must implement.




// notes 
// 1. abstract class may or may not have any or many abstract methods 
// 2. abstract method must be defined inside an abstract class 
// 3. object is created only on concrete class [ a subclass of abstract class with all methods implemented of parent abstract class i.e method overriden ]
// 4. a abstract class => its child can be abstract [ if not ooverride all undefined methods of parent class ]
abstract class car{ 

    public abstract void drive() ;  // method declaration only  => don't know it's implementation => make it abstract then [point1]
    public  abstract void engine() ;     // defined on subclass -> updatedWagonR class/..........

    public  void  PlayMusic(){
        System.out.println("playing...");
    }

}

// this sub class is abstract too : don't override the engine() method of parent class [ super class ] here !! 
abstract class WagonR extends car{

    public void drive(){
        System.out.println("driving...");
    }

}

// this class is CONCRETE CLASS-> bcoz override all undefined methods of super class in this subclass ......
//  -> object is created only on that class [ may be refrened to super class => dynamic method dispatch concept ***** ]
class UpdatedWagonR extends WagonR{

    public void engine(){
        System.out.println("working...");
    }

}


public class AbstractKeyword {

    public static void main(String[] args) {
        
        // car object = new car() ;  // not possible => car is a abstract class
        // car object = new WagonR() ; // not possible => WagonR is a abstract class too 

        // safe object creation [ using upcasting ]
            car object = new UpdatedWagonR() ;   // becaue UpdatedWagonR is a concrete class [ upcasting is done here    [ reference type used is of super class => car ]    ]
            object.PlayMusic();
            object.drive();
            object.engine();


            System.out.println();
        // standart syntax of object creation
            UpdatedWagonR object1 = new UpdatedWagonR() ;  // without upcasting [ object created on class is same as reference type *** .. important ]
            object1.PlayMusic();
            object1.drive();
            object1.engine();

    // NOTE THAT => both above object creation is on concrete class but reference type is different => hence gives exact same output when call 
    // 1 . reference type is superclass [ safety insure here ]
    // 2. refrence type is same subclass as on which object is created [ stantard method to follow ]


    }
};

    
