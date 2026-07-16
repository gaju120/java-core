public class NumberPattern {
    public static void main(String[] args) {
        // Outer loop for rows
        for(int i = 0; i < 3; i++) {
            // Inner loop for columns
            for(int j = 0; j < 4; j++) {
                System.out.print("" + (i + j) + " ");
            }
            System.out.println(); // next line
        }
    }
}
