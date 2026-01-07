package elc;

import blc.DriverAssignment;
import blc.FareCalculation;
import blc.LiveTracking;
import blc.PaymentProcessing;
import blc.RatingSystem;
import blc.RideRequest;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException
	{
		 RideRequest rr = new RideRequest();
	     DriverAssignment da = new DriverAssignment();
	     FareCalculation fc = new FareCalculation();
	     
	     LiveTracking  lt = new LiveTracking();
	     PaymentProcessing pp = new PaymentProcessing();
	     RatingSystem rs = new RatingSystem();
	     
	     rr.start();
	    
	     fc.start();
         fc.join();
         
	     da.start();
	     da.join();
	     
	     lt.start();
	     lt.join();
	     
	     pp.start();
	     pp.join();
	     
	     rs.start();
	     rs.join();
	}

}
