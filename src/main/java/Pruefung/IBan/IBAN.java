package Pruefung.IBan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IBAN {
    public boolean iBANCheck(String iban) throws FalscheIBANException {
        if(iban.startsWith("DE")&&iban.length()==22)return true;
        throw new FalscheIBANException();
    }
    public void iBANauslesen(String dateiName) throws FalscheIBANException {
        try(BufferedReader br= new BufferedReader(new FileReader(dateiName))){
            String line = br.readLine();
            while(line!=null){
                iBANCheck(line);
            }
            System.out.println("Alle IBANs Passen in :"+dateiName);
        }catch (FileNotFoundException e){
            System.out.println("Datei" +dateiName+ "nicht gefunden“\n");
        }catch(IOException e) {
            System.out.println("Fehler beim Lesevorgang von Datei: "+dateiName);
        }catch (NullPointerException e){
            System.out.println("Datei "+dateiName+" existiert nicht");
        }
    }
    public void dateienTest(String[] dateien){
        for (String datei:dateien) {
            try{iBANauslesen(datei);}
            catch (FalscheIBANException e){
                System.out.println(datei+" enthaelt fehlerhafte IBANs");
            }
        }
    }
    @Test
    public void Teste() throws FalscheIBANException {
        String rIBAN="DE2130120400000BYI1522";
        String fIBAN="1432442314312432123423";
        String f2IBAN="DE31231231231231231";
        Assertions.assertTrue(iBANCheck(rIBAN));
        Assertions.assertThrows(Pruefung.IBan.FalscheIBANException.class,()->iBANCheck(fIBAN));
        Assertions.assertThrows(Pruefung.IBan.FalscheIBANException.class,()->iBANCheck(f2IBAN));
    }

}
