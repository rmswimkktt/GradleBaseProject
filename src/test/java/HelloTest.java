import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest{
    @Test
    public void test(){
        assertThat(Hello.getOne(), is(1));
    }
}

