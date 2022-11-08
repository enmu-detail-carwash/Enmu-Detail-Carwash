public class Employee {

  private int ID; // = defaultValue;
  private int Age; // - defaultValue;
  private String Name; // = defaultValue;
  private double WeeklySalary; // = defaultValue;
  private int OThrs; // = defaultValue;
  private double OTrate = 26.25;
  private boolean PayStatus = false;

  public Employee() {

  }

  public Employee(int ID, int Age, String name) {
    this.ID = ID;
    this.Age = Age;
    this.Name = name;

  }

  public Employee(int ID, int Age, String name, double WeeklySalary) {
    this.ID = ID;
    this.Age = Age;
    this.Name = name;
    this.WeeklySalary = WeeklySalary;

  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    this.Name = Name;
  }

  public int getAge() {
    return Age;
  }

  public void setAge(int Age) {
    this.Age = Age;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public void setWeeklySalary(double WeeklySalary) {
    this.WeeklySalary = WeeklySalary;
  }

  public void setOThrs(int OThrs) {
    this.OThrs = OThrs;
  }

  public int getOThrs() {
    return OThrs;
  }

  public double getOTpay() {
    return OTrate * OThrs;
  }

  public double getTotalPay() {
    return WeeklySalary + getOTpay();
  }

  public void paid() {

    this.PayStatus = true;

  }


}
