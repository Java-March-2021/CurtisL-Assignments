package phoneAssignment;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String ring() {
		String message ="IPhone "+ this.getVersionNumber()+" says "+this.getRingTone();
		return message;
		
	}
	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("IPhone "+this.getVersionNumber()+" from "+this.getCarrier());
		
	}
}
