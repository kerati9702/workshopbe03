public class helloworld {

    public String sayhi() {
        return "hello world";
    }



    public String sayhi(String name) {
        return "hello" +name.substring(0,1).toUpperCase()+ name.substring(1,name.length());
    }
}
