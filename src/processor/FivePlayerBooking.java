package processor;

import model.Booking;

public class FivePlayerBooking extends BookingProcessor {

    @Override
    protected String getFieldName() {
        return "San bong 5 nguoi";
    }

    @Override
    protected double calculatePrice(Booking booking) {
        double price = booking.getHours() * 150000;
        System.out.println("3. Tinh tien san 5 nguoi(150k/1h)");
        return price;
    }

    @Override
    protected void processService() {
        System.out.println("5. Dich vu san 5 nguoi:");
        System.out.println("- Co ao bib");
        System.out.println("- Khong co nuoc uong");
    }
}