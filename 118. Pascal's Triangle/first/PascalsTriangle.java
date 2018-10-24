package first;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        while (numRows-- > 0) {
            row.add(0, 1);
            for (int i = 1; i < row.size() - 1; i++)
                row.set(i, row.get(i) + row.get(i + 1));
            ret.add(new ArrayList<>(row));
        }
        return ret;
    }
}
