package JavaAdvanced.DefiningClasses.CompanyRoster_ex_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {

    public String name;
    public List<Employee> employeeList;

    public Department() {
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addEmployeeList(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(employeeList);
    }

    public double getAverageSalary() {
        double avgSalary = 0.0;
        for (Employee employee : this.employeeList) {
            avgSalary += employee.getSalary();
        }
        return avgSalary / this.employeeList.size();
    }

}
