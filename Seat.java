import java.util.Random;
public class Seat {
    private char seatRow;
    private int seatNumber;

    public Seat() {
    }

    public Seat(char seatRow, int seatNumber) {
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }

    public char getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(char seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public char findSeatRow(){
        Random rand = new Random();
        char r = (char) (rand.nextInt(10) + 'A');
        return r;
    }

    public int findSeatNumber(){
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        return n;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatRow='" + seatRow + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
