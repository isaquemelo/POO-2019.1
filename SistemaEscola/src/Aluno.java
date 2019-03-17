public class Aluno {
    private long matricula;
    private String nome;
    private String nascimento;
    private String nome_mae;
    private Boletin boletin = new Boletin();

    Aluno(String nome, String nascimento, String nome_mae, float[] boletin, long matricula){
        this.setNome(nome);
        this.setNascimento(nascimento);
        this.setNome_mae(nome_mae);
        this.getBoletin().setNotas(boletin);
        this.setMatricula(matricula);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public Boletin getBoletin() {
        return boletin;
    }

    public void setBoletin(Boletin boletin) {
        this.boletin = boletin;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
