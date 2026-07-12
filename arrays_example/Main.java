public class Main {
     public static void main(String[] args) {
        int[][] jagged=new int[5][];
        jagged[0]=new int[3];
        jagged[1]=new int[2];
        jagged[2]=new int[4];
        jagged[3]=new int[1];
        jagged[4]=new int[5];



        jagged[0][0] = 10;
        jagged[0][1] = 20;
        jagged[0][2] = 30;

        jagged[1][0] = 40;
        jagged[1][1] = 50;

        jagged[2][0] = 60;
        jagged[2][1] = 70;
        jagged[2][2] = 80;
        jagged[2][3] = 90;
        jagged[2][4] =100;

        jagged[3][0]=105;


        jagged[4][0] = 110; 
        jagged[4][1] = 120; 
        jagged[4][2] = 130; 
        jagged[4][3] = 140; 
        jagged[4][4] = 150;

         for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");

              for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
     }

        
}
