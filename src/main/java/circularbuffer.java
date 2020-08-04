public class circularbuffer {
    private int size;
    private final String[] buffer;
    private int writepointer;
    private int readpointer;
    private int readpointerbw = 1;
    public boolean isEmpty() {
        return true;

    }
    public circularbuffer(){
        this(10);
    }
    public circularbuffer(int size1){
        this.size = size1;
        this.buffer = new String[size];
    }

    public void writeData(String input) {
        this.buffer [writepointer++] = input ;
        if(writepointer == size){
            writepointer = 0;
        }
    }
    public boolean isFull(){
        if (readpointer == size) {
            return false;
        }
        else return true;
    }

    public String readdata() {
        return this.buffer[readpointer++];
    }


    public String readdatabackward() {
            return this.buffer[readpointerbw--];
    }

    public void newsize(int newsize) {
        size = newsize ;
    }
}
