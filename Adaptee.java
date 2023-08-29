public class Adaptee{
    public void receive(String text){
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(text);
    }
}