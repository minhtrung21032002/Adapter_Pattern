public class Adapter implements Client_Interface{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void send(String text){
        System.out.println("Reading Words ...");
        System.out.println(text);
        String vietnameseWords = this.translate(text);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }
    public String translate(String vietnameseWords){
        System.out.println("Translated!");
        return "Word translated";
    }
}