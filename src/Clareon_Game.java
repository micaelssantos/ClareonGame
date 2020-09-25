
import java.util.Random;
import java.util.Scanner;

public class Clareon_Game {

    static Random aleatorio = new Random();
    static Scanner input = new Scanner(System.in);
    static Scanner leitor = new Scanner(System.in);
    static String enter;
    static int LP;

    static void entradaJogo() {

        System.out.println("\t\t\t\t----- BEM VINDO AO -----\n\n"
                + "   ____   _          _      ____    _____    ___    _   _      ____      _      __  __   _____ \n"
                + "  / ___| | |        / \\    |  _ \\  | ____|  / _ \\  | \\ | |    / ___|    / \\    |  \\/  | | ____|\n"
                + " | |     | |       / _ \\   | |_) | |  _|   | | | | |  \\| |   | |  _    / _ \\   | |\\/| | |  _|  \n"
                + " | |___  | |___   / ___ \\  |  _ <  | |___  | |_| | | |\\  |   | |_| |  / ___ \\  | |  | | | |___ \n"
                + "  \\____| |_____| /_/   \\_\\ |_| \\_\\ |_____|  \\___/  |_| \\_|    \\____| /_/   \\_\\ |_|  |_| |_____|\n"
                + "                                                                                               ");

        System.out.println("\nTem coragem para jogar esse jogo?");
        System.out.println("\n[1] - Sim!!!");
        System.out.print("[2] - Nha... Deixa em Paz!\n\nDigite: ");
        int n = input.nextInt();
        while ((n < 1) || (n > 2)) {
            System.err.print("Número errado, noob, tente novamente...\nDigite: ");
            n = input.nextInt();
        }
        if (n == 2) {
            System.out.println("Adeus Fracassado! Ficou com medo? Nos Vemos na Próxima...");
            System.exit(0);
        }
        System.out.println("\nArah! sabia que você aceitaria o desafio...");
    }

    static void LifePoint() {
        System.out.println("\t\n\n ----- Escolha um nível -----  \n");
        System.out.println(" a) Nível Noob: 7 pontos de vida");
        System.out.println(" b) Nível Médio: 5 pontos de vida");
        System.out.println(" c) Nível Intermediário: 3 pontos de vida");
        System.out.println(" d) Nível Avançado: 1 ponto de vida\n");
        System.out.print("Digite: ");
        String escolha = leitor.nextLine().toLowerCase().trim();
        while (!(escolha.equals("a") || escolha.equals("b") || escolha.equals("c") || escolha.equals("d"))) {
            System.err.print("Digite uma opção válida: ");
            escolha = leitor.nextLine().toLowerCase().trim();
        }
        switch (escolha) {
            case "a":
                LP = 7;
                break;
            case "b":
                LP = 5;
                break;
            case "c":
                LP = 3;
                break;
            case "d":
                LP = 1;
                break;

        }
    }

    static String cadastroNome() {
        System.out.println("\n\t ----- VAMOS PARA O CADASTRO! -----");
        System.out.print("\nDigite seu Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Digite sua Idade: ");
        int idade = input.nextInt();
        return nome;
    }

    static int cadastroSenha() {
        System.out.print("Digite uma Senha Numérica: ");
        int senha = input.nextInt();

        System.out.println("\n\t ----- Ótimo! Agora é necessário logar para Continuar -----\n");
        return senha;
    }

    static String cadastroUsuario() {
        System.out.print("Escolha um Usuário: ");
        String id = leitor.nextLine();
        return id;
    }

    static void logandoJogo(String id, int senha) {
        System.out.print("Insira seu Usuário: ");
        String RespostaId = leitor.nextLine();
        while (!RespostaId.equals(id)) {
            System.err.print("Usuário incorreto! Digite seu usuário novamente: ");
            RespostaId = leitor.nextLine();
        }

        System.out.print("Insira sua Senha: ");
        int Respostasenha = input.nextInt();
        while (Respostasenha != senha) {
            System.err.print("Senha incorreta! Digite sua senha novamente: ");
            Respostasenha = input.nextInt();
        }
    }

    static int menuInicial() {
        System.out.println("\n\t --  MENU  --\n");
        System.out.println("1) História do jogo;");
        System.out.println("2) Instruções;");
        System.out.println("3) Sobre o jogo");
        System.out.println("4) Desenvolvedores");
        System.out.println("5) VAMOS JOGAR!!!\n");
        System.out.print("Digite: ");
        int escolha = input.nextInt();
        return escolha;
    }

    static void opcaoMenu(int escolha, String nome) {
        do {
            if (escolha == 1) {
                System.out.println("");
                System.out.println(nome + " deu pra perceber que você é novato... bom... puxe uma cadeira, pegue uma pipoca e preste atenção....\n");

                System.out.print("Tecle 'Enter' para Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nMeu nome é Bruce, faço parte do departamento de Inteligência Secreta Mundial - WSI(WORLD SECRET INTELLIGENCE)");
                System.out.println("\nBom...\n");
                System.out.println("Todo o problema começou no ano de 2200... Onde o governo, com a finalidade de melhorar e facilitar a comunicação, saúde e até mesmo a segurança da população ");
                System.out.println("fez parceria com uma empresa chamada AKIA, e juntas desenvolveram um microchip -- conhecido como NanoMultiply -- com sensores bioquímicos");
                System.out.println("Ele seria implantado de forma intramuscular nas pessoas... \n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nObviamente que isso daria merda... Você pensou nisso, eu pensei nisso, todo mundo pensou nisso... ");
                System.out.println("Deu merda? deu merda... \n");
                System.out.println("Mesmo nós da WSI votando contra toda essa doideira, o projeto foi homologado... \n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nTrês anos se passaram e após algumas automatizações no processo de tratamento de dados do chip, ");
                System.out.println("foi implementado uma inteligência artificial com a finalidade de prevenir falhas no código, ");
                System.out.println("entretanto o algoritmo da I.A. (Clareon), foi se autodesenvolvendo e devido à análise de tomadas de decisões começou a querer");
                System.out.println("padronizar comportamentos humanos de forma racionalizada, não reconhecendo mais os hormônios relacionados com os sentimentos,");
                System.out.println("ou seja, Clareon reconhecia quando a pessoa agia por impulso emocional, e com isso interpretava como um erro a ser corrigido.\n");
                System.out.println("Você acha que está ruim, " + nome + "???" + " Pois bem...  Piora...\n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nPara evitar que outras atitudes fossem tomadas por impulsos emocionais, Clareon, decidiu inibir alguns hormônios necessários para o metabolismo humano,");
                System.out.println("adoecendo, assim, metade da população....bem doida ela... ");
                System.out.println("para evitar qualquer intervenção humana, Clareon começou a criar portas e bloqueios com desafios matemáticos, cada vez mais complexos ao avançar cada nível.\n");
                System.out.println("Você deve estar se perguntando... O que sua pessoa tem a ver com isso tudo?!\n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nPois bem, perdemos alguns agentes, e você foi escolhido para se infiltar no sistema e desativar a Clareon...");
                System.out.println("Parece ser dificil, mas me garantiram que você seria a pessoa certa! a pessoa que estávamos procurando!!!\n");
                System.out.println("Vamos jogar?!");
                System.out.println("2) Instruções;");
                System.out.println("3) Sobre o jogo");
                System.out.println("4) Desenvolvedores");
                System.out.println("5) VAMOS JOGAR!!!\n");
                System.out.print("Digite: ");
                escolha = input.nextInt();
                while (escolha <= 1 || escolha > 5) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }
            } else if (escolha == 2) {
                System.out.println("\n" + nome + ",\nAntes de iniciarmos seria interessante fazermos algumas observações relevantes... \n");

                System.out.print("Tecle 'Enter' para Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nPrimeiramente, para esse jogo, recomendamos fortemente o uso de papel, lápis e borracha...\n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nVocê poderá utilizar a calculadora... ");
                System.out.println("E pedir ajuda para os universitários...\n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nNão se esqueça de que a Clareon é sagaz e tentará te irritar a todo o momento para você perder!\n");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nAparecerá um número durante as perguntas, são seus pontos de vida...");
                System.out.println("Toda vez que você errar alguma pergunta, você perderá um ponto...");

                System.out.print("Continuar... ");
                enter = leitor.nextLine();

                System.out.println("\nSe você perder todos os pontos antes de chegar até o fim, lamento... GAME OVER!");
                System.out.println("Senão, PARABÉNS! Será um verdadeiro herói!\n");
                System.out.println("O que você gostaria agora? \n");
                System.out.println("1) História do jogo;");
                System.out.println("3) Sobre o jogo");
                System.out.println("4) Desenvolvedores");
                System.out.println("5) VAMOS JOGAR!!!\n");
                System.out.print("Digite: ");
                escolha = input.nextInt();

                while (escolha < 1 || escolha > 5 || escolha == 2) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }
            } else if (escolha == 3) {

                System.out.println("Esse jogo foi criado devido a uma disciplina do Centro Universitário SENAC. \n ");
                System.out.println("O intuito dele é que os alunos do ensino médio/faculdade estudem matemática se divertindo!\n");
                System.out.print("Continuar... ");
                enter = leitor.nextLine();
                System.out.println("Para realizar o jogo, o grupo desenvolvedor utilizou: ");
                System.out.println("\nEstruturas de repetições, \nEstruturas condicionais, \nFunções, \nVetores e... \nMuita Criatividade! :P");
                System.out.print("Continuar... ");
                enter = leitor.nextLine();
                System.out.println("Esperamos de coração, caro jogador, ou melhor... " + nome + " que se divirta e aprenda com o nosso trabalho!");
                System.out.print("Continuar... ");
                enter = leitor.nextLine();
                System.out.println("BONS ESTUDOS! :D ");

                System.out.println("O que você gostaria agora? \n");
                System.out.println("1) História do jogo;");
                System.out.println("2) Instruções;");
                System.out.println("4) Desenvolvedores");
                System.out.println("5) VAMOS JOGAR!!!\n");
                System.out.print("Digite: ");
                escolha = input.nextInt();
                while (escolha < 1 || escolha > 5 || escolha == 3) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }

            } else if (escolha == 4) {

                System.out.println("Esse jogo foi criado e desenvolvido pelas pessoas mais fora da caixinha da turma");
                System.out.println("amantes de técnologia e de 'Black Mirror' rs... \n");
                System.out.println("Sendo eles: \n");
                System.out.println("Gabriela Alves Tucunduva Arantes;");
                System.out.println("Micael de Sousa Santos;");
                System.out.println("Pedro Victor Lage de Oliveira Cruz;");
                System.out.println("Raphael Della Maggiore Orlandi \n");

                System.out.println("O que você gostaria agora? \n");
                System.out.println("1) História do jogo;");
                System.out.println("2) Instruções;");
                System.out.println("3) Sobre o jogo");
                System.out.println("5) VAMOS JOGAR!!!\n");
                System.out.print("Digite: ");
                escolha = input.nextInt();
                while (escolha < 1 || escolha > 5 || escolha == 4) {
                    System.err.print("Opção Inválida! Digite Novamente: ");
                    escolha = input.nextInt();
                }

            } else if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida, vamos tentar de novo?");
                System.out.print("Digite: ");
                escolha = input.nextInt();
            }

        } while (escolha != 5);
    }

    static void interacaoClareo() {
        System.out.println("\nOlááááááá....");
        System.out.println("Meu nome é CLAREON, mas com certeza você já deve saber... \n");

        System.out.print("Tecle 'Enter' para Continuar... ");
        enter = leitor.nextLine();

        System.out.println("\nHum... Você é o novo bode expiatório da WSI??? Que piada... ");
        System.out.println("Olha essa carinha, tem certeza que você vai me desativar??  hahahaha \n");

        System.out.print("Continuar... ");
        enter = leitor.nextLine();

        System.out.println("\nEntão... Vamos ver o que você é capaz... \n\nBoa sorte, NOOB... \n");

        System.out.print("Continuar... ");
        enter = leitor.nextLine();
    }

    static void primeiraPergunta() {
        System.out.println("\nVamos lá...  \n\nVeremos se é bom mesmo... \n\nPrimeira pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
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
        System.out.print("Tecle 'Enter' para Continuar... ");
        enter = leitor.nextLine();
    }

    static void segundaPergunta() {
        System.out.println("\nSegunda pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n2) Qual é a resposta da equação? \n => 10+30x5-10 ");
        System.out.print("\n a) 200 \n b) -200 \n c) -150 \n d) 150 \n\nDigite a opção: ");
        String alternativaDois = leitor.nextLine();
        while (!alternativaDois.toLowerCase().trim().equals("d")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaDois = leitor.nextLine();
        }
        System.out.println("\nTa entendendo matemática heim?! \n\nPRÓXIMA! \n");
        System.out.print("Continuar... ");
        enter = leitor.nextLine();
    }

    static void terceiraPergunta() {
        System.out.println("\n\nTerceira pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n3) Quais são as raizes da equação\n => x^2-3x-4=0  ");
        System.out.print("\n a) S={-1; 4} \n b) S={1; 7}  \n c) S={3; 4}  \n d) S={2; 8}  \n\nDigite a opção: ");
        String alternativaTres = leitor.nextLine();
        while (!alternativaTres.toLowerCase().trim().equals("a")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaTres = leitor.nextLine();
        }
        System.out.println("\nHum... Vamos continuar... \n");
        System.out.print("Continuar... ");
        enter = leitor.nextLine();
    }

    static void quartaPergunta() {
        System.out.println("\n\nQuarta pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n4) A soma de 3 números inteiros consecutivos é igual à 393. Quais são esses números? HAM?!\n  ");
        System.out.print(" a) 130,131 e 132 \n b) 131,132 e 133  \n c) 129,130 e 131  \n d) 128,129 e 130  \n\nDigite a opção: ");
        String alternativaQuatro = leitor.nextLine();
        while (!alternativaQuatro.toLowerCase().trim().equals("a")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaQuatro = leitor.nextLine();
        }
        System.out.println("\nNossa, QUE SACO... \n\nDUVIDO ACERTAR ESSA! \n");
        System.out.print(" Continuar... ");
        enter = leitor.nextLine();
    }

    static void quintaPergunta() {
        System.out.println("\nQuinta pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n5) O quadrado menos o dobro de um número é igual a menos um. Calcule esse número! PEGA ESSA!!!\n  ");
        System.out.print(" a) 0 \n b) 1  \n c) 2  \n d) 3  \n\nDigite a opção: ");
        String alternativaQuinto = leitor.nextLine();
        while (!alternativaQuinto.toLowerCase().trim().equals("b")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaQuinto = leitor.nextLine();
        }

        System.out.print("Tecle 'Enter' para Continuar... ");
        enter = leitor.nextLine();

    }

    static void sextaPergunta() {
        System.out.println("\nSexta pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n6) Qual é o número que somado com 6 é igual a -13?\n  ");
        System.out.print(" a) 15 \n b) -19  \n c) -6  \n d) 19  \n\nDigite a opção: ");
        String alternativaSexta = leitor.nextLine();
        while (!alternativaSexta.toLowerCase().trim().equals("b")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaSexta = leitor.nextLine();
        }
        System.out.println("\nÚltimo desafio! \n\nQuero ver se é bom mesmo! \n");

        System.out.print("Tecle 'Enter' para Continuar... ");
        enter = leitor.nextLine();
    }

    static void setimaPergunta() {
        System.out.println("Sétima pergunta: \n");
        System.out.println("Life: " + ">>> " + LP + " <<<");
        System.out.println("\n7) O quadrado de um número é igual ao produto desse número por 3, mais 18. Qual é esse número?\n");
        System.out.print(" a) -1 e 7 \n b) 4 e 5  \n c) 7 e -3  \n d) 6 e -3  \n\nDigite a opção: ");
        String alternativaSete = leitor.nextLine();
        while (!alternativaSete.toLowerCase().trim().equals("d")) {
            LP = LP - 1;
            if (LP == 0) {
                System.out.println("Você perdeu o jogo... Adios muchacho!");
                gameOver();
                return;
            }
            System.err.print("Resposta incorreta! HAHAHAHA menos um ponto! TENTE NOVAMENTE...\n\nDigite a opção: ");
            alternativaSete = leitor.nextLine();
        }

        System.out.print("Tecle 'Enter' para Continuar... ");
        enter = leitor.nextLine();
    }

    static String opotunidadeClareon() {
        System.out.println("\n\nHum.... Vejo que você está indo bem...  \nVamos brincar com a sorte???\n\nA regra é simples...\n");
        System.out.println("Se você topar o desafio, terá uma probabilidade de 50% de chance de ganhar uma PERGUNTA BÔNUS");
        System.out.println("Essa pergunta bônus ira acrescentar 3 pontos na sua vida, porém, se você não tiver sorte... Fim de jogo!\n");
        System.out.println("Viu, não sou tão má assim, até chance estou te dando... "
                + ""
                + "Deseja continuar??? [Sim] ou [Não]\n");
        System.out.print("Digite: ");
        String resposta = leitor.nextLine();
        return resposta;
    }

    static void perguntaBonus(String resposta) {
        if (LP > 0) {
            if (resposta.toLowerCase().trim().equals("sim")) {
                int numero = aleatorio.nextInt(2);
                switch (numero) {
                    case 0:
                        System.out.println("");
                        System.out.println("HAHAHAAHHA lamento jovem, a sorte não estava ao seu lado! Bjs\n");

                        System.out.print("Tecle 'Enter' para Continuar... ");
                        enter = leitor.nextLine();

                        System.out.println("\nBricadeirinha...  Vamos continuar... Mas não há mais chances...\n");

                        System.out.print("Continuar... ");
                        enter = leitor.nextLine();

                        break;
                    case 1:
                        System.out.println("\nPERGUNTA BÔNUS!\n");
                        System.out.println("Se o gráfico de uma equação do 2º grau possui a vértice voltada para cima, pode-se afirmar que o coeficiente A da função é positivo?\n");
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

                System.out.print("Tecle 'Enter' para Continuar... ");
                enter = leitor.nextLine();
            }
        }
    }

    static void perguntasJogo(int perguntas) {
        switch (perguntas) {
            case 1:
                primeiraPergunta();
                break;
            case 2:
                segundaPergunta();
                break;
            case 3:
                terceiraPergunta();
                break;
            case 4:
                quartaPergunta();
                break;
            case 6:
                quintaPergunta();
                break;
            case 7:
                sextaPergunta();
                break;
            case 8:
                setimaPergunta();
                break;
            case 5:
                String opcao = opotunidadeClareon();
                perguntaBonus(opcao);
                break;
        }
    }

    static int[] criandoVetor() {
        int[] vetor = new int[7];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        return vetor;
    }

    static void finalFeliz(String nome) {
        System.out.println("\nVocê Ganhou! \n");
        System.out.println("   ____                                          _             _           _     _                         _   _   _ \n"
                + "  / ___|   ___    _ __     __ _   _ __    __ _  | |_   _   _  | |   __ _  | |_  (_)   ___    _ __    ___  | | | | | |\n"
                + " | |      / _ \\  | '_ \\   / _` | | '__|  / _` | | __| | | | | | |  / _` | | __| | |  / _ \\  | '_ \\  / __| | | | | | |\n"
                + " | |___  | (_) | | | | | | (_| | | |    | (_| | | |_  | |_| | | | | (_| | | |_  | | | (_) | | | | | \\__ \\ |_| |_| |_|\n"
                + "  \\____|  \\___/  |_| |_|  \\__, | |_|     \\__,_|  \\__|  \\__,_| |_|  \\__,_|  \\__| |_|  \\___/  |_| |_| |___/ (_) (_) (_)\n"
                + "                          |___/                                                                                      ");

        System.out.println("Parabéns " + nome + ", você conseguiu desativar a Clareon.\n");
        System.out.println("Estamos todos salvos.");
    }

    static void gameOver() {
        System.out.println("   ____      _      __  __   _____      ___   __     __  _____   ____      _   _ \n"
                + "  / ___|    / \\    |  \\/  | | ____|    / _ \\  \\ \\   / / | ____| |  _ \\    | | | |\n"
                + " | |  _    / _ \\   | |\\/| | |  _|     | | | |  \\ \\ / /  |  _|   | |_) |   | | | |\n"
                + " | |_| |  / ___ \\  | |  | | | |___    | |_| |   \\ V /   | |___  |  _ <    |_| |_|\n"
                + "  \\____| /_/   \\_\\ |_|  |_| |_____|    \\___/     \\_/    |_____| |_| \\_\\   (_) (_)\n"
                + "                                                                                 ");

        System.out.println("Por você ter perdido, Clareon acabou se desenvolvendo a ponto de dizimar a raça humana!");
        System.out.println("Adeus :/");
        System.exit(0);
    }

    public static void main(String[] args) {
        entradaJogo();
        LifePoint();
        String nome = cadastroNome();
        String id = cadastroUsuario();
        int senha = cadastroSenha();
        logandoJogo(id, senha);
        int escolha = menuInicial();
        opcaoMenu(escolha, nome);
        interacaoClareo();
        int[] jogando = criandoVetor();
        for (int i = 0; i < jogando.length; i++) {
            perguntasJogo(jogando[i]);
        }
        finalFeliz(nome);
    }

}
