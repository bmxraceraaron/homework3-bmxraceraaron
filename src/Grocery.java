public class Grocery extends Item implements Tax, Discount{
    double price;
    double units;
    double discount;
    //double savings;
    //double subtotal;
    final double taxp = 8.5;

    public Grocery(String i, String n, double price, double units, double discount){
        super(i, n);
        this.units = units;
        this.price = price;
        this.discount = discount;
        //this.subtotal = subtotal;
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
        double discount = computeDiscount();
        return(units * price) - discount + computeTax();
    }

    //public double computeSavings{
    //    return
    //}

    //public double computeSubtotal{
    //    return computeTotalPrice() + discount;
    //}


    public void displayGrocery(){
        super.displayItem();
        System.out.println("Units: "+ units + " Price: "+ price + " Discount: "+ discount + " Total Price: " + computeTotalPrice());
    }
}
