class CSphere {
    private int x; // 圓心的x座標
    private int y; // 圓心的y座標
    private int z; // 圓心的z座標
    private int radius; // 圓球的半徑

    // (a) 設定圓心位置的函數
    public void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // (b) 設定球半徑的函數
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // (c) 計算表面積的函數
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // (d) 計算體積的函數
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // (e) 顯示圓心座標的函數
    public void showCenter() {
        System.out.println("圓心座標：(" + x + ", " + y + ", " + z + ")");
    }
}

public class Ex16 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere();

        // (a) 設定圓心位置為(3, 4, 5)
        sphere.setLocation(3, 4, 5);

        // (b) 設定球的半徑為1
        sphere.setRadius(1);

        // (c) 計算並印出表面積
        double surfaceArea = sphere.surfaceArea();
        System.out.println("圓球的表面積： " + surfaceArea);

        // (d) 計算並印出體積
        double vol = sphere.volume();
        System.out.println("圓球的體積： " + vol);

        // (e) 顯示圓心座標
        sphere.showCenter();
    }
}
