public class Main {

    public static void main(String[] args) {

        SpecialClient C1 = new SpecialClient();
        Membership bronze = new Membership();
        bronze.setDiscount(.05);
        bronze.setTierName("Bronze");

        C1.setName("Joe");
        C1.setEmail("joe123@gmail.com");
        C1.setPhoneNumber("5756077475");
        C1.setMembership(bronze);
        C1.printInfo();



    }
}
