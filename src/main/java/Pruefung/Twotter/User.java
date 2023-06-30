package Pruefung.Twotter;

import java.io.Serializable;

public class User implements Serializable {
    final String name;
    String pw;
    public User(String name,String pw){
        this.name=name;
        this.pw=pw;
    }


    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }
}
