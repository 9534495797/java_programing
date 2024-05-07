import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Calendarex {
    public static void main(String[]args){
        // LocalDateTime bc=LocalDateTime.now();
        // System.out.println(bc);
        // String dat1=("1947-08-15");
        // String date2=("1948-08-15");
        Scanner sc=new Scanner(System.in);
        String dat1=sc.nextLine();
        String date2=sc.nextLine();

        LocalDate localDate1 = LocalDate.parse(dat1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate localDate2 = LocalDate.parse(date2,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        long da=ChronoUnit.DAYS.between(localDate1,localDate2);
        System.out.println(da);
    }
}
