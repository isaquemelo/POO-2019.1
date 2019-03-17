public class Boletin {
    private float[][] notas = new float[4][4];

    public void setNotas(float[] notas){
        this.notas[0] = notas;
    }

    public float[][] getNotas() {
        return notas;
    }
}
