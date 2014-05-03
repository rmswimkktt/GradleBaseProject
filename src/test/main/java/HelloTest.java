package test.main.java;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import main.java.Hello;

import org.junit.Test;

public class HelloTest{
    @Test
    public void test(){
        assertThat(Hello.getOne(), is(1));
    }
    @Test
    public void _2を返す(){
        assertThat(Hello.getTwo(), is(2));
    }
}

