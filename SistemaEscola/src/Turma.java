import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private int cod;
    private int sala;
    private char horario;

    public void listarAlunos(){
        System.out.println("Listagem da Turma " + cod + " da sala " + sala + " no horario " + horario);
        for (int i = 0; i < getAlunos().size(); i++){
            System.out.println("Nome: " + getAlunos().get(i).getNome());
            System.out.println("Matricula: " + getAlunos().get(i).getMatricula());
            System.out.println("Nascimento: " + getAlunos().get(i).getNascimento());
            System.out.println("Boletin: " + getAlunos().get(i).getBoletin());
            System.out.println("Nome da Mae: " + getAlunos().get(i).getNome_mae());

            System.out.println("");
        }
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public char getHorario() {
        return horario;
    }

    public void setHorario(char horario) {
        this.horario = horario;
    }
}
