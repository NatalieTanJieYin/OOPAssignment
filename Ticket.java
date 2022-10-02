public class Ticket {
    private int ticketID;
    private static int nextTicketID = 1000;
    private final Details details;
    private Hall hall;
    private Seat seat;
    private Price price;

    public Ticket() {
        this(0,new Details(), new Hall(), new Seat(), new Price());
    }

    public Ticket(int ticketID, Details details, Hall hall, Seat seat, Price price) {
        this.ticketID = nextTicketID++;
        this.details = details;
        this.hall = hall;
        this.seat = seat;
        this.price = price;
    }

    Ticket(Details details){
        this.details = details;

    }
    public static int getNextTicketID() {
        return nextTicketID;
    }

    public Details getDetails() {
        return details;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", details=" + details +
                ", hall=" + hall +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}
