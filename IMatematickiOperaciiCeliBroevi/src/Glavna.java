public class Glavna {

    public static void main(String[] args) {
        int x=15;
        int y=15;
        KalkulatorZaCeliBroevi obj1=new KalkulatorZaCeliBroevi();
        System.out.println("Odzemanje: " + obj1.odzemanje(x,y));
        System.out.println("Sobiranje: " + obj1.sobiranje(x,y));
        System.out.println("Mnozenje: " + obj1.mnozenje(x,y));
        System.out.println("Delenje: " + obj1.delenje(x,y));
        System.out.println("Ostatok: " + obj1.ostatok(x,y));
        System.out.println("Stepenuvanje: " + obj1.stepenuvanje(x,y));
    }
}
