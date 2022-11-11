import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.lang.Character;

import java.lang.*;

//The input.reset() statements after every input is used to clear the cache of the Scanner so it scans
//the proper input.

public class Management {

    Map<String, Employee> employees;
    Map<String, Client> clients;
    Map<String, Appointment> Appointments;
    Map<String, Service> services;

    Scanner input = new Scanner(System.in);



    public Management(){

        this.employees = new TreeMap<String,Employee>();
        this.clients = new TreeMap<String,Client>();
        this.Appointments = new TreeMap<String,Appointment>();
        this.services = new TreeMap<String,Service>();

    }

    public void createEmployee(){
        input.nextLine();

        System.out.print("Enter the name of the new employee: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.print("Enter the age of the new employee: ");
        int ageInput = input.nextInt();
        input.reset();
        System.out.print("Enter the employee ID: ");
        int IDinput = input.nextInt();
        input.reset();
        System.out.print("Enter the weekly salary of the new employee: ");
        double salaryInput = input.nextDouble();


        employees.put(nameInput, new Employee( IDinput, ageInput, nameInput, salaryInput));


    }

    public void deleteEmployee(){
        input.nextLine();

        System.out.println("Enter the name of the employee you want to delete: ");
        String nameinput = input.nextLine();

        employees.remove(nameinput);

        System.out.println("The employee, " + nameinput + ", has been removed.");

    }

    public void printEmployeeInfo(){
        input.nextLine();

        System.out.print("To print an employees info, enter their name: ");
        String nameInput = input.nextLine();

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
        input.nextLine();

        System.out.println("Enter the name of the employee you want to modify: ");
        String nameinput = input.nextLine();
        input.reset();

        System.out.println("Employee " + employees.get(nameinput).getName());
        System.out.println("Changed Name: ");
        String newNameInput = input.nextLine();
        input.reset();
        System.out.print("Changed Age: ");
        int newAge = input.nextInt();
        input.reset();
        System.out.print("Changed ID: ");
        int newID = input.nextInt();
        input.reset();
        System.out.print("Changed Weekly Salary: ");
        double newSalary = input.nextDouble();

        employees.remove(nameinput);
        employees.put(newNameInput,new Employee(newID,newAge,newNameInput,newSalary));

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        System.out.println("Updated Employee Information");
        printEmployeeInfo(employees.get(newNameInput));

    }

    public void createClient(){
        input.nextLine();

        System.out.print("Enter the name of the new client: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.print("Enter the new client's phone number: ");
        String pnInput = input.nextLine();
        input.reset();
        System.out.print("Enter the new client's email: ");
        String emailInput = input.nextLine();

        clients.put(nameInput, new Client(nameInput,pnInput,emailInput));

    }

    public void deleteClient(){
        input.nextLine();

        System.out.print("Enter the name of the client you want to delete: ");
        String nameInput = input.next();

        clients.remove(nameInput);

        System.out.println("The client, " + nameInput + ", has been removed.");

    }

    public void printClientInfo(){
        input.nextLine();

        System.out.print("To print a client's info, enter their name: ");
        String nameInput = input.nextLine();

        System.out.println("Name: " + clients.get(nameInput).getName());
        System.out.println("Phone Number: " + clients.get(nameInput).getPhoneNumber());
        System.out.println("Email: " + clients.get(nameInput).getEmail());
        System.out.println("Cars: ");
        clients.get(nameInput).printCarList();


    }

    private void printClientInfo(Client c){

        System.out.println("Name: " + c.getName());
        System.out.println("Phone Number: " + c.getPhoneNumber());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Cars: ");
        c.printCarList();


    }

    public void modifyClient(){
        input.nextLine();

        System.out.print("Enter the name of the client you want to modify: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.println("Client " + clients.get(nameInput).getName());
        System.out.print("Changed Name: ");
        String newNameInput = input.nextLine();
        input.reset();
        System.out.print("Changed Phone Number: ");
        String newPhone = input.nextLine();
        input.reset();
        System.out.print("Changed Email: ");
        String newEmail = input.nextLine();



//        System.out.print("Do you want to add a car? (y/n) ");

//        char addOrRemove = input.next().charAt(0);
//        if(addOrRemove == 'y'){
//
//        }




        clients.remove(nameInput);
        clients.put(newNameInput,new Client(newNameInput,newPhone,newEmail));

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        printClientInfo(clients.get(newNameInput));


    }

    public void createService(){
        input.nextLine();
        Scanner inputDouble = new Scanner(System.in);
        System.out.print("Enter the name of the new service: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.println("Enter the description of the new service :");
        String descInput = input.nextLine();
        input.reset();
        System.out.print("Enter the price of the new service: ");
        double priceInput = input.nextDouble();


        services.put(nameInput, new Service(nameInput,priceInput,descInput));

    }

    public void deleteService(){
        input.nextLine();

        System.out.print("Enter the name of the service you want to delete: ");
        String nameInput = input.nextLine();


        services.remove(nameInput);

        System.out.println("The service " + nameInput + " has been deleted.");
    }

    public void printServiceInfo(){
        input.nextLine();

        System.out.print("To print a Service's information, enter the name of the service: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.println("Name: " + services.get(nameInput).getServiceName());
        System.out.println("Description: ");
        System.out.println(services.get(nameInput).getDescription());
        System.out.println("Price: $" + services.get(nameInput).getPrice());
        System.out.println("Amount Sold: " + services.get(nameInput).getAmountSold());
    }

    private void printServiceInfo(Service s){

        System.out.println("Name: " + s.getServiceName());
        System.out.println("Description: ");
        System.out.println(s.getDescription());
        System.out.println("Price: " + s.getPrice());
        System.out.println("Amount Sold: " + s.getAmountSold());

    }

    public void modifyService(){
        input.nextLine(); //Resets scanner cache

        System.out.print("Enter the name of the service you want to modify: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.print("New Name: ");
        String newNameInput = input.nextLine();
        input.reset();
        System.out.println("New Description: ");
        String descInput = input.nextLine();
        input.reset();
        System.out.print("New Price: ");
        double priceInput = input.nextDouble();
        input.reset();
        System.out.print("Do you want to change the amount sold? (Y/N) ");
        Character query = input.next().charAt(0);


        if(query=='Y'||query=='y'){
            System.out.print("Enter the new amount of services sold: ");
            int amountSoldInput = input.nextInt();
            services.get(nameInput).setAmountSold(amountSoldInput);
        }

        services.remove(nameInput);
        services.put(newNameInput,new Service(newNameInput,priceInput,descInput));

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        printServiceInfo(services.get(newNameInput));


    }




    public void createAppointment(){
        input.nextLine();

        System.out.print("Enter the name of the client you are creating an appointment for: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the appointment date (mm/dd/yyyy): ");
        String dateInput = input.nextLine();
        input.reset();
        System.out.print("Enter the appointment time (hh:mm AM/PM): ");
        String timeInput = input.nextLine();
        input.reset();
        System.out.print("Enter the service that will be done: ");
        String serviceInput = input.nextLine();
        input.reset();
        System.out.println("Enter the employee that will be assigned to the appointment: ");
        String empInput = input.nextLine();

        Appointments.put(clientInput, new Appointment(services.get(serviceInput),clients.get(clientInput),employees.get(empInput),timeInput,dateInput));
    }

    public void deleteAppointment(){


    }



}
