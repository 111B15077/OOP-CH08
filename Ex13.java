class CCircle {
    // (a) 計算圓形面積的多載函數，傳值型態為 double
    double area(double r) {
        return Math.PI * r * r;
    }

    // (b) 計算圓形面積的多載函數，傳回值型態為 float
    float area(float r) {
        return (float)(Math.PI * r * r);
    }

    // (c) 計算圓形面積的多載函數，傳回值型態為 double
    double area(int r) {
        return Math.PI * r * r;
    }
}

public class Ex13 {
    public static void main(String[] args) {
        CCircle circle = new CCircle();

        // (d) 呼叫不同多載的area函數並印出面積
        double result1 = circle.area(2);
        System.out.println("半徑為2的圓形面積: " + result1);

        float result2 = circle.area(2.2f);
        System.out.println("半徑為2.2的圓形面積: " + result2);

        double result3 = circle.area(2.2);
        System.out.println("半徑為2.2的圓形面積: " + result3);
    }
}