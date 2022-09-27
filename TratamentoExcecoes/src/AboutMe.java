import java.sql.SQLOutput;
import java.util.*;
public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            sc.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos Idade e Altura devem ser numéricos e altura conforme exemplo: 1.70");
        }
    }
}
