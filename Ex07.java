class CTest {
    public void test(int number) {
        if (number == 0) {
            System.out.println("此數為0");
        } else if (number % 2 == 0) {
            System.out.println("此數為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }
}

public class Ex07 {
    public static void main(String[] args) {
        CTest tester = new CTest();

        tester.test(3);
        tester.test(8);
        tester.test(0);
    }
}