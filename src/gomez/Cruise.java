package gomez;


/**
 * Created by fernandogomez on 4/26/17.
 */
public class Cruise implements Expense {

    Destination d;

    public Cruise(Destination country) {

        this.d = country;

    }

    @Override
    public float getCost() {

        switch (d) {

            case Japan:
                return 3000.00f;

            case Europe:
                return 2000.00f;

            case Mexico:
                return 1000.00f;
        }
        return 0;
    }
}
