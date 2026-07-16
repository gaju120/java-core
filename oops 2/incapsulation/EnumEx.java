enum Day{
   
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumEx {
    public static void main(String[] args) {
       Day today = Day.SUNDAY;
        System.out.println("Today is: " + today);

        // Using enum in switch
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case TUESDAY:
                System.out.println("Second day of the week.");
                break;
            case WEDNESDAY:
                System.out.println("Middle of the week.");
                break;
            case THURSDAY:
                System.out.println("Almost weekend!");
                break;      
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;

            default:
                System.out.println("It's the weekend!");
        }
    }
}