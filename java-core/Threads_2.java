// Threads:-
// topic here is -> thread priority and sleep method use case  and need of try and catch blocks in the code here ******* 


// thread creation ..... by extending child class  to class threads !! 

    // class LOOP1 extends Thread{

    //     public void run(){
    //         for( int i = 0 ; i< 40 ; i++ ){
    //             System.out.println("hi");
                
    //             // we make this thread sleeps for 10 ms so that thread2 runs in parallel in scheduler as required !! 
    //             try {
    //                 Thread.sleep(10 );   // throws exception so use the try and catch block here 
    //             } catch (InterruptedException e) {  e.printStackTrace(); } 
                

    //         }
    //     }
    // }

    // class LOOP2 extends Thread{

    //     public void run(){
    //         for( int i = 0 ; i< 40  ; i++ ){
    //             System.out.println("hello");
                
    //             try {
    //                 Thread.sleep(10 );   // throws exception so use the try and catch block here 
    //             } catch (InterruptedException e) {  e.printStackTrace();  }   

    //         }
    //     }
    // }




// thread creation by named class implementing the runnable interface !! 
// actually runnable is a functional interface so that we implement it using anonymous class too with lambda expressions instead of this way of external implementation using classes ** 

    // class LOOP1 implements Runnable{

    //         public void run(){
    //             for( int i = 0 ; i< 10 ; i++ ){
    //                 System.out.println("hi");
                    
    //                 // we make this thread sleeps for 10 ms so that thread2 runs in parallel in scheduler as required !! 
    //                 try {
    //                     Thread.sleep(10 );   // throws exception so use the try and catch block here 
    //                 } catch (InterruptedException e) {  e.printStackTrace(); } 
                    

    //             }
    //         }
    //     }

    //     class LOOP2 implements Runnable{

    //         public void run(){
    //             for( int i = 0 ; i< 10  ; i++ ){
    //                 System.out.println("hello");
                    
    //                 try {
    //                     Thread.sleep(10 );   // throws exception so use the try and catch block here 
    //                 } catch (InterruptedException e) {  e.printStackTrace();  }   

    //             }
    //         }
    //     }





public class Threads_2 {

    public static void main(String[] args) {


        // thread creation ==> way 1 !! [ extend to thread class ]
            
            // LOOP1 object1 = new LOOP1() ; 
            // LOOP2 object2 = new LOOP2() ; 


            // thread priority creation [ to optimise the multithreads execution ]

            // // priority[ set and get ] is the method of Thread class 
            // object2.setPriority( Thread.MAX_PRIORITY );  // by default priority value is set to 5=> normal_prioroty and also the priority range is from [  0 to 9 ]
            // System.out.println(object1.getPriority() );


            // // thread creation execution -> parallel 
            //     object1.start() ; 

            //     // to make gap of execution in thread1 and thread2 -> use method sleep inside try and catch [ exception handling ]
            //     try{
            //         Thread.sleep(2);
            //     }
            //     catch(InterruptedException  e ){ e.printStackTrace(); }

            //     object2.start() ; 



        // thread creation ==> way 2 [ implement the runnable interface using classes ]
        
            // Runnable object1 = new LOOP1() ;  // a object is created on class that implements the runnalbe interface and refrered by variable of type [ runnable interface ]
            // Runnable object2 = new LOOP2() ; 


            // Thread t1 = new Thread( object1 ) ; 
            // Thread t2 = new Thread( object2 ) ; 

            // t1.start() ; 
            // t2.start() ; 



        // thread creation ==>> way 3 [ using anonymmous class and then using lambda expression on anonymous class as runnable is a functional interface and anonymous class hence do one function only *** ]

            Runnable object1 = () ->  {
                
                for( int i = 0 ; i< 10 ; i++ ){

                    System.out.println("hi");
                    try { Thread.sleep(10 );   } catch (InterruptedException e) {  e.printStackTrace(); } 
                }
            
            } ;  


            Runnable object2 =  () ->  {
                
                for( int i = 0 ; i< 10 ; i++ ){

                    System.out.println("hello");
                    try { Thread.sleep(10 );   } catch (InterruptedException e) {  e.printStackTrace(); } 
                }
            
            } ;  

            // note that => creating a lambda expression by modifing the external class that implements functional interface is very easy compared to directly create a lambda expression logic in code *** 

            Thread t1 = new Thread( object1 ) ; 
            Thread t2 = new Thread( object2 ) ; 

            t1.start() ; 
            t2.start() ; 



    }
    
}

