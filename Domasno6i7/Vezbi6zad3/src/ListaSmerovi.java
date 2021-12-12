
import java.util.ArrayList;
import java.util.List;
public class ListaSmerovi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Informatika");
        lista.add("Elektrotehnika");
        lista.add("Kompjuterski nauki");
        lista.add("Komunikacisko inzenerstvo");
        lista.add("Masinstvo");
        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}
