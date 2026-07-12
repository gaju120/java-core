public class jagged_example {

    public static void main(String[] args) {
        int[][] arr=new int[5][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[4];
        arr[3]=new int[1];
        arr[4]=new int[5];

        

        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;


        arr[1][0]=40;
        arr[1][1]=50;


        arr[2][0]=60;
        arr[2][1]=70;
        arr[2][2]=80;
        arr[2][3]=90;
        arr[2][4]=100;

        arr[4][0] = 110; 
        arr[4][1] = 120; 
        arr[4][2] = 130; 
        arr[4][3] = 140; 
        arr[4][4] = 150;
        

        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"");

                for(int j=0;j<arr[i].length;j++){
                   System.out.print(arr[i][j]+"");
                }
                System.out.println();

            }
    }
}           
    
    
        
