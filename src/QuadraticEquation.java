public class QuadraticEquation {
    private int a, b, c;
    private double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public double getDiscrimenant() {
        delta = (this.getB() * this.getB()) - 4 * this.getA() * this.getC();
        return delta;
    }

    public double getRoot1() {
        return ((-this.getB() + Math.sqrt(this.getDiscrimenant())) / (2 * this.getA()));
    }

    public double getRoot2() {
        return ((-this.getB() - Math.sqrt(this.getDiscrimenant())) / (2 * this.getA()));
    }

    public void display() {
        System.out.println("Your Quadratic Equation: ");
        System.out.println(this.getA() + "x2 + " + this.getB() + "x + " + this.getC() + " = 0");
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -4, 4);
        quadraticEquation.display();
        if (quadraticEquation.getDiscrimenant() >= 0){
            System.out.println("Root1: " + quadraticEquation.getRoot1() + " Root2: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("Equation has no Root.");
        }
    }
}
