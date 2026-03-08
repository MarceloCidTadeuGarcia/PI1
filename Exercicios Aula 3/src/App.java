
import java.util.*;

public class App {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18 || idade %2 == 0 && idade < 50) {
            System.out.println("Bem-vindo à taverna!");
        } else {
            System.out.println("Entrada inválida!");
        }
        
    }
}
