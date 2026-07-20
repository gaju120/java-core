public class setCharEx {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("jovo");

        str.setCharAt(1, 'a');
        str.setCharAt(3, 'a'); 
        str.append(" is my name");
        System.out.println(str);
        System.out.println("Length = " + str.length());
        System.out.println("Capacity = " + str.capacity());
        System.out.println(str);
    }
}
