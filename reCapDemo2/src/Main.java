public class Main {

    public static void main(String[] args) {
        //double[] myList = new double[4];
        double[] myList = {1.4,4.5,8.6,4.1};
        // Yukarıda tanımladığımızla aynı şey
        double total =0;
        double max = myList[0];
        for (double number:myList){
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);

    }
}
