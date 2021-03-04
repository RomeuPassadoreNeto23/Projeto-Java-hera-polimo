package entitites;

public class OutsourcedeEmployee extends Employee {

	private double additionalCharge;

	public OutsourcedeEmployee() {
		super();
	}

	public OutsourcedeEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	

}
