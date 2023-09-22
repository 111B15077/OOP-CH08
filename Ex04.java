class Cddd {
    String name;
    double height;
    double weight;
}
public class Ex04 {
    public static void main(String[] args) {
        Cddd student = new Cddd();

        student.name = "Sandy";
        student.height = 165.5; 
        student.weight = 58.2; 

        double heightInMeters = student.height / 100.0; 
        double bmi = student.weight / (heightInMeters * heightInMeters);

        System.out.println("學生姓名: " + student.name);
        System.out.println("身高 (公分): " + student.height);
        System.out.println("體重 (公斤): " + student.weight);
        System.out.println("BMI值: " + bmi);
    }
}