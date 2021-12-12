import java.util.ArrayList;
import java.util.List;
public class ListaStringovi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("mail5@yahoo.com");
        lista.add("mail10@yahoo.com");
        lista.add("mail15@yahoo.com");
        lista.add("mail20@yahoo.com");



        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}
