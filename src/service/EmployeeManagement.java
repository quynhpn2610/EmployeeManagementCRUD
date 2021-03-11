package service;

import entity.Employee;

import java.util.ArrayList;


public class EmployeeManagement implements IEmployee {

    // Attributes
    ArrayList<Employee> employeeList = new ArrayList<>();

    // Methods

    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    @Override
    public void updateEmployee(String id, String newId, String newName, int newAge) {
        int count = 0;
        if (employeeList.isEmpty()){
            System.out.println("Empty list. Cannot update!");
            return;
        }
        for (Employee e : employeeList) {
            if (id.equals(e.getId())) {
                e.setId(newId);
                e.setName(newName);
                e.setAge(newAge);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot update!");
        } else {
            System.out.println("Successfully updated");
        }

    }

    @Override
    public void deleteEmployee(String id) {
        int count = 0;
        if (employeeList.isEmpty()){
            System.out.println("Empty list. Cannot delete!");
            return;
        }

        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                employeeList.remove(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Cannot delete");
        } else {
            System.out.println("Successfully deleted");
        }
    }

    @Override
    public void showAllInfo() {
        if (employeeList.isEmpty()){
            System.out.println("No info to show!");
            return;
        }
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
    }

    @Override
    public void searchEmployee(String name) {
        if (employeeList.isEmpty()){
            System.out.println("No employee to search!");
            return;
        }
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(employeeList.get(i).toString());
            }
        }
    }


}
