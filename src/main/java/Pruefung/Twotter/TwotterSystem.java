package Pruefung.Twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwotterSystem {
    HashMap<User ,Message> inhalt=new HashMap<>();
    public void addMessage(Message content,User u){
        inhalt.put(u,content);
    }
    public List<Message> getAllMessages(){
        List<Message> out = new ArrayList<>();
        inhalt.forEach((key,value)->out.add(value));
        return out;
    }
    public List<Message> getAllMessagesFromDate(String datum){
        List<Message> out = new ArrayList<>();
        inhalt.values().stream().filter(value -> value.getDatum().equals(datum)).forEach(value->out.add(value));
        return out;


    } public static void main(String[] args)
    {
        TwotterSystem system = new TwotterSystem();
        User u = new User("joe", "joeRus!");
        system.addMessage(
                new Message("Hello World!"),u);
        List<Message> a = system.getAllMessages();
        List<Message> m =
                system.getAllMessagesFromDate(
                        "2019-05-31");
        List<Message> d =
                system.getAllMessagesFromUser(u);
    }

    private List<Message> getAllMessagesFromUser(User u) {
        return null;
    }
}
