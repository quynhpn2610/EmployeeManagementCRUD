package service;

import entity.Employee;

public interface IEmployee {
    // Add (Create) info of an Employee
    void addEmployee(Employee e);

    // Edit (Update) Employee info
    void updateEmployee(String id, String newId, String newName, int newAge);

    // Delete an Employee
    void deleteEmployee(String id);

    // Show(Read) all Employee info
    void showAllInfo();

    // Search an Employee's info
    void searchEmployee(String name);


}
