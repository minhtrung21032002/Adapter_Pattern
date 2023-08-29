public class Test_Client {
    public static void main(String[] args) {
        Client_Interface test = new Adapter(new Adaptee());
        test.send("Xin Chao");
}}
