package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservations {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //Para trabalhar com datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room Number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkinDate = sdf.parse(sc.next());



        sc.close();
    }
}
