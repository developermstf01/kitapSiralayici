import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookList = new TreeSet<>(new OrderByComparator());

        bookList.add(new Book("Harry Potter","Rowling","20/02/1998",100));
        bookList.add(new Book("Sherlock Holmes","Doyle","20/02/1998",150));
        bookList.add(new Book("Yalnız Efe","Seyfettin","20/02/1998",70));
        bookList.add(new Book("Ada","Seyfettin","20/02/1998",20));

        TreeSet<Book> bookList2 = new TreeSet<>(new OrderByNumberComparator());

        bookList2.add(new Book("Harry Potter","Rowling","20/02/1998",100));
        bookList2.add(new Book("Sherlock Holmes","Doyle","20/02/1998",150));
        bookList2.add(new Book("Yalnız Efe","Seyfettin","20/02/1998",70));
        bookList2.add(new Book("Ada","Seyfettin","20/02/1998",20));

        System.out.println("İsim sırasına göre...");

        for (Book s: bookList){
            System.out.println(s.name);
        }
        System.out.println("#####################################");

        System.out.println("Sayfa sayısına göre, büyükten küçüğe...");

        for (Book s: bookList2){
            System.out.println(s.page);
        }
    }
}