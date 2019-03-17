import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turma portugues = new Turma();
        portugues.setCod(12);
        portugues.setProfessor(new Professor("Maria", "7", 1, 5000d));
        portugues.setSala(24);
        portugues.setHorario('A');

        ArrayList<Aluno> alunos = new ArrayList<>();
        float[] notasEx1 = {1f,2f,3f,4f};
        float[] notasEx2 = {2f,3f,4f,5f};
        float[] notasEx3 = {6f,8f,34f,25f};
        alunos.add(new Aluno("Isaque", "04 de maio de 2000", "Viviane", notasEx1, 3));
        alunos.add(new Aluno("Carla", "14 de maio de 1921", "Julia", notasEx2, 6));
        alunos.add(new Aluno("Maria", "24 de maio de 2031", "Yanel", notasEx3, 9));

        portugues.setAlunos(alunos);

        portugues.listarAlunos();

    }
}
