import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("");

        // input : รับค่าตำนวณเต็มจากผู็ใช้
        System.out.println("Enter  number:"); // ข้อความบอกให้แก่ป้อนตัวเลข
        int n = kb.nextInt(); // ตัวแปรสำหรับเก็บค่าจำนวนเต็มที่ป้อนเข้ามา

        //Process : สูตรจำนวนเลขคู่และเลขคี่
         // เอาตัวแปรที่รับเข้ามาไปหารด้วย 2
        //Output : แสดงผลลัพธ์
        if(n%2 == 0){
        System.out.println("Number"+ n +" is Even");//ถ้าเศษที่ได้จากการหารเป็น 0 แสดงว่าเป็นเลขคู่
        }else {
        System.out.println("Number"+ n + " is Odd");//ถ้าเศษที่ได้จากการไม่เป็น 0 แสดงว่าเป็นเลขคี่
        }
                            
    }
    
}
