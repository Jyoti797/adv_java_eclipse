package in.ashokit;

public class CreditCard implements Ipayment {

	@Override
	public String pay(double amount) {
        return "money debited from your account using Credit card";		
	}

}
