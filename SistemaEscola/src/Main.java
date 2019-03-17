import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turma portugues = new Turma();
        portugues.setCod(12);
        portugues.setProfessor(new Professor("Maria", "7", 1, 5000d));
        portugues.setSala(24);
        portugues.setHorario('A');

        ArrayList<Aluno> alunos = new ArrayList<>();
        float[] notasEx1 = {1f, 2f, 3f, 4f};
        float[] notasEx2 = {2f, 3f, 4f, 5f};
        float[] notasEx3 = {6f, 8f, 34f, 25f};
        alunos.add(new Aluno("Isaque", "04 de maio de 2000", "Viviane", notasEx1, 3));
        alunos.add(new Aluno("Carla", "14 de maio de 1921", "Julia", notasEx2, 6));
        alunos.add(new Aluno("Maria", "24 de maio de 2031", "Yanel", notasEx3, 9));
        portugues.setAlunos(alunos);

        portugues.info();


        Turma ingles = new Turma();
        portugues.setCod(54);
        portugues.setProfessor(new Professor("Marcia", "127", 3, 5000d));
        portugues.setSala(123);
        portugues.setHorario('C');

        alunos = new ArrayList<>();
        notasEx1 = new float[] {11f, 22f, 31f, 43f};
        notasEx2 = new float[]{21f, 33f, 44f, 51f};
        notasEx3 = new float[]{641f, 81f, 34f, 25f};
        alunos.add(new Aluno("Joao", "31 de maio de 1999", "Kenia", notasEx1, 3));
        alunos.add(new Aluno("Joab", "14 de maio de 1921", "Marcia", notasEx2, 6));
        alunos.add(new Aluno("Murilo", "24 de maio de 2031", "Gabriela", notasEx3, 9));
        portugues.setAlunos(alunos);

        portugues.info();


    }
}
