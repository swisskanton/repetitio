/*
Create a Reservation class by implementing all the features as required by the interface.
The reservation code should contain 8 characters randomly from 0-Z, all uppercase letters.
Use String.format to print the reservation code.
Also, the DOW is randomly ordered to the bookings from an array.
    DOW stands for Day of the Week (MON, TUE, etc.)

The string representation of the booked reservations should look somehow like these:
    Booking# 1WBA3OMU for THU
    Booking# 0V5OH7VS for WED
    Booking# CV6QOAJO for MON
    Booking# 03GHEJMV for SAT
    Booking# M5JFB32I for THU
 */
package reservations;

import java.util.ArrayList;
import java.util.Random;

public class Reservation implements Reservable {

    private String code;
    private String dow;
    public Reservation() {
        this.code = this.getBookingCode();
        this.dow = this.getBookingDow();
    }

    @Override
    public String getBookingDow() {
        String[] days = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
        Random r = new Random();
        return days[r.nextInt(7)];
    }

    @Override
    public String getBookingCode() {
        String code = "";
        char[] source = "0123456789QWERTZUIOPLKJHGFDSAYXCVBNM".toCharArray();
        Random r = new Random();
        for (int i = 0; i < 8; i++)
            code += source[r.nextInt(36)];
        return code;
    }

    @Override
    public String toString() {
        return String.format("Booking# %s for %s", this.code, this.dow);
    }

    public static void main(String[] args) {

        ArrayList<Reservation> bookings = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            Reservation booking = new Reservation();
            bookings.add(booking);
        }

        for (Reservation item: bookings) {
            System.out.println(item.toString());
        }
    }
}
