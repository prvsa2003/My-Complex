package MyComplex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double imag, double real) {
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "(" + getReal() + "+" + getImag() + "i)";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {

        if ((this.real == real) && (this.imag == imag)) {
            return true;
        } else if ((Math.abs(this.real - real) < 0.00000001) && (Math.abs(this.imag - imag) < 0.00000001)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(MyComplex another) {

        if ((this.real == another.getReal()) && (this.imag == another.getImag())) {
            return true;
        } else if ((Math.abs(this.real - another.getReal()) < 0.00000001) && (Math.abs(this.imag - another.getImag()) < 0.00000001)) {
            return true;
        } else {
            return false;
        }

    }

    public double magnitude() {
        return (double) Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument() {

        return (double) Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex another) {
        MyComplex complex = new MyComplex();
        complex.real = another.real + getReal();
        complex.imag = another.imag + getImag();
        return complex;
    }
    public MyComplex subtract(MyComplex another) {
        MyComplex co = new MyComplex();
        co.real = another.real - getReal();
        co.imag = another.imag - getImag();
        return co;
    }
    public MyComplex addnew(MyComplex another) {

        return new MyComplex(this.real + another.getReal(), this.imag + another.getImag());
    }

    public MyComplex conjugate() {

        return new MyComplex(this.real, -1 * this.imag);
    }

    public MyComplex subtractnew(MyComplex another) {
        return new MyComplex(this.real - another.getReal(), this.imag - another.getImag());
    }

    public MyComplex multiply(MyComplex another) {
        double a, b, c, d;
        a = this.real;
        b = this.imag;
        c = another.getReal();
        d = another.getImag();

        this.real = (double) (a * c - b * d);
        this.imag = (double) (a * d + b * c);

        return this;
    }

    public MyComplex divide(MyComplex another) {
        double a, b, c, d;
        a = this.real;
        b = this.imag;
        c = another.getReal();
        d = another.getImag();

        this.real = (double) (a * c + b * d) / (c * c + d * d);
        this.imag = (double) (b * c - a * d) / (c * c + d * d);

        return this;
    }

}
