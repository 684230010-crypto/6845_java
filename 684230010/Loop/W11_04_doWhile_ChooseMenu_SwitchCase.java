package Loop;
import java.util.Scanner;
public class W11_04_doWhile_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb == new Scanner(System.in);
        //โจทย์ เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
    
    //================================================
    
        

    //================================================
    //แสดงเมนูเพื่อรัน choice
        System.out.println("===========================");
        System.out.println( " Menu:");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Exit");
        System.out.print("=============================");
        int choice;

        do { 
            // รับค่าเลือกเมนู
        System.out.println("Enter your choice: ");
        choice = kb.nextInt();
        System.out.println("----------------------------");
        switch(choice){
                case 1:
                // แสดงข้อความรับตัวเลข 2 จำนวน
                    System.out.println("Enter Number 1: ");
                    num 1 = kb.nextInt();
                    System.out.println("Enter Number 2: ");
                    num 2 = kb.nextInt();
                    int result = num1 + num2;
                    System.out.println("Addition Result: " + result);
                    break;

                case 2:
                    // แสดงข้อความรับตัวเลข 2 จำนวน
                    System.out.println("Enter Number 1: ");
                    num 1 = kb.nextInt();
                    System.out.println("Enter Number 2: ");
                    num 2 = kb.nextInt();
                    System.out.println("Subtraction Result: "+ (num1 - num2));
                    break;

                case 3:
                    System.out.println("Exiting the program.Goodbye! ");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                
            }

            }while(choice !=3); // ถ้า choice ไม่ใช่ 3mเท่ากับ 3


            
            kb.close();

        
                }
            }   
        
    

