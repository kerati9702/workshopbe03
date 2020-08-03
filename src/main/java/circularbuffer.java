public class circularbuffer {
    private int size = 10;
    private String[] buffer = new String[10];
    private int writepointer;
    private int readpointer;
    private int readpointerbw = 1;
    public boolean isEmpty() {
        return true;

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
