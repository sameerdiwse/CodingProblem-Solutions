import java.util.*;
import java.time.*;
import java.util.stream.*;

public class Test {

    public static void main(String[] args) {

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
                new Employee(10, "Jenny", "Marketing", 50000, 25, "Female", LocalDate.of(2024, 4, 1))
        );

        // Highest paid employee
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(emp -> System.out.println("Highest Paid: " + emp.getName() + " -> " + emp.getSalary()));

        // Max salary only
        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);

        System.out.println("Max Salary: " + maxSalary);

        // Average salary
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average Salary: " + avgSalary);

        // Sort employees by salary (descending)
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(emp -> System.out.println(emp.getName() + " -> " + emp.getSalary()));

        // Simple array example
        int[] nums = {3, 2, 1, 5, 4};
        int max = Arrays.stream(nums).max().orElse(0);
        System.out.println("Max in array: " + max);
    }
}
