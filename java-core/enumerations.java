// topic is  enum 
    // An enum (short for enumeration) is a special Java type used to define a fixed set of named constants. 
    // Introduced in Java 5, an enum is technically a special kind of class — every enum implicitly extends java.lang.Enum....[imp.]
    //  and each constant is a public static final instance of that enum type.


// enum class -> 
    // we create objects inside this class 
    // we create constructors etc and methods  but can't extends the enum class for inheritence 
enum status {

   running , failed , pending ,  success , // enum class's objects !! or we say named constants ! Enum constants are implicitly public static final. 

}


public class enumerations {

    public static void main(String[] args) {
        
        // ex 1 -> basic usecase of enum class ...

            // status s = status.running ;
            // status s = status.success ; 
            // status s = status.pending ; 

            // System.out.println(s);
            // System.out.println(s.ordinal());


        // ex -2 > array creation of objects of enum class ......... 

            // status[] ss = status.values() ; 
            // // System.out.println(ss);  // get randon value !! 

            // // use the enhanced loop to print all the objects of enum class 
            // for( status s : ss ) {
            //     // System.out.println(s); // jsut print all objects of enum class 
            //     System.out.println(s + " : "  + s.ordinal());  // concatenation using + operator here !! 
            // }


        // ex 3 -> if-else usecase 

            // status s = status.pending ; 

            // if(s == status.running){
            //     System.out.println("all good");
            // }
            // else if( s == status.pending){
            //     System.out.println("please wait");
            // }
            // else if ( s == status.failed){
            //     System.out.println("try again!");
            // }
            // else {
            //     System.out.println("done");
            // }


        // ex 4 -> switch case => Enums can be used safely in switch statements/expressions without needing to qualify the case labels.

            status s = status.pending ; 

            switch (s) {

                case running:
                    System.out.println("all good ");
                    break;
                case pending:
                    System.out.println("");
                    break;

                case failed:
                    System.out.println("try again");
                    break;
            
                default:
                    System.out.println("done");
                    break;


            }


        //ex 5 =

    }

    
}
