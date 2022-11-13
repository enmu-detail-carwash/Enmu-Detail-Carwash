import java.util.*;
import java.lang.Character;

import java.lang.*;


//The input.reset() statements after every input is used to clear the cache of the Scanner so it scans
//the proper input.

public class Management {

    Map<String, Employee> employees;
    Map<String, Client> clients;
    Map<String, Appointment> Appointments;
    Map<String, Service> services;
    Map<String, Membership> memberships;

    Map<String, Sale> sales;

    Scanner input = new Scanner(System.in);



    public Management(){

        this.employees = new TreeMap<String,Employee>();
        this.clients = new TreeMap<String,Client>();
        this.Appointments = new TreeMap<String,Appointment>();
        this.services = new TreeMap<String,Service>();
        this.memberships = new TreeMap<String,Membership>();
        this.sales = new TreeMap<String,Sale>();

    }

    public void createMembership(){


        System.out.print("Enter the name of the new membership tier: ");
        String memberName = input.nextLine();
        input.reset();
        System.out.println("Enter the discount this membership will apply: ");
        double discountAmountInput = input.nextDouble();
        input.reset();

        memberships.put(memberName, new Membership(memberName,discountAmountInput));
        input.nextLine();
    }

    public void deleteMembership(){

        System.out.println("Enter the name of the membership tier you want to delete: ");
        String name = input.nextLine();
        input.reset();

        memberships.remove(name);
        input.nextLine();
    }

    public void modifyMembership(){

        System.out.println("Enter the name of the membership tier you want to modify: ");
        String name = input.nextLine();
        System.out.println("Membership "+ name);
        System.out.println("Changed name: ");
        String newName = input.nextLine();
        input.reset();
        System.out.println("Changed discount amount: ");
        double discount = input.nextDouble();
        input.reset();

        memberships.remove(name);
        memberships.put(newName,new Membership(newName,discount));
        input.nextLine();
    }

    public void printMember(){

        System.out.println("Enter the member tier you want to view: ");
        String name = input.nextLine();
        input.reset();
        System.out.println("");
        System.out.println("Member tier: " + name);
        System.out.println("Description: The "+ name + " tier applies a discount of " + (memberships.get(name).getDiscount()*100) + "%.");
        input.nextLine();
    }
    public void printListMember(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        for(String key: memberships.keySet()){
            System.out.println("Member Tier: " + key);
            System.out.println("Description: The member tier " + key +" applies a discount of " +(memberships.get(key).getDiscount()*100) + "%.");
        }
    }



    public void createEmployee(){


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
        input.reset();


        employees.put(nameInput, new Employee( IDinput, ageInput, nameInput, salaryInput));
        input.nextLine();

    }

    public void deleteEmployee(){

        System.out.println("Enter the name of the employee you want to delete: ");
        String nameinput = input.nextLine();
        input.reset();

        employees.remove(nameinput);

        System.out.println("The employee, " + nameinput + ", has been removed.");
        input.nextLine();
    }

    public void printEmployeeInfo(){


        System.out.print("To print an employees info, enter their name: ");
        String nameInput = input.nextLine();
        input.reset();

        System.out.println("Name: " + employees.get(nameInput).getName());
        System.out.println("Age: " + employees.get(nameInput).getAge());
        System.out.println("ID: " + employees.get(nameInput).getID());
        System.out.println("WeeklySalary: " + employees.get(nameInput).getWeeklySalary());
        input.nextLine();
    }

    private void printEmployeeInfo(Employee e){

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("ID: " + e.getID());
        System.out.println("WeeklySalary: " + e.getWeeklySalary());
    }

    public void modifyEmployee() {


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
        input.reset();

        employees.remove(nameinput);
        employees.put(newNameInput,new Employee(newID,newAge,newNameInput,newSalary));
        input.nextLine();
    }

    public void createClient(){


        System.out.print("Enter the name of the new client: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.print("Enter the new client's phone number: ");
        String pnInput = input.nextLine();
        input.reset();
        System.out.print("Enter the new client's email: ");
        String emailInput = input.nextLine();
        input.reset();
        System.out.print("Do you want to assign a membership level? (Y/N)");
        Character query = input.next().charAt(0);
        input.reset();

        clients.put(nameInput, new Client(nameInput,pnInput,emailInput));
        input.nextLine();
    }

    public void deleteClient(){


        System.out.print("Enter the name of the client you want to delete: ");
        String nameInput = input.next();
        input.reset();

        clients.remove(nameInput);

        System.out.println("The client, " + nameInput + ", has been removed.");
        input.nextLine();
    }

    public void printClientInfo(){


        System.out.print("To print a client's info, enter their name: ");
        String nameInput = input.nextLine();
        input.reset();

        System.out.println("Name: " + clients.get(nameInput).getName());
        System.out.println("Phone Number: " + clients.get(nameInput).getPhoneNumber());
        System.out.println("Email: " + clients.get(nameInput).getEmail());
        System.out.println("Cars: ");
        clients.get(nameInput).printCarList();
        input.nextLine();

    }

    private void printClientInfo(Client c){

        System.out.println("Name: " + c.getName());
        System.out.println("Phone Number: " + c.getPhoneNumber());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Cars: ");
        c.printCarList();


    }

    public void modifyClient(){


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
        input.reset();


        clients.remove(nameInput);
        clients.put(newNameInput,new Client(newNameInput,newPhone,newEmail));
        input.nextLine();

    }
    public void AssignMembership(){
        System.out.print("To change a client's membership tier enter the their name: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the membership you want to apply: ");
        String membInput = input.nextLine();
        input.reset();
        String email = clients.get(clientInput).getEmail();
        String pn = clients.get(clientInput).getPhoneNumber();
        String name = clients.get(clientInput).getName();
        ArrayList<Car> Carlist = clients.get(clientInput).getCarList();
        clients.remove(clientInput);
        clients.put(clientInput,new SpecialClient(clientInput,pn,email,memberships.get(membInput),Carlist));

    }

    public void createService(){

        Scanner inputDouble = new Scanner(System.in);
        System.out.print("Enter the name of the new service: ");
        String nameInput = input.nextLine();
        input.reset();
        System.out.println("Enter the description of the new service :");
        String descInput = input.nextLine();
        input.reset();
        System.out.print("Enter the price of the new service: ");
        double priceInput = input.nextDouble();
        input.reset();


        services.put(nameInput, new Service(nameInput,priceInput,descInput));
        input.nextLine();
    }

    public void deleteService(){


        System.out.print("Enter the name of the service you want to delete: ");
        String nameInput = input.nextLine();
        input.reset();


        services.remove(nameInput);

        System.out.println("The service " + nameInput + " has been deleted.");
        input.nextLine();
    }

    public void printServiceInfo(){


        System.out.print("To print a Service's information, enter the name of the service: ");
        String nameInput = input.nextLine();
        input.reset();

        System.out.println("Name: " + services.get(nameInput).getServiceName());
        System.out.println("Description: ");
        System.out.println(services.get(nameInput).getDescription());
        System.out.println("Price: $" + services.get(nameInput).getPrice());
        System.out.println("Amount Sold: " + services.get(nameInput).getAmountSold());
        input.nextLine();
    }

    private void printServiceInfo(Service s){

        System.out.println("Name: " + s.getServiceName());
        System.out.println("Description: ");
        System.out.println(s.getDescription());
        System.out.println("Price: " + s.getPrice());
        System.out.println("Amount Sold: " + s.getAmountSold());
        input.nextLine();
    }

    public void modifyService(){


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

        int amountSold = services.get(nameInput).getAmountSold();

        services.remove(nameInput);
        services.put(newNameInput,new Service(newNameInput,priceInput,descInput));
        services.get(newNameInput).setAmountSold(amountSold);
        input.nextLine();

    }




    public void createAppointment(){


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
        input.reset();


        Appointments.put(dateInput + clientInput, new Appointment(services.get(serviceInput),clients.get(clientInput),employees.get(empInput),timeInput,dateInput));
        input.nextLine();
    }

    public void deleteAppointment(){


        System.out.print("Enter the name of the client, who's appointment you want to delete: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the date of the appointment you want to delete (mm/dd/yyyy): ");
        String dateInput = input.nextLine();
        input.reset();


        Appointments.remove(dateInput + clientInput);
        input.nextLine();
    }

    public void printAppointment(){


        System.out.print("Enter the name of the client, who's appointment you want to print: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("To print an appointment's info print the date of the appointment (mm/dd/yyyy): ");
        String dateInput = input.nextLine();
        input.reset();


        Appointments.get(dateInput + clientInput).displayAppInfo();
        input.nextLine();
    }

    private void printAppointment(Appointment a){

        a.displayAppInfo();

    }

    public void modifyAppointment(){


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
        input.reset();

        Appointments.remove(dateInput + clientInput);
        Appointments.put(newDateInput+newClientInput,(new Appointment(services.get(newServiceInput),clients.get(newClientInput),employees.get(newEmployeeInput),newTimeInput,newDateInput)));

        input.nextLine();
    }

    public void printListEmployees(){
        System.out.println("|Name:       |ID:       |Age:       |Salary:       |");
        for(String key: employees.keySet()){


            System.out.println("|" + employees.get(key).getName() +"|" + employees.get(key).getID() +"|" +
                    employees.get(key).getAge() + "|" + employees.get(key).getWeeklySalary());

        }
    }
    public void printListClients() {
        System.out.printf("|%20s|%20s|%40s|", "Name:", "Phone Number", "Email:");
        System.out.println("");
        System.out.printf("|%20s|", "Cars:");

        for (String key : clients.keySet()) {
            System.out.println("");
            System.out.printf("|%20s|%20s|%40s|", clients.get(key).getName(), clients.get(key).getPhoneNumber(),
                    clients.get(key).getEmail());
            System.out.println("");
            clients.get(key).printCarList();
        }

    }

    public void printListService(){
        System.out.printf("|%20s|","Name:");
        System.out.printf("|%20s|","Description");
        System.out.printf("|%20s|","Price:");
        for(String key: services.keySet()){
            System.out.println("");
            System.out.println("|"+services.get(key).getServiceName() +"|");
            System.out.println("--------------------------------");
            System.out.println("|" + services.get(key).getDescription()+"|");
            System.out.printf("|$%.2f",services.get(key).getPrice());
            System.out.println("");
        }
    }
    public void printListAppointments(){
        System.out.printf("|%20s|%20s|%20s|%20s|","Date:","Time:","Client:","Service:");
        System.out.println("");
        for(String key: Appointments.keySet()){
            System.out.printf("|%20s|%20s|%20s|%20s|",Appointments.get(key).getAppDate()
            ,Appointments.get(key).getAppTime(), Appointments.get(key).getClient().getName(),
                    Appointments.get(key).getService().getServiceName());
            System.out.println("");
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
        input.nextLine();
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
        input.nextLine();


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
        input.nextLine();
    }

    public void createSale(){

        System.out.println("To add a sale: ");
        System.out.print("Enter an ID number for the Sale: ");
        String saleID = input.nextLine();
        input.reset();
        System.out.print("Enter the client's name: ");
        String clientInput = input.nextLine();
        input.reset();
        System.out.print("Enter the Service sold: ");
        String serviceInput = input.nextLine();
        input.reset();
        System.out.print("Enter the amount of products sold: ");
        int productAmountInput = input.nextInt();
        input.reset();

        sales.put(clientInput + saleID, new Sale(clients.get(clientInput).getName(),services.get(serviceInput).getServiceName(),
                services.get(serviceInput).getPrice(),
                productAmountInput, clients.get(clientInput).getDiscountAmount(),saleID));

        services.get(serviceInput).addSale(productAmountInput);
        input.nextLine();


    }

    public void deleteSale(){
        System.out.print("To delete a sale: ");
        System.out.print("Enter sale ID: ");
        String oldsaleID = input.nextLine();
        input.reset();
        System.out.print("Enter the client's name: ");
        String oldClient = input.nextLine();
        input.reset();

        sales.remove(oldClient + oldsaleID);
        input.nextLine();
    }

    public void printServiceSales(){

        for(String key: services.keySet()){
            System.out.println("Service " + services.get(key).getServiceName());
            System.out.println("-----------------");
            System.out.printf("Price: $%.2f",services.get(key).getPrice());
            System.out.println("Total Sold: " + services.get(key).getAmountSold());
            System.out.println("Total Made: " + services.get(key).getPrice() * services.get(key).getAmountSold());
            System.out.println("----------------------------------");

        }
    }

    public void printAllSales(){

        for(String key: sales.keySet()){
            System.out.println("ID: " + sales.get(key).getID() + "     |Client: " + sales.get(key).getCustomer() + "     |Product: " + sales.get(key).getProduct() + "     |# of Products: " +
                    sales.get(key).getProductAmount() + "     |Price of Product: $" + sales.get(key).getProductPrice() + "     |Total Amount: $"
                    + sales.get(key).getTotalSaleAmount() + "     |");
        }

    }







}
