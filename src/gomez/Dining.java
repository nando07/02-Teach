package gomez;

/**
 * Created by fernandogomez on 4/26/17.
 */
public class Dining implements Expense {

    private Destination destination;
    private int nights;

    public Dining(Destination d, int n) {

        this.destination = d;
        this.nights = n;
    }

    @Override
    public float getCost() {

        float cost = 0;

        switch (destination) {

            case Japan:
                cost = 30.00f * nights;
                break;

            case Europe:
                cost = 20.00f * nights;
                break;

            case Mexico:
                cost = 10.00f * nights;
                break;
            default:
                cost = 0;
                break;
        }
        return cost;
    }
}
