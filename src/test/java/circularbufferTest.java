import org.junit.Test;

import static org.junit.Assert.*;

public class circularbufferTest {
    circularbuffer cb = new circularbuffer();

    @Test
    public void create_new_buffer_should_empty(){
        boolean result = cb.isEmpty();
        assertTrue("buffer ไม่ว่าง",result);
    }
    @Test
    public void default_buffer_size_should_10(){
        for (int i = 0;i<10;i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("bufferไม่เต็ม",result);
    }
    @Test
    public void write_A_to_bufer_should_read_A(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readdata());
        assertEquals("B",cb.readdata());
    }

    @Test
    public void read_data_backward_should_B(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("B",cb.readdatabackward());
        assertEquals("A",cb.readdatabackward());
    }
    @Test
    public void nine11_should_in_first_position(){
        for (int i = 0;i<10;i++) {
            cb.writeData("haha" + i);
        }
        cb.writeData("nine11");
        assertEquals("nine11",cb.readdata());
    }

    @Test
    public void change_size_to_6_and_test(){
        int size = 6;
        cb.newsize(size);
        for (int i = 0;i<6;i++) {
            cb.writeData("haha" + i);
        }
        cb.writeData("nine");
        assertEquals("nine",cb.readdata());

    }

}