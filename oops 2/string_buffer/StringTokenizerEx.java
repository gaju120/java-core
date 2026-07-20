import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String str = "Hello World Welcome to Java";

        // Use the built-in StringTokenizer
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
