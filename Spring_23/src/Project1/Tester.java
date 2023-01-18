package Project1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    
    @Test
    public void addTest(){
        Temp lmao = new Temp();
        assertEquals(lmao.add(3, 4), 7);
    }

}
