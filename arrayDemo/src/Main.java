public class Main {

    public static void main(String[] args) {
        String[] array ={"Ceyda","Hüseyin","Buğra","Yiğit","Sıla"};
        System.out.println(array[0]);
        System.out.println(array[3]);
        System.out.println("---------------------------------------------------");

        String[] students = new String[4];
        students[0] = "Münevver";
        students[1] = "Yunus";
        students[2] = "Rabia";
        students[3] = "Mustafa";

        System.out.println(students[1]);
        System.out.println("---------------------------------------------------");

        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("---------------------------------------------------");
        for (String student:students){
            System.out.println(student);
        }
    }
}
