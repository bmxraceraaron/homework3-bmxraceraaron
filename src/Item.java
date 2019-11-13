public class Item {
    private String itemCode;
    private String Name;

    public Item(String i, String n){
        itemCode = i;
        Name = n;
    }
    public void displayItem(){
        System.out.println("itemCode is: "+itemCode);
        System.out.println("Name is: "+ Name);
    }
}
