public class StarBlocks {
    public static void main(String[] args) {
         int n=3;
        // Outer loop for rows
        for(int i = 1; i <= n; i++) {
            // Inner loop for columns
            for(int j = 1; j <= n; j++) {
                System.out.print("*** "); // print block with space
            }
            System.out.println(); // next line
        }
    }
}
