import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;
import java.util.List;

class HowManyTimes {

    public static void main(String[] args) {

        // Input array with duplicate numbers
        Integer[] a = {2,2,5,1,9,8,5,0,2,4,6,2,7,5,0,5};

        // Sorting array (not required for counting, just for ordered view)
        Arrays.sort(a);

        // Calling method to count occurrences
        isRepeated(a);
    }

    public static void isRepeated(Integer[] a) {

        // Convert array to List so we can use Stream API
        List<Integer> aa = Arrays.asList(a);

        // Group numbers and count how many times each appears
        Map<Integer, Long> repeated =
                aa.stream()
                  .collect(Collectors.groupingBy(
                      Function.identity(),     // key = number itself
                      Collectors.counting()    // value = count
                  ));

        // Print frequency of each number
        System.out.println(repeated);


        // ================== EXAMPLE 2 ==================
        // For counting department-wise employee with max salary

        Map<String, Optional<Employee>> maxSalary =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             Employee::getDepartment,                 // group by department
                             Collectors.maxBy(Comparator.comparing(Employee::getSalary)) // find max salary employee
                         ));

        // Print result
        maxSalary.forEach((dept, emp) ->
                System.out.println(emp.get().getName() +
                        " who works in " + dept +
                        " department gets highest salary of " +
                        emp.get().getSalary()));
    }
}
