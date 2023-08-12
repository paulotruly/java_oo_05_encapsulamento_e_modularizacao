public class Aluno {

    public static void main(String[] args) {

            Aluno a = new Aluno(100, "Paulo", "Ciência da computação", 6);
                 a.imprimirAluno();
           }

    private int matricula;
    private String nome;
    private String curso;
    private int periodo;

public Aluno(int aluno_matr, String aluno_nom, String aluno_curs, int aluno_per) {
        matricula = aluno_matr;
        nome = aluno_nom;
        curso = aluno_curs;
        periodo = aluno_per;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


     public void imprimirAluno() {
       System.out.println("====== INFORMAÇÕES DO ALUNO ======");
       System.out.println("Matrícula: "+ matricula);
       System.out.println("Nome: "+ nome);
       System.out.println("Curso: "+ curso);
       System.out.println("Período: "+ periodo);
       System.out.println("==================================");
    }   

}
