package examples;

public class Doctor {
	
	String careGiver;
	int patientsPerDay;
	
	public Doctor(String careGiver, int patientsPerDay) {
		
		this.careGiver = careGiver;
		this.patientsPerDay = patientsPerDay;
	}

	public String getCareGiver() {
		return careGiver;
	}

	public void setCareGiver(String careGiver) {
		this.careGiver = careGiver;
	}

	public int getPatientsPerDay() {
		return patientsPerDay;
	}

	public void setPatientsPerDay(int patientsPerDay) {
		this.patientsPerDay = patientsPerDay;
	}
	
	public void doMedicine() {
		System.out.println("Do medicine stuff..");
	}
	
	

}
