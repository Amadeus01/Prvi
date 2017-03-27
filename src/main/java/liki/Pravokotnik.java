package liki;

/**
 * Created by amadej on 27. 03. 17.
 */
public class Pravokotnik {
    public int a;
    public int b;

    public Pravokotnik() {}

    public Pravokotnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int ploscina() {
        return a * b;
    }
}
