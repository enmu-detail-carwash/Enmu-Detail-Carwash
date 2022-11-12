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
        System.out.print("Enter the employee that will be assigned to the appointment: ");
        String empInput = input.nextLine();


        Appointments.put(dateInput + clientInput, new Appointment(services.get(serviceInput),clients.get(clientInput),employees.get(empInput),timeInput,dateInput));
    }

    public void deleteAppointment(){
        input.nextLine();

        System.out.print("Enter the name of the client, who's appointment you want to delete: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the date of the appointment you want to delete (mm/dd/yyyy): ");
        String dateInput = input.nextLine();


        Appointments.remove(dateInput + clientInput);

    }

    public void printAppointment(){
        input.nextLine();

        System.out.print("Enter the name of the client, who's appointment you want to print: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("To print an appointment's info print the date of the appointment (mm/dd/yyyy): ");
        String dateInput = input.nextLine();


        Appointments.get(dateInput + clientInput).displayAppInfo();
    }

    private void printAppointment(Appointment a){

        a.displayAppInfo();

    }

    public void modifyAppointment(){
        input.nextLine();

        System.out.print("Enter the client's name of the appointment you want to change: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the date of the appointment you want to change: ");
        String dateInput = input.nextLine();
        input.reset();

        System.out.print("Changed Client: ");
        String newClientInput = input.nextLine();
        input.reset();
        System.out.print("Changed date: ");
        String newDateInput = input.nextLine();
        input.reset();
        System.out.print("Changed time: ");
        String newTimeInput = input.nextLine();
        input.reset();
        System.out.print("Changed service: ");
        String newServiceInput = input.nextLine();
        input.reset();
        System.out.print("Changed assigned employee: ");
        String newEmployeeInput = input.nextLine();

        Appointments.remove(dateInput + clientInput);
        Appointments.put(newDateInput+newClientInput,(new Appointment(services.get(newServiceInput),clients.get(newClientInput),employees.get(newEmployeeInput),newTimeInput,newDateInput)));

        System.out.println("<><><><><><><><><><><><<><><>");
        System.out.println("");
        printAppointment(Appointments.get(newDateInput + newClientInput));

    }

    public void printListEmployees(){
        System.out.println("|Name:       |ID:       |Age:       |Salary:       |");
        for(String key: employees.keySet()){


            System.out.println("|" + employees.get(key).getName() +"|" + employees.get(key).getID() +"|" +
                    employees.get(key).getAge() + "|" + employees.get(key).getWeeklySalary());

        }
    }
    public void printListClients(){
        System.out.println("|Name:       |Phone Number:       |Email:       |");
        System.out.println("|Cars:       |");
        for(String key: clients.keySet()){
            System.out.println("|" + clients.get(key).getName()+"|"+clients.get(key).getPhoneNumber()+"|"+
                    clients.get(key).getEmail());
            System.out.print("|");
            clients.get(key).printCarList();
            System.out.println("|");
        }
    }
    public void printListService(){
        System.out.println("|Name:       |");
        System.out.println("|Description:       |");
        System.out.println("|Price:       |");
        for(String key: services.keySet()){
            System.out.println("");
            System.out.println("|"+services.get(key).getServiceName() +"|");
            System.out.println("");
            System.out.println("|" + services.get(key).getDescription()+"|");
            System.out.println("");
            System.out.printf("|$%.2f",services.get(key).getPrice());
            System.out.println("");
        }
    }
    public void printListAppointments(){
        System.out.println("|Date:       |Time:        |Client:       |Service:       |");
        for(String key: Appointments.keySet()){

            System.out.println("|" +Appointments.get(key).getAppDate() + "|" + Appointments.get(key).getAppTime() + "|"
                    + Appointments.get(key).getClient().getName() + "|" + Appointments.get(key).getService().getServiceName() + "|");

        }
    }
    public void addClientCar(){

        System.out.print("To add assign a to a client, enter their name: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the type of car: ");
        String typeInput = input.nextLine();
        input.reset();
        System.out.print("Enter the car's make: ");
        String makeInput = input.nextLine();
        input.reset();
        System.out.print("Enter the car's model");
        String modelInput = input.nextLine();
        input.reset();
        System.out.print("Enter the year model of the car: ");
        String yearInput = input.nextLine();
        input.reset();
        System.out.print("Enter the color of the car: ");
        String colorInput = input.nextLine();
        input.reset();
        System.out.print("Enter the license plate of the car: ");
        String licenseInput = input.nextLine();
        input.reset();

        clients.get(clientInput).addCar(new Car(colorInput,licenseInput,typeInput,yearInput,modelInput,makeInput));
    }
    public void deleteClientCar(){

        System.out.print("To delete a client's car, enter the client's name: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("License Plate: ");
        String licenseInput = input.nextLine();
        input.reset();
        for(int i = 0; i<clients.get(clientInput).getCarList().size();i++){
            if(clients.get(clientInput).getCarList().get(i).getCarLicensePlateNum() == licenseInput){
                clients.get(clientInput).getCarList().remove(i);
            }
        }


    }

    public void modifyClientCar(){

        System.out.print("To modify a client's car, enter the client's name: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the license plate of the car you want to modify: ");
        String licenseInput = input.nextLine();
        input.reset();
        System.out.print("Changed Type: ");
        String typeInput = input.nextLine();
        input.reset();
        System.out.print("Changed Make: ");
        String makeInput = input.nextLine();
        input.reset();
        System.out.print("Changed Model: ");
        String modelInput = input.nextLine();
        input.reset();
        System.out.print("Change Year: ");
        String yearInput = input.nextLine();
        input.reset();
        System.out.print("Change Color: ");
        String colorInput = input.nextLine();
        input.reset();
        System.out.print("Change License Plate: ");
        String newLicensePlate = input.nextLine();
        input.reset();

        for(int i = 0; i<clients.get(clientInput).getCarList().size();i++){
            if(clients.get(clientInput).getCarList().get(i).getCarLicensePlateNum() == licenseInput){
                clients.get(clientInput).getCarList().get(i).setCarColor(colorInput);
                clients.get(clientInput).getCarList().get(i).setCarMake(makeInput);
                clients.get(clientInput).getCarList().get(i).setCarModel(modelInput);
                clients.get(clientInput).getCarList().get(i).setCarType(typeInput);
                clients.get(clientInput).getCarList().get(i).setCarYear(yearInput);
                clients.get(clientInput).getCarList().get(i).setCarLicensePlateNum(newLicensePlate);
            }
        }

    }





}
