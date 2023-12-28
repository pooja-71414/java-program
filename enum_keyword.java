enum Day 
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class enum_keyword 
{
    public static void main(String[] args) {
        // Using the enum constants
        Day today = Day.WEDNESDAY;
        
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's some other day.");
        }
    }
}
