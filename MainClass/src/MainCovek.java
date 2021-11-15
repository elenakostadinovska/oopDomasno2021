public class MainCovek {
    public static void main(String[] args){
        Covek c = new Covek();
        c.setIme("Rajko");
        c.setPrezime("Markoski");
        c.setEmbg("2410993485003");

        System.out.println("Ime: " + c.getIme());
        System.out.println("Prezime: " + c.getPrezime());
        System.out.println("EMBG: " + c.getEmbg());
    }
}
