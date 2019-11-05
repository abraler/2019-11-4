import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<book>a=new LinkedList<>();
        a.add(new book("java",19.2));
        a.add(new book("c++",22.2));
        a.add(new book("python",40.3));
        System.out.println("按书名比较");

    }
}
