import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

    @Test
    public void testSame() {
        String ret = Demo.JustTheSame("1");
        Assert.assertEquals("1", ret);
    }
}
