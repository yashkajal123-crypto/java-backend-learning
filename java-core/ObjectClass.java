// topic =>  object class [ hashcode , tostring and equals() code !! ]

// by default -> every class extends to object class in java code !! 
class Laptop
{
	String model;
	int price;
    //	String serial;
	
    // self made tostring() implementation [ method override ]

        // tostring() method override here in laptop class which extends object class by default and its tostring() is inherited but gets overriden now !!! [imp.]
        public String toString()
        {
            //		return "Hey";
            return model+ " : "+price;
        }



    // source action -> generates tostring() 

        // @Override
        // public String toString() {
        //     return "Laptop [model=" + model + ", price=" + price + "]";
        // }



    // equals() method override here **** 
    // that is  parameter of data type [ class laptop ] ; means ; that -> is a object of class laptop 
        public boolean equals(Laptop that)
        {
            //		if(this.model.equals(that.model) && this.price==that.price) 
            //			return true;
            //		else
            //			return false;
            // or , 
            return this.model.equals(that.model) && this.price==that.price ;
        }


}
	


public class ObjectClass{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Lenevo Yoga";
    	obj.price=1000;
        
    	Laptop obj2=new Laptop();
    	obj2.model="Lenevo Yoga";    // gives true for override implementation of equals in class laptop 
        // obj2.model="Lenevo Yoga1";   // gives false for override implememation of equals in class laptop 
    	obj2.price=1000;
    	
    	boolean result = obj.equals(obj2);  // actually by default equals gives [ output == false ] here  becoz , 
    	System.out.println(result);

        
        System.out.println(obj); // ------------------->> output ---->> Laptop@7ad041f3
        // println( obj.tostring()) -->> this is actual by default call here to tostring() method of object class !!
        System.out.println(obj.toString()); // ----------->> output --->> Laptop@7ad041f3
  	    
    	
    }
}
 