package gomez;

/**
 * Created by fernandogomez on 4/26/17.
 */
public class Lodging implements Expense {

    private Destination destination;
    private int nights;

    public Lodging(Destination d, int n) {

        this.destination = d;
        this.nights = n;
    }

    @Override
    public float getCost() {

        float EuropeHotelTax = 1.1f;
        float JapanHotelTax = 1.3f;

        float cost = 0;

        switch (destination) {

            case Japan:
                cost = (300.00f * nights) * JapanHotelTax ;
                break;

            case Europe:
                cost = (200.00f * nights) * EuropeHotelTax;
                break;

            case Mexico:
                cost = 100.00f * nights;
                break;
            default:
                cost = 0;
                break;
        }
        return cost;
    }
}
