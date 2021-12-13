import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Glavna    {
    public static void main(String[] args){
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            AngliskoMkdRecnik r=new AngliskoMkdRecnik();
            r.vnesiMapa();
            r.translate(s);
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
