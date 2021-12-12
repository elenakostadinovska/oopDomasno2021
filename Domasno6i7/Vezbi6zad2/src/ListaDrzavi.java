
import java.util.ArrayList;
import java.util.List;
public class ListaDrzavi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Severna Makedonija");
        lista.add("Srbija");
        lista.add("Bugarija");
        lista.add("Albanija");
        lista.add("Grcija");
        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}