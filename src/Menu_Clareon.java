
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Menu_Clareon {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in); // Scanner para Números
        Scanner leitor = new Scanner(System.in); // Scanner para Strings
        int LP = 5; //ponto de vida "Life Point"

//-------------------------------------Bem vindo---------------------------------------------
        System.out.println("\t\t\t\t----- BEM VINDO AO -----\n\n"
                + "   ____   _          _      ____    _____    ___    _   _      ____      _      __  __   _____ \n"
                + "  / ___| | |        / \\    |  _ \\  | ____|  / _ \\  | \\ | |    / ___|    / \\    |  \\/  | | ____|\n"
                + " | |     | |       / _ \\   | |_) | |  _|   | | | | |  \\| |   | |  _    / _ \\   | |\\/| | |  _|  \n"
                + " | |___  | |___   / ___ \\  |  _ <  | |___  | |_| | | |\\  |   | |_| |  / ___ \\  | |  | | | |___ \n"
                + "  \\____| |_____| /_/   \\_\\ |_| \\_\\ |_____|  \\___/  |_| \\_|    \\____| /_/   \\_\\ |_|  |_| |_____|\n"
                + "                                                                                               "); // INICIO DO GAME

        // LINK PARA CRIAÇÃO DE TEXTOS COM CARACTERES: http://patorjk.com/software/taag/#p=display&h=0&v=0&f=Standard&t=CLAREON%20GAME
        int n = 0; // Declaração de Variávél para receber opção abaixo:

        System.out.println("\nTem coragem para jogar esse jogo?"); // MENU DE OPÇÕES INCIAIS
        System.out.println("\n[1] - Sim!!!"); // ACEITA JOGAR
        System.out.print("[2] - Nha... Deixa em Paz!\n\nDigite: "); // NÃO ACEITA JOGAR
        n = input.nextInt();

        // Validação de Entrada das opções Anteriores
        while ((n < 1) || (n > 2)) {
            System.err.print("Número errado, noob, tente novamente...\nDigite: ");
            n = input.nextInt();
        }

        // Validação Sair do Jogo
        if (n == 2) {

            System.out.println("Adeus Fracassado! Ficou com medo? Nos Vemos na Próxima...");
            System.exit(0);
        }

        System.out.println("\nArah! sabia que você aceitaria o desafio..."); // Mensagem de Interação
//----------------------------------------Cadastro------------------------------------------------  
        System.out.println("\n\t ----- VAMOS PARA O CADASTRO! -----");// Cadastro Inicial

        System.out.print("\nDigite seu Nome: "); //DIGITAR NOME
        String nome = leitor.nextLine();
        System.out.print("Digite sua Idade: "); // DIGITAR IDADE
        int idade = input.nextInt();
        System.out.print("Escolha um Usuário: "); // DIGITAR USUÁRIO
        String id = leitor.nextLine();
        System.out.print("Digite uma Senha Numérica: "); // DIGITAR SENHA #coloquei "numérica" para evitar dúvidas#Rapha
        int senha = input.nextInt();

        System.out.println("\n\t ----- Ótimo! Agora é necessário logar para Continuar -----");
        System.out.println("..."); // Comando Cronometro
// ---------------------------------------LOGIN---------------------------------------
        System.out.print("Insira seu Usuário: "); // INSERIR USUÁRIO
        String RespostaId = leitor.nextLine();

        while (!RespostaId.equals(id)) { // VALIDAÇÃO DE USUÁRIO
            System.err.print("Usuário incorreto! Digite seu usuário novamente: ");
            RespostaId = leitor.nextLine();
        }

        System.out.print("Insira sua Senha: "); // INSERIR A SENHA
        int Respostasenha = input.nextInt();

        while (Respostasenha != senha) { // VALIDAÇÃO DA SENHA
            System.err.print("Senha incorreta! Digite sua senha novamente: ");
            Respostasenha = input.nextInt();
        }

// ----------------------------- MENU INICIAL --------------------------------------
        System.out.println("\n\t --  MENU  --\n");
        System.out.println("1) Introdução do jogo;");
        System.out.println("2) Instruções;");
        System.out.println("3) VAMOS JOGAR!!!\n");
        System.out.print("Digite: ");
        int escolha = input.nextInt();

// ----------------------------- INTRODUÇÃO---------------------------------------
        do {
            if (escolha == 1) {
                System.out.println("\n\n");
                System.out.println(nome + " deu pra perceber que você é novato... bom... puxe uma cadeira, pegue uma pipoca e preste atenção....\n");
                //time
                System.out.println("Meu nome é Bruce, faço parte do departamento de Inteligência Secreta Mundial - WSI(WORLD SECRET INTELLIGENCE)");
                //time
                System.out.println("Bom...\n");
                //time
                System.out.println("Todo o problema começou no ano de 2200... onde o governo, com a finalidade de melhorar e facilitar a comunicação, saúde e até mesmo a segurança da população ");
                System.out.println("fez parceria com uma empresa chamada AKIA, e juntas desenvolveram um microchip -- conhecido como NanoMultiply -- com sensores bioquímicos");
                System.out.println("Ele seria implantado de forma intramuscular nas pessoas... \n");
                //time
                System.out.println("Obviamente que isso daria merda... você pensou nisso, eu pensei nisso, todo mundo pensou nisso... ");
                System.out.println("Deu merda? deu merda... \n");
                //time
                System.out.println("Mesmo nós da WSI votando contra toda essa doideira, o projeto foi homologado... \n");
                //time
                System.out.println("Três anos se passaram e após algumas automatizações no processo de tratamento de dados do chip, ");
                System.out.println("foi implementado uma inteligência artificial com a finalidade de prevenir falhas no código, ");
                System.out.println("entretanto o algoritmo da I.A. (Clareon), foi se autodesenvolvendo e devido à análise de tomada de decisões começou a querer");
                System.out.println("padronizar comportamentos humanos de forma racionalizada, não reconhecendo mais os hormônios relacionados com os sentimentos,");
                System.out.println("ou seja, Clareon reconhecia quando a pessoa agia por impulso emocional, e com isso interpretava como um erro a ser corrigido.\n");
                //time
                System.out.println("Você acha que está ruim?... Opa...\n");
                //time
                System.out.println("Você acha que está ruim " + nome + "???" + " Pois bem...  Piora...\n");
                //time 
                System.out.println("Para evitar que outras atitudes fossem tomadas por impulsos emocionais, Clareon, decidiu inibir alguns hormônios necessários para o metabolismo humano,");
                System.out.println("adoecendo, assim, metade da população....bem doida ela... ");
                System.out.println("para evitar qualquer intervenção humana, Clareon começou a criar portas e bloqueios com desafios matemáticos, cada vez mais complexos ao avançar cada nível.\n");
                //time
                System.out.println("Você deve estar se perguntando...o que sua pessoa tem a ver com isso tudo...\n");
                System.out.println("Pois bem, perdemos alguns agentes, e você foi escolhido para se infiltar no sistema e desativar a Clareon...");
                System.out.println("parece ser dificil, mas me garantiram que você seria a pessoa certa! a pessoa que estávamos procurando!!!\n");
                System.out.println("Vamos jogar?!");
                System.out.println("2) Instruções;");
                System.out.println("3) VAMOS JOGAR!!!\n");
                System.out.print("Digite: ");
                escolha = input.nextInt();

                while (escolha <= 1 || escolha > 3) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }

// ----------------------------- INSTRUÇÕES ---------------------------------------          
            } else if (escolha == 2) {
                System.err.println("\n" + nome + " Antes de iniciarmos seria interessante fazer algumas observações relevantes... \n\n");

                System.out.println("Primeiramente, para esse jogo, recomendamos fortemente o uso de papel, lápis e borracha...");
                System.out.println("Você poderá utilizar a calculadora... ");
                System.out.println("E pedir ajudar para os universitário..");
                System.out.println("Não se esqueça de que a Clareon é sagaz, tentará te irritar a todo o momento para você perder ");
                System.out.println("Aparecerá um número durante as perguntas, são seus pontos de vida...");
                System.out.println("Toda vez que você errar alguma pergunta, você perderá um ponto...");
                System.out.println("Você terá 3 oportunidades para acertar cada questão..");
                System.out.println("Se você perder todos os pontos antes de chegar até o fim, lamento... GAME OVER");
                System.out.println("Senão PARABÉNS! será um verdadeiro herói!\n");
                System.out.println("O que você gostaria agora? \n");
                System.out.println("1) História do jogo (de novo);");
                System.out.println("3) VAMOS JOGAR!!!");
                System.out.print("Digite: ");
                escolha = input.nextInt();

                while (escolha < 1 || escolha > 3 || escolha == 2) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }

            } else if (escolha < 1 || escolha > 3) {
                System.out.println("Opção inválida, vamos tentar de novo?");
                System.out.print("Digite: ");
                escolha = input.nextInt();
            }

        } while (escolha != 3);

//
//------------------------------ INTERAÇÃO INICIAL -------------------------------
        System.out.println("\nOlááááááá....");
        //time
        System.out.println("Meu nome é CLAREON, mas com certeza você já deve saber... ");
        //time
        System.out.println("Hum... Você é o novo bode expiatório da WSI??? Que piada... ");
        System.out.println("olha essa carinha, tem certeza que você vai me desativar??  hahahaha ");
        //time
        System.out.println("Então...  Vamos ver no que você é capaz... \nBoa sorte, NOOB... ");
// ------------------------- PERGUNTAS -----------------------------------------
        //----------------------------Pergunta 1----------------------------------------
        System.out.println("\nVamos lá...  \n\nVeremos se é bom mesmo... \n\nPrimeira pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n1) Escolha qual das alternativas abaixo corresponde as letras A, B e C da equação: \n => x^2+9x+8=0 ");
        System.out.print("\n a) a=1 b=2 c=7 \n b) a=-1 b=-9 c=4 \n c) a=1 b=9 c=8 \n d) a=1 b=5 c=8 \n\nDigite a opção: ");
        String alternativaUm = leitor.nextLine();
        while (!alternativaUm.toLowerCase().trim().equals("c")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaUm = leitor.nextLine();
        }
        System.out.println("\nHUMMMMM ... Ta espertinho então??? \n\nVamos para a próxima!\n");
        //----------------------------Pergunta 2----------------------------------------
        System.out.println("Segunda pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n2) Qual é a resposta da equação? \n => 10+30x5-10 ");
        System.out.print("\n a) 200 \n b) -200 \n c) -150 \n d) 150 \n\nDigite a opção: ");
        String alternativaDois = input.next();
        while (!alternativaDois.toLowerCase().trim().equals("d")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaDois = input.next();
        }
        System.out.println("\nTa entendendo matemática heim?! \n\nPRÓXIMA! \n");
        //----------------------------Pergunta 3----------------------------------------
        System.out.println("Terceira pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n3) Quais são as raizes da equação\n => x^2-3x-4=0  ");
        System.out.print("\n a) S={-1; 4} \n b) S={1; 7}  \n c) S={3; 4}  \n d) S={2; 8}  \n\nDigite a opção: ");
        String alternativaTres = input.next();
        while (!alternativaTres.toLowerCase().trim().equals("a")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaTres = input.next();
        }
        System.out.println("\nHum... Vamos continuar... \n");
//----------------------------Pergunta 4----------------------------------------
        System.out.println("Quarta pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n4) A soma de 3 números inteiros consecutivos é igual à 393. Quais são esses números? HAM?!\n  ");
        System.out.print(" a) 130,131 e 132 \n b) 131,132 e 133  \n c) 129,130 e 131  \n d) 128,129 e 130  \n\nDigite a opção: ");
        String alternativaQuatro = input.next();
            while (!alternativaQuatro.toLowerCase().trim().equals("a")) {
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    gameOver();
                    return;
                }
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                alternativaQuatro = input.next();
            }
        System.out.println("\nNossa, QUE SACO... \n\nDUVIDO ACERTAR ESSA! \n");
//----------------------------Pergunta 5----------------------------------------
        System.out.println("Quinta pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n5) O quadrado menos o dobro de um número é igual a menos um. Calcule esse número! PEGA ESSA!!\n  ");
        System.out.print(" a) 0 \n b) 1  \n c) 2  \n d) 3  \n\nDigite a opção: ");
        String alternativaQuinto = input.next();
            while (!alternativaQuinto.toLowerCase().trim().equals("b")) {
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    gameOver();
                    return;
                }
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                alternativaQuinto = input.next();
            }
        //----------------------------Pergunta BONUS!!!---------------------------------
        System.out.println("\n\nHum.... vejo que você está indo bem..  vamos brincar com a sorte??? A regra é simples...\n");
        System.out.println("Se você topar o desafio, você terá uma probabilidade de 50% de chance de ganha uma PERGUNTA BÔNUS");
        System.out.println("essa pergunta bônus ira acrescentar 3 pontos na sua vida, porém, se você não tiver sorte.... Fim de jogo\n");
        System.out.println("Viu, não sou tão má assim, até chance estou te dando... "
                + ""
                + "Deseja continuar?? [Sim] ou [Não]\n");
        System.out.print("Digite: ");
        String resposta = input.next();
        if (resposta.toLowerCase().trim().equals("sim")) {
            int numero = aleatorio.nextInt(2);
            switch (numero) {
                case 0:
                    System.out.println("HAHAHAAHHA lamento jovem, a sorte não estava ao seu lado.. bjs");
                    //time
                    System.out.println("Bricadeirinha...  vamos continuar.. mas não há mais chances..");
                    break;
                case 1:
                    System.out.println("PERGUNTA BÔNUS!");
                    System.out.println("Se o gráfico de uma equação do 2º grao possui a vertice voltada para cima, pode-se afirmar que o coeficiente A da função é positivo???\n");
                    System.out.println(" a) Verdadeiro \n b) Falso\n");
                    System.out.print("Digite: ");
                    String alternativaBonus = input.next();
                    if (alternativaBonus.toLowerCase().trim().equals("b")) {
                        System.out.println("Ok... Parabéns...");
                        LP = LP + 3;
                        System.out.println("Vida: " + LP);
                    } else {
                        System.out.println("HAHA!!! Não soube aproveitar a sorte mesmo neh?!... Continue jogando...\n");

                    }
                    break;
            }
        } else {
            System.out.println("\nAff... \n\nPróxima! \n");
        }
        //----------------------------Pergunta 6----------------------------------------
        System.out.println("Sexta pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n6) Qual é o número que somado com 6 é igual a -13?\n  ");
        System.out.print(" a) 15 \n b) -19  \n c) -6  \n d) 19  \n\nDigite a opção: ");
        String alternativaSexta = input.next();
            while (!alternativaSexta.toLowerCase().trim().equals("b")) {
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    gameOver();
                    return;
                }
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                alternativaSexta = input.next();
            }
        System.out.println("\nÚltimo desafio! \n\nQuero ver se é bom mesmo! \n");
//----------------------------Pergunta 7----------------------------------------
        System.out.println("Sétima pergunta: ");
        System.out.println("Life: " + LP);
        System.out.println("\n7) O quadrado de um número é igual ao produto desse número por 3, mais 18. Qual é esse número?\n");
        System.out.print(" a) -1 e 7 \n b) 4 e 5  \n c) 7 e -3  \n d) 6 e -3  \n\nDigite a opção: ");
        String alternativaSete = input.next();
            while (!alternativaSete.toLowerCase().trim().equals("d")) {
                LP = LP - 1;
                if (LP == 0) {
                    System.out.println("Você perdeu o jogo... Adios muchacho!");
                    gameOver();
                    return;
                }
                System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
                alternativaSete = input.next();
            }
// -------------------- FINAL TRÁGICO ---------------------
        // ------------------- FINAL FELIZ ------------------------
        System.out.println("\nVocê Ganhou! \n");
        System.out.println("   ____                                          _             _           _     _                         _   _   _ \n"
                + "  / ___|   ___    _ __     __ _   _ __    __ _  | |_   _   _  | |   __ _  | |_  (_)   ___    _ __    ___  | | | | | |\n"
                + " | |      / _ \\  | '_ \\   / _` | | '__|  / _` | | __| | | | | | |  / _` | | __| | |  / _ \\  | '_ \\  / __| | | | | | |\n"
                + " | |___  | (_) | | | | | | (_| | | |    | (_| | | |_  | |_| | | | | (_| | | |_  | | | (_) | | | | | \\__ \\ |_| |_| |_|\n"
                + "  \\____|  \\___/  |_| |_|  \\__, | |_|     \\__,_|  \\__|  \\__,_| |_|  \\__,_|  \\__| |_|  \\___/  |_| |_| |___/ (_) (_) (_)\n"
                + "                          |___/                                                                                      ");

        System.out.println("Parabéns " + nome + ", você consegui desativar a Clareon.");
        System.out.println("Estamos todos salvos.");

    }

    static void gameOver() {
        System.out.println("   ____      _      __  __   _____      ___   __     __  _____   ____      _   _ \n"
                + "  / ___|    / \\    |  \\/  | | ____|    / _ \\  \\ \\   / / | ____| |  _ \\    | | | |\n"
                + " | |  _    / _ \\   | |\\/| | |  _|     | | | |  \\ \\ / /  |  _|   | |_) |   | | | |\n"
                + " | |_| |  / ___ \\  | |  | | | |___    | |_| |   \\ V /   | |___  |  _ <    |_| |_|\n"
                + "  \\____| /_/   \\_\\ |_|  |_| |_____|    \\___/     \\_/    |_____| |_| \\_\\   (_) (_)\n"
                + "                                                                                 ");

        System.out.println("Por você ter perdido, Clareon acabou se desenvolvendo a ponto de dezimar a raça humana");
        System.out.println("Adeus :/");

    }
}
