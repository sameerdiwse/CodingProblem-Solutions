import java.util.*;
import java.util.stream.Collectors;
import java.time.*;
public class Java8Grind
{
	public static void main(String[] args) {
List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", "HR", 49000, 28, "Female", LocalDate.of(2022, 5, 10)),
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
		// List<String> empList = employees.stream().map(Employee::getName).filter(d->d.startsWith("A")).collect(Collectors.toList());
		// empList.forEach(System.out::println);
		//Get a list of employees whose last name ends with "son".
		// List<Employee> empList = employees.stream().filter(e->e.getName().endsWith("ula")).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e.getName()));
		//Get a list of employees whose salary is between 40,000 and 60,000.
		//employees.stream().map(Employee::getSalary).filter(e->e<50000 & e>30000).collect(Collectors.toList()).forEach(e->System.out.println(e));;
		// Get a list of employees whose age is an even number.
		//employees.stream().filter(e->e.getAge()%2==0).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary()));
		//Get a list of employees whose first name contains "an".
		//employees.stream().map(Employee::getName).filter(e->e.contains("an")).collect(Collectors.toList()).forEach(System.out::println);
		//Get the top 3 highest paid employees.
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList()).
		// 	forEach(e->System.out.println("One of the highest paid employees: "+e.getName()+ "-" +e.getSalary()));
		//Get the top 5 youngest employees.
		// employees.stream().sorted(Comparator.comparing(Employee::getAge)).limit(3).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" has age of "+e.getAge()+" years"));;
		//Skip the first 2 highest paid employees and get the next one.
		// Employee empName = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
		// System.out.println("this is empName: "+empName.getName()+ " and salary he's getting is "+empName.getSalary());
		//Skip the first 3 oldest employees and get the next two.
		// employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(3).limit(2).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+" "+e.getAge()));
		//Get the second highest salary employee.
		// Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
		// System.out.println(emp.getName()+" gets salary of "+emp.getSalary());
		//Get the last employee after sorting by salary descending.
		// Double empSal = employees.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();
		// System.out.println("this is empSalary the minimum one: "+empSal);
		// Get the middle employee after sorting by age ascending.
		// Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getAge)).skip(employees.size()/2).findFirst().get();
		// System.out.println(employee.getAge()+" this is the middle one "+employee.getName());
		// Get the first employee whose first name starts with "M"
		// String name = employees.stream().filter(e->e.getName().startsWith("M")).findFirst().get().getName();
		// System.out.println("this is the name we are looking for: "+name);
		//Get the last employee whose salary is above 50,000.
		// Employee emp = employees.stream().filter(e->e.getSalary()>50000).findFirst().get();
		// System.out.println(emp.getName()+" is the first employee who has salary more than 50000, and the salary is: "+emp.getSalary());
		//Sort employees by first name ascending.
		// employees.stream().map(e->e.getName()).sorted(Comparator.reverseOrder()).forEach(System.out::println);;
		//Sort employees by salary ascending.
		// // employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(e->System.out.println("this is name: "+e.getName()+" and this is salary: "+e.getSalary()));
		// employees.stream().map(e->e.getAge()).sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		//Sort employees first by age, then by salary.
		// employees.stream().sorted(Comparator.comparing((Employee e)->e.getAge()).thenComparing(e->e.getSalary())).collect(Collectors.toList()).forEach(
		// e->System.out.println(e.getName() + " -> "+e.getAge()+" -> "+e.getSalary()));
		//.then part only works if first condition is not equal.
		//Sort employees first by salary, then by first name.
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(
		// Collectors.toList()).forEach(e->System.out.println("sorted again: "+e.getName()+" "+e.getSalary()+" "+e.getName()));
		//Get the employee with the highest salary.
		// Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
		// System.out.println(emp.getName()+" has highest salary of: "+emp.getSalary());
		//Get the employee with the lowest age.
		// int empAge = employees.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst().get().getAge();
		// System.out.println("this is the lowest age of employee: "+empAge);
		}
}
