// Boletim

public class Cadeiras {

    public static void main(String[] args) {
        Cadeiras um = new Cadeiras("Desenvolvimento Web", 10, 6);
        um.imprimirBoletim();

        Cadeiras dois = new Cadeiras("Programação", 8, 6);
        dois.imprimirBoletim();

        Cadeiras tres = new Cadeiras("Sistema Operacionais", 4, 6);
        tres.imprimirBoletim();

    }

    private String nome_cadeira;
    private double av1;
    private double av2;

    public Cadeiras(String nm_cd, double x, double y) {
        nome_cadeira = nm_cd;
        av1 = x;
        av2 = y;
    }

    public String getNome() {
        return nome_cadeira;
    }

    public void setNome(String nome_cadeira) {
        this.nome_cadeira = nome_cadeira;
    }

     public double getAV1() {
        return av1;
    }

    public void setAV1(double av1) {
        this.av1 = av1;
    }

    public double getAV2() {
        return av2;
    }

    public void setAV2(double av2) {
        this.av2 = av2;
    }

    public static double media(double[] v) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        media = soma / v.length;
        return media;
}

public void imprimirBoletim() {
       double media = (av1+ av2)/2;
       System.out.println("====== " + nome_cadeira + " ======");
       System.out.println("Avaliação 1: " +av1);
       System.out.println("Avaliação 2: " +av2);
       System.out.println("Média: "+media);
        if (media < 7) {
            System.out.println("Nota média não atingida! Você está reprovado em "+nome_cadeira+"!");
        } else {
            System.out.println("Você está aprovado em "+nome_cadeira+"!");
        }
       System.out.println("=============================");
    }   

}
    
