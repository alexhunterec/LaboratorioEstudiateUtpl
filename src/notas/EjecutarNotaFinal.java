package notas;

/**
 *
 * @author Alex Caza
 */
public class EjecutarNotaFinal {

    public static void main(String[] args) {
        double[] notasAcd = {8, 7};
        double[] notasAa = {7,  7};
        double[] notasApe = {7, 5, 7};
        EstudianteUtpl estudiante1 = new EstudianteUtpl();
        estudiante1.insertarNotas(notasAcd, notasAa, notasApe);
        estudiante1.presentarNota();
    }

}
