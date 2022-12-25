import java.util.List;
import java.util.Collections;
class Test
{
	public static void main(String[] args)
	{
		Employee e = new Employee(1,"Sameer","Pandharpur");
		Employee e0 = new Employee(2,"Maran","Latur");
		Employee e1 = new Employee(3,"Kahendra","Udgir");
		
		List<Employee> emp = new ArrayList<>();
		emp.add(e);
		emp.add(e0);
		emp.add(e1);
		
		Collections.sort(emp);
		
		for(Employee ee : emp)
		{
			System.out.print(ee);
		}
		
	}
}