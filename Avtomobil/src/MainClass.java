class MainAvtomobil {
    public static void main(String[] args){
        Avtomobil c = new Avtomobil();
        c.setMarka("Mercedes");
        c.setModel("S");
        c.setKm("100000");
        c.setBoja("Bela");

        System.out.println("Marka: " + c.getMarka());
        System.out.println("Model: " + c.getModel());
        System.out.println("Kilometri: " + c.getKm());
        System.out.println("Boja: " + c.getBoja());
    }
}
