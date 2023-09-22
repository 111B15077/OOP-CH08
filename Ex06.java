class CCircle {
    double pi = 3.14;
    double radius;

    public void setRadius(double r) {
        this.radius = r;
    }

    public void show_periphery() {
        System.out.println("periphery = " + 2 * pi * radius);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        CCircle cir1 = new CCircle();

        cir1.setRadius(3.0);

        cir1.show_periphery();
    }
}