public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new OgrenciKrediManager(),new TarımKrediManager()};
        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }


   }
}
