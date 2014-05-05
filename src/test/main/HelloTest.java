package test.main.java;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import main.java.Hello;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class HelloTest{
    public static class Enclosedを使う1{
    	@Test
    	public void 日本語が使えるか(){
            assertThat(Hello.getOne(), is(1));
    	}
    }
    public static class Enclosedを使う2{
    	@Test
    	public void 日本語が使えるか(){
            assertThat(Hello.getTwo(), is(2));
    	}
    }
}

