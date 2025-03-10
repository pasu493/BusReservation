package busRes;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Passenger:");
		passengerName=sc.next();
		System.out.println("Enter Bus No:");
		busNo=sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable() throws SQLException
	{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();
		
		int capacity=busdao.getCapacity(busNo);
		int booked=bookingdao.getBooked(busNo,date);
		
		
		return booked<capacity;
	}
	}


