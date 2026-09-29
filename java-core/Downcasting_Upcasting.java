// topic is typecasting => UPCASTING AND DOWNCASTING ṇ

// illustration 1 => => => 

    // class Animal {
    //     void eat() { System.out.println("Animal eats"); }
    // }

    // class Dog extends Animal {
    //     void bark() { System.out.println("Dog barks"); }
    // }

    // public class Downcasting_Upcasting{
    //     public static void main(String[] args) {
    //         Animal a = new Dog();      // upcasting -> implicit casting !!
    //         a.eat();                   // OK

    //         Dog d = (Dog) a;           // downcasting -> explicit casting !! 
    //         d.bark();                  // OK

    //         Animal a2 = new Animal();
    //         Dog d2 = (Dog) a2;         // compiles, but throws ClassCastException at runtime
    //     }
    // }


// illustration 2 => => => 

    class A
    {
        public void show1()
        {
            System.out.println("in A show");
        }
    }
        
    class B extends A
    {
        public void show2()
        {
            System.out.println("in show B");
        }
    }


    public class Downcasting_Upcasting{
        public static void main(String[] args) {

            //    	double d=4.5;
            //    	int i=(int)d;
            //    	
            //    	System.out.println(i);
                    
            //    	A obj= new A();
            //    	A obj=(A) new B();   //upcasting
            //    	obj.show1();
            
            A obj=new B(); // upcasting 
            obj.show1();
            
            B obj1=(B)obj; // downcasting 
    	    obj1.show2();

    }
}
