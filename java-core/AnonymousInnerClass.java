class animals{

    public void show(){
        System.out.println("in animals show  ");
    }
}

class dog extends animals{
    // method overriding -> runtime polymorphism 
    public void show(){
        System.out.println("in dog show");
    }
}


// note => $ is the symbol used when inner class is saved **


public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        // method 1 -> override using inheritence !! 
            animals object = new dog() ; // upcasting [ safe creation of object ]
            System.out.println("overriden implementation using subclass i.e inheritence ");
            object.show();   // output is : overriden implementation of child class 

        
            System.out.println();
        // method 2 -> we made a new implementation or override the show() of super class without using inheritence but using anonymous inner class 
            animals object1 = new animals(){

                public void show(){
                    System.out.println("in dog show");
                }

            };

            System.out.println("overriden implementation usinh anonymous inner class defination ");
            object1.show();  // output is : new implementation of anonymous inner class method !! S


    }
}
