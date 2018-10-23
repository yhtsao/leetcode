package first;

import java.util.Iterator;
import java.util.List;

public class Vector2D implements Iterator<Integer> {
    List<List<Integer>> vec2d;
    int lineNum;
    int index;

    public Vector2D(List<List<Integer>> vec2d) {
        this.vec2d = vec2d;
        this.lineNum = 0;
        this.index = 0;
    }

    @Override
    public Integer next() {
        return vec2d.get(lineNum).get(index++);
    }

    @Override
    public boolean hasNext() {
        while (lineNum < vec2d.size()) {
            if (!vec2d.get(lineNum).isEmpty()) {
                List<Integer> line = vec2d.get(lineNum);
                if (index < line.size())
                    return true;
            }
            lineNum++;
            index = 0;
        }
        return false;
    }

    @Override
    public void remove() {
    }
}
/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
