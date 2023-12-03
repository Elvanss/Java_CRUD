package ls10.lab.service.impl;

import ls10.lab.dao.impl.EmployeeDao;
import ls10.lab.model.Employee;
import java.util.List;

public class EmployeeImpl {
    private EmployeeDao employeeDao;

    public EmployeeImpl() {
        this.employeeDao = new EmployeeDao();
    }

    public void create(Employee employee) {
        employeeDao.insert(employee);
    }

    public void display(List<Employee> employees) {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println("Mã Nhân Viên: " + employee.getMaNV() + ", Tên: " + employee.getTen() + ", Lương: " + employee.getLuong());
        }
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.getAll();
    }
}

