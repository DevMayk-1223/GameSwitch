import java.util.Scanner;

  public class GameSwitch {

      public static void mostrarMenu(){
          System.out.println("Welcome to our program, where do you want to go?");
          System.out.println("1 - Open Game");
          System.out.println("2 - Open Settings");
          System.out.println("3 - Help");
          System.out.println("4 - Exit");
      }

      public static int lerEscolhaDoUsuario(Scanner pedido) {
          int opcao;

          while (true) {
              System.out.println("Choose an optioon: ");
              opcao = pedido.nextInt();

              if (opcao >= 1 && opcao <= 4) {
                  return opcao;
              }
              System.out.println("Invalid, try again!");
          }

      }

      public static void abrirSettings() {
          System.out.println("Entering our settings, wait...");

      }

      public static void abrirHelp() {
          System.out.println("Entering our help space...");
      }

      public static void menuGames(){

          System.out.println("Entering our games space...");
          System.out.println("----- GAMES -----");
          System.out.println("1 - Cont Numbers");
          System.out.println("2 - Sum numbers");
          System.out.println("3 - Odd or even");
          System.out.println("4 - Rerturn to menu");

      }

      public static void abrirGames(Scanner pedido) {

          int game;

          menuGames();

          game = pedido.nextInt();

          if (game == 1) {

              int choose;
              int cont = 0;

              System.out.println("---- Welcome to the game, let's start :) ----");
              System.out.println("We will count from 1 to the number you choose");
              System.out.println("Choose the number:");

              choose = pedido.nextInt();

              while (cont < choose) {
                  cont++;
                  System.out.println(cont);
              }

              System.out.println("We finished our count, congratulations ;)");
          }
          else if (game == 2){

              int choose;
              int cont = 0;
              int sum = 0;

              System.out.println("Chose an number: ");

              choose = pedido.nextInt();

              while(cont < choose){
                  cont++;
                  sum = sum + cont;
                  System.out.println(cont);
              }

              int resultado = sum;

              System.out.println("Finishe ! The result: " + resultado );

          } else if (game == 3){
              jogoParOuImpar(pedido);

          } else if (game == 4) {
              System.out.println("Returning...");
              return;
          }
      }

      public static void jogoParOuImpar(Scanner pedido){

          int escolha;

          System.out.println("Escolha seu numero: ");
          escolha = pedido.nextInt();

          if (escolha % 2 == 0) {
              System.out.println("O numero " + escolha + " é par");


          } else {
              System.out.println("O numero " + escolha + " é Impar");
          }

      }

      public static void mostrarBoasVindas(){

          System.out.println("////////////WELCOME :)\\\\\\\\\\\\\\");

      }

      public static void exitGame(){
          System.out.println("Exiting...");
          System.exit(0);
      }

      public static void executarOpcao(int opcao, Scanner pedido){

          switch (opcao){

              case 1:
                  abrirGames(pedido);
                  break;

              case 2:

                  abrirSettings();
                  break;

              case 3:
                  abrirHelp();
                  break;

              case 4:
                  exitGame();
                  break;

              default:
                  System.out.println("This option don't exist");
          }
      }


      public static void main(String[] args) {
          Scanner pedido = new Scanner(System.in);

          mostrarBoasVindas();

          while(true){
              mostrarMenu();

              int select = lerEscolhaDoUsuario(pedido);
              executarOpcao(select, pedido);

          }
      }
  }