import java.util.Scanner;

public class W07_04_aboutCircle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final double PI = 3.1416; // ค่าคงที่ของ pi

        System.out.println("Choice to calculate the area related to a circle");
        System.out.println("1. Circum");
        System.out.println("2. Area");

        System.out.print("please choice : (1 or 2) ");
        int choice = kb.nextInt(); // ใช้ scanner แทน kb

        System.out.print("Enter Radius: ");
        double radius = kb.nextDouble(); // ใช้ nextDouble() แทน nextdoble()

        double result = 0;

        if (choice == 1) {
            // คำนวณเส้นรอบวง
            result = 2 * PI * radius;
            System.out.println("Circum of a circle = " + result);
        } else if (choice == 2) {
            // คำนวณพื้นที่
            result = PI * Math.pow(radius, 2); // Math.pow(radius, 2) คือการยกกำลังสองของรัศมี
            System.out.println("Area of a circle = " + result);
        } else {
            System.out.println("You did not  choose in the correct opition . please choose elther 1or 2");
        }

        scanner.close();
    }
}