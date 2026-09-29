// topic =>> ENCAPSULATION HERE .....
class Human{
    // instance variable -> uninitialised and cannot be accessed directly ( data hiding )
    int age ;
    String name ;

    // generate getter and setter using source action shortcut ** 

        // public int getage() {
        //     return age;
        // }
        // public void setage(int age) {
        //     this.age = age;
        // }
        // public String getname() {
        //     return name;
        // }
        // public void setname(String name) {
        //     this.name = name;
        // }


    // write myself ..........
        public

        // to read the value of instance variable age by current object .....
        int getage(){
            return age ;
        }

        // to read the value of instance variable name by current object ....
        String getname(){
            return name ;
        }

        // this-> keyword represents the current object and thus passed parameter in setter can modify the instance variable's value INDIRECTLY !! 
        void setage( int age ){ // local variable passed by value always 
            this.age = age ;
        }

        // compile time polymorpism ==>>  method overloading done here in setage() .............
        void setage( int age , Human obj ){
            Human obj1 = obj ;  // obj1 is another reference variable to current object[ human ]
            obj1.age  = age ; 
        }

        void setname( String name ) {
            this.name = name ; 
        }

};

// note -> 
// to generate the getter and setter -> use source action by right click anywhere on code !! 

public class oops_part2 {
    
    public static void main(String[] args) {
        
        Human obj = new Human() ;  // when object created all its instances initialised to zero value by default **** 

        // local variable creation .....
        // obj.age = 22 ;  
        // obj.name = "yash" ;
        // System.out.println( obj.age + " " + obj.name );
        // cannot do that -> i.e directly accessed the instance variable data.  HOW TO DO?? -> by calling the same class methods ( getters and setter )................(important)



        // way - 1 -> this keyword used in setter specifies current object impicitly .............
        obj.setage(22);
        System.out.println("age after way 1: " + obj.getage());


        // way -2 -> pass the current object 's reference value  , alongwith local variable , and  change it's instance variable values !! 
        obj.setage(30 , obj ); 
        System.out.println("age after way 2 : " + obj.getage());


        obj.setname("yash") ;
        // final stored values got printed inside current object  instance variables** 
        System.out.println( obj.getname() + " : " + obj.getage() );


    }
}
