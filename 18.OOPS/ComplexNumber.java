import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        int realPart = (this.real * c.real) - (this.imag * c.imag);
        int imagPart = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(realPart, imagPart);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real and imaginary part of first number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        // Input second complex number
        System.out.print("Enter real and imaginary part of second number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Output
        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        diff.display();

        System.out.print("Product: ");
        prod.display();
        sc.close();
    }
}