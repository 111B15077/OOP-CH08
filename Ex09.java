class CCalculator {
    int a;
    int b;
    int c;

    public void set_value(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public int add() {
        return a + b + c;
    }

    public int sub() {
        return a - b - c;
    }

    public int mul() {
        return a * b * c;
    }

    public double avg() {
        return (double)(a + b + c) / 3.0;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        CCalculator obj = new CCalculator();

        obj.set_value(25, 3, 7);

        System.out.println("資料成員的值：");
        obj.show();

        System.out.println("三數之和為：" + obj.add());
        System.out.println("a - b - c 為：" + obj.sub());
        System.out.println("三數之乘積為：" + obj.mul());
        System.out.println("三數之均值為：" + obj.avg());
    }
}
