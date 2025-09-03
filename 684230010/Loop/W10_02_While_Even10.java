package Loop;

public class W10_02_While_Even10 {
    public static void main(String[] args) {
        
        int i = 2 ;
        int sum =0;
        while (i <= 20) {
            sum = sum+i;
            System.out.print("i");

            if(i <20){
                System.out.println("+");
            }else{
                System.out.println("="+ sum);
            }
            i =i+2;
        }
    }
}
