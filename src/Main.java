import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Derivadas derivadas = new Derivadas();
        int escolha;
        char continuar;
        do {
            derivadas.menu();
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 0:
                    System.out.println("Fechando programa...");
                    System.exit(0);
                    break;
                case 1:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_x(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 2:
                    System.out.print("Digite o valor de a (para o termo ax): ");
                    derivadas.setA(scanner.nextInt());
                    System.out.print("Digite o expoente n (para o termo ax^n): ");
                    derivadas.setN(scanner.nextInt());
                    System.out.println();
                    derivadas.derivada_com_expoente(derivadas.getA(), derivadas.getN());
                    break;
                case 3:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_raiz(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 4:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_log(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 5:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_ln(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 6:
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_exponencial(derivadas.getA());
                    break;
                case 7:
                    derivadas.verificarVariavel();
                    derivadas.setN(derivadas.digiteValorA());
                    derivadas.derivada_exponencial_Euler(derivadas.getN(), derivadas.isTemVariavel());
                    break;
                case 8:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_sin(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 9:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_cos(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 10:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_tg(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 11:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_ctg(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 12:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_sec(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 13:
                    derivadas.verificarVariavel();
                    derivadas.setA(derivadas.digiteValorA());
                    derivadas.derivada_csc(derivadas.getA(), derivadas.isTemVariavel());
                    break;
                case 14:
                    System.out.print("Digite a variável a (para o termo ax^n): ");
                    derivadas.setA(scanner.nextInt());
                    System.out.print("Digite a variável n (para o termo ax^n): ");
                    derivadas.setN(scanner.nextInt());
                    System.out.print("Digite a variável b (para o termo bx): ");
                    derivadas.setB(scanner.nextInt());
                    System.out.print("Digite a variável c (termo constante): ");
                    derivadas.setC(scanner.nextInt());
                    System.out.println();
                    derivadas.derivada_polinomio(derivadas.getA(), derivadas.getN(), derivadas.getB(), derivadas.getC());
                    break;
                case 15:
                    System.out.print("Digite a variável a (para o termo ax): ");
                    derivadas.setA(scanner.nextInt());
                    System.out.print("Digite a variável b (termo constante): ");
                    derivadas.setB(scanner.nextInt());
                    System.out.println();
                    derivadas.derivada_seno(derivadas.getA(), derivadas.getB());
                    break;
                case 16:
                    System.out.print("Digite a variável a (para o termo ax): ");
                    derivadas.setA(scanner.nextInt());
                    System.out.print("Digite a variável b (termo constante): ");
                    derivadas.setB(scanner.nextInt());
                    System.out.println();
                    derivadas.derivada_exp(derivadas.getA(), derivadas.getB());
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
            do {
                System.out.print("Continuar? [S/N]: ");
                continuar = scanner.next().toUpperCase().charAt(0);
                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Escolha uma opção válida!");
                }
            } while (continuar != 'S' && continuar != 'N');
            if (continuar == 'S') {
                clear();
            } else {
                System.out.println("Até mais tarde!");
            }
        } while (continuar == 'S');
    }

    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}