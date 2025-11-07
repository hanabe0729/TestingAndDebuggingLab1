import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class insertTestClass {
    //Full statement coverage on insert()
    Set s = new Set();

    @Test
    void insert5Test() {
        s.insert(5);
        assertArrayEquals(new int[]{5}, s.toArray());
    }
    @Test
    void insert4Test() {
        //Works when we have [4,5,4] but fails with [4,5] (which should work). Bug found and code changed.
        //See test on SetChanged below                                         //FÅR INTE VARA BUG
        s.insert(5);
        s.insert(4);
        assertArrayEquals(new int[]{4, 5}, s.toArray());
    }
    @Test
    void insertSecond5Test() {
        //Works when we have [4,5,4,5] but fails with [4,5, 4] (which should work). Same bug as above.
        //See test on SetChanged below
        s.insert(5);
        s.insert(4);
        s.insert(5);
        assertArrayEquals(new int[]{4, 5}, s.toArray());
    }

    //Tests on the corrected Set version
    SetChanged cs = new SetChanged();
    @Test
    void newArrayInsert5() {
        SetChanged cs = new SetChanged();
        cs.insert(5);
        assertArrayEquals(new int[]{5}, cs.toArray());
    }
    @Test
    void newArrayInsert4() {
        cs.insert(5);
        cs.insert(4);
        assertArrayEquals(new int[]{4, 5}, cs.toArray());
    }
    @Test
    void newArrayInsertSecond5() {
        cs.insert(5);
        cs.insert(4);
        cs.insert(5);
        assertArrayEquals(new int[]{4, 5}, cs.toArray());
    }
}

