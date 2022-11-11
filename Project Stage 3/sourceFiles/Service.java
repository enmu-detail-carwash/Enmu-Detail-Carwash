public class Service {

    private String serviceName;
    private double price;
    private String description;
    private int amountSold;

    public Service(){
        this.serviceName = null;
        this.price = 0;
        this.description = null;
        this.amountSold = 0;
    }

    public Service(String name, double price, String description){

        this.serviceName = name;
        this.price = price;
        this.description = description;
        this.amountSold = 0;

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSale(){
        amountSold++;
    }

    public int getAmountSold(){
        return amountSold;
    }

    public void setAmountSold(int i){
        this.amountSold = i;
    }

    public double totalMade() {
        return amountSold * price;
    }

}
