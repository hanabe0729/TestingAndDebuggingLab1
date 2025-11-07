import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class intersectTestClass {
    //Full statement coverage on intersect()
    @Test
    public void testIntersect() {
        SetChanged sc = new SetChanged();
        sc.insert(5);
        sc.insert(4);
        sc.insert(7);
        sc.insert(10);

        SetChanged st = new SetChanged();
        st.insert(3);
        st.insert(4);
        st.insert(6);
        st.insert(10);

        sc.intersect(st);
        assertArrayEquals(new int[]{4, 10}, sc.toArray());
    }
}
