public class Switches {
        
    public static void main(String[] args){
        Switches switches = new Switches();
        
        switches.intSwitch(6);
        switches.fallThroughCases(2,1992);
        switches.fallThroughCases(2,1993);
        switches.stringSwitch("tuesday");
        
    }
    // switches are an alternative to if-then-else statements when many flows can be chosen from a single value
    // a switch works with (primitives) char, byte, short  ----  (wrappers) Character, Byte, Short  ----  (Object) String

    // This method is an example of a very simple case
    public void intSwitch(int month) {
        //int numDays=0;
        switch (month){
            case (1): System.out.println("numDays=31");
            break;
            case (2): System.out.println("numDays=28");
            break;
            case (3): System.out.println("numDays=31");
            break;
            case (4): System.out.println("numDays=30");
            break;
            case (5): System.out.println("numDays=31");
            break;
            case (6): System.out.println("numDays=30");
            break;
            case (7): System.out.println("numDays=31");
            break;
            case (8): System.out.println("numDays=31");
            break;
            case (9): System.out.println("numDays=30");
            break;
            case (10): System.out.println("numDays=31");
            break;
            case (11): System.out.println("numDays=30");
            break;
            case (12): System.out.println("numDays=31");
            break;
        }
    }
    
    public void fallThroughCases(int month, int year) {
        int leapYear = year % 4;
        if (leapYear == 0){
            switch (month){
            case (1): System.out.println("numDays=31");
            break;
            case (2): System.out.println("numDays=29");
            break;
            case (3): System.out.println("numDays=31");
            break;
            case (4): System.out.println("numDays=30");
            break;
            case (5): System.out.println("numDays=31");
            break;
            case (6): System.out.println("numDays=30");
            break;
            case (7): System.out.println("numDays=31");
            break;
            case (8): System.out.println("numDays=31");
            break;
            case (9): System.out.println("numDays=30");
            break;
            case (10): System.out.println("numDays=31");
            break;
            case (11): System.out.println("numDays=30");
            break;
            case (12): System.out.println("numDays=31");
            break;
            }
        } else {
    
            switch (month){
            case (1): System.out.println("numDays=31");
            break;
            case (2): System.out.println("numDays=28");
            break;
            case (3): System.out.println("numDays=31");
            break;
            case (4): System.out.println("numDays=30");
            break;
            case (5): System.out.println("numDays=31");
            break;
            case (6): System.out.println("numDays=30");
            break;
            case (7): System.out.println("numDays=31");
            break;
            case (8): System.out.println("numDays=31");
            break;
            case (9): System.out.println("numDays=30");
            break;
            case (10): System.out.println("numDays=31");
            break;
            case (11): System.out.println("numDays=30");
            break;
            case (12): System.out.println("numDays=31");
            break;
            }    
           
        }
    }    

    // The same thing, but using Strings instrad of ints. Requires Java 7 or greater
    public void stringSwitch(String dayOfWeek) {
        switch (dayOfWeek.toLowerCase()) {
            case "sunday": System.out.println(1);
            break;
            case "monday": System.out.println(2);
            break;
            case "tuesday": System.out.println(3);
            break;
            case "wednesday": System.out.println(4);
            break;
            case "thursday": System.out.println(5);
            break;
            case "friday": System.out.println(6);
            break;
            case "saturday": System.out.println(7);
            break;
            
        }
    }
}
