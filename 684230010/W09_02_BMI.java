import java.util.Scanner;
public class W09_02_BMI  {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter weight(kg):");
        Double weight = kb.nextDouble();

        System.out.println("Enter height (m):");
        Double height = kb.nextDouble();
        double m = height / 100;

        double bmi = weight / (m*m);

        System.out.println("Your BMI is:" + String.format("%.2f", bmi));
        System.out.println("Your body weight level si:");
        if(bmi > 40){
            System.out.println("โรคอ้วน ระดับ 3");
        }else if(bmi >= 35) {
            System.out.println("โรคอ้วน ระดับ 2");
        }else if(bmi>= 30) {
            System.out.println("โรคอ้วน ระดับ 1");
        }else if(bmi >=  25) {
            System.out.println("น้ำหนัก้เกิน");
        }else if(bmi >= 18.5) {
            System.out.println("น้ำหนักปกติ");
        }else{
            System.out.println("น้ำหนักน้อย");
        }
        kb.close();

    }
}