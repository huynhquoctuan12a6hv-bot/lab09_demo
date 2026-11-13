package main;

import model.Booking;
import processor.BookingProcessor;
import processor.FivePlayerBooking;
import processor.ElevenPlayerBooking;

public class Main {

	public static void main(String[] args) {

		// Truong hop 1: Dat san 5 nguoi
		System.out.println("TRUONG HOP 1: SAN 5 NGUOI");

		try {
			Booking booking1 = new Booking("Tuan Huynh", -2);

			// true: San con trong
			boolean tinhtrangSan1 = true;

			BookingProcessor fivePlayer = new FivePlayerBooking();

			fivePlayer.processBooking(booking1, tinhtrangSan1);

		} catch (IllegalArgumentException e) {
			System.out.println("Loi: " + e.getMessage());
		}

		// Truong hop 2: Dat san khong thanh con
		System.out.println("\nTRUONG HOP 2: SAN 11 NGUOI");

		try {
			Booking booking2 = new Booking("Lionel Messi", 3);

			// false: San da duoc dat
			boolean tinhtrangSan2 = true;

			BookingProcessor elevenPlayer = new ElevenPlayerBooking();

			elevenPlayer.processBooking(booking2, tinhtrangSan2);

		} catch (IllegalArgumentException e) {
			System.out.println("Loi: " + e.getMessage());
		}
	}
}