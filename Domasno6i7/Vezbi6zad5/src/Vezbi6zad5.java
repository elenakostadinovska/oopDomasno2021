
import java.util.ArrayList;
import java.util.List;
public class Vezbi6zad5 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(98);
        lista.add(42);
        lista.add(51);
        lista.add(12);
        System.out.println("Vtoriot element vo listata e: " + lista.get(1));
        System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}
