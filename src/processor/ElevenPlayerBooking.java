package processor;

import model.Booking;

public class ElevenPlayerBooking extends BookingProcessor {

    @Override
    protected String getFieldName() {
        return "San bong 11 nguoi";
    }

    @Override
    protected double calculatePrice(Booking booking) {
        double price = booking.getHours() * 500000;
        System.out.println("3. Tinh tien san 11 nguoi(500k/1h)");
        return price;
    }

    @Override
    protected void processService() {
        System.out.println("5. Dich vu san 11 nguoi:");
        System.out.println("- Co ao bib");
        System.out.println("- Co trong tai");
        System.out.println("- Nuoc uong mien phi");
    }
}