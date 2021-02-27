package mypackage;

public class TestClass {
    public static void main(String[] args) {

        System.out.println("Program with for");

        for (int i=0; i<5;i++){
            System.out.println(i);
        }

        System.out.println();

        for (int i=10; i>0;i--){
            System.out.println(i);
        }

        System.out.println();
        int[]array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = i;
            System.out.println("Done");
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Element with index " + i + " is " + array[i]);
        }

        // for each
        System.out.println();
        for (int element  : array){
            System.out.println(element);
        }

        int i = 0;
        boolean bool1 = true;
        while (i < 10){
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool1 = false;
        }

    }
}

