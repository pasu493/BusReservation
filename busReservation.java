package busRes;
import java.sql.SQLException;
import java.util.*;
public class busReservation {
public static void main(String[] args) throws SQLException {
	
	BusDAO busdao=new BusDAO();
	
	busdao.displayBusInfo();
	
	
	int userOpt=1;
	Scanner sc=new Scanner(System.in);
	while(userOpt==1)
	{
	System.out.println("Enter 1 to Book and 2 to Exit");
	userOpt=sc.nextInt();
	if(userOpt==1)
	{
		Booking booking=new Booking();
	
		if(booking.isAvailable())
		{
			BookingDAO bookingdao=new BookingDAO();
			bookingdao.addBooking(booking);
			System.out.println("your Booking Confirmed");
		}
		else
		{
			System.out.println("Sorry! try other Bus or Date");
		}
	}	
	}
	}
}
