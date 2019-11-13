public class Grocery extends Item implements Tax, Discount{
    double price;
    double units;
    double discount;

    public Grocery(String i, String n, double price, double units, double discount){
        super(i, n);
    }

    @Override
    public double computeDiscount(){
        return (units * price) * (discount/100);
    }

    @Override
    public double computeTax(){
        return 0;
    }

    public double computeTotalPrice(){
        
    }
}
