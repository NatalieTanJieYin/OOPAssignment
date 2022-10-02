public class Beverage extends FABorder implements Menu {
    public Beverage(){
    }
    public void menu(){
        System.out.println("\n******************* Welcome to GPC Cinema *******************");
        System.out.println("**************** Please Order Beverage Here *****************");
        System.out.println("=============================================================");
        System.out.println("        1. Coke Regular                 RM2.00");
        System.out.println("        2. Coke Zero                    RM2.00");
        System.out.println("        3. Sprite                       RM2.00");
        System.out.println("        4. Fanta Orange                 RM2.00");
        System.out.println("        5. Fanta Grape                  RM2.00");
        System.out.println("        6. Fanta Strawberry             RM2.00");
        System.out.println("        7. Ice Lemon Tea                RM2.00");
        System.out.println("        8. 100 Plus                     RM2.00");
        System.out.println("        9. Milo Ice                     RM2.00");
        System.out.println("        10. Mountain Dew Lime           RM2.00");
        System.out.println("=============================================================");
    }

    public Beverage(String name, double price){
        super(name, price);
    }
}
