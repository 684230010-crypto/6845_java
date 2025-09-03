package Loop;

import java.util.Scanner;

public  class W12_02_SumNumber {
    public static void main(String[] args) {

        Scanner kb =  new Scanner(System.in);

        int start,stop;
        do { 
            System.out.println("Start number must be less than Stop number");
            System.out.print("Enter a start number:");
            start = kb.nextInt();
            System.out.print("Enter a  stop number:");
            stop  = kb.nextInt();

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

        } while (start >= stop);
        kb.close();
    }
}
    