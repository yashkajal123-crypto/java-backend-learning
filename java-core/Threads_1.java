// Threads:-
// Multiple threads run at same time in a code.
// This is known as Multithreading.

// - A thread is a smallest unit to work with. (individual task)
// - They can run parallely.
// - Multiple threads can share resources.


// topic here is -> thread creation with extend the class and using run and start methods********** 



// traditional way => normal obejct creation and execution is sequential here 
    // class LOOP1{

    //     public void show(){
    //         for( int i = 0 ; i< 10 ; i++ ){
    //             System.out.println("hi");
    //         }
    //     }
    // }

    // class LOOP2{

    //     public void show(){
    //         for( int i = 0 ; i< 10 ; i++ ){
    //         System.out.println("hello");
    //         }
    //     }
    // }




// thread creation .....

    class LOOP1 extends Thread{

        public void run(){
            for( int i = 0 ; i< 40 ; i++ ){
                System.out.println("hi");
            }
        }
    }

    class LOOP2 extends Thread{

        public void run(){
            for( int i = 0 ; i< 40  ; i++ ){
            System.out.println("hello");
            } 
        }
    }
    

public class Threads_1 {

    public static void main(String[] args) {

        LOOP1 object = new LOOP1() ; 
        LOOP2 object1 = new LOOP2() ; 

        // normal object execution -> sequentially 
            // object.show() ; 
            // object1.show() ; 

        // thread creation execution -> parallel 
            object.start() ; 
            object1.start() ; 


    }
    
}
