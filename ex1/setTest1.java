import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class setTest1 {

    //Full statement coverage on insert()
    @Test
    void insertTest(){
        Set s = new Set();

        s.insert(5);
        assertArrayEquals(new int[]{5}, s.toArray());

        s.insert(4);
        assertArrayEquals(new int[]{4, 5}, s.toArray());

        SetChanged cs = new SetChanged();
        cs.insert(5);
        assertArrayEquals(new int[]{5}, cs.toArray());

        cs.insert(4);
        assertArrayEquals(new int[]{4, 5}, cs.toArray());
    }

    /*
    @Test
    void memberTest(){

    }*/

}

