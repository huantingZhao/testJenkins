import org.junit.Test;
import static org.junit.Assert.*;

public class testMain{
    Main m = new Main();
    @Test
    public void test1(){
        assertEquals(3,m.cal(1,2));
    }
}
