import java.util.Comparator;

public class OrderByNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.page - o1.page;
    }
}
