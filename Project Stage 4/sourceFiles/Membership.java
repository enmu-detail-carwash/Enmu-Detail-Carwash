public class Membership{

    private double discount;
    private String tierName;

    public Membership(String name, double discount){
        this.discount = discount/100;
        this.tierName = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public double getDiscount() {
        return discount;
    }

    public String getTierName() {
        return tierName;
    }
}
