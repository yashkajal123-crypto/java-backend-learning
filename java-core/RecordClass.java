// A record (finalized in Java 16) is a special, restricted kind of class designed to model immutable data carriers concisely. Declaring a record automatically 
// generates the constructor, accessor methods, equals(), hashCode(), and toString() — based on the components listed in the record header.

// Record = concise class for storing immutable data.........  
//  record  cannot extend any other class ..........
// record can implements any interface ...........



// way 1 -> class implementation  when  having  final data that is used directy !! 
    // final class Alien{

    //     public String name ; 
    //     public int id ;

    //     public String getName() {
    //         return name;
    //     }

    //     public void setName(String name) {
    //         this.name = name;
    //     }

    //     public int getId() {
    //         return id;
    //     }

    //     public void setId(int id) {
    //         this.id = id;
    //     }

    //     public Alien(String name, int id) {
    //         this.name = name;
    //         this.id = id;
    //     }
        
    //     public String toString() {
    //         return "Alien [name=" + name + ", id=" + id + "]";
    //     } 

    // }



// way 2 -> RECORD CLASS IMPLEMENTATION 

    record Alien( String name , int id ){

        // variable must be declared in header only not inside of record 
            // int age ;         // error  
            

        // to define explicit constructor to create a object in main mehtod [bad practice btw ->record is not used for such implementation in java]
            public Alien(){
                this( " ", 20) ;
            }


        // this constructor is called => ---- CANONICAL CONSTRUCTOR ----  in record -> as it is already defined when record implemented 
            // we use it here explicitly for override constructor and exceptioN handling in code 

            // public Alien( String name , int id ) {

            //     if( id == 0 ) throw new IllegalArgumentException( " it cannot be zero : ") ;
            //     this.id = id ; 
            //     this.name = name ; 

            // }

            // alternate syntax of ABOVE aononical constructor is -> COMPACT CANONICAL CONSTRUCTOR ............
            public Alien {

                if( id == 0 ) throw new IllegalArgumentException( " it cannot be zero : ") ;
                
            }


        // method can be created inside record[ concise class ]
        public void sound( ){
            System.out.println("peeeee..............");
        }

    }


public class RecordClass {
    
    public static void main(String[] args) {

        // object creation 
            Alien A1 = new Alien( "yash", 12) ; 
            Alien A2 = new Alien( "harsh", 43 ) ;

            // Alien A2 = new Alien( "harsh", 0 ) ;  // gives error and throws exception statement 


        
        // syntax for class implementation !! ->>>>>>>>>>> getters and setters are needed to access the instance variables and methods !!  
            // A1.setId(59 );
            // System.out.println( A1.getId() );

            // System.out.println( A2.getName());



        // record implementation  !! ->>>>>>>>>>>>>>>.... NO GETTERS AND SETTERS IS NEEDED TO ACCESS INSTANCE VARIBIALES UNLIKE in classes !! 
            System.out.println(A1);
            A1.sound();
            System.out.println(A2);


        // illustration of expicit constructor define in record !! 
            Alien A3 = new Alien() ;  // error: the constructor Alien here is undefined -> solve ,, explicitly created constructor in record !! 
           System.out.println(A3);


    }
}
