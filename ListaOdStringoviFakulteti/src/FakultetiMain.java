import java.util.ArrayList;
import java.util.List;
public class FakultetiMain {
    public static void main(String[] args) {
        List<String> fakulteti = new ArrayList<>();
        fakulteti.add("FIKT");
        fakulteti.add("FINKI");
        fakulteti.add("Tehnicki fakultet");
        System.out.println("Listata sodrzhi: " + fakulteti.size() + " elementi.");
        System.out.println("Elementite na listata se: " + fakulteti);
    }
}
