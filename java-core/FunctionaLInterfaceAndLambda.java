
// example 1 == >> 

    // // -> only single abstract METHOD is allowed !! 
    // @FunctionalInterface 
    // interface A{
        
    //     void show(int i ) ; 
    //     // void smile() ;  cannot used inside functional interface but can be used in normal interface 

    // }


    // // class BB implements A{

    // //     public void show(){
    // //         System.out.println("in show");
    // //     }

    // // }



    // public class FunctionaLInterfaceAndLambda {
    //     public static void main(String[] args) {
            
    //         // A object = new BB() ; can be used when inherited class is used 


    //         // object creation using the lambda expression ( -> )   syntax ..........[ most important ]

    //             // A object1 = ( int i ) -> System.out.print("inside the show of lambda expression " +  i ) ;
    //             // or , better syntax for same use [ when single parameter is passed ]..........
    //             A object1 = i -> System.out.print("inside the show of lambda expression " +  i ) ;

    //             object1.show(5);


    //         // inner class representation used to create a object 

    //             A object = new A() {

    //                 public void show( int i ){
    //                     System.out.println();
    //                     System.out.println("in show inside anonymous inner class " + i );
    //                 }

    //             };

    //         object.show(5); 


    //     }
    // }



// exapmle 2 => 

    @FunctionalInterface             // annotation used here !! 
    interface maths{
        int linearAlgebra(int a , int b ) ; 
    }


    class mathematics implements maths{
        public int linearAlgebra( int a , int b ){
            return a + b ; 
        }
    }


    public class FunctionaLInterfaceAndLambda{
        public static void main(String[] args) {
            
            // way 1 -> when class implements the interface 
                maths object1 = new mathematics() ;

                int result1 =  object1.linearAlgebra(4, 8 ) ; 
                System.out.println(result1);


            // way 2 -> abstract method of interface ko inner class banake implement karna anonymously 
                maths object = new maths() {

                    public int linearAlgebra( int i , int j ){
                        return i + j  ; 
                    }
                };

                int result =  object.linearAlgebra(4, 8 ) ;  
                System.out.println(result);


            // note : we do the same work of way 2 : using the lambda expression here !! 
            // way 3 -> beacuse interface is of type functional here ; use the lambda expression to make the code short ************
                maths object2 = ( i , j ) -> i + j ; 
                
                int result2 = object2.linearAlgebra(4 , 8 ) ;
                System.out.println( result2 );

        }
    }
