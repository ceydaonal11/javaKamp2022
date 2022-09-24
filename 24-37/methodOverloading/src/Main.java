import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(4,5));
        int sonuc = dortIslem.topla(5,6,9);
        System.out.println(sonuc);
    }
}
