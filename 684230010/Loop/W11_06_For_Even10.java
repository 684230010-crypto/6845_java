package Loop;

public class W11_06_For_Even10 {
    public static void main(String[] args) {

        // 2+4+6+8+10+12+14+16+18+20=110
        int sum = 0; //  ตัวแปรสำหรับเก็บผลรวม
        for(int i=2 ;i<=20 ;i+=2 ) {
            if(i<20){
            System.out.print(i+" + ");
            }else{
            System.out.print(i+" = ");
        }
            sum = sum+i;  // รูปย่อ sum+=1;
            }
            System.out.println(sum);
        }



            
    }

