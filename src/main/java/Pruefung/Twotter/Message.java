package Pruefung.Twotter;

public class Message {
    String content;
    String datum;
    String user;

    public Message(String content){
        this.content=content;
        this.datum=datum;
    }

    public String getDatum() {
        return datum;
    }
}
