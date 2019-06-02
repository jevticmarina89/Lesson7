package examples;

public class GeneralPractitioner extends Doctor{
	
	String therapist;
	
	public GeneralPractitioner(String careGiver, int patientsPerDay, String therapist) {
		super(careGiver, patientsPerDay);
		this.therapist = therapist;
	}

	public String getTherapist() {
		return therapist;
	}

	public void setTherapist(String therapist) {
		this.therapist = therapist;
	}

	@Override
	public void doMedicine() {
		System.out.println("Prescribes medicine.");
	}
	
	public void makeHouseCalls() {
		System.out.println("Visiting houses");
	}
	


		
	
	

}
