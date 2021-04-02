package cv.com.company.behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        String s;

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            s = it.next();
            //...
        }
    }
}
