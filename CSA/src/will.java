import java.time.format.*;
import java.time.*;
import java.util.*;

public class will {
    public void location() {
        //my code
        LocalDateTime dobj = LocalDateTime.now();
        DateTimeFormatter fobj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fdate = dobj.format(fobj);
        //not my code
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(fdate, formatter); // LocalDate = 2010-02-23
        DayOfWeek dow = date.getDayOfWeek();  // Extracts a `DayOfWeek` enum object.
        String output = dow.getDisplayName(TextStyle.FULL_STANDALONE, Locale.US); // String = Tue
        //my code
        System.out.print("Today is a "+output+" so ");
        switch (output){
            case "Monday":
            case "Thursday":
                System.out.println("Will is at his dads");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("Will is at his moms");
                break;
            default:
                System.out.println("it depends on weekends");
                break;
        }
    }
}
