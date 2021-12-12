
import java.util.ArrayList;
import java.util.List;
public class ListaIminja {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Bitola");
        lista.add("Prilep");
        lista.add("Ohrid");
        lista.add("Struga");
        lista.add("Skopje");
        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}