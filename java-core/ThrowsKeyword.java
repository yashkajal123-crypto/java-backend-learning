// THROWS IN JAVA => 
    // throws is a keyword used in a method signature to declare that a method might propagate one or more checked exceptions
    //  to its caller instead of handling them internally.



// handling exception using class creation  !! 
    // class handle {

    //     public void show() {

    //         try{
    //             Class.forName("pro") ; // nearest  catch block is used to handle exception 
    //             Class.forName( "ThrowsKeyword" );  // jumps after all catch blocks in code   // if first one runs this one ignores and try block gets ended***** 
    //         }

    //         catch(ClassNotFoundException e ){
    //             System.out.println("not able to find the class : " + e );
    //         }

    //     }
    // }


// or using THROWS KEYWORD ........
class handle{

    public void show()  throws ClassNotFoundException{

        Class.forName("pro") ; // nearest  catch block is used to handle exception 
    
    }
}



public class ThrowsKeyword{
    public static void main(String[] args  )  throws ClassNotFoundException {  // not good practice to use throws to allow JVM itself to handle the exception !! 
        
        
        // way - 1 ->  
        // we can handle the try and catch using class creation ...........[ alternative of code below ]
        handle obj = new handle() ; 
        obj.show() ; 


        // way 2 -> 
        // SAFEST AND MOST USED METHOD => to handle the exceptions !! 
            // try{
            //     Class.forName("pro") ; // nearest  catch block is used to handle exception 
            //     Class.forName( "ThrowsKeyword" );  // jumps after all catch blocks in code 
            // }

            // catch(ClassNotFoundException e ){
            //     System.out.println("not able to find the class : " + e );
            // }



    }
}
