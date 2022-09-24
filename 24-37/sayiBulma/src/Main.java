import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,0};
        int arancak = 5;

        Arrays.sort(sayilar); // dizi sıralandı.
        int deger = Arrays.binarySearch(sayilar,5); //5 sayısı aranıyor
        if (deger < 0){
            System.out.println("Bulunamadı");
        }else {
            System.out.println("Bulundu ve indisi : " + deger);
        }
    }
}
