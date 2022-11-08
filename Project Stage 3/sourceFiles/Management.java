import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import java.lang.*;

public class Management {

    Map<String, Employee> employees;
    Map<String, Client> clients;
    Map<String, Appointment> Appointments;
    Map<String, Service> services;
    Map<String, SpecialClient> specialClients;

    Scanner input = new Scanner(System.in);

    public Management(){

        this.employees = new TreeMap<String,Employee>();
        this.clients = new TreeMap<String,Client>();
        this.Appointments = new TreeMap<String,Appointment>();
        this.services = new TreeMap<String,Service>();
        this.specialClients = new TreeMap<String,SpecialClient>();

    }

    public void createEmployee(){

        System.out.print("Enter the name of the new employee: ");
        String nameInput = input.next();
        System.out.print("Enter the age of the new employee: ");
        int ageInput = input.nextInt();
        System.out.print("Enter the employee ID: ");
        int IDinput = input.nextInt();
        System.out.print("Enter the weekly salary of the new employee: ");
        double salaryInput = input.nextDouble();


        employees.put(nameInput, new Employee( IDinput, ageInput, nameInput, salaryInput));


    }

    public void deleteEmployee(){

        System.out.println("Enter the name of the employee you want to delete: ");
        String nameinput = input.next();

        employees.remove(nameinput);

        System.out.println("The employee, " + nameinput + ", has been removed.");

    }

    public void printEmployeeInfo(){

        System.out.print("To print an employees info, enter their name: ");
        String nameInput = input.next();

        System.out.println("Name: " + employees.get(nameInput).getName());
        System.out.println("Age: " + employees.get(nameInput).getAge());
        System.out.println("ID: " + employees.get(nameInput).getID());
        System.out.println("WeeklySalary: " + employees.get(nameInput).getWeeklySalary());

    }

    private void printEmployeeInfo(Employee e){

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("ID: " + e.getID());
        System.out.println("WeeklySalary: " + e.getWeeklySalary());
    }

    public void modifyEmployee() {

        System.out.println("Enter the name of the employee you want to modify: ");
        String nameinput = input.next();

        System.out.println("Employee " + employees.get(nameinput).getName());
        System.out.print("Changed Age: ");
        int newAge = input.nextInt();
        System.out.print("Changed ID: ");
        int newID = input.nextInt();
        System.out.print("Changed Weekly Salary: ");
        double newSalary = input.nextDouble();

        employees.get(nameinput).setAge(newAge);
        employees.get(nameinput).setID(newID);
        employees.get(nameinput).setWeeklySalary(newSalary);

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        System.out.println("Updated Employee Information");
        printEmployeeInfo(employees.get(nameinput));

    }

    public void createClient(){

        System.out.print("Enter the name of the new client: ");
        String nameInput = input.next();
        System.out.print("Enter the new client's phone number: ");
        String pnInput = input.next();
        System.out.print("Enter the new client's email: ");
        String emailInput = input.next();

        clients.put(nameInput, new Client(nameInput,pnInput,emailInput));

    }

    public void deleteClient(){

        System.out.print("Enter the name of the client you want to delete: ");
        String nameInput = input.next();

        clients.remove(nameInput);

        System.out.println("The client, " + nameInput + ", has been removed.");

    }

    public void printClientInfo(){

        System.out.print("To print a client's info, enter their name: ");
        String nameInput = input.next();

        System.out.print("Name: " + clients.get(nameInput).getName());
        System.out.print("Phone Number: " + clients.get(nameInput).getPhoneNumber());
        System.out.print("Email: " + clients.get(nameInput).getEmail());
        System.out.println("Cars: ");
        clients.get(nameInput).printCarList();


    }

    private void printClientInfo(Client c){

        System.out.print("Name: " + c.getName());
        System.out.print("Phone Number: " + c.getPhoneNumber());
        System.out.print("Email: " + c.getEmail());
        System.out.println("Cars: ");
        c.printCarList();


    }

    public void modifyClient(){

        System.out.print("Enter the name of the client you want to modify: ");
        String nameInput = input.next();

        System.out.println("Client " + clients.get(nameInput).getName());
        System.out.print("Changed Phone Number: ");
        String newPhone = input.next();
        System.out.print("Changed Email: ");
        String newEmail = input.next();


//        System.out.print("Do you want to add a car? (y/n) ");

//        char addOrRemove = input.next().charAt(0);
//        if(addOrRemove == 'y'){
//
//        }




        clients.get(nameInput).setPhoneNumber(newPhone);
        clients.get(nameInput).setEmail(newEmail);

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        printClientInfo(clients.get(nameInput));


    }



}
