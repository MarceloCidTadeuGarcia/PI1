import java.util.*;
public class RPG3 {

    public static void main(String[] args) {
        
        int nivel = 0;
        int magia = 0;
        int forca = 0;
        
        Scanner leia = new Scanner(System.in);
        
        //Escolha da classe do personagem
        System.out.println("Informe a classe do seu personagem");
        System.out.println("1 - Mago \n2 - Guerreiro");
        int personagem = leia.nextInt();
        System.out.println("Qual o nível do seu personagem?");
        nivel = leia.nextInt();
        
        //Seleção de pontos de atributos
        System.out.println("\nAgora coloque os pontos de habilidade dele");
        System.out.print("Magia:");
        magia = leia.nextInt();
        System.out.print("Força:");
        forca = leia.nextInt();

        //Condicional e seleção de Guilda
        System.out.println("-------------------------------------------");
        
        if (personagem == 1 && nivel>=10 && magia >= 8){
            System.out.println("\nParabéns, você entrou como Mago da Guilda!");
        } else if (personagem == 2 && nivel>=10 && forca >=8) {
            System.out.println("\nParabéns, você entrou como Guerreiro da Guilda!");
        } else {
            System.out.println("\nVocê não tem os requisitos necessários para a Guilda. Volte depois de farmar xp");
        }
}
}
