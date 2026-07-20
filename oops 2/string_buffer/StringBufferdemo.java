public class StringBufferdemo { 
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello1234");
        sb.append(" World");
        System.out.println(sb);


        System.out.println("Capacity of StringBuffer: " + sb.capacity());
       
    }

}