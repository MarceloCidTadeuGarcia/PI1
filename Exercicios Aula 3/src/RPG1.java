import java.util.Scanner;

public class RPG1 {

        public static void main(String[] args) {

        int magia = 0;
        int forca = 0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha seu personagem!");
        System.out.println("1 - Mago \n2 - Guerreiro");
        int personagem = leia.nextInt();

        if (personagem == 1){
            magia = 10;
            forca = 3;
            System.out.println("\nVocê escolheu um Mago!");
            System.out.println("Magia: "+magia+" \nForça: "+forca);
        } else if (personagem == 2) {
            magia = 2;
            forca = 10;
            System.out.println("\nVocê escolheu um Guerreiro!");
            System.out.println("Magia: "+magia+" \nForça: "+forca);
        } else {
            System.out.println("Escolha inválida!");
        }

    }
}
