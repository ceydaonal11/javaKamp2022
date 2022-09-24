import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,0};
        int arancak = 5;

        Arrays.sort(sayilar); // dizi sıralandı
        int deger = Arrays.binarySearch(sayilar,7); //7 sayısı aranıyor.
        String mesaj = "";
        if (deger < 0){
            mesajVer("Bulunamadı" + deger);
            mesajVer(mesaj);
        }else {
            mesajVer("Bulundu ve indisi : " + deger);
        }

    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
