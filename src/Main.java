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
}
