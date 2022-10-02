public class Food extends FABorder implements Menu {

    public Food() {
    }

    public Food(String name, double price) {
        super(name, price);
    }

    public void menu() {
        System.out.println("\n******************* Welcome to GPC Cinema *******************");
        System.out.println("****************** Please Order Food Here *******************");
        System.out.println("=============================================================");
        System.out.println("        1. Sea Salt Popcorn             RM10.00");
        System.out.println("        2. Caramel Apple Popcorn        RM10.00");
        System.out.println("        3. Grilled Chicken Popcorn      RM10.00");
        System.out.println("        4. Royale Popcorn               RM10.00");
        System.out.println("        5. Chocolate Popcorn            RM10.00");
        System.out.println("        6. Chicken Nuggets              RM8.00");
        System.out.println("        7. Hot Minis                    RM9.00");
        System.out.println("        8. Cheezy Wedges                RM8.00");
        System.out.println("        9. Mexican Nachos               RM12.00");
        System.out.println("        10. Beef Coney                  RM11.00");
        System.out.println("=============================================================");


    }

}
