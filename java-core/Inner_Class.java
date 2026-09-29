
// outer class can never be static while inner class may or may not be static 
class animal{

    public void show(){
        System.out.println("in animal show");
    }

    class dog{

        public void show(){
            System.out.println("in dog show");
        }

    }

    // static class dog{

    //     public void show(){
    //         System.out.println("in dog show");
    //     }

    // }

}


public class Inner_Class {
    public static void main(String[] args) {

        animal object = new animal() ;  // syntax to create object on class animal with same referenve type on animal 
        object.show(); 

        // this one works only for inner class be non static 
            animal.dog object1 = object.new dog() ;   // syntax to create object on inner class[ non - static ] with super class as refrenc type 
            object1.show(); 

        // this pne works only for inner class be static 
            // animal.dog object1 = new animal.dog() ;     // syntax to create object on inner class [ static ] with super class as refrence type  
            // object1.show(); 
        
        
    }
}
