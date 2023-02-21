import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
        int[] c = {5, 9, 7, 2, 8, 3, 4, 8};
        for (int i = 0; i < c.length; i++) {
            System.out.println("Ячейка массива номер: " + i + " равно " + c[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] a = {5, 9, 7, 2};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i!= a.length-1 ){
                System.out.print(",");
            }
        }
        System.out.println();

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i!=b.length-1){
                System.out.print(",");
            }
        }
        System.out.println();

        int[] c = {5412, 54569, 366652, 1114147, 55555};
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i!= c.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] a = {5, 9, 7, 2};
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i!=0){
                System.out.print(",");
            }
        }
        System.out.println();

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print(b[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println();

        int[] c = {5412, 54569, 366652, 1114147, 55555};
        for (int i = c.length-1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i!=0){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));
        for (int i = 0 ;i<a.length;i++){
            if (a[i]%2==1){
                a[i]=a[i]+1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}



