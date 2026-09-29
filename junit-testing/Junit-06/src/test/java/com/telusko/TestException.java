package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestException {

    @Test
    void TestSortingArray_Exception() {

        // case 1 -> array is not null .................
//            // make an instance of class whose method needs to be tested
//                SortingArrays array = new SortingArrays() ;
//                int[] unsorted = { 5 , 12, 41 } ;
//                int[]  SortedArr = array.SortingArray( unsorted ) ;
//
//            // print the sorted array after method called
//                for( int elem : SortedArr) {
//                    System.out.print( elem + " " );
//                }
//

        // case 2 -> array is null -> throws null pointer exception and test got failed here
//            // make an instance of class whose method needs to be tested
//                SortingArrays array = new SortingArrays() ;
//                int[] unsorted = null ;
//                int[]  SortedArr = array.SortingArray( unsorted ) ;
//
//            // print the sorted array after method called
//                for( int elem : SortedArr) {
//                    System.out.print( elem + " " );
//                }
//
//                // output is => => java.lang.NullPointerException: Cannot read the array length because "a" is null


        // case 3 -> using try-catch to handle the exception  in assertions in junit5 ...........
//
//            // if test passed -> try block statements got executed only
//            // if test fails -> catch block statements got executed to handle that exception only
//            try {
//                SortingArrays array = new SortingArrays();
////                int[] unsorted = null;       // catch block executes only
//                int[] unsorted = { 11 , 43 , 41 , 64 , 32 } ;   // try block executed only -> but in use case of fail() -> it fails !!
//                int[] SortedArr = array.SortingArray(unsorted);
//
//                for (int elem : SortedArr) {
//                    System.out.print(elem + " ");
//                }
//
//                System.out.println( " \n statements below exception ");
//
//
//                // use case of fail() => means when no exception is generated we explicitly fails the test -> even when try block code runs fine in output !!
//                //                       and if exception is generated -> test case passed -> catch block executes and handle the same !!
//
////                fail() ;     // always called at end of try block => to perform the above said use case !!
//
//            }
//            catch ( NullPointerException e ){
//                System.out.println( "exception generated");
//            }

        // case 4 -> use of assertThrows() method im junit5 ->
                     // to perform th above try-catch exception handling using shorthand code !!

            SortingArrays array = new SortingArrays();
            int[] unsorted = null ; // here -> test passed
//            int[] unsorted = { 31  , 13 , 54,  36 } ;   // test failed

            // this assertion handles exception only and failed when no exception is generated !!!
            assertThrows( NullPointerException.class   , () -> array.SortingArray(unsorted) ) ;

    }


}