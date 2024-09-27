package Company_Roster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<Employee> employees = new LinkedHashSet<>();
        LinkedHashMap<String, Department> departments = new LinkedHashMap<>();
        Employee employee;
        Department department;
        for (int i = 0; i < number; i++) {
            String [] info = scanner.nextLine().split("\\s+");
            employee = new Employee(info[0], Double.parseDouble(info[1]), info[2], info[3]);

            if(info.length > 4){
                if(info.length == 5){
                    if(info[4].contains("@"))
                        employee.setEmail(info[4]);
                    else
                        employee.setAge(Integer.parseInt(info[4]));
                } else {
                    if(info[4].contains("@")){
                        employee.setEmail(info[4]);
                        employee.setAge(Integer.parseInt(info[5]));
                    }
                    else {
                        employee.setAge(Integer.parseInt(info[4]));
                        employee.setEmail(info[5]);
                    }
                }
            }
            employees.add(employee);


            if(departments.containsKey(info[3])){
                department = departments.get(info[3]);
                department.addCount();
                department.addSalary(Double.parseDouble(info[1]));
                departments.put(info[3], department);
            } else {
                department = new Department(info[3], Double.parseDouble(info[1]));
                departments.put(info[3], department);
            }
        }

        Map.Entry<String, Department> departmentWithHighestAvgSalary = departments
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(d -> d.getValue().getAverage()))
                .orElse(null);

        System.out.println(String.format("Highest Average Salary: %s", departmentWithHighestAvgSalary.getKey()));

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .filter((p) -> p.getDepartment().equals(departmentWithHighestAvgSalary.getKey()))
                .forEach(p -> System.out.println(String.format(Locale.US,"%s %.2f %s %d", p.getName(), p.getSalary(), p.getEmail(), p.getAge())));


    }

}
