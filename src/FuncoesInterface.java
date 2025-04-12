public interface FuncoesInterface {
    void menu();
    void derivada_x(int a, boolean temVariavel);
    void derivada_com_expoente(int a, int n);
    void derivada_raiz(int a, boolean temVariavel);
    void derivada_log(int a, boolean temVariavel);
    void derivada_ln(int a, boolean temVariavel);
    void derivada_exponencial(int a);
    void derivada_exponencial_Euler(int n, boolean temVariavel);
    void derivada_sin(int a, boolean temVariavel);
    void derivada_cos(int a, boolean temVariavel);
    void derivada_tg(int a, boolean temVariavel);
    void derivada_ctg(int a, boolean temVariavel);
    void derivada_sec(int a, boolean temVariavel);
    void derivada_csc(int a, boolean temVariavel);
    void derivada_polinomio(int a, int n, int b, int c);
    void derivada_seno(int a, int b);
    void derivada_exp(int a, int b);
    void verificarVariavel();
    int digiteValorA();
}