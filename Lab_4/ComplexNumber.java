package Lab_4;

public class ComplexNumber {

    private int real;
    private int imag;

    public ComplexNumber() {
        real = 0;
        imag = 0;
    }

    public ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public double getArgument() {
        double arg = Math.atan2(imag, real);
        return arg;
    }

    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + Math.abs(imag) + "i";
        }
    }

}
