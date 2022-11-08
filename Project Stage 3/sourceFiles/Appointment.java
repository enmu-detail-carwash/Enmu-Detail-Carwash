import java.util.ArrayList;
import java.util.Date;

public class Appointment extends SpecialClient {

    private Service service;
    private Client client;
    private Employee employee;
    private Date AppTime;

    public Appointment(){

        this.service = null;
        this.client = null;
        this.employee = null;
        this.AppTime = null;

    }

    public Appointment(Service s, Client c, Employee e, Date d){

        this.service = s;
        this.client = c;
        this.employee = e;
        this.AppTime = d;
    }

    public void setService(Service s){
        this.service = s;
    }

    public void setClient(Client c){
        this.client = c;
    }

    public void setEmployee(Employee e) {
        this.employee = employee;
    }

    public void setAppTime(Date d) {
        AppTime = d;
    }

    public Service getService() {
        return service;
    }

    public Client getClient() {
        return client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getAppTime() {
        return AppTime;
    }

    public String getClientTier(){
        return client.getMemberTier();
    }

    public ArrayList<Car> getClientCars(){

        return client.getCarList();

    }

    public void displayAppInfo(){

        int hours = AppTime.getHours();
        int Month = AppTime.getMonth() + 1;
        int Year = AppTime.getYear();
        int day = AppTime.getDate();
        int minutes = AppTime.getMinutes();

        System.out.println(client.getName() + "'s appointment on " + Month + "/" + day + "/" + Year + " at " +hours+":"+minutes);
        System.out.println("Client: " + client.getName());
        System.out.println("Vehicles: ");
        client.printCarList();
        //Need to add lines to pint the service name, price, and description
        System.out.println("Assigned Employee: " + employee.getName());





    }


}
