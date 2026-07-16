public class PyramidPattern {
    public static void main(String[] args) {
        // Loop for rows
        for(int i = 5; i >= 1; i--) {
            // Loop for stars in each row
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
    }
}

 
    

