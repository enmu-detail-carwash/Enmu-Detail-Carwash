import java.lang.reflect.Array;
import java.util.ArrayList;

public class SpecialClient extends Client{

    private double discountAmount;
    private String memberTier;


    public SpecialClient(){
        super(null,null,null,null);
        this.discountAmount = 0;
        this.memberTier = null;
    }
    public SpecialClient(String name, String phonenumber, String email, Membership m){

        super(name, phonenumber,email, null);
        this.discountAmount = m.getDiscount();
        this.memberTier = m.getTierName();
    }
    public SpecialClient(String name, String phonenumber, String email, Membership m, ArrayList<Car> CarList){

        super(name, phonenumber,email, CarList);
        this.discountAmount = m.getDiscount();
        this.memberTier = m.getTierName();
    }


    public void setMembership(Membership m){

        discountAmount = m.getDiscount();
        memberTier = m.getTierName();

    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public String getMemberTier() {
        return memberTier;
    }
    public void printInfo(){
        System.out.println(super.getName());
        System.out.println(super.getEmail());
        System.out.println(super.getPhoneNumber());
        System.out.println(discountAmount);
        System.out.println(memberTier + " tier member.");
    }
}
