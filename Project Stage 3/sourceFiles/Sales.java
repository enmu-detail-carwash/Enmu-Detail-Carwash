public class Sales {

    private double totalSales;
    private double serviceSales;

    public double indivServiceSales(Service s){

        return 0;

    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void displayAllServiceSales(){
        System.out.println(serviceSales);
    }

    public void displayTotalSales(){
        System.out.println(totalSales);
    }


}
