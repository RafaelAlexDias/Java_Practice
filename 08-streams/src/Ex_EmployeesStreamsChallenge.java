import Ex_Employee.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Exercise: Employees streams challenge
 *
 * A practical pipeline on a list of Employee objects:
 * filter by department and salary, map to names, reduce salaries and findFirst.
 */
public class Ex_EmployeesStreamsChallenge {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Rafael", "IT", 1800),
                new Employee("Maria", "HR", 1500),
                new Employee("João", "IT", 2500),
                new Employee("Ana", "Marketing", 1700),
                new Employee("Miguel", "IT", 3200),
                new Employee("Rui", "HR", 1400),
                new Employee("Carolina", "Marketing", 2100),
                new Employee("Pedro", "IT", 2800)
        );

        // Exercise 1
        System.out.println("Exercise 1");

        List<Employee> itEmployees = employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .toList();

        itEmployees.forEach(employee ->
                System.out.println(employee.getName())
        );


        // Exercise 2
        System.out.println("\nExercise 2");

        List<String> lowercaseEmployees = employees.stream()
                .map(Employee::getName)
                .map(String::toLowerCase)
                .toList();

        System.out.println(lowercaseEmployees);


        // Exercise 3
        System.out.println("\nExercise 3");

        List<Employee> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 2000)
                .toList();

        highSalaryEmployees.forEach(employee ->
                System.out.println(employee.getName())
        );


        // Exercise 4
        System.out.println("\nExercise 4");

        double salaries = employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(salaries);


        // Exercise 5
        System.out.println("\nExercise 5");

        boolean checkSalaries = employees.stream()
                .allMatch(employee -> employee.getSalary() >= 1000);

        System.out.println(checkSalaries);


        // Exercise 6
        System.out.println("\nExercise 6");

        Optional<Employee> findEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 3000)
                .findFirst();

        findEmployee.ifPresent(employee ->
                System.out.println(employee.getName())
        );
    }
}