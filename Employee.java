import java.time.LocalDate;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;
    private LocalDate joiningDate;

    // Constructor
    public Employee(int id, String name, String department,
                    double salary, int age, String gender,
                    LocalDate joiningDate) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.joiningDate = joiningDate; // FIXED
    }

    // Getters
    public int getId() { return id; }

    public String getName() { return name; }

    public String getDepartment() { return department; }

    public double getSalary() { return salary; }

    public int getAge() { return age; }

    public String getGender() { return gender; }

    public LocalDate getJoiningDate() { return joiningDate; }

    // Optional: toString (very useful for debugging)
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
