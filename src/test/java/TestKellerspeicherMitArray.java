import Aufgabe1.Kellerspeicher;
import Aufgabe1.KellerspeicherMitArray;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class TestKellerspeicherMitArray {

    public KellerspeicherMitArray createKellerspeicher(int size){
        return new KellerspeicherMitArray(size);
    }

    @Test
    public void create(){
        KellerspeicherMitArray k = createKellerspeicher(10);
        assertEquals(10, k.capacity());
    }

    @Test
    public void testSize(){
        int size = 10;
        KellerspeicherMitArray k = createKellerspeicher(size);
        for(int i = 0; i < size; i++){
            assertEquals(i, k.size());
            k.push(i);
        }
    }

    @Test
    public void top(){
        KellerspeicherMitArray k = createKellerspeicher(10);
        Integer i = 5;
        k.push(i);
        assertEquals(i, k.top());
    }

    @Test
    public void overflow(){
        int size = 10;
        KellerspeicherMitArray k = createKellerspeicher(size);
        for(int i = 0; i < size; i++){
            k.push(i);
        }
        assertThrowsExactly(IllegalStateException.class, () -> k.push(size));
    }

    @Test
    public void popEmpty(){
        KellerspeicherMitArray k = createKellerspeicher(10);
        assertThrowsExactly(NoSuchElementException.class, () -> k.pop());
    }

    @Test
    public void topEmpty(){
        KellerspeicherMitArray k = createKellerspeicher(10);
        assertThrowsExactly(NoSuchElementException.class, () -> k.top());
    }

}
