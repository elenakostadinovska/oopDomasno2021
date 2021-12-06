import java.util.ArrayList;
import java.util.List;
public class FootballClubsMain {
    public static void main(String[] args) {
        List<String> footballClubs = new ArrayList<>();
        footballClubs.add("Barcelona");
        footballClubs.add("Real Madrid");
        footballClubs.add("Atletiko");
        System.out.println("Listata pred brishenje na 1 element sodrzhi: " + footballClubs.size() + " elementi.");
        System.out.println("Elementite na listata se: " + footballClubs);
        footballClubs.remove(0);
        System.out.println("Listata posle brishenje na 1 element sodrzhi: " + footballClubs.size() + " elementi.");
        System.out.println("Elementite na listata se: " + footballClubs);
    }
}
