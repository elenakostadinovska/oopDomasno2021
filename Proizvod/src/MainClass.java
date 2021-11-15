class MainProizvod {
    public static void main(String[] args){
        Proizvod c = new Proizvod();
        c.setIme("Prsten");
        c.setCena("7000den");
        c.setProizvoditel("Zlatara AS");
        c.setTezina("3kg");

        System.out.println("Ime na proizvod: " + c.getIme());
        System.out.println("Cena: " + c.getCena());
        System.out.println("Proizvoditel: " + c.getProizvoditel());
        System.out.println("Tezina: " + c.getTezina());
    }
}