import java.util.Scanner;
import java.lang.*;

public class Main {

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int userInt = 0;
        boolean input = false;
        do{
            try{
                userInt = scanner.nextInt();
                input = true;

            }catch (Exception e){
                System.out.println("Please enter number !!!");
                scanner.next();
                System.out.print("Reenter your input: ");
            }
        }while(input == false);

        return userInt;
    }
    public static void movieDisplay(){
        System.out.print("\n\nNow Showing");
        System.out.print("\n[1] The Toothless Great White Shark");
        System.out.print("\n[2] Gravity Rise");
        System.out.print("\n[3] Dear Diary");
        System.out.print("\n[4] The Author and The Superstar");
        System.out.print("\n[5] Married Life with Amber Herd");
    }
    public static void priceDisplay(){
        System.out.print("\n\nTICKET PRICE");
        System.out.println("\n=============");
        System.out.printf("\n\n%-20s %-9s","Category","Price(RM)");
        System.out.print("\n------------------------------");
        System.out.printf("\n%-20s %-9s","Adult","25.00");
        System.out.printf("\n%-20s %-9s","Children","12.00");
        System.out.printf("\n%-20s %-9s","Senior Citizen","18.00");
    }
    public static void dateDisplay(){
        System.out.print("\n\nDate");
        System.out.print("\n[1] 01/09/2022 (Thursday)");
        System.out.print("\n[2] 07/09/2022 (Wednesday)");
        System.out.print("\n[3] 12/09/2022 (Monday)");
        System.out.print("\n[4] 18/09/2022 (Sunday)");
        System.out.print("\n[5] 24/09/2022 (Saturday)");
    }

    public static void timeDisplay(){
        System.out.print("\n\nShowtime");
        System.out.print("\n[1] 11.00am");
        System.out.print("\n[2] 2.00pm");
        System.out.print("\n[3] 3.00pm");
        System.out.print("\n[4] 6.00pm");
        System.out.print("\n[5] 8.00pm");
    }

    public static void venueDisplay(){
        System.out.print("\n\nVenue");
        System.out.print("\n[1] Mid Vally Megamall");
        System.out.print("\n[2] Pavillion");
        System.out.print("\n[3] 1 Utama");
        System.out.print("\n[4] Setapak Central");
        System.out.print("\n[5] Sunway Velocity");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection ;
        String option;
        int number1, number2, number3;
        boolean input = true;
        Price p = new Price();
        Details d = new Details();
        Hall h = new Hall();

        System.out.printf("%50s","Welcome to Golden Phoenix Cinema!");

        //Movie summary
        do {
            do {
                movieDisplay();
                    System.out.print("\n\nPlease select movie: ");
                    selection = scanner.nextLine();

                    if (selection.equals("1")) {
                        d.setMovieName("The Toothless Great White Shark");
                        System.out.println("\nMovie selected: " + d.getMovieName());
                        System.out.println("Genre: Thriller");
                        System.out.println("Director: Xavier Knight");
                        System.out.println("Duration: 120 min");
                        input = false;
                    } else if (selection.equals("2")) {
                        d.setMovieName("Gravity Rise");
                        System.out.println("\nMovie selected: " + d.getMovieName());
                        System.out.println("Genre: Science Fiction");
                        System.out.println("Director: Aiden Sanson");
                        System.out.println("Duration: 132 min");
                        input = false;
                    } else if (selection.equals("3")) {
                        d.setMovieName("Dear Diary");
                        System.out.println("\nMovie selected: " + d.getMovieName());
                        System.out.println("Genre: Animation");
                        System.out.println("Director: Ian Kingston");
                        System.out.println("Duration: 130 min");
                        input = false;
                    } else if (selection.equals("4")) {
                        d.setMovieName("The Author and the Superstar");
                        System.out.println("\nMovie selected: " + d.getMovieName());
                        System.out.println("Genre: Romance");
                        System.out.println("Director: Alyssa Bent");
                        System.out.println("Duration: 125 min");
                        input = false;
                    } else if (selection.equals("5")) {
                        d.setMovieName("Married Life with Amber Herd");
                        System.out.println("\nMovie selected: " + d.getMovieName());
                        System.out.println("Genre: Horror");
                        System.out.println("Director: John Dep");
                        System.out.println("Duration: 128 min");
                        input = false;
                    } else{
                        System.out.println("Invalid! Please try again!");
                       input = true;
                    }

            }while(input);

            System.out.print("\n\nWould you like to proceed? (Y/N) => ");
            option = scanner.nextLine();

        } while (option.equals("N") || option.equals("n"));

        //Movie Date
        do{
            do {
                dateDisplay();
                    System.out.print("\n\nPlease select date: ");
                    selection = scanner.nextLine();

                    if ("1".equals(selection)) {
                        d.setMovieDate("01/09/2022 (Thursday)");
                        System.out.println("\nDate selected: " + d.getMovieDate());
                        input = false;
                    } else if ("2".equals(selection)) {
                        d.setMovieDate("07/09/2022 (Monday)");
                        System.out.println("\nDate selected: " + d.getMovieDate());
                        input = false;
                    } else if ("3".equals(selection)) {
                        d.setMovieDate("12/09/2022 (Wednesday)");
                        System.out.println("\nDate selected: " + d.getMovieDate());
                        input = false;
                    } else if ("4".equals(selection)) {
                        d.setMovieDate("18/09/2022 (Sunday)");
                        System.out.println("\nDate selected: " + d.getMovieDate());
                        input = false;
                    } else if ("5".equals(selection)) {
                        d.setMovieDate("24/09/2022 (Saturday)");
                        System.out.println("\nDate selected: " + d.getMovieDate());
                        input = false;
                    } else{
                        System.out.println("Invalid! Please try again!");
                        input = true;
                    }
            }while(input);

            System.out.print("\n\nWould you like to proceed? (Y/N) => ");
            option = scanner.nextLine();

        }while (option.equals("N") || option.equals("n"));

        //Movie Time
        do{
            do {
                timeDisplay();
                    System.out.print("\n\nPlease select time: ");
                    selection = scanner.nextLine();
                    if ("1".equals(selection)) {
                        d.setMovieTime("11.00am");
                        System.out.println("\nTime selected: " + d.getMovieTime());
                        input = false;
                    } else if ("2".equals(selection)) {
                        d.setMovieTime("2.00pm");
                        System.out.println("\nTime selected: " + d.getMovieTime());
                        input = false;
                    } else if ("3".equals(selection)) {
                        d.setMovieTime("3.00pm");
                        System.out.println("\nTime selected: " + d.getMovieTime());
                        input = false;
                    } else if ("4".equals(selection)) {
                        d.setMovieTime("6.00pm");
                        System.out.println("\nTime selected: " + d.getMovieTime());
                        input = false;
                    } else if ("5".equals(selection)) {
                        d.setMovieTime("8.00pm");
                        System.out.println("\nTime selected: " + d.getMovieTime());
                        input = false;
                    }else{
                    System.out.println("Invalid! Please try again!");
                    input = true;
                }
            }while(input);

            System.out.print("\n\nWould you like to proceed? (Y/N) => ");
            option = scanner.nextLine();

        }while (option.equals("N") || option.equals("n"));

        //Movie Venue
        do{
            do {
                venueDisplay();
                    System.out.print("\n\nPlease select venue: ");
                    selection = scanner.nextLine();

                    if ("1".equals(selection)) {
                        d.setMovieVenue("Mid Valley Megamall");
                        System.out.println("\nVenue selected: " + d.getMovieVenue());
                        input = false;
                    } else if ("2".equals(selection)) {
                        d.setMovieVenue("Pavillion");
                        System.out.println("\nVenue selected: " + d.getMovieVenue());
                        input = false;
                    } else if ("3".equals(selection)) {
                        d.setMovieVenue("1 Utama");
                        System.out.println("\nVenue selected: " + d.getMovieVenue());
                        input = false;
                    } else if ("4".equals(selection)) {
                        d.setMovieVenue("Setapak Central");
                        System.out.println("\nVenue selected: " + d.getMovieVenue());
                        input = false;
                    } else if ("5".equals(selection)) {
                        d.setMovieVenue("Sunway Velocity");
                        System.out.println("\nVenue selected: " + d.getMovieVenue());
                        input = false;
                    }else{
                    System.out.println("Invalid! Please try again!");
                    input = true;
                }
            }while(input);

            System.out.print("\n\nWould you like to proceed? (Y/N) => ");
            option = scanner.nextLine();

        }while (option.equals("N") || option.equals("n"));

        //Ticket quantity
        do{
            do{
                priceDisplay();

                    System.out.println("\n\nPlease select number of tickets (MAX TOTAL is 5)");
                    System.out.println("\nPress 0 if you do not wish to purchase the stated ticket type");
                    System.out.print("\nAdult ticket: ");
                    number1 = getInt();

                    p.setAdultQty(number1);
                    System.out.print("\nChildren ticket: ");
                    number2 = getInt();
                    p.setChildrenQty(number2);
                    System.out.print("\nSenior Citizen ticket: ");
                    number3 = getInt();
                    p.setSeniorCitizenQty(number3);

                    input = false;

                    if(p.calcQty(number1 + number2 + number3) > 5
                            || p.calcQty(number1 + number2 + number3) < 1) {
                        System.out.println("ERROR! Invalid total number of tickets!");
                        System.out.print("\nPlease reenter! ");
                        input = true;
                }

            } while (input);

            System.out.print("\n\nWould you like to proceed? (Y/N) => ");
            option = scanner.nextLine();

        }while (option.equals("N") || option.equals("n"));

        //Print ticket
        for(int i = 1; i <= p.calcQty(number1 + number2 + number3) ; i++ ) {
            System.out.println("\n\nMOVIE TICKET");
            System.out.println("---------------");

            Ticket t = new Ticket(d);
            Seat s = new Seat();

            System.out.println("Ticket ID: " + Ticket.getNextTicketID());
            System.out.println("Ticket details: " + d.toString());
            System.out.println("Seat: " + s.findSeatRow() + s.findSeatNumber());
            System.out.printf("Total price:RM%.2f", p.calcPrice());

        }
        System.out.println("\n\n==========");
        System.out.println("\nHall: " + h.findHallNumber());
    }
}