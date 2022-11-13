public class Sale {



    private String customer;
    private String product;
    private double productPrice;
    private int productAmount;
    private double TotalSaleAmount;
    private double discount;
    private String ID;


    public Sale(String customer,String product,double productPrice,int productAmount,double discount,String id){
        this.customer = customer;
        this.product = product;
        this.productPrice = productPrice;
        this.TotalSaleAmount = productAmount*productPrice;
        this.discount = discount;
        this.productAmount = productAmount;
        this.ID = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getTotalSaleAmount() {
        return TotalSaleAmount;
    }

    public void setTotalSaleAmount(double saleAmount) {
        this.TotalSaleAmount = saleAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
