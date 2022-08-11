public class pergunta4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        double umporcento = total/100;
        double percentualsp = sp/umporcento;
        double percentualrj = rj/umporcento;
        double percentualmg = mg/umporcento;
        double percentuales = es/umporcento;
        double percentualoutros = outros/umporcento;

        System.out.printf(" O percentual de SP foi: %.2f%% %n ", (percentualsp));
        System.out.printf("O percentual do RJ foi: %.2f%% %n ", (percentualrj));
        System.out.printf("O percentual de MG foi: %.2f%% %n ", (percentualmg));
        System.out.printf("O percentual do ES foi: %.2f%% %n ", (percentuales));
        System.out.printf("O percentual dos Outros Estados foi: %.2f%% %n ", (percentualoutros));




    }
}
