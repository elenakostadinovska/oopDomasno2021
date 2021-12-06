import java.util.ArrayList;
import java.util.List;
public class Glavna {
    public static void main(String[] args) {
        Convert object = new Convert();
        List<String> lista = new ArrayList<String>();
        lista.add("M");
        lista.add("N");
        object.listToArray(lista);
        String[] niza = {"m", "n", "o"};
        object.arrayToList(niza);
    }
}