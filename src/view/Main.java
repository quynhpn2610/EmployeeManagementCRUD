package view;

import entity.Employee;
import service.EmployeeManagement;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static EmployeeManagement em = new EmployeeManagement();
    static void showMenu(){
        System.out.println("Welcome to the Employee Management app. Please select an option:");
        System.out.println("1 - Add new employee info");
        System.out.println("2 - Update current employee info");
        System.out.println("3 - Delete employee info");
        System.out.println("4 - Show all employee info");
        System.out.println("5 - Search for an employee's info");
        System.out.println("6 - Quit program");
    }

    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            showMenu(); //print everything above
            int userChoice = Integer.parseInt(sc.nextLine()); //allow user to select an option
            switch(userChoice) {
                case 1: //Add (Create)
                    System.out.println("---Add new employee---"); //show users what they picked
                    System.out.println("Enter name");
                    String nameToadd = sc.nextLine(); //allow user to enter a name
                    System.out.println("Enter age");
                    int ageToadd = Integer.parseInt(sc.nextLine()); //allow user to enter an age
                    System.out.println("Enter id");
                    String idToadd = sc.nextLine(); //allow user to enter an id
                    Employee newEmployee = new Employee(nameToadd, ageToadd, idToadd); //construct a new employee having name, age, id
                    em.addEmployee(newEmployee); //add this new employee to the employeeList
                    break;
                case 2: //Update
                    System.out.println("---Update current employee info---");
                    System.out.println("Enter id of the employee you want to update: ");
                    String idToupdate = sc.nextLine();
                    System.out.println("New id: ");
                    String newId = sc.nextLine();
                    System.out.println("New name: ");
                    String newName = sc.nextLine();
                    System.out.println("New age: ");
                    int newAge = Integer.parseInt(sc.nextLine());
                    em.updateEmployee(idToupdate, newId, newName, newAge);
                    break;
                case 3: //Delete
                    System.out.println("---Delete employee info---");
                    System.out.println("Enter id of the employee you want to delete: ");
                    String idTodelete = sc.nextLine();
                    em.deleteEmployee(idTodelete);
                    break;
                case 4: //Show all info
                    System.out.println("---Show all employee info---");
                    em.showAllInfo();
                    break;
                case 5: //Search info of an employee
                    System.out.println("---Search for employee info---");
                    System.out.println("Enter name of the employee: ");
                    String nameTosearch = sc.nextLine();
                    em.searchEmployee(nameTosearch);
                    break;
                case 6: //Quit
                    System.out.println("Close program. Bye!");
                    condition = false;
                    break;
                default: //When user fails to input 1-6
                    System.out.println("Invalid input. Please pick 1-6.");
            }


        }

    }
}
