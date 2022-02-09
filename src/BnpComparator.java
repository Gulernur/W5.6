import java.util.Comparator;

public class BnpComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getBnp() - o2.getBnp();
    }
}
