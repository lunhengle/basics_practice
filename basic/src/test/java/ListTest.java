import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if(s.equals("B"))
                iterator.remove();
        }
        Iterator<String> iterator1=list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        //list.removeIf(s -> s.equals("B"));
        //list.forEach(System.out::println);
    }
}
