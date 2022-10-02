public class Price {
    private static double adultPrice = 25.00;
    private static double childrenPrice = 12.00;
    private static double seniorCitizenPrice = 18.00;
    private int adultQty;
    private int childrenQty;
    private int seniorCitizenQty;

    public Price() {
    }

    public Price(int adultQty,int childrenQty,int seniorCitizenQty) {
        this.adultQty = adultQty;
        this.childrenQty = childrenQty;
        this.seniorCitizenQty = seniorCitizenQty;
    }

    public static double getAdultPrice() {
        return adultPrice;
    }

    public static void setAdultPrice(double adultPrice) {
        Price.adultPrice = adultPrice;
    }

    public static double getChildrenPrice() {
        return childrenPrice;
    }

    public static void setChildrenPrice(double childrenPrice) {
        Price.childrenPrice = childrenPrice;
    }

    public static double getSeniorCitizenPrice() {
        return seniorCitizenPrice;
    }

    public static void setSeniorCitizenPrice(double seniorCitizenPrice) {
        Price.seniorCitizenPrice = seniorCitizenPrice;
    }

    public int getAdultQty() {
        return adultQty;
    }

    public int getChildrenQty() {
        return childrenQty;
    }

    public int getSeniorCitizenQty() {
        return seniorCitizenQty;
    }

    public void setAdultQty(int adultQty) {
        this.adultQty = adultQty;
    }

    public void setChildrenQty(int childrenQty) {
        this.childrenQty = childrenQty;
    }

    public void setSeniorCitizenQty(int seniorCitizenQty) {
        this.seniorCitizenQty = seniorCitizenQty;
    }

    public int calcQty(int totalQty){
        return totalQty = getAdultQty() + getChildrenQty() + getSeniorCitizenQty();
    }

    public double calcPrice(){
        double totalPrice;
        return totalPrice = ((adultPrice * getAdultQty()) +
                (childrenPrice * getChildrenQty()) + (seniorCitizenPrice * getSeniorCitizenQty()));
    }

    @Override
    public String toString() {
        return "Price{" +
                "adultQty=" + adultQty +
                ", childrenQty=" + childrenQty +
                ", seniorCitizenQty=" + seniorCitizenQty +
                '}';
    }
}
