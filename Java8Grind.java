import java.text.CompactNumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Grind {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Diana", "HR", 49000, 28, "Female", LocalDate.of(2022, 5, 10)),
				new Employee(2, "Bob", "Finance", 75000, 28, "Male", LocalDate.of(2020, 3, 15)),
				new Employee(3, "Charlie", "IT", 29000, 30, "Male", LocalDate.of(2019, 7, 1)),
				new Employee(4, "Ciana", "IT", 120000, 42, "Female", LocalDate.of(2018, 1, 25)),
				new Employee(5, "Ethan", "Finance", 120000, 24, "Male", LocalDate.of(2023, 8, 12)),
				new Employee(6, "Fiona", "HR", 60000, 31, "Female", LocalDate.of(2021, 11, 5)),
				new Employee(7, "George", "Marketing", 70000, 29, "Male", LocalDate.of(2022, 2, 20)),
				new Employee(8, "Hannah", "IT", 85000, 27, "Female", LocalDate.of(2023, 3, 14)),
				new Employee(9, "Ian", "Finance", 95000, 38, "Male", LocalDate.of(2017, 6, 18)),
				new Employee(10, "Jenny", "Marketing", 50000, 19, "Female", LocalDate.of(2024, 4, 1)),
				new Employee(11, "Cevin", "IT", 78000, 33, "Male", LocalDate.of(2021, 9, 10)),
				new Employee(12, "Laura", "Finance", 67000, 29, "Female", LocalDate.of(2019, 12, 22)),
				new Employee(13, "Mike", "HR", 52000, 26, "Male", LocalDate.of(2020, 5, 18)),
				new Employee(14, "Nina", "Marketing", 1009, 36, "Female", LocalDate.of(2018, 7, 4)),
				new Employee(15, "Oscar", "IT", 110000, 41, "Male", LocalDate.of(2017, 10, 29)),
				new Employee(16, "Paula", "Finance", 62000, 28, "Female", LocalDate.of(2022, 3, 16)),
				new Employee(17, "Quentin", "HR", 48000, 23, "Male", LocalDate.of(2023, 1, 8)),
				new Employee(18, "Cachel", "Marketing", 93000, 34, "Female", LocalDate.of(2019, 4, 25)),
				new Employee(19, "Steve", "IT", 99000, 39, "Male", LocalDate.of(2020, 11, 12)),
				new Employee(20, "Tina", "Finance", 56000, 27, "Female", LocalDate.of(2024, 2, 5)));

		// Get a list of employees with salary greater than 50,000.
		// List<Employee> empList =
		// employees.stream().filter(e->e.getSalary()>78000).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e.getName() + "has salary of:
		// "+e.getSalary()));
		// Get a list of employees below 30 years of age.
		// List<Integer>empList =
		// employees.stream().map(Employee::getAge).filter(e->e<30).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e));
		// Get a list of employees whose first name starts with "A".
		// List<String> empList =
		// employees.stream().map(Employee::getName).filter(d->d.startsWith("A")).collect(Collectors.toList());
		// empList.forEach(System.out::println);
		// Get a list of employees whose last name ends with "son".
		// List<Employee> empList =
		// employees.stream().filter(e->e.getName().endsWith("ula")).collect(Collectors.toList());
		// empList.forEach(e->System.out.println(e.getName()));
		// Get a list of employees whose salary is between 40,000 and 60,000.
		// employees.stream().map(Employee::getSalary).filter(e->e<50000 &
		// e>30000).collect(Collectors.toList()).forEach(e->System.out.println(e));;
		// Get a list of employees whose age is an even number.
		// employees.stream().filter(e->e.getAge()%2==0).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+"
		// "+e.getDepartment()+" "+e.getSalary()));
		// Get a list of employees whose first name contains "an".
		// employees.stream().map(Employee::getName).filter(e->e.contains("an")).collect(Collectors.toList()).forEach(System.out::println);
		// Get the top 3 highest paid employees.
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList()).
		// forEach(e->System.out.println("One of the highest paid employees:
		// "+e.getName()+ "-" +e.getSalary()));
		// Get the top 5 youngest employees.
		// employees.stream().sorted(Comparator.comparing(Employee::getAge)).limit(3).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+"
		// has age of "+e.getAge()+" years"));;
		// Skip the first 2 highest paid employees and get the next one.
		// Employee empName =
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
		// System.out.println("this is empName: "+empName.getName()+ " and salary he's
		// getting is "+empName.getSalary());
		// Skip the first 3 oldest employees and get the next two.
		// employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(3).limit(2).collect(Collectors.toList()).
		// forEach(e->System.out.println(e.getName()+"
		// "+e.getAge()));
		// Get the second highest salary employee.
		// Employee emp =
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
		// System.out.println(emp.getName()+" gets salary of "+emp.getSalary());
		// Get the last employee after sorting by salary descending.
		// Double empSal =
		// employees.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();
		// System.out.println("this is empSalary the minimum one: "+empSal);
		// Get the middle employee after sorting by age ascending.
		// Employee employee =
		// employees.stream().sorted(Comparator.comparing(Employee::getAge)).skip(employees.size()/2).findFirst().get();
		// System.out.println(employee.getAge()+" this is the middle one
		// "+employee.getName());
		// Get the first employee whose first name starts with "M"
		// String name =
		// employees.stream().filter(e->e.getName().startsWith("M")).findFirst().get().getName();
		// System.out.println("this is the name we are looking for: "+name);
		// Get the last employee whose salary is above 50,000.
		// Employee emp =
		// employees.stream().filter(e->e.getSalary()>50000).findFirst().get();
		// System.out.println(emp.getName()+" is the first employee who has salary more
		// than 50000, and the salary is: "+emp.getSalary());
		// Sort employees by first name ascending.
		// employees.stream().map(e->e.getName()).sorted(Comparator.reverseOrder()).forEach(System.out::println);;
		// Sort employees by salary ascending.
		// //
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(e->System.out.println("this
		// is name: "+e.getName()+" and this is salary: "+e.getSalary()));
		// employees.stream().map(e->e.getAge()).sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
		// Sort employees first by age, then by salary.
		// employees.stream().sorted(Comparator.comparing((Employee
		// e)->e.getAge()).thenComparing(e->e.getSalary())).collect(Collectors.toList()).forEach(
		// e->System.out.println(e.getName() + " -> "+e.getAge()+" -> "+e.getSalary()));
		// .then part only works if first condition is not equal.
		// Sort employees first by salary, then by first name.
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(
		// Collectors.toList()).forEach(e->System.out.println("sorted again:
		// "+e.getName()+" "+e.getSalary()+" "+e.getName()));
		// Get the employee with the highest salary.
		// Employee emp =
		// employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
		// System.out.println(emp.getName()+" has highest salary of: "+emp.getSalary());
		// Get the employee with the lowest age.
		// int empAge =
		// employees.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst().get().getAge();
		// System.out.println("this is the lowest age of employee: "+empAge);
		// //Get a list of employee full names (name + " " + age).
		// employees.stream().map(e->e.getName()+"->"+e.getAge()).collect(Collectors.toList()).forEach(System.out::println);;
		// Get a set of all distinct first names.
		// employees.stream().map(Employee::getName).distinct().collect(Collectors.toList()).size();
		// Get a list of salaries only.
		// employees.stream().map(Employee::getSalary).collect(Collectors.toList()).forEach(System.out::println);
		// Get a list of unique salaries.
		// employees.stream().map(e->e.getSalary()).distinct().sorted().collect(Collectors.toList()).forEach(e->System.out.println("this
		// is the salaries: "+e));
		// Get a map of employee id → full name.
		// employees.stream().collect(Collectors.toMap(e->e.getName(),
		// e->e.getSalary())).forEach((name, sal)->System.out.println(
		// "this is name: "+name+" and this is salary: "+sal));
		// Get a map of employee id → salary.
		// employees.stream().collect(Collectors.toMap(e->e.getId(),
		// e->e.getSalary())).forEach((id, sal)->System.out.println(
		// "this is id: "+id+" this is salary: "+sal));

		// System.out.println(empAge);
		// Map<String, List<Employee>> emp =
		// employees.stream().collect(Collectors. roupingBy(Employee::getName));
		// emp.forEach((name, emps)->{
		// System.out.println("employee name is: "+name);
		// emps.forEach(e->System.out.println(name+"'s salary: "+e.getSalary()+" and
		// employee age is"+e.getAge()));
		// });
		// //Get a map of age → count of employees with that age.
		// Map<Integer, List<Employee>> emp =
		// employees.stream().collect(Collectors. roupingBy(Employee::getAge));
		// emp.forEach((age, emps)->{
		// System.out.println("we have "+emps.size()+" employees with age of "+age+"
		// years.");
		// k);
		// Join all employee names with comma.
		// String empNames =
		// employees.stream().map(e->e.getName()).collect(Collectors.joining(", "));
		// System.out.println(empNames);
		// Join all names with age.
		// Map<String, Integer> empMap =
		// employees.stream().collect(Collectors.toMap(Employee::getName,
		// Employee::getAge, ((first, second)->second)));
		// empMap.forEach((name, age)->System.out.println(name+":"+age));
		// Find any employee whose salary > 70,000.
		// employees.stream().filter(e->e.getSalary()>70000).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+"
		// "+e.getSalary()));
		// Find the first employee whose age < 25.
		// Employee emp = employees.stream().filter(e->e.getAge()<25).findFirst().get();
		// System.out.println(emp.getName()+" "+emp.getAge());
		// Find the first employee whose first name starts with "R".
		// String empName = employees.stream().filter(e ->
		// e.getName().startsWith("R")).findFirst().get().getName();
		// System.out.println(empName);
		// Find any employee whose last name contains "son".
		// int empSize =
		// employees.stream().filter(e->e.getName().contains("Ra")).collect(Collectors.toList()).size();
		// System.out.println("empSize: "+empSize);
		// Find an employee by id.
		// Employee employee =
		// employees.stream().filter(e->e.getId()==7).findFirst().get();
		// System.out.println(employee.getName()+" "+employee.getAge()+"
		// "+employee.getId());
		// Find the first employee whose salary equals the average salary.
		// List<Employee> emp =
		// employees.stream().filter(e->e.getSalary()>employees.stream().mapToDouble(Employee::getSalary).average().orElse(0)).collect(Collectors.toList());
		// emp.forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
		// Find the employee with the longest first name.
		// String empName = employees.stream().sorted(Comparator.comparingInt((Employee
		// e)->e.getName().length()).reversed()).findFirst().get().getName();
		// System.out.println("emp name: "+empName);
		// Find the employee with the shortest last name.
		// Employee emp = employees.stream().min(Comparator.comparingInt((Employee
		// e)->e.getName().length())).get();
		// System.out.println(emp.getName()+" and length is: "+emp.getName().length());
		// int minSize =
		// employees.stream().mapToInt(e->e.getName().length()).min().getAsInt();
		// employees.stream().filter(e->e.getName().length()==minSize).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()+"
		// "+e.getName().length()));
		// Find the first employee whose full name contains "John".
		// Employee em =
		// employees.stream().filter(e->e.getName().contains("John")).findFirst().orElse(null);
		// System.out.println(em!=null ? em.getId()+" "+em.getName() : "no records
		// found");
		// System.out.println(emp!=null ? emp.getName()+" gets "+emp.getSalary():"no
		// record found");
		// Employee emp =
		// employees.stream().filter(e->BigInteger.valueOf((int)e.getSalary()).isProbablePrime(50)).findFirst().get();
		// System.out.println(emp!=null ? emp.getName()+" gets "+emp.getSalary():"no
		// record found");
		// Count employees with salary > 50,000.
		// Long emp =
		// employees.stream().filter(e->e.getSalary()>50000).collect(Collectors.counting());
		// System.out.println("there are "+emp+" employees who has salary more than
		// 50000.");
		// Count employees with age < 30.
		// Long empAge =
		// employees.stream().filter(e->e.getAge()<30).collect(Collectors.counting());
		// System.out.println(empAge);
		// Count employees with first name starting with "A".
		// employees.stream().filter(e->e.getName().startsWith("B")).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()));
		// Sum of all employee salaries.
		// System.out.println("sum of employee's salaries:
		// "+employees.stream().mapToDouble(e->e.getSalary()).sum());
		// Average salary of all employees.
		// Double empAvgSal =
		// employees.stream().mapToDouble(e->e.getSalary()).average().getAsDouble();
		// System.out.println("double: "+empAvgSal);
		// Max salary of employees under 40.
		// System.out.println("max sal:
		// "+employees.stream().filter(e->e.getAge()<40).mapToDouble(Employee::getSalary).max().getAsDouble());
		// Min salary of employees over 25.
		// double maxBelow =
		// employees.stream().filter(e->e.getAge()<25).mapToDouble(e->e.getSalary()).max().getAsDouble();
		// System.out.println(maxBelow);
		// Total number of employees above 35.
		// System.out.println("doing:
		// "+employees.stream().filter(e->e.getAge()>25).collect(Collectors.counting()));
		// Average age of employees with salary > 50,000.
		// double em =
		// employees.stream().filter(e->e.getSalary()>50000).mapToInt(Employee::getAge).average().getAsDouble();
		// System.out.println("em: "+em);
		// Total salary of employees whose first name starts with "M".
		// System.out.println("this is fine:
		// "+employees.stream().filter(e->e.getName().startsWith("C")).mapToDouble(Employee::getSalary).sum());
		// Check if all employees are older than 18.
		// System.out.println("this is boolean:
		// "+employees.stream().allMatch(e->e.getAge()>18));
		// Check if any employee has salary > 100,000.
		// System.out.println("employees has salary more than 10000:
		// "+employees.stream().allMatch(e->e.getSalary()>100000));
		// Check if no employee has age < 18.
		// System.out.println("not less than 18:
		// "+employees.stream().noneMatch(e->e.getAge()<18));
		// Check if any employee has last name "Smith".
		// System.out.println("Do we have an employee having name as Laura:
		// "+employees.stream().anyMatch(e->e.getName().equals("Laura")));
		// Check if no employee has negative salary.
		// System.out.println(employees.stream().anyMatch(e->e.getSalary()<0) ?
		// "Negative" : "Positive");
		// Check if all employees have salary >= 30,000.
		// System.out.println("Does everyone getting >=30k:
		// "+employees.stream().allMatch(e->e.getSalary()>=30000));
		// Check if any employee has full name containing "King".
		// System.out.println(employees.stream().anyMatch(e->e.getName().contains("nny")));
		// employees.stream().map(Employee::getName).filter(e->e.contains("nny")).collect(Collectors.toList()).forEach(e->System.out.println(e));
		// Check if all employees have age < 60.
		// System.out.println(employees.stream().allMatch(e->e.getAge()<60 &&
		// e.getAge()>18));
		// Check if no employee has first name starting with "Z".
		// System.out.println(employees.stream().noneMatch(e->e.getName().toUpperCase().startsWith("z"))
		// ? "no match found" : "match found");
		// Group employees by department
		// employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((dep,
		// emp)->
		// {
		// System.out.println(dep+" has "+emp.size()+" employees.");
		// int[] num = {1};
		//// AtomicInteger num = new AtomicInteger(1);
		// emp.forEach(e->
		// {
		// System.out.println(num[0]+++" "+e.getName());
		// });
		// });
		// Group employees by age.
		// Map<Integer, Optional<Employee>> empGroup =
		// employees.stream().collect(Collectors.groupingBy(Employee::getAge,
		// Collectors.maxBy(Comparator.comparing(
		// Employee::getSalary))));
		//
		// empGroup.forEach((age, emp)->System.out.println("this is the age: "+age+" and
		// this is the highest employee salary: "+ emp.get().getSalary()));
		// Group employees by salary range (<50k, 50k-100k, >100k).
		// Map<String, List<Employee>> empMap =
		// employees.stream().collect(Collectors.groupingBy(e -> {
		// if (e.getSalary() < 50000)
		// return "<50k";
		// else if (e.getSalary() < 100000)
		// return "50k-100k";
		// else
		// return "no value found";
		// }));
		//
		// empMap.forEach((range, emps) -> {
		// System.out.println("the range is: " + range);
		// emps.forEach(e -> System.out
		// .println(e.getName() + "=" + e.getDepartment() + "=" + e.getSalary()));
		// });
		// Count employees in each age group.
		// Map<Integer, List<Employee>> empAge =
		// employees.stream().collect(Collectors.groupingBy(Employee::getAge));
		// empAge.forEach((age, emps)->{
		// System.out.println("age is: "+age);
		// emps.forEach(e->System.out.println("emp name: "+e.getName()+"emp salary:
		// "+e.getSalary()+"emp dept: "+e.getDepartment()));
		// });
		// Count employees in each department.
		// Map<String, List<Employee>> empMap = employees.stream()
		// .collect(Collectors.groupingBy(Employee::getDepartment));
		// empMap.forEach((dept, emps) -> {
		// System.out.println(dept+" has "+emps.size()+" employees.");
		// });
		// Get max salary employee in each age group.
		// Map<Integer, Double> empMap = employees.stream()
		// .collect(Collectors.groupingBy(Employee::getAge,
		// Collectors.collectingAndThen(
		// Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
		// e->e.get().getSalary())));
		// empMap.forEach((age, maxSalary)->System.out.println("age: "+age+" maxSalary:
		// "+maxSalary));
		// Get min salary employee in each department.
		// employees.stream()
		// .collect(Collectors.groupingBy(Employee::getDepartment,
		// Collectors.collectingAndThen(
		// Collectors.minBy(Comparator.comparing(Employee::getSalary)),
		// e -> e.get().getSalary()))).forEach((a, b)->{System.out.println("dept: "+a+"
		// and min salary: "+b);});
		// Get sum of salaries by department.
		// employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		// Collectors.summingDouble(Employee::getSalary))).forEach((dept, salSum)->{
		// System.out.println("dept: "+dept+" salary sum: "+salSum);
		// });
		// Get average age by department.
		// employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		// Collectors.averagingDouble(e->e.getAge()))).forEach((e,f)->{
		// System.out.println("department: "+e+"avg age: "+f);
		// });
		// });
		// Group employees by first letter of first name.
		// Map<String, List<Employee>> ee =
		// employees.stream().collect(Collectors.groupingBy(e->String.valueOf(e.getName().charAt(0))));
		// printing by iterating over the Map, where employees are lrouped by the first
		// Character of their name.
		// ee.forEach((a, b)->{
		// System.out.println("Char is: ->->->->->-> "+a);
		// b.forEach(e->{
		// System.out.println("The name is: "+e.getName()+" and salary is:
		// "+e.getSalary());
		// });
		// });
		// Partition employees with salary > 50k and ≤ 50k.
		// employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >
		// 50000)).forEach((e, f) -> {
		// System.out.println("this is e: " + e);
		// f.forEach(ee -> {
		// System.out.println("name: " + ee.getName() + " salary: " + ee.getSalary());
		// });
		// });
		// Get first 3 employees with highest salary and return full names.
		//employees.stream().sorted(Comparator.comparing((Employee e) -> e.getSalary()).reversed()).limit(3)
		//		.forEach(e -> System.out.println(
		//				"emp name: " + e.getName() + "and their salary is: " + e.getSalary()));
		//Double maxSalary = employees.stream().map(Employee::getSalary).findFirst().get();
		//System.out.println(maxSalary);
	}
}
