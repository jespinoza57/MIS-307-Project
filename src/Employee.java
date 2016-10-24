
public class Employee {

	private String name;
	private String SSN;
	private String address;
	private boolean married;
	private double hourlyPayRate;
	private double hoursWorked;

	public Employee(String name, String SSN, String address, boolean married, double hourlyPayRate, double hoursWorked){
		this.name = name;
		this.SSN = SSN;
		this.address = address;
		this.married = married;
		this.hourlyPayRate = hourlyPayRate;
		this.hoursWorked = hoursWorked;
	}
	
	public void setName(String x){
		name = x;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSSN(String x){
		SSN = x;
	}
	
	public String getSSN(){
		return SSN;
	}
	
	public void setAddress(String x){
		address = x;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setMaritalStatus(boolean x){
		married = x;
	}
	
	public boolean getMaritalStatus(){
		return married;
	}
	
	public void setHourlyPayRate(Double x){
		hourlyPayRate = x;
	}
	
	public double getHourlyPayRate(){
		return hourlyPayRate;
	}
	
	public void addHoursWorked(double x){
		hoursWorked += x;
	}
	
	public void subtractHoursWorked(double x){
		hoursWorked -= x;
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
}
