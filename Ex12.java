class CWin {
    int width;
    int height;
    String name;

    void setW(int w) {
        width = w;
    }
    void setH(int h) {
        height = h;
    }
    void setName(String s) {
        name = s;
    }

    void setWindows(int w, int h) {
        width = w;
        height = h;
    }

    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }
    
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Ex12 {
    public static void main(String args[]) {
        CWin cw = new CWin();
        //第一題
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();

        //第二題
        cw.setWindows(10, 8);
        cw.show();

        //第三題
        cw.setWindows(15, 12, "New Window");
        cw.show();
    }
}