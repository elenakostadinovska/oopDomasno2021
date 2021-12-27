import java.io.IOException;
import java.security.PublicKey;

public class Glavna {
    public static void main (String[] args) throws IOException {
        Datoteka d=new Datoteka("file.txt");
        d.zapishi("Tekstot e ovaj");
        d.prochitaj();
    }
}
