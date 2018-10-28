package first;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArray {

    public int[] beautifulArray(int N) {
        List<Integer> ret = new ArrayList<>();
        List<Integer> tmp;
        ret.add(1);
        while (ret.size() < N) {
            tmp = new ArrayList<>();
            for (int n : ret) {
                if (n * 2 - 1 <= N) tmp.add(n * 2 - 1);
            }
            for (int n : ret) {
                if (n * 2 <= N) tmp.add(n * 2);
            }
            ret = tmp;
        }
        return ret.stream().mapToInt(i -> i).toArray();
    }
}
