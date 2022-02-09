import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Denmark", 300, 90, 66.5));
        countries.add(new Country("Sverige", 150, 50, 66.4));
        countries.add(new Country("Norge", 200, 40, 70.5));

        /*Collections.sort(countries);
        for (Country c : countries) {
            System.out.println(c);
        }*/

        /*Collections.sort(countries, new BnpComparator());
        for (Country c : countries) {
            System.out.println(c);
        }*/

        Collections.sort(countries, new LatitudeComparator());
        for (Country c : countries) {
            System.out.println(c);
        }
    }
}
