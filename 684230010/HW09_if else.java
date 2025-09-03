import java.util.Scanner;
import java.time.Year;
  public class HW09_if else {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        // รับค่ารหัสนักศึกษา 9 หลัก
        System.out.print("Enter 9-digit Student ID:");
        int studentID = sc.nextInt();

        // ดึงเลข 2 หลักแรก (ปีที่เข้าเรียน เช่น 68)
        int yearTwoDigits = studentID / 1000000;

        // แปลงเป็น พ.ศ. (เช่น 68 → 2568)
        int yearEnrolled = 2500 + yearTwoDigits;

        // หาปีปัจจุบันจากเครื่อง
        int currentYear = Year.now().getValue() + 543;

        // คำนวณชั้นปี = ปีปัจจุบัน - ปีที่เข้า + 1
        int studentYear = (currentYear - yearEnrolled) + 1;

        // ตรวจสอบแล้วแสดงผลตามเงื่อนไข
        if (studentYear == 1) {
            System.out.println("1(Freshman)");
            }else if (studentYear == 2) {
              System.out.println("2(Sophomore)");
            }else if (studentYear == 3 ) {
              System.out.println("3(Junior)");
            }else if (studentYear == 4 ) {
              System.out.println("4(Senior)");
            }else if ( Scanner > 4 ) {
              System.out.println(studentYear + "(Beyond 4 years)")
            }else {
              System.out.println("Invalid Student year");
            }
            sc.close();
 
      }

  }



