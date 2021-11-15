


class MainRestoran {
    public static void main(String[] args){
        Restoran c = new Restoran();
        c.setIme("Lovec");
        c.setLokacija("Bulevar 1-vi maj");
        c.setTelefon("047234567");
        c.setSedista("100");

        System.out.println("Ime na restoran: " + c.getIme());
        System.out.println("Lokacija: " + c.getLokacija());
        System.out.println("Telefon: " + c.getTelefon());
        System.out.println("Sedista: " + c.getSedista());
    }
}
