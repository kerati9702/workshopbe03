import org.junit.Test;

import static org.junit.Assert.*;

public class helloworldTest {

    @Test
    public void sayHi_should_return_helloworld(){
            helloworld h = new helloworld();
            String result = h.sayhi();
            assertEquals("hello world",result);

    }

    @Test
    public void sayHi_should_return_helloworld_with_kerati(){
        helloworld h = new helloworld();
        String result = h.sayhi("kerati");
            assertEquals("helloKerati",result);

    }

    @Test
    public void sayHi_should_return_helloworld_with_nine(){
        helloworld h = new helloworld();
        String result = h.sayhi("nine");
        assertEquals("helloNine",result);

    }

}