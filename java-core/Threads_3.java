// topic is RACE CONDITION HANDLING IN THREAD CREATION !! 
// A race condition is a concurrency bug that occurs when two or more threads access shared data simultaneously and try to change it at the same time.
//  Because the operating system can switch between threads unpredictably, the final outcome of the program depends entirely on the order and timing of thread execution

// hence conclusion => USING THE MUTTABLE DATA WITH THREADS IS NOT GOOD CHOICE !! 

class counter {

    int count ;

    // public void increment() // gives different output each time called and not total expected count as count is lossed due to race condtion here !! 
    public synchronized void increment() {    // synchronised keyword handles the race condtion 
        count ++ ; 
    }
}



public class Threads_3 {
    
    public static void main(String[] args) throws InterruptedException {
        
        counter c = new counter() ;  // object created on class counter ...... to access its data members in main method !! 
        
        Runnable object1 = () ->  {
            
            // for( int i = 0 ; i< 100 ; < i ++ ) // here works fine for small countn without synchonised the counter method [ increment() ] 
            for( int i = 0 ; i < 10000 ; i++ ) {
                c.increment(); 
            }

        };


        Runnable object2 = () ->  {

            // for( int i = 0 ; i< 100 ; < i ++ ) // here works fine for small count  without synchonised the counter method [ increment() ] 
            for( int i = 0 ; i < 10000 ; i++ ) {
                c.increment(); 
            }

        };


        // thread creation which implements that ANONYMOUS CLASS on runnable interface 
            Thread T1 = new Thread( object1 ) ; 
            Thread T2 = new Thread( object2 ) ; 

            T1.start() ; 
            T2.start() ; 

            // The Thread.join() method is part of the java.lang.Thread class, and its purpose is simple:
            //  it allows one thread to pause its execution until another thread (the one it's "joining") has finished
            T1.join() ; 
            T2.join() ; 


        // after synchonised the method of counter class when print here in main method i.e.  called after total execution of t1 and t2 both 
        // hence print totol count each time same [ race condition is handled here ]
        System.out.println( c.count ); // access instance variable 

    }
}
