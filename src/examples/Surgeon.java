package examples;

public class Surgeon extends Doctor {
	
	String hasScalpel;

	public Surgeon(String careGiver, int patientsPerDay, String hasScalpel) {
		super(careGiver, patientsPerDay);
		this.hasScalpel = hasScalpel;
	}

	public String getHasScalpel() {
		return hasScalpel;
	}

	public void setHasScalpel(String hasScalpel) {
		this.hasScalpel = hasScalpel;
	}
	
	public void performSurgery() {
		System.out.println("Cuts people in order to help them");
	}
	
	

}
