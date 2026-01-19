import java.util.Scanner;

  public class GameSwitch {

      public static int lerOpcao(Scanner pedido) {
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
          System.out.println("Entering our settings...");

      }

      public static void abrirHelp() {
          System.out.println("Entering our help space...");
      }

      public static void abrirGames(Scanner pedido) {

          int game;

          System.out.println("Entering our games space...");
          System.out.println("----- GAMES -----");
          System.out.println("1 - Cont Numbers");
          System.out.println("2 - Sum numbers");
          System.out.println("3 - Rerturn to menu");

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
              System.out.println("Returning...");
              return;
          }
      }


      public static void mostrarBoasVindas(){

          System.out.println("////////////WELCOME :)\\\\\\\\\\\\\\");

      }

      public static void exitGame(){
          System.out.println("Exiting...");
      }

      public static void main(String[] args) {

          mostrarBoasVindas();

            Scanner pedido = new Scanner(System.in);
            int select;

            while (true) {

                System.out.println("Welcome to our program, where do you want to go?");
                System.out.println("1 - Open Game");
                System.out.println("2 - Open Settings");
                System.out.println("3 - Help");
                System.out.println("4 - Exit");

                select = lerOpcao(pedido);

                switch (select) {

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
                        return;

                    default:
                        System.out.println("Invalid Option");
                }
            }
        }
    }