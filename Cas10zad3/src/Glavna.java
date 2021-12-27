
public class Glavna {
    public static void main(String[] args) {
        Student vraboten = new Student();
        vraboten.setIme("Stefan");
        vraboten.setPrezime("Stefanovski");
        vraboten.setIndex("100");


        XmlCreator xml = new XmlCreator();
        xml.createXMLFile("xml.xml", vraboten);

    }
}
