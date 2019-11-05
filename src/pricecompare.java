import java.util.Comparator;

public class pricecompare implements Comparator<book> {
    @Override
    public int compare(book o1, book o2) {
        return (int) (o1.price-o2.price);
    }
}
