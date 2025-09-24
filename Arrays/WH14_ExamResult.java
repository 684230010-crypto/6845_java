import java.util.Scanner; // นำเข้า Scanner สำหรับรับข้อมูลจากผู้ใช้

public class WH14_ExamResult{
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in); // สร้าง Scanner สำหรับรับ input

        System.out.print("Enter number of students:"); // ขอจำนวนผู้เรียน

        int n = sc.nextInt(); // เก็บจำนวนผู้เรียนในตัวแปร n

        // ตัวแปรเก็บจำนวนผ่านและไม่ผ่าน
        int passed = 0;
        int failed = 0;

        // วนลูปทีละนักเรียน
        for (int i = 1; i <= n; i++){

            // ขอคะแนนนักเรียนคนที่ i
            System.out.print("Enter score for student " + i +":");

            //เก็บคะแนนใน score
            int score = sc nextInt();

            if (score >= 50) {
                System.out.println("Student" + i +" : Passed");
                passed++; // คะแนน >=50 ผ่าน
            } else {
                System.out.println("Student" + i +" : Failed");
                failed++; //คะแนน <50 ไม่ผ่าน
            }
            System.out.print("================================"); // เส้นแบ่งผลแต่ละคน
        }

        System.out.println("Number of students passed = " + passed + "persons"); // จำนวนผู้ผ่านทั้งหมด
        System.out.println("Number of students failed = " + failed + "persons"); // จำนวนผู้ไม่ผ่านทั้งหมด
    }
}



                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                        