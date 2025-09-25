import java.util.*;
import java.util.stream.Collectors;
import java.time.*;
public class Java8Grind
{
	public static void main(String[] args) {
List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", "HR", 55000, 28, "Female", LocalDate.of(2022, 5, 10)),
				new Employee(2, "Bob", "Finance", 75000, 35, "Male", LocalDate.of(2020, 3, 15)),
				new Employee(3, "Charlie", "IT", 90000, 30, "Male", LocalDate.of(2019, 7, 1)),
				new Employee(4, "Diana", "IT", 120000, 42, "Female", LocalDate.of(2018, 1, 25)),
				new Employee(5, "Ethan", "Finance", 120000, 24, "Male", LocalDate.of(2023, 8, 12)),
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
	
		//Get a list of employees with salary greater than 50,000.
		// List<Employee> empList = employees.stream().filter(e->e.getSalary()>78000).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e.getName() + "has salary of: "+e.getSalary()));
		//Get a list of employees below 30 years of age.
		// List<Integer>empList = employees.stream().map(Employee::getAge).filter(e->e<30).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e));
		//Get a list of employees whose first name starts with "A".
		List<Employee> empList = employees.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());

		}


}
