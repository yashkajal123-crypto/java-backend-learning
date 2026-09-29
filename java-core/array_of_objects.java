
class student{

    //properties
    String name ;
    int roll_no ;
    int marks ;
    
};


public class array_of_objects {

    public static void main(String[] args) {
        
        // object 1 
        student s1 = new student() ;
        s1.name = "yash" ;
        s1.roll_no = 215 ;
        s1.marks = 95 ;

        // object 2 
        student s2 = new student() ;
        s2.name = "utkarsh" ;
        s2.roll_no = 155 ;
        s2.marks = 90 ;
        
        // object 3 
        student s3 = new student();
        s3.name = "kuldeep" ;
        s3.roll_no = 210 ;
        s3.marks = 80 ;
        

        // array of objects creation -->>>

        // declaration 
        student students[] = new student[3] ;   // this means : we created a array(object) on heap named student( on class student ) of size 3 : and ,
        // it's first element student[0] is referened by reference variable named students in stack memory and thus can access the whole array continously till array ends !! 

        // input the objects in array as its elements ..........
        students[0] = s1 ; // means students[0] stores reference of object named s1 on heap , and not the s1 itself...
        students[1] = s2 ;
        students[2] = s3 ;

        // print the array of objects using enhanced for loop ....
        // here , we print the data of type student class -> one by one using iterator [n] -> from the students [ till n > students.length automatically ]
        System.out.println("name" + ":" + "marks" + " " ); 
        System.out.println();
        for( student n : students ) {
            System.out.println( n.name + ":"  + n.marks + " ") ;  // + operator used for concatenation here 
            System.out.println() ;
        }
    }
} 
