import java.util.List;

public class Sort {
    public static void sort(List<book> list){
        for (int i = 1; i <list.size() ; i++) {
            book a=list.get(i);
            int j=i-1;
            for (;j>=0&&list.get(j).name.compareTo(a.name)>0; j--) {

            }
        }
    }
}
