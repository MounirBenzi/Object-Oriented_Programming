import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class ReverseList<T> {
    static <T> List<T> reverse(List<T> xs){
        List<T> sx = new ArrayList<>(xs.size());
        for(int i = xs.size() -1 ; i >= 0; i --){
            sx.add(xs.get(i));
        }
        return sx;

    }
}
