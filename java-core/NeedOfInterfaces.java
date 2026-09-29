// topic -> need of interfaces .............
    // abstract class computer{

    //     // public void code(){

    //     // }

    //     public abstract void code() ; 
    // }


    // class laptop extends computer{

    //     public void code(){
    //         System.out.println("code , compile and run : ");
    //     }

    // }

    // class Desktop extends computer{

    //     public void code(){
    //         System.out.println("code , compile and run : faster :: " );
    //     }

    // }


    // class Developer{

    //     // public void DevApp( laptop lap )...... // case when  without making computer as abstract class *********** 
    //     public void DevApp( computer lap ) {

    //         lap.code() ; 

    //     }
    // }



    // public class NeedOfInterfaces {
    //     public static void main(String[] args) {
        
    //         // when no abstract class exists -> object creation 
    //             // laptop lap = new laptop() ; 
    //             // Desktop desk = new Desktop() ; 

    //         // when abstract class exists -> and used as refrence type for object creatiion on concrete subclasses which overrides the computer's method as they want !! 
    //             computer lap  = new laptop() ; 
    //             computer desk  = new Desktop() ; 

    //         Developer yash = new Developer() ; 
    //         yash.DevApp( lap ) ;
    //         yash.DevApp(desk);

    //     }
    // }




// topic => importance of interface using above example *********** 
// same code above can be implemented using the interfaces here !!! 
    interface computer{

        void code() ; 

    }

    class laptop implements computer{

        public void code(){
            System.out.println("code , compile and run : ");
        }

    }

    class Desktop implements computer{

        public void code(){
            System.out.println("code , compile and run : faster :: " );
        }

    }

    class Developer{

        // public void DevApp( laptop lap )...... // case when  without making computer as abstract class *********** 
        public void DevApp( computer lap ) {

            lap.code() ; 

        }
    }


    public class NeedOfInterfaces {
        public static void main(String[] args) {
            
            // when no abstract class exists -> object creation 
                // laptop lap = new laptop() ; 
                // Desktop desk = new Desktop() ; 

            // when abstract class exists -> and used as refrence type for object creatiion on concrete subclasses which overrides the computer's method as they want !! 
                computer lap  = new laptop() ; 
                computer desk  = new Desktop() ; 

            Developer yash = new Developer() ; 
            yash.DevApp( lap ) ;
            yash.DevApp(desk);
    
        }
    }
