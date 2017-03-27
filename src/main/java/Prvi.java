import liki.Pravokotnik;

/**
 * Created by amadej on 27. 03. 17.
 */


public class Prvi {
    public static void main(String[] args){
        System.out.println("Zdravo");



        Pravokotnik pravokotnik = new Pravokotnik(5, 10);

        System.out.println(pravokotnik.ploscina());

        Pravokotnik pravokotnik2 = new Pravokotnik(5, 10);
        pravokotnik2.ploscina();

        Pravokotnik pravokotnik3 = new Pravokotnik();
        pravokotnik2.ploscina();
    }
}
