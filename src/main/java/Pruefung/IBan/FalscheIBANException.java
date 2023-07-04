package Pruefung.IBan;

public class FalscheIBANException extends Exception{
    public FalscheIBANException(){
        super(" FEHLER: Datei enthaelt ungueltige IBAN");
    }
    public FalscheIBANException(String message){
        super(message);
    }
}
