import java.util.Scanner;

public class Derivadas implements FuncoesInterface {
    private int a, b, c, n;
    private char charVariavel;
    private boolean temVariavel;
    final String comecoDerivada = "A derivada de f(x) = ";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void menu() {
        System.out.println("Escolha a regra de derivação para calcular:");
        System.out.println("0. Fechar programa");
        System.out.println("1. Simples f(x) = ax");
        System.out.println("2. Regra da potência f(x) = ax^n");
        System.out.println("3. Regra de raiz quadrada f(x) = √(ax)");
        System.out.println("4. Logaritmo f(x) = log(a)");
        System.out.println("5. Ln f(x) = ln(a)");
        System.out.println("6. Exponencial f(x) = a^x");
        System.out.println("7. Exponencial com Euler f(x) = e^ax");
        System.out.println("8. Seno f(x) = sin(ax)");
        System.out.println("9. Cosseno f(x) = cos(ax)");
        System.out.println("10. Tangente f(x) = tg(ax)");
        System.out.println("11. Cotangente f(x) = ctg(ax)");
        System.out.println("12. Secante f(x) = sec(ax)");
        System.out.println("13. Cossecante f(x) = csc(ax)");
        System.out.println("14. Polinômio (ax^n + bx + c)");
        System.out.println("15. Seno sin(ax + b)");
        System.out.println("16. Euler e^(ax + b)");
        System.out.print("Sua escolha é: ");
    }

    @Override
    public void derivada_x(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + a + "x");
            System.out.println("f'(x) = " + a);
            System.out.println("f''(x) = 0");
        } else {
            System.out.println(comecoDerivada + a);
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_com_expoente(int a, int n) {
        int aa = a * n;
        int nn = n - 1;
        System.out.println(comecoDerivada + a + "x^" + n);
        if (nn == 1) {
            System.out.println("f'(x) = " + aa + "x");
        } else if (nn == 0) {
            System.out.println("f'(x) = " + aa);
        } else if (nn + 1 == 0){
            System.out.println("f'(x) = 0");
        } else {
            System.out.println("f'(x) = " + aa + "x^" + nn);
        }
        int aaa = aa * nn;
        int nnn = nn - 1;
        if (nnn == 1) {
            System.out.println("f''(x) = " + aaa + "x");
        } else if (nnn == 0) {
            System.out.println("f''(x) = " + aaa);
        } else if (nnn + 2 == 0 || nnn == -1) {
            System.out.println("f''(x) = 0");
        } /*else if (nnn == -1) {
            System.out.println("f''(x) = 0");
        }*/ else {
            System.out.println("f''(x) = " + aaa + "x^" + nnn);
        }
    }

    @Override
    public void derivada_raiz(int a, boolean temVariavel) {
        int numerador = 1;
        if (temVariavel) {
            System.out.println(comecoDerivada + "√" + a + "x");
            System.out.println("f'(x) = " + numerador + " / 2√" + a + "x * " + a);
            boolean ehDivisivel = a % 2 == 0;
            if (ehDivisivel) {
                numerador = a / 2;
                System.out.println("f'(x) = " + numerador + " / √" + a + "x");
            } else {
                numerador *= a;
                System.out.println("f'(x) = " + numerador + " / 2√" + a + "x");
            }
        } else {
            System.out.println(comecoDerivada + "√" + a);
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_log(int a, boolean temVariavel) {
        //int numerador = 1;
        if (temVariavel) {
            System.out.println(comecoDerivada + "log (" + a + "x)");
            //numerador *= a;
            System.out.println("f'(x) =  1 / x ln(10)");
            /*boolean ehDivisivel = a % 10 == 0;
            if (ehDivisivel) {
                numerador = a / a;
                System.out.println("f'(x) = " + numerador + " / " + numerador + "x ln 10");
            } else {
                System.out.println("f'(x) = " + numerador + " / " + numerador + "x ln 10");
            }*/
        } else {
            System.out.println(comecoDerivada + "log(" + a + ")");
            System.out.println("f'(x) = 0");

        }
    }

    @Override
    public void derivada_ln(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "ln (" + a + "x)");
            System.out.println("f'(x) = 1 / x");
        } else {
            System.out.println(comecoDerivada + "ln(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_exponencial(int a) {
        System.out.println(comecoDerivada + a + "^x");
        System.out.println("f'(x) = " + a + "^x * ln(" + a + ")");
    }

    @Override
    public void derivada_exponencial_Euler(int n, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "e^" + n + "x");
            System.out.println("f'(x) = " + n + "e^" + n + "x");
        } else {
            System.out.println(comecoDerivada + "e^" + n);
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_sin(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "sen(" + a + "x)");
            int variavelAbs = (a < 0) ? Math.abs(a) : a;
            System.out.println("f'(x) = " + a + "cos(" + variavelAbs + "x)");
        } else {
            System.out.println(comecoDerivada + "sen(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_cos(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "cos(" + a + "x)");
            if (a < 0) {
                System.out.println("f'(x) = " + a + "sen(" + Math.abs(a) + "x)");
            } else {
                System.out.println("f'(x) = -" + a + "sen(" + a + "x)");
            }
        } else {
            System.out.println(comecoDerivada + "cos(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_tg(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "tg(" + a + "x)");
            int variavelAbs = (a < 0) ? Math.abs(a) : a;
            System.out.println("f'(x) = " + a + "sec^2 (" + variavelAbs + "x)");
        } else {
            System.out.println(comecoDerivada + "tg(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_ctg(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "ctg(" + a + "x)");
            System.out.println("f'(x) = " + (a * -1) + "csc^2 (" + Math.abs(a) + "x)");
        } else {
            System.out.println(comecoDerivada + "ctg(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_sec(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "sec(" + a + "x)");
            System.out.println("f'(x) = " + Math.abs(a) + "(tg(" + Math.abs(a) + "x) * sec(" + Math.abs(a) + "x))");
        } else {
            System.out.println(comecoDerivada + "sec(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_csc(int a, boolean temVariavel) {
        if (temVariavel) {
            System.out.println(comecoDerivada + "csc(" + a + "x)");
            System.out.println("f'(x) = " + (a * -1) + "ctg(" + Math.abs(a) + "x) * csc(" + Math.abs(a) + "x)");
        } else {
            System.out.println(comecoDerivada + "csc(" + a + ")");
            System.out.println("f'(x) = 0");
        }
    }

    @Override
    public void derivada_polinomio(int a, int n, int b, int c) {
        int da = a * n;
        int dn = n - 1;

        System.out.println(comecoDerivada + a + "x^" + n + " + " + b + "x + " + c);
        System.out.println("f'(x) = " + da + "x^" + dn + " + " + b);
    }

    @Override
    public void derivada_seno(int a, int b) {
        System.out.println(comecoDerivada + "sin(" + a + "x + " + b + ")");
        System.out.println("f'(x) = " + a + "cos(" + a + "x + " + b + ")");
        int aa = a * a;
        System.out.println("f''(x) = -" + aa + "sen(" + Math.abs(a) + "x + " + b + ")");
    }

    @Override
    public void derivada_exp(int a, int b) {
        System.out.println(comecoDerivada + "e^(" + a + "x + " + b + ")");
        System.out.println("f'(x) = " + a + "e^(" + a + "x + " + b + ")");
    }

    @Override
    public int digiteValorA() {
        int a;
        System.out.print("Digite o valor de a: ");
        a = scanner.nextInt();
        System.out.println();
        return a;
    }

    @Override
    public void verificarVariavel() {
        do {
            System.out.print("Essa função vai ter variável? [S/N]: ");
            charVariavel = scanner.next().toUpperCase().charAt(0);
            setCharVariavel(charVariavel);
            if (getCharVariavel() != 'S' && getCharVariavel() != 'N') {
                System.out.println("Resposta inválida!");
            }
        } while (getCharVariavel() != 'S' && getCharVariavel() != 'N');
        setTemVariavel(getCharVariavel() == 'S');
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public char getCharVariavel() {
        return charVariavel;
    }

    public void setCharVariavel(char charVariavel) {
        this.charVariavel = charVariavel;
    }

    public boolean isTemVariavel() {
        return temVariavel;
    }

    public void setTemVariavel(boolean temVariavel) {
        this.temVariavel = temVariavel;
    }
}
