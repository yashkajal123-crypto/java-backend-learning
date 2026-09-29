// topic is sealed class.........
    // A sealed class (finalized in Java 17, using the sealed keyword) restricts which other classes or interfaces are allowed to extend or 
    // implement it. The permitted subtypes must be explicitly listed using a permits clause (or be in the same file/package under certain rules).


// note -> it is just a want it or not want it type of class implementation in java !! 

// class implementation learn .........
    sealed class A extends Thread implements Cloneable permits B, C {

    }

    // sealed class A  permits B, C {

    // }
    

    // final class B extends A {
        
    // }


    non-sealed class B extends A{

    }


    final class C extends A {
        
    }


    class D {
        
    }


// interface implementation learn  ...........
    sealed interface P permits Q {

    }

    non-sealed interface Q extends P {       
        
    }




// proper example that demonstrate the sealed class usecase in java code !! 
    public class SealedClass {
        
        sealed interface Shape permits Circle, Square, Triangle {}

        record Circle(double radius) implements Shape {}
        record Square(double side) implements Shape {}
        record Triangle(double base, double height) implements Shape {}

        static double area(Shape shape) {
            return switch (shape) {
                case Circle c   -> Math.PI * c.radius() * c.radius();
                case Square s   -> s.side() * s.side();
                case Triangle t -> 0.5 * t.base() * t.height();
                // no default needed — compiler knows these are ALL possible subtypes
            };
        }

        public static void main(String[] args) {

            Shape shape = new Circle(5);
            System.out.println("Area: " + area(shape));

        }
    }