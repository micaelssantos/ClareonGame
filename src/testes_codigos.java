
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raphael.dmorlandi
 */
public class testes_codigos {
    
    static String[] questoes = new String[]{
        "\nVamos lá...  \n\nVeremos se é bom mesmo... \n\nPrimeira pergunta:",
        "segunda",
        "terceira",
        "quarta",
        "quinta",
        "sexta",
        "setima",
    };
    
    
    
    
    static void getQuestion(int n){
        System.out.println(questoes[n]);
    }
    
    
//    static int[] Array(int n){
//        return 1;
//    }
   
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        //int escolha;
        
        //escolha = input.nextInt();
        
        //getQuestion(escolha);
        
        
        
        String nome = "raphael";
        int LP =5;
        Scanner leitor = new Scanner (System.in);

//        System.out.println("\nVamos lá...  \n\nVeremos se é bom mesmo... \n\nPrimeira pergunta: ");
//        System.out.println("Life: " + LP);
//        System.out.println("\n1) Escolha qual das alternativas abaixo corresponde as letras A, B e C da equação: \n => x^2+9x+8=0 ");
//        System.out.print("\n a) a=1 b=2 c=7 \n b) a=-1 b=-9 c=4 \n c) a=1 b=9 c=8 \n d) a=1 b=5 c=8 \n\nDigite a opção: ");
        
        getQuestion(0);

        String alternativaUm = leitor.nextLine();
        for (int i = 0; i <= 3; i++) {
            while (!alternativaUm.toLowerCase().trim().equals("c")) {
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    return; //É RETURN O MELHOR CÓDIGO PARA PARAR?
                }
                alternativaUm = leitor.nextLine();
            }
        }
        System.out.println("\nHUMMMMM ... Ta espertinho então??? \n\nVamos para a próxima!\n");
        //----------------------------Pergunta 2----------------------------------------
        System.out.println("Segunda pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n2) Qual é a resposta da equação? \n => 10+30x5-10 ");
        System.out.print("\n a) 200 \n b) -200 \n c) -150 \n d) 150 \n\nDigite a opção: ");
        String alternativaDois = input.next();
        for (int i = 0; i <= 3; i++) {
            while (!alternativaDois.toLowerCase().trim().equals("d")) {
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    return;
                }
                alternativaDois = input.next();
            }
        }
        System.out.println("\nTa entendendo matemática heim?! \n\nPRÓXIMA! \n");

    }

//    public testes_codigos() {
//        this.<error> =  ;
//    }

}
