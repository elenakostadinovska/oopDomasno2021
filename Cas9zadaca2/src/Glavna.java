public class Glavna {
    public static void main(String[] args) {
        Vraboten vraboten = new Vraboten();
        vraboten.setIme("Aleksandar");
        vraboten.setPrezime("Ristevski");
        vraboten.setPlata("15000");


        XML xml = new XML();
        xml.createXMLFile("xml.xml", vraboten);

    }
}