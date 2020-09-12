package com.test.array;

import java.lang.System.Logger;

class MyService {
	private String customeId;

	public String getCustomeId() {
		return customeId;
	}

	public void setCustomeId(String customeId) {
		this.customeId = customeId;
	}
	public static double getPoints(String customerId) {
		
		return 100;
	}
public static void save(String customerId,Double newPoinnts) {
		
		
	}
	
}

public class CheckUseCase {
//	 Logger log = Logger.getLogger(MyService.class.getName());
//	public static boolean redeemPoint(String customerId, String amount)
/*	{
		 Logger log = Logger.class;
		MyService myService = new MyService();
	Double toRedeem = Double.valueOf(amount); 
	double currentPoints = myService.getPoints(customerId); 
//	double currentPointss = MyService.getPoints(customerId); 
	double newPoints = currentPoints - toRedeem; 
	myService.save(customerId,newPoints); 
	log.info("Points redeemed for customer {}",customerId); 
	return true; 

	}

*/
	
	public static void main(String[] args) {
		String id = "101";
		String amount = "9999";
		
	//	redeemPoint(id, amount);
		
		
	}
	
	
/*

public boolean redeemPoint(String customerId, String amount) {
        if (amount == null) {
            log.info("Amount to be redeemed can not be null for customer id{}", customerId);
            return false;
        }
        try {
            Double toRedeem = Double.valueOf(amount);
            double currentPoints = myService.getPoints(customerId);
            if (currentPoints < toRedeem) {
                log.info("available points are lesser than the redeemed points : {} for customer id{}", amount, customerId);
                return false;
            }
            double newPoints = currentPoints - toRedeem;
            myService.save(customerId, newPoints);
            log.info("Points redeemed for customer {}", customerId);
            return true;
        } catch (NumberFormatException exception) {
            log.info("Error while parsing amount {} for customer id{}", amount, customerId);
        } catch (Exception customerNotFoundException) {
            log.info("Customer does no exists in the system customer id {}", customerId);
        } catch (Exception databaseException) {
            log.info("unable to update remaining points in the system for customer id{}", customerId);
        }
        return false;
    }
*/
}
