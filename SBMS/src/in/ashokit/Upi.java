package in.ashokit;

public class Upi implements Ipayment {

	@Override
	public String pay(double amount) {
		return "money debited from your account using Unified paymemt interface";
	}

}
