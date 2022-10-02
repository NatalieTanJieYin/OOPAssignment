public class FABorder {
    private String name;
    private double price;
    private int quantity;
    private static double total1 = 0.0;
    private static double total2 = 0.0;

    public FABorder(){
    }

    public FABorder(String name, double price){
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static double getTotal1() {
        return total1;
    }

    public static double getTotal2() {
        return total2;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalFPrice(){
        total1 = total1 + quantity * price;
        return total1;
    }
    public double totalBPrice(){
        total2 = total2 + quantity * price;
        return total2;
    }
}

