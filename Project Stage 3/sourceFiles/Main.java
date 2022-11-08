import java.util.Calendar;
import java.util.Date;

public class Main {



    public static void main(String[] args) {
//
//        SpecialClient C1 = new SpecialClient();
//        Client C2 = new Client();
//        Membership bronze = new Membership();
//        bronze.setDiscount(.05);
//        bronze.setTierName("Bronze");
////        C1.setMembership(bronze);
////        System.out.println(C1.getMemberTier());
//        C1.setName("David");
//
//        Appointment app = new Appointment();
//        app.setClient(C1);
////        System.out.println(app.getClientTier());
//        Appointment app1 = new Appointment();
//        app1.setClient(C2);
////        System.out.println(app1.getClientTier());
//
//        Appointment app2 = new Appointment(null, C1,null, new Date(2022-1900, Calendar.NOVEMBER, 7, 9, 30));
//        app2.setAppTime(new Date(2022-1900, Calendar.DECEMBER, 3, 4,30));
//        app2.displayAppInfo();

    Employee E1 = new Employee(1,23,"John",500);
    E1.setOThrs(10);
        System.out.println(E1.getTotalPay());



    }
}
