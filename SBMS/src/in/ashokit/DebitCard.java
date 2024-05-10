package in.ashokit;

public class DebitCard implements Ipayment {

	@Override
	public String pay(double amount) {
		return "money debited from your account using Debit Card";

	}

}
