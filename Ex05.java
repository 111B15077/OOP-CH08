class CBox{
    int length;
    int width;
    int height;

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public void showData() {
        System.out.println("長: " + length);
        System.out.println("寬: " + width);
        System.out.println("高: " + height);
    }

    public void showAll() {
        System.out.println("長: " + length);
        System.out.println("寬: " + width);
        System.out.println("高: " + height);
        System.out.println("表面積: " + surfaceArea());
        System.out.println("體積: " + volume());
    }
}
public class Ex05 {
    public static void main(String[] args) {
        CBox box = new CBox();

        box.length = 1;
        box.width = 1; 
        box.height = 1; 

        System.out.println("box物件的資料:");
        box.showData();

        System.out.println("\nbox物件的詳細資料:");
        box.showAll();
    }
    
}
