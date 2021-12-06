
import java.util.ArrayList;
import java.util.List;

public class SportskiKlub {
    public static void main(String[] args) {
        List<String> iminja = new ArrayList<>();
        iminja.add("Barcelona");
        iminja.add("Real Madrid");
        iminja.add("Atletiko");


        List<String> sport = new ArrayList<>();
        sport.add("Fudbal");
        sport.add("Kosarka");
        sport.add("Odbojka");

        List<String> clenovi = new ArrayList<>();
        clenovi.add("5");
        clenovi.add("6");
        clenovi.add("7");

        System.out.println("Elementite na listata se: " + iminja);
        System.out.println("Elementite na listata se: " + sport);
        System.out.println("Elementite na listata se: " + clenovi);
    }
}
