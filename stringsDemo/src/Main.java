import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        //B ile başlıyor mu?
        System.out.println(mesaj.startsWith("B"));
        //y ile bitiyor mu?
        System.out.println(mesaj.endsWith("y"));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler,0);
        System.out.println(karakterler);
        //Soldan arama yapar.
        System.out.println(mesaj.indexOf("av"));
        //Sağdan aramaya başlar.
        System.out.println(mesaj.lastIndexOf("a"));*/

        //neyi neyle değiştiricez (replace)
        String yeniMesaj =mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //2. indexten başla 5. indexe kadar (5. index dahil değil)
        System.out.println(mesaj.substring(2,5));

        //split alt alta yazdırır.
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        //Küçük harfe çevirme
        System.out.println(mesaj.toLowerCase());
        //Büyük harfe çevirme
        System.out.println(mesaj.toUpperCase());
        //Başındaki ve sonundaki boşlukları kaldırır.
        System.out.println(mesaj.trim());

    }
}
