import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private int cod;
    private int sala;
    private char horario;

    public void listarAlunos(){
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("Nome: " + alunos.get(i).getNome());
            System.out.println("Matricula: " + alunos.get(i).getMatricula());
            System.out.println("Nascimento: " + alunos.get(i).getNascimento());
            System.out.println("Boletin: " + alunos.get(i).getBoletin());

        }
    }



}
