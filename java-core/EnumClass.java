// topic  => ENUM CLASS 
// enum class cannot be extended [ no inheritence here ]


enum laptop{

    // macbook(1999) , asus(1700) , dell(1600) , msi(1750) ; // enum objects == named constants [ with parameter passed ]
      macbook(1999) , asus(1700) , dell() , msi(1750) ; 

    private int price ; 

    // default constructor
    private laptop(){
        price = 500 ; 
        System.out.println(" in default constructor");
    }

    // Enum constructors are implicitly private — no external instantiation.
    // parameterised constructor -> must to create object with parameter passed above [ access modifier can be private => as accessed by object created inside same class] 
    private laptop( int price ){
        this.price = price ; 
        System.err.println(" in laptop ");
    }


    // getter 
    public int getPrice() {
        return price;
    }

    // setter 
    public void setPrice(int price) {
        this.price = price;
        System.err.println(" in laptop " + this.name() );
    }
    
}

// enum Cannot extend a class; can implement interfaces

public class EnumClass {

    public static void main(String[] args) {
        
        // reference varaible created on any one value of enum object !!  
            // laptop lap = laptop.asus ; 
            // System.out.println( lap + " : " + lap.getPrice() );


        // reference variable created on all objects of enum class using for loop !! 
            for( laptop lap : laptop.values()  ){
            System.out.println( lap + " : " + lap.getPrice() );
            }

    }
    
}
