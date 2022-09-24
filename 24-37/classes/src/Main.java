public class Main {

    public static void main(String[] args) {
        // Classlar referans tiptir.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar = new int[]{1,2,3,4,5};
        int[] sayilar2 = new int[]{10,20,30,40,50};
        sayilar = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar[0]);
    }
}


