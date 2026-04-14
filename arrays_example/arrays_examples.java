public class arrays_examples {
    public static void main(String[] args) {
        int[] number = {10, 20, 80};  // fixed array initialization

       /*  for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);  // prints each element
        }

        System.out.println( number.length); // prints length once

        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]);
        }*/
       int temp=number[0];
       number[0]=number[2];
       number[2] = temp; 

       for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]+"");
       }

       int[]arr={1,2,3,4,5};

       int start=0;
       int end=arr.length-1;
       while(start< end) {
          
        int temp1=arr[start];
        arr[start]=arr[end];
        arr[end]=temp1;
        start++;
        end--;
       }
       for(int elem:arr){
        System.out.println(elem);

       }
       




        
    }

}
//joint array is amultidimentional array where each number has different number of coloms
