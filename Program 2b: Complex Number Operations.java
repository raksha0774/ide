class ComplexNumber {
    double real;
    double imag;

    // Default constructor
    ComplexNumber() {
        real = 0.0;
        imag = 0.0;
    }

    // Constructor with one argument
    ComplexNumber(double a) {
        real = a;
        imag = 0;
    }

    // Constructor with two arguments
    ComplexNumber(double a, double b) {
        real = a;
        imag = b;
    }

    // Copy constructor
    ComplexNumber(ComplexNumber ob) {
        real = ob.real;
        imag = ob.imag;
    }

    // Method to add two complex numbers
    void add(ComplexNumber c1, ComplexNumber c2) {
        double realSum = c1.real + c2.real;
        double imagSum = c1.imag + c2.imag;
        System.out.println("Sum is " + realSum + "+i" + imagSum);
    }

    // Method to subtract two complex numbers
    void sub(ComplexNumber c1, ComplexNumber c2) {
        double realDiff = c1.real - c2.real;
        double imagDiff = c1.imag - c2.imag;
        System.out.println("Difference is " + realDiff + "-i" + imagDiff);
    }
}

public class ComplexNumberRun {
    public static void main(String args[]) {
        // Creating ComplexNumber objects
        ComplexNumber cn1 = new ComplexNumber(); // Default constructor
        ComplexNumber cn2 = new ComplexNumber(10); // Constructor with one argument
        ComplexNumber cn3 = new ComplexNumber(20, 30); // Constructor with two arguments
        ComplexNumber cn4 = new ComplexNumber(cn3); // Copy constructor

        // Performing addition and subtraction on complex numbers
        cn1.add(cn1, cn4); 
        cn2.sub(cn3, cn2);
    }
}
