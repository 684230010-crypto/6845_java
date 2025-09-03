package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        

        Scanner kb = new Scanner(System.in);


        while(true){
            // NO.1   เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อย จนกระทั่งกดเบอร์ 9 จึงจะหยุด 1
           // System.out.print("Enter Number:");
            //int num = kb.nextInt();

           // if(num ==9) {   // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
           //     break; // คำสั่งที่ใช้ในการออกจาลูป
            //}
            // NO.2  เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อย จนกระทั่งกดเบอร์ e จึงจะหยุด 1
            System.out.println("Enter Alphabet :");
            String alphabet = kb.nextLine();
            if(alphabet.equals("e")) {
                break;
            }
        }
    }
}
