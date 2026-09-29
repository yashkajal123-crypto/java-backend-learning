public class Strings {
    
    // note that -> in java , strings are inbuild classes !! 
    public static void main(String[] args) {
        
        // ex -1 -->>  object creation on class String in java .....
            
            // // String name = new String("yash") ;        // syntax 1 -> object in heap 
            // // or , 
            // String name = "yash" ;                       // syntax 2 -> string pool string used 

            // System.out.println("hello " + name); // here we do concatenation in string's object [name] value [ yash changes to hello yash ]****

 
        // ex 2 -->> string constant pool in heap memory  -> reusable string constants ...........

            // String s1 = "arun" ;
            // String s2 = "arun" ;

            // System.out.println( s1 == s2 );  //true here =>>>     == operator checks equality of references in java not value equality ;


        // ex 3 -->> equals() vs == operator in java strings ;

            // String s3 = new String() ;
            // String s4 = new String() ;

            // // checks -> memory addresses of objects 
            // System.out.println( s3 == s4 ); // output -> false  

            // // checks -> actual data stored in object 
            // System.out.println(s3.equals(s4)) ; // output -> true 



        // ex 4 -> difference between concatenation and other object creation ..

            // // different object creation -> here data reffered to marks string in scp first then , change reference to different string in scp memory !! 
            // String data = "marks" ;
            // data = data + " total" ;
            // System.out.println(data); 

            // // concatenation --->>>>> 

            //     // way 1-> + operator 
            //         // eg 1 -> 
            //         String firstname = "aniket" ;
            //         String lastname = "deshwal" ;

            //         String fullname = firstname + lastname ;
            //         System.out.println( fullname ); 

            //         // eg 2 ->
            //         String result = "grade_A" ;
                    
            //         // when string first + acts as concatenation operator to string and add both integer to it without evaluating calculation 
            //         System.out.println( result + 10 + 20 ) ;

            //         // use parenthesis to prioritise calculation 
            //         System.out.println( result + ( 10 + 20 )); 

            //         // when integer first + do evalaute calculation and then adds string to it 
            //         System.out.println( 10 + 20 + result ) ;

            //     // way 2 -> USING concat() method of string class 
            //         String inital = "good" ;
            //         String last = "bye" ;
            //         System.out.println(inital.concat(last));



        // ex 5 ->> StringBuffer -->> to create mutable string [ means whose object data can be modified unlike the strings which are immutable by default ]

            // creation ...
                StringBuffer sb = new StringBuffer("kajal") ;

                System.out.println(sb.capacity()); // returns the default buffer size = 16 bytes + length of sb = 5 here !! 
                System.out.println(sb.length()); // returns only length of string created here 

            // modifications in stringbuffer data using its methods -> 
                // 1. 
                sb.append("hero") ;
                System.out.println(sb);
 
                // 2. convert data of stringbuffer into string explicilty 
                String a1 = sb.toString(); 
                System.out.println(a1);

                // 3. 
                sb.deleteCharAt(3) ;

                // 4. 
                sb.insert(0, "java ") ;

                sb.insert(3 , "j" ) ;



    }
}
