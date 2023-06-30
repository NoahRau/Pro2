package Pruefung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserManager implements ObjectManager<User>{
    final String datei ="User.dat";
    @Override
    public void serialize(List<User> object) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(datei))) {
        for(User u :object){
            bw.write(u.getName()+";"+u.getPw()+"\n");
            bw.flush();
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> deserialize() {
        List<User> out = new ArrayList<>();
        try(
                BufferedReader br = new BufferedReader(new FileReader(datei))
                )
        {
            while(true){
                String in =br.readLine();
                if(Objects.equals(in, "") || in ==null)break;
                else{
                    out.add(new User(in.split(";")[0],in.split(";")[1]));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return out;
    }
}
