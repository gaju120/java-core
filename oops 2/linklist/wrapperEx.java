import java.util.ArrayList;

public class wrapperEx {
    public static void main(String[] args) {

        // int num=10;

        // Integer obj =num;

        // System.out.println("primitive value: " + num);
        // System.out.println("wrraper object: " + obj);
        // int value =obj;
        // System.out.println("values: "+ value);

        String mark = "95";
        // string to Integer object
        Integer score = Integer.parseInt(mark);

        System.out.println(score + 5);

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(90);
        marks.add(85);

        System.out.println(marks);

    }
}
