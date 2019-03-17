import java.util.Arrays;

public class Boletin {
    private float[] notas = new float[4];

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float[] getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getNotas());
    }
}
