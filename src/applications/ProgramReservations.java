package applications;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservations {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //Para trabalhar com datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (checkIn.after(checkOut)) {
            System.out.println("Errorin reservation: Check-out date must beaftercheck-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println(" Errorin reservation: Reservation dates for updatemust be future dates");
            } else if (checkIn.after(checkOut)) {
                System.out.println("Errorin reservation: Check-out date must beaftercheck-in date");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }



        }



        sc.close();
    }
}
