import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int maxNumber = 100;

        enumerate_while(maxNumber);

        System.out.println();

        enumerate_for(maxNumber);

        System.out.println();

        enumerate_even(maxNumber);

        System.out.println();

        superior_square(63);

        System.out.println();
        inferior_square(30);

        System.out.print(" ");

        inferior_square(63);
        System.out.print(" ");

        System.out.println();
        fibo(10);

        System.out.println("fibo 2");
        System.out.print(Arrays.toString(appoximative_fibo((float)0.01)));
    }
    static public void enumerate_while(int max) {
        int i = 0;
        while (i <= max) {
            System.out.printf(" " + i);
            i++;
        }
    }
    static public void enumerate_for(int max) {
        int i=0;
        for (i = 0; i <= max; i++) {
            System.out.print(" " + i);
        }
    }
    static public void enumerate_even(int max) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {

                System.out.printf(" " + i);
            }
            i++;
        }
    }

    static public void superior_square(int number){

       double result = Math.ceil(Math.sqrt(number));
       System.out.print(Math.round(result*result));
    }

    static public void inferior_square(int number){
        double result = Math.floor(Math.sqrt(number));
        System.out.print(Math.round(result*result));
    }

    public static int[] fibo(int number){

       int[] array = new int[number];
        array[0]=0;
        array[1]=1;
        int i = 2;

        while(i < number){
            int nb1 = array[i-1];
            int nb2 = array[i-2];
            array[i] = nb1+nb2;

            i++;
        }

        return array;
    }

    public static int[] appoximative_fibo(float epsilon){

        int[] array = fibo(10);
        float phi = ((float)(1+Math.sqrt(5))/2);
        int[] result = new int[2];

        for(int i = array.length-1 ; i > 0  ; i--) {

            if(((float)(Math.abs(array[i] / array[i-1]) - phi)) <= epsilon){

                result[0] = array[i];
                result[1] = array[i-1];
                return result;
            }
        }

        return result;
    }

}
