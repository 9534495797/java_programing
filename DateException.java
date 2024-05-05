import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.chronoUnit;
import java.time.LocalDate;
public class DateException {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        DatTimeFormatter formatter=DatTimeFormatter.Format("yyyy-MM-DD");
        LocalDate start=LocalDate.parse(sc.nextLine(),formatter);
        LocalDate end=LocalDate.parse(sc.nextLine(),formatter);
int days=chronoUnit.difference
    }
}
