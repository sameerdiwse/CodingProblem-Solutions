import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000, 28, "Female", LocalDate.of(2022, 5, 10)),
                new Employee(2, "Bob", "Finance", 75000, 35, "Male", LocalDate.of(2020, 3, 15)),
                new Employee(3, "Charlie", "IT", 90000, 30, "Male", LocalDate.of(2019, 7, 1)),
                new Employee(4, "Diana", "IT", 120000, 42, "Female", LocalDate.of(2018, 1, 25)),
                new Employee(5, "Ethan", "Finance", 45000, 24, "Male", LocalDate.of(2023, 8, 12))
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
        );

        // Employees with salary > 50k
        List<Employee> highSalary = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList();

        // Names list
        List<String> names = employees.stream()
                .map(Employee::getName)
                .toList();

        // Distinct departments
        List<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        // Names starting with A
        List<String> namesWithA = employees.stream()
                .map(Employee::getName)
                .filter(n -> n.startsWith("A"))
                .toList();

        // Highest salary
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(e -> System.out.println("Highest: " + e.getName()));

        // Lowest salary
        employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .ifPresent(e -> System.out.println("Lowest: " + e.getName()));

        // Any salary > 100k
        boolean hasHighPackage = employees.stream()
                .anyMatch(e -> e.getSalary() > 100000);

        System.out.println("Any >100k: " + hasHighPackage);

        // Count age > 30
        long count = employees.stream()
                .filter(e -> e.getAge() > 30)
                .count();

        System.out.println("Age >30 count: " + count);

        // First joined
        employees.stream()
                .min(Comparator.comparing(Employee::getJoiningDate))
                .ifPresent(e -> System.out.println("First joined: " + e.getName()));

        // Latest joined
        employees.stream()
                .max(Comparator.comparing(Employee::getJoiningDate))
                .ifPresent(e -> System.out.println("Latest joined: " + e.getName()));

        // Max in array (no boxing needed)
        int[] arr = {1, 4, 23, 103, 54, 3, 21, 90};
        int max = Arrays.stream(arr).max().orElse(-1);

        System.out.println("Max: " + max);
    }
}
