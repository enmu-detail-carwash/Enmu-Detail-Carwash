public class Car {

  private String carColor; // = defaultValue
  private String carLicensePlateNum; // defaultValue
  private String carType; // defaultValue
  private String carYear; // defaultValue
  private String carModel; // defaultValue
  private String carMake; // defaultValue

  public Car() {

  }

  public Car(String carColor, String carLicensePlateNum, String carType, String carYear,
      String carModel, String carMake) {
    this.carColor = carColor;
    this.carLicensePlateNum = carLicensePlateNum;
    this.carType = carType;
    this.carYear = carYear;
    this.carModel = carModel;
    this.carMake = carMake;

  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public String getCarColor() {
    return carColor;
  }

  public void setCarLicensePlateNum(String carLicensePlateNum) {
    this.carLicensePlateNum = carLicensePlateNum;
  }

  public String getCarLicensePlateNum() {
    return carLicensePlateNum;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  public String getCarMake() {
    return carMake;
  }

  public void setCarYear(String carYear) {
    this.carYear = carYear;
  }

  public String getCarYear() {
    return carYear;
  }

}
