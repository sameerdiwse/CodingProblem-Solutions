public class Practice{
public static void main(String[] str)
{
List<Employee> employees = Arrays.asList(
			new Employee(1, "Alice", "HR", 55000, 28, "Female", LocalDate.of(2022, 5, 10)),
			new Employee(2, "Bob", "Finance", 75000, 35, "Male", LocalDate.of(2020, 3, 15)),
			new Employee(3, "Charlie", "IT", 90000, 30, "Male", LocalDate.of(2019, 7, 1)),
			new Employee(4, "Diana", "IT", 120000, 42, "Female", LocalDate.of(2018, 1, 25)),
			new Employee(5, "Ethan", "Finance", 45000, 24, "Male", LocalDate.of(2023, 8, 12)),
			new Employee(6, "Fiona", "HR", 60000, 31, "Female", LocalDate.of(2021, 11, 5)),
			new Employee(7, "George", "Marketing", 70000, 29, "Male", LocalDate.of(2022, 2, 20)),
			new Employee(8, "Hannah", "IT", 85000, 27, "Female", LocalDate.of(2023, 3, 14)),
			new Employee(9, "Ian", "Finance", 95000, 38, "Male", LocalDate.of(2017, 6, 18)),
			new Employee(10, "Jenny", "Marketing", 50000, 25, "Female", LocalDate.of(2024, 4, 1)),
			new Employee(11, "Kevin", "IT", 78000, 33, "Male", LocalDate.of(2021, 9, 10)),
			new Employee(12, "Laura", "Finance", 67000, 29, "Female", LocalDate.of(2019, 12, 22)),
			new Employee(13, "Mike", "HR", 52000, 26, "Male", LocalDate.of(2020, 5, 18)),
			new Employee(14, "Nina", "Marketing", 88000, 36, "Female", LocalDate.of(2018, 7, 4)),
			new Employee(15, "Oscar", "IT", 110000, 41, "Male", LocalDate.of(2017, 10, 29)),
			new Employee(16, "Paula", "Finance", 62000, 28, "Female", LocalDate.of(2022, 3, 16)),
			new Employee(17, "Quentin", "HR", 48000, 23, "Male", LocalDate.of(2023, 1, 8)),
			new Employee(18, "Rachel", "Marketing", 93000, 34, "Female", LocalDate.of(2019, 4, 25)),
			new Employee(19, "Steve", "IT", 99000, 39, "Male", LocalDate.of(2020, 11, 12)),
			new Employee(20, "Tina", "Finance", 56000, 27, "Female", LocalDate.of(2024, 2, 5)));

//Find all employees with salary greater than 50,000.
			List<Employee> emp = employees.stream().filter(e->e.getSalary()>50000).collect(Collectors.toList());
			//emp.forEach(e->System.out.println("name is: "+e.getName()+", and salary is: "+e.getSalary()));
			
			//Get names of all employees in a list.
			List<String> empNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
			empNames.forEach(e->System.out.println("these are all names: "+e));
			
			//Print distinct departments.
			//List<String> distictDepts = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
			//distictDepts.forEach(i->System.out.println("these are distinct departments: "+i+" and the count is: "+distictDepts.size()));
			//String[] distictDepts = employees.stream().map(Employee::getDepartment).toArray(String[]::new);
			
			//Find employees whose name starts with "A".
			String[] empFilNames = employees.stream().map(Employee::getName).filter(a->a.startsWith("A")).toArray(String[]::new);
			//System.out.println(empFilNames.length);
			//Arrays.stream(empFilNames).forEach(e->System.out.println("Names starting with A: "+e));
			
			//Get the employee with the highest salary.
			Employee empHighSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
			//System.out.println(empHighSalary.getName()+" has highest salary of "+empHighSalary.getSalary());
			
			//Get the employee with the lowest salary.
			Employee empLowSal = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst().get();
			//System.out.println(empLowSal.getName()+" has the lowest salary of "+empLowSal.getSalary());
			
			//Check if any employee has salary above 1,00,000.
			List<Employee> empHeftyPackage = employees.stream().filter(e->e.getSalary()>100000).collect(Collectors.toList());
			//empHeftyPackage.forEach(e->System.out.println(e.getName()+" has, hefty package of "+e.getSalary()));
			
			//Count employees older than 30.
			//employees.stream().filter(emps->emps.getAge()>30).collect(Collectors.toList()).
			//forEach(e->System.out.println(e.getName()+" is older than 30, and the age is "+e.getAge()));
			
			//Find the first employee who joined the company.
			Employee s = employees.stream().min(Comparator.comparing(Employee::getJoiningDate)).get();
			System.out.println(s.getName()+ "'s joining date was: "+s.getJoiningDate());
			
			//Find the latest joined employee.
			Employee latestJoined = employees.stream().max(Comparator.comparing(Employee::getJoiningDate)).get();
			System.out.println(latestJoined.getName()+" joined on "+latestJoined.getJoiningDate());
			
			
			int[] i = {1,4,23,103,54,3,21,90};
			
			int max = Arrays.stream(i).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
			System.out.println("maxy: "+max);
}
}
