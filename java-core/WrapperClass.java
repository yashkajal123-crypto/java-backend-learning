// topic is WRAPPER CLASS -> defination => => 
    // A wrapper class is a class that "wraps" a primitive data type into an object. 
    // Every primitive type in Java (int, char, double, etc.) has a corresponding class in 
    // java.lang (Integer, Character, Double, etc.) that lets that value be treated as an object

    
public class WrapperClass {
    
    public static void main(String[] args) {
        
        // ex -1 => =>  
            // here Integer is a wrapper class in [ java.lang package ] -->> that is by defauled present in each code of java !!!
            int num = 2 ; 
            Integer num1 = num ;    // auto-boxing
            
            int num2 = num1 ;       // auto -unboxing 
            System.out.println(num2);



        // ex -2 => =>
            String str = "12" ; // here we have this integer stores as String format 
            // System.out.println( str * 12 ); // error : because we cannot do calculation on string directly !!  
        
            int num3 = Integer.parseInt(str) ; // using wrapper class -> method we can convert string's value into integer value 
            System.out.println( num3 * 12 ); // no error : now str value is converted to integer and can do calculations now !! 



    }
}
