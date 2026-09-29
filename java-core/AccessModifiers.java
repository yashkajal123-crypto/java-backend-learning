import others.AA ; 

// defination 
    // Access modifiers are keywords that set the visibility (accessibility) of classes, methods, constructors,
    //  and variables to other classes. Java has four levels: public, protected, default (no keyword), and private.
public class AccessModifiers {
    public static void main(String[] args) {
        
        // when access the class from other package[ others ] *** 
        AA obj = new AA() ;
        System.out.println(obj.marks);
        obj.show(); 

        
        // when access the class from the same package ** 
        BB obj1 = new BB() ; 
        System.out.println(obj1.marks);
        obj1.show() ;

    }
}
