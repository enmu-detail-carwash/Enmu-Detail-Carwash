import java.util.Calendar;
import java.util.Date;

public class Main {



    public static void main(String[] args) {

//        Client C1 = new Client();
//        Car car1 = new Car("Red","ENMU123","Truck","2018","Sierra","GMC");
//        Car car2 = new Car("Black","ENMU234","Truck","2017","F150","Ford");
//
//        C1.addCar(car1);
//        C1.addCar(car2);
//
//        C1.printCarList();
//        C1.setName("David");
//
//
//    Employee E1 = new Employee(1,23,"John",500);
//    E1.setOThrs(10);
//    System.out.println(E1.getTotalPay());
//    Service s1 = new Service();
//
//    Appointment App1 = new Appointment(s1,C1,E1, new Date(2022,Calendar.DECEMBER,24,4,30));
//    App1.displayAppInfo();

        Management m = new Management();


        m.createClient();
        m.createClient();
        m.modifyClient();
        m.deleteClient();



    }
}
