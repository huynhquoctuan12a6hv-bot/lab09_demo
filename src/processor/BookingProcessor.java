package processor;

import model.Booking;

public abstract class BookingProcessor {

	// Template Method
	public final void processBooking(Booking booking, boolean tinhtrangSan) {

		System.out.println("\n===== QUY TRINH DAT SAN =====");

		validateCustomer(booking);

		// Kiem tra tinh trang san
		if (!checkFieldAvailability(tinhtrangSan)) {
			System.out.println("Dat san that bai!");
			return;
		}

		double price = calculatePrice(booking);

		confirmBooking(booking);
		processService();

		notifyCustomer(booking, price);

		System.out.println("===== DAT SAN THANH CONG =====");
	}

	private void validateCustomer(Booking booking) {
		if (booking == null || booking.getCustomerName() == null || booking.getCustomerName().trim().isEmpty()
				|| booking.getHours() <= 0) {

			throw new IllegalArgumentException("Thong tin dat san khong hop le!");
		}

		System.out.println("1. Kiem tra khach hang: Hop le");
	}

	// Tra ve true neu san con trong
	private boolean checkFieldAvailability(boolean tinhtrangSan) {

		System.out.println("2. Kiem tra tinh trang san:");

		if (tinhtrangSan) {
			System.out.println("San con trong!");
			return true;
		} else {
			System.out.println("San da duoc dat!");
			return false;
		}
	}

	protected abstract String getFieldName();

	protected abstract double calculatePrice(Booking booking);

	private void confirmBooking(Booking booking) {
		System.out.println("4. Xac nhan dat san:");
		System.out.println("- Khach hang: " + booking.getCustomerName());
		System.out.println("- Loai san: " + getFieldName());
		System.out.println("- So gio: " + booking.getHours());
	}

	protected abstract void processService();

	private void notifyCustomer(Booking booking, double price) {
		System.out.println("6. Thong bao khach hang: " + booking.getCustomerName());
		System.out.println("Tong tien: " + price + " VND");
	}
}