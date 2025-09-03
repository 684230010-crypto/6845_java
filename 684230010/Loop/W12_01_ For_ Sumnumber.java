package Loop;

import java.util.Scanner;

public class W12_01_For_Sumnumber{
    public static void main(String[] args) {
        do{ 
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter a start number:");
            int start = kb.nextInt();
            System.out.print("Enter a  stop number:");
            int stop  = kb.nextInt();
        
        while(start >= stop){
            System.out.println("Start number must be less than Stop number");
            System.out.print("Enter a start number:");
            start = kb.nextInt();
            System.out.print("Enter a  stop number:");
            stop  = kb.nextInt();
        }

    
            int sum = 0; 
            int count=1;

        if(start<stop){
            for(int i=start ;i<=stop ;i++ ) {
            System.out.println("round"+count +":"+sum+ "+"+ i + "=" + (sum+=i));
            count++;
        } 
        
        }else{
            System.out.println("Start number must be less than Stop number");
        }
        
    }
}
}
