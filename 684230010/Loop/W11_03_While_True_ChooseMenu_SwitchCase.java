package Loop;
import java.util.Scanner;
public class W11_03_While_True_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb == new Scanner(System.in);
        //โจทย์ เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
    
    //================================================
    // แสดงข้อความรับตัวเลข 2 จำนวน
        System.out.println("Enter Number 1: ");
        int num 1 = kb.nextInt();
        System.out.println("Enter Number 2: ");
        int num 2 = kb.nextInt();

    //================================================
    //แสดงเมนูเพื่อรัน choice
        System.out.println("===========================");
        System.out.println( " Menu:");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Exit");
        System.out.print("=============================");

        while(true) {
        //    System.out.println("Enter your choice: ");
        //    int choice = kb.nextInt();
        //   System.out.println("----------------------------");
        //    if (choice == 1) {
         //       System.out.println("Addition Result:" + (num1+ num2));
        //        break;
        //    }else if (choice == 2) {
        //        System.out.println("Subtraction Result:"+(num1 - num2));
        //        break;
        //    }else if (choice == 3) {
        //        System.out.println("Exiting the program. Goodbye!");
        //        break;
        //    }else{
         //       System.out.println("Invalid choice. Please try again.");
        //    }
            
            switch(choice){
                case 1:
                    int result = num1 + num2;
                    System.out.println("Addition Result: " + result);
                    break;
                case 2:
                    System.out.println("Subtraction Result: "+ (num1 - num2));
                    break;
                case 3:
                    System.out.println("Exiting the program.Goodbye! ");
                    break;
                }

                // ตรวจสอบการออกจากลูป while true
                if(choice ==1){
                    break;
                }else if(choice ==2){
                    break;
                }else if(choice == 3){
                    break;
                }else{
                    System.out.println("Invalid choice. Please try again.");
                }
            }   
        }
    }

