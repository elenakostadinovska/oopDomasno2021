import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class ListaCeliBroevi {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(15);
        lista.add(2);
        lista.add(75);
        lista.add(67);
        Collections.sort(lista);
        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Sortiranite elementi na listata se: " + lista);
    }
}
