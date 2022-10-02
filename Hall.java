import java.util.Random;
public class Hall {
    private int hallNumber;

    public Hall(){

    }

    public Hall(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int findHallNumber(){
        Random rand = new Random();
        int h = rand.nextInt(5) + 1;
        return h;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallNumber=" + hallNumber +
                '}';
    }
}
