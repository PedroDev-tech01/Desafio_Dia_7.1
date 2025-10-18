import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o Nump1 op nump2");

        Scanner N = new Scanner(System.in);
        double nump1 = N.nextDouble();
        char op = N.next().charAt(0);
        double nump2 = N.nextDouble();

        if(op == '+' ){
            System.out.println((int)nump1 + nump2);
        }
        else if (op == '-' ) {
            System.out.println((int)nump1 - nump2);
        }
        else if (op == '*' ) {
            System.out.println((int)nump1 * nump2);
        }
        else if (op == '/' ) {
            System.out.println(nump1 / nump2);
        }
        else {
            System.out.println("Numero invalido");
        }

    }
}