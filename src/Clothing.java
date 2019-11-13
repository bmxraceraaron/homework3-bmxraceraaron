public class Clothing extends Item implements Tax, Discount{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Clothing(String i, String n, String brand, double price, double units, double discount){
        super(i, n);
    }

    @Override
    public double computeDiscount(){
        return(units * price) * (discount/100);
    }

    @Override
    public double computeTax(){
        return((units * price) - computeDiscount())* 8.5/100;
    }

    double computeTotalPrice(){
        return (units * price) - computeDiscount() + computeTax();
    }

    public void displayClothing(){
        super.displayItem();
        System.out.println("Units: "+ units +"Price: "+ price +"Brand"+ brand +"Discount: "+discount);
    }

}
