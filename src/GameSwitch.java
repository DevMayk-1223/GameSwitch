
import java.util.Scanner;

  public class GameSwitch {

      public static void mostrarMenu() {
          System.out.println("Bem - Vindo ao nosso programa, para onde iremos?");
          System.out.println("1 - Abrir jogos");
          System.out.println("2 - Configurações");
          System.out.println("3 - Ajuda");
          System.out.println("4- Sair");
      }

      public static int lerEscolhaDoUsuario(Scanner pedido) {
          int opcao;

          while (true) {
              System.out.println("Escolha uma opcão ");
              opcao = pedido.nextInt();

              if (opcao >= 1 && opcao <= 4) {
                  return opcao;
              }
              System.out.println("Invalido, tente novamente");
          }

      }


      public static void abrirHelp() {
          System.out.println("Entrando na aba de ajuda...");
      }

      public static void menuGames() {

          System.out.println("Entrando no menu de jogos...");
          System.out.println("----- Jogos -----");
          System.out.println("1 - Contador de numeros");
          System.out.println("2 - Soma de numeros");
          System.out.println("3 -Impar ou par ");
          System.out.println("4 - Retornar ao menu");

      }

      public static void abrirGames(Scanner pedido) {

          int game;

          menuGames();

          game = pedido.nextInt();

          if (game == 1) {

              int choose;
              int cont = 0;

              System.out.println("----Bem - Vindo ao jogo, vamos iniciar :) ----");
              System.out.println("Nós vasmos contar de 1 até o numero que você escolher");
              System.out.println("Escolha um numero:");

              choose = pedido.nextInt();

              while (cont < choose) {
                  cont++;
                  System.out.println(cont);
              }

              System.out.println("Terminamos a nossa conta, parabéns ;)");
          } else if (game == 2) {

              int choose;
              int cont = 0;
              int sum = 0;

              System.out.println("Escolha um numero ");

              choose = pedido.nextInt();

              while (cont < choose) {
                  cont++;
                  sum = sum + cont;
                  System.out.println(cont);
              }

              int resultado = sum;

              System.out.println("Terminamos!! resultado: " + resultado);

          } else if (game == 3) {
              jogoParOuImpar(pedido);

          } else if (game == 4) {
              System.out.println("Voltando...");
              return;
          }
      }

      public static void jogoParOuImpar(Scanner pedido) {

          int escolha;

          System.out.println("Escolha seu numero: ");
          escolha = pedido.nextInt();

          if (escolha % 2 == 0) {
              System.out.println("O numero " + escolha + " é par");


          } else {
              System.out.println("O numero " + escolha + " é Impar");
          }

      }

      public static void mostrarBoasVindas() {

          System.out.println("////////////Bem - Vindo :)\\\\\\\\\\\\\\");

      }

      public static void exitGame() {
          System.out.println("Saindo...");
          System.exit(0);
      }

      public static void executarMenuAdmin(int opcao, Scanner pedido) {

          switch (opcao) {

              case 1:
                  System.out.println("Mostrando Usuário...");
                  break;

              case 2:
                  System.out.println("Criando Usuário...");
                  break;

              case 3:
                  System.out.println("Saindo do menu Admin...");
                  break;

              default:
                  System.out.println("Esta opcão não existe :(");
          }
      }

      public static void executarOpcao(int opcao, Scanner pedido) {

          switch (opcao) {

              case 1:
                  abrirGames(pedido);
                  break;

              case 2:
                  abrirSettings(pedido);
                  break;

              case 3:
                  abrirHelp();
                  break;

              case 4:
                  exitGame();
                  break;

              case 5:
                  mostrarMenuAdmin(pedido);
                  break;

              default:
                  System.out.println("Esta opcão não existe :(");
          }
      }

      public static void abrirSettings(Scanner pedido){

          while(true) {
              System.out.println("1- Abrir menu do admin");
              System.out.println("2- Voltar ao menu");

              int escolha = lerEscolhaDoUsuario(pedido);

              switch (escolha) {

                  case 1:
                      mostrarMenuAdmin(pedido);
                      break;

                  case 2:
                      System.out.println("Votando...");
                      return;

                  default:
                      System.out.println("Opção não existente :)");
              }
          }
      }

      public static void mostrarMenuAdmin(Scanner pedido) {
          System.out.println("-----MENU ADMIN-----");
          System.out.println("1- Ver Usuário");
          System.out.println("2- Criar usuário");
          System.out.println("3- Sair do menu admin");
      }
      public static void abrirMenuAdmin(Scanner pedido){

          while (true){
              mostrarMenuAdmin(pedido);

              int escolha = lerEscolhaDoUsuario(pedido);
              executarMenuAdmin(escolha, pedido);

              if (escolha == 3){
                  break;
              }
          }
      }
      public static void main (String[] args) {
          Scanner pedido = new Scanner(System.in);

          mostrarBoasVindas();

          while(true){
              mostrarMenu();

              int select = lerEscolhaDoUsuario(pedido);
              executarOpcao(select, pedido);

          }
      }
  }