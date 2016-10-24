import java.util.ArrayList;

public class Run {

	static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static Employee getName(String x){
		for(int i = 0; i < employees.size(); i++){
			if(employees.get(i).getName().equals(x)){
				return employees.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		employees.add(new Employee("Nick","123-123-1234","place",false,0,0));
		
		System.out.println(getName("Nick").getAddress());
	}
}
