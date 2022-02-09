import java.util.Comparator;

public class LatitudeComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getLatitude() < o2.getLatitude()){
            return -1;
        } else if(o1.getLatitude() > o2.getLatitude()){
            return 1;
        }else {
            return 0;
        }
    }
}
