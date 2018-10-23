package first;

import java.util.Iterator;
import java.util.List;

public class Vector2DIterator implements Iterator<Integer> {
    Iterator<List<Integer>> it;
    Iterator<Integer> line;

    public Vector2DIterator(List<List<Integer>> vec2d) {
        it = vec2d.iterator();
    }

    @Override
    public Integer next() {
        return line.next();
    }

    @Override
    public boolean hasNext() {
        while ((line == null || !line.hasNext()) && it.hasNext())
            line = it.next().iterator();
        return line != null && line.hasNext();
    }

    @Override
    public void remove() {
    }
}
