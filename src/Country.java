import java.util.Comparator;

public class Country implements Comparable{

    private String name;
    private int size;
    private int bnp;
    private double latitude;

    public Country(String name, int size, int bnp, double latitude) {
        this.name = name;
        this.size = size;
        this.bnp = bnp;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBnp() {
        return bnp;
    }

    public double getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Size: " + size + ", " + "BNP: " + bnp + ", " + "Latitude: "
                + ", " + latitude;
    }

    @Override
    public int compareTo(Object o) {
        Country otherCountry = (Country) o;
        return size - otherCountry.getSize();
    }
}
