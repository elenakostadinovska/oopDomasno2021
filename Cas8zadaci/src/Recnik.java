import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Recnik {
    public static void main(String[] args) {
        TreeMap<String, String> a = new TreeMap <String, String>();
        a.put("hi", "zdravo");
        a.put("okay", "dobro");
        a.put("sorry", "izvini");
        a.put("thanks", "blagodaram");
        a.put("yes", "da");
        a.put("no", "ne");

        System.out.println(a.keySet());
        System.out.println(a.values());

        for (Map.Entry<String , String> entry : a.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        System.out.println(a.firstKey());

    }
}
