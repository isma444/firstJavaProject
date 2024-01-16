import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int maxNumber = 100;

        enumerate_while(maxNumber);

        System.out.println("enumerate for");

        enumerate_for(maxNumber);

        System.out.println("enumerate even");

        enumerate_even(maxNumber);

        System.out.println("superior square");

        superior_square(63);

        System.out.println("inferior square");
        inferior_square(30);

        System.out.print("");

        inferior_square(63);
        System.out.println(" ");

        System.out.println("fibo 1");
        System.out.println(Arrays.toString( fibo(10)));

        System.out.println("fibo 2");
        System.out.println(Arrays.toString(aproximative_fibo((float)0.01)));

        System.out.println("chaine de caractère");
        ArrayList<String> name = new ArrayList<>(List.of("jean", "Ahmed", "Lea", "Blanca" ));
        describe(name);
        to_upper_case(name);
        System.out.println(decrypt());
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

    public static int[] aproximative_fibo(float epsilon){

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

    public static void describe(ArrayList<String> list){
        for (String word : list){
            if(word.length()>=4) {
                System.out.println(word + " : " + word.length());
            }
        }
    }

    public static void to_upper_case(ArrayList<String> list){
        for(String word : list){
            System.out.println(word.toUpperCase());
        }
    }

    public static String decrypt(){
        String message = "000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000 c00o0000d00000e000000000000r000000000000000000 " +
                "00000c0000000000o000m00000000000000m0e000 000000000s00i0000000000 0l000e00000000 g000000000000a00000000000000000r0s0000 " +
                "000000000000000000000000000q00000u0000000000000000000000000i00000000 " +
                "000f000i0ni00000r0000000a 000p00000a00000r0000000000000000000000000000000"+"m00000000000000a000in0t000000e00n000000000i00r0000000000000000 " +
                "00000000000v00000000000o0000000t00r0000000e000000000 0c000o00d000000000e000000000 00e0000000000000000000000000000000000s0t0000000000000000000 0000000000000u0n00000 0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t0000h0e0 " +
                "000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t 0000000q0u000000000i 00000000sa00000it00000 000où0000000000 "+"000000v0000000o0000000000u000000000000000s000000000000000000 " +
                "00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000 " +
                "00(000000c0i0000000000000000000ta0ti0o00000000n 000000d000000000000000000e00 " +
                "00J000o00000000000000h0n00 0W00o000000000000o00000000000d0000000s0000000000)0.";

        return message.replaceAll("0", "");
    }

}
