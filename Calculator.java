package oops;

// Encapsulation
public class Calculator {
    // Abstraction
    protected int add(int num1, int num2) {
        return num1+num2;
    }
    // Method Overloading
    protected int add(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    protected int subtract(int num1, int num2) {
        return num1-num2;
    }

    protected int multiply(int num1, int num2) {
        return num1*num2;
    }

    protected int divide(int num1, int num2) {
        if(num2 == 0) return -1;
        else return num1/num2;
    }

    public float getAverage(float marksObtained, float totalSubjects) {
        return  marksObtained / totalSubjects;
    }
    protected float getPercent(float marksObtained, int totalMarks) {
        return (marksObtained / totalMarks) * 100;
    }
    public void terminate() {
        System.out.println("Thanks for using Calculator");
        System.exit(0);
    }
}
