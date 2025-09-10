package  Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปร Array แบบที่ 1 ระบุสมาชิกในวงเล็บปีกกา
        // String [] animals;
        String animals[] = {"Dog","Cat","Lion"};
        int dice [] = {1,2,3,4,5,6};
        float avgScore [] = {3.50f,4.00f,2.75f};

        // หาขนาดของ Array
        System.out.println("Size of animals array :" + animals.length);

        // การเข้าถึงสมาชิก Array
        System.out.println("Animal at index 0 : " + animals[0]);
        System.out.println("Animal at index 2 : " + animals[2]);

        // วนลูปแสดงสมาชิกใน Array avgscore
        System.out.println("Show all average scores : ");
        for(int i=0;i < avgScore.length ;i++){
            System.out.println(avgScore[i]);
        }

    //==================================================================

        // การประกอบตัวแปรแบบ Array แบบที่ 2 ระบุขนาดของ array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        

        System.out.println("Size of colors array :" + colors.length);

        System.out.println("Show all colors : ");
        int J = 1;
        for(int i=0;i < colors.length ;i++){
            System.out.println("Block" + (i+1) + ":" + colors[i]);
           // System.out.println("Block" + J + ":" + colors[i]);
           // J
        }


        System.out.println("Color at index 0 : " + colors[0]);
        System.out.println("Color at index 1 : " + colors[2]);
    //==================================================================

        int score[] = new int[5];
        score[0] = 50;
        System.out.println("Score at index 4 :" + score[4]);
    }
}
