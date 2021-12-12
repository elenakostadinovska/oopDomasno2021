
import java.util.HashSet;
import java.util.Set;
public class MnozStr {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        System.out.println(set1);
        System.out.println("Множеството има " + set1.size() + " елемент/и.");
    }
}
