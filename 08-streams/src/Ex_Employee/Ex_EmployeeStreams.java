package Ex_Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex_EmployeeStreams {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rafael", "IT", 1800),
                new Employee("Maria", "HR", 1500),
                new Employee("João", "IT", 2500),
                new Employee("Ana", "Marketing", 1700),
                new Employee("Miguel", "IT", 3200),
                new Employee("Rui", "HR", 1400)
        );


        // 1. Employees with salary greater than 1800

        List<Employee> highEarners = employees.stream()
                .filter(employee -> employee.getSalary() > 1800)
                .toList();

        System.out.println("Salary > 1800:");
        highEarners.forEach(employee ->
                System.out.println(employee.getName())
        );


        // 2. Get all names in uppercase

        List<String> namesUppercase = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .toList();

        System.out.println("\nNames:");
        namesUppercase.forEach(System.out::println);


        // 3. Calculate total salaries

        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("\nTotal salary: " + totalSalary);


        // 4. Check if someone earns more than 3000

        boolean hasHighSalary = employees.stream()
                .anyMatch(employee -> employee.getSalary() > 3000);

        System.out.println(
                "\nSomeone earns more than 3000: " + hasHighSalary
        );


        // 5. Find first employee from IT

        Optional<Employee> firstITEmployee = employees.stream()
                .filter(employee ->
                        employee.getDepartment().equals("IT")
                )
                .findFirst();

        firstITEmployee.ifPresent(employee ->
                System.out.println(
                        "\nFirst IT employee: " + employee.getName()
                )
        );


        // 6. Group employees by department

        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getDepartment
                                )
                        );

        System.out.println("\nEmployees by department:");

        employeesByDepartment.forEach(
                (department, employeeList) -> {

                    System.out.println(department);

                    employeeList.forEach(employee ->
                            System.out.println(
                                    "  " + employee.getName()
                            )
                    );
                }
        );
    }
}