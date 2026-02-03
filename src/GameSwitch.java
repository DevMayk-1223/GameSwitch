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

      public static int lerEscolhaDoGame(Scanner pedido) {
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

      public static void decisaoDoUser(Scanner pedido) {

          while (true) {
              menuGames();

              int escolhaUser = lerEscolhaDoGame(pedido);
             EstadoJogo estado = menuAbrirGames(escolhaUser, pedido);

             switch (estado) {
                 case CONTINUAR:
                     break;

                 case VOLTAR_MENU:
                     return;

                 case SAIR:
                     exitGame();
                     break;
             }
          }
      }
        enum EstadoJogo{
            CONTINUAR,
            VOLTAR_MENU,
            SAIR
        }

        public static EstadoJogo ficarContinuarOuSair(Scanner pedido){
            System.out.println("Qual você deseja fazer agora?");
            System.out.println("1- Continuar");
            System.out.println("2- Voltar ao Menu");
            System.out.println("3- Sair");

            int resposta = pedido.nextInt();

            switch (resposta){
                case 1:
                    return EstadoJogo.CONTINUAR;
                case 2:
                    return EstadoJogo.VOLTAR_MENU;
                case 3:
                    return EstadoJogo.SAIR;
                default:
                    return EstadoJogo.VOLTAR_MENU;
            }
        }

      public static EstadoJogo contadorDeNumeros(Scanner pedido) {

          System.out.println("----Bem - Vindo ao jogo, vamos iniciar :) ----");
          System.out.println("Nós vamos contar de 1 até o numero que você escolher");
          System.out.println("Escolha um numero:");

          int escolhaDoUser;

          escolhaDoUser = pedido.nextInt();

          for (int i = 1; i < escolhaDoUser; i++) {
              System.out.println(i);
          }
            return  ficarContinuarOuSair(pedido);
      }

      public static EstadoJogo menuAbrirGames(int escolhaUser, Scanner pedido) {

          switch (escolhaUser) {

              case 1:
                return contadorDeNumeros(pedido);
              case 2:
                 return somaDosNumeros(pedido);
              case 3:
                  return jogoParOuImpar(pedido);
              case 4:
                  return EstadoJogo.VOLTAR_MENU;
              default:
                  return EstadoJogo.VOLTAR_MENU;

          }
      }

      public static EstadoJogo somaDosNumeros(Scanner pedido) {

          System.out.println("Vamos somar numeros!!!");

          int escolhaDoUser;
          int soma = 0;

          System.out.println("Escolha um numero ");

          escolhaDoUser = pedido.nextInt();

          for (int i = 0; i < escolhaDoUser; i++) {
              soma +=  i;
              System.out.println(i);
          }
          int resultado = soma;

          System.out.println("Resultado = " + resultado);
         return ficarContinuarOuSair(pedido);
      }

      public static EstadoJogo jogoParOuImpar(Scanner pedido) {

          int escolha;

          System.out.println("Escolha seu numero: ");
          escolha = pedido.nextInt();

          if (escolha % 2 == 0) {
              System.out.println("O numero " + escolha + " é par");


          } else {
              System.out.println("O numero " + escolha + " é Impar");
          }

          return ficarContinuarOuSair(pedido);
      }

      public static void mostrarBoasVindas() {

          System.out.println("////////////Bem - Vindo :)\\\\\\\\\\\\\\");

      }

      public static void exitGame() {
          System.out.println("Saindo...");
          System.exit(0);
      }

      public static void executarOpcao(int select, Scanner pedido) {

          switch (select) {

              case 1:
                  decisaoDoUser(pedido);
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

              default:
                  System.out.println("Esta opcão não existe :(");
          }
      }

      public static void mostrarMenuSettings(){
          System.out.println("1- Abrir menu do admin");
          System.out.println("2- Voltar ao menu");
      }


      public static void abrirSettings(Scanner pedido){

          while(true) {
              mostrarMenuSettings();

              int escolha = lerEscolhaDoUsuario(pedido);

              switch (escolha) {
                  case 1:
                      abrirMenuAdmin(pedido);
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
                  System.out.println("Saindo do menu admin");
                  return;
              }
          }
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