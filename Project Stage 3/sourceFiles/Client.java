import java.util.ArrayList;

public class Client {

    private String Name;
    private String phoneNumber;
    private String email;
    private ArrayList<Car> CarList = new ArrayList<Car>();


    public Client(){

        this.Name = null;
        this.phoneNumber = null;
        this.email = null;
        this.CarList = new ArrayList<Car>();

    }

    public Client(String name, String phoneNumber, String email, ArrayList<Car> CarList){

        this.Name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.CarList = CarList;

    }

    public Client(String name, String phoneNumber, String email){

        this.Name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCarList(ArrayList<Car> carList) {
        CarList = carList;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Car> getCarList() {
        return CarList;
    }

    public void addCar(Car car){
        CarList.add(car);
    }

    public String getMemberTier(){
        return "None";
    }

    public double getDiscountAmount(){
        return 0;
    }

    public void printCarList(){
        for(int i = 0; i < CarList.size();i++){

            System.out.print(CarList.get(i).getCarYear() + " " + CarList.get(i).getCarMake() + " " + CarList.get(i).getCarType());
            System.out.println("");
        }
    }





}
