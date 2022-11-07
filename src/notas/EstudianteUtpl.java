package notas;

import java.text.DecimalFormat;

/**
 *
 * @author Alex Caza
 */
public class EstudianteUtpl {

    private double notaFinal;
    private double promAcd, promAa, promApe;

    public double promedioNotaGlobal(double[] notasInsertar) {
        double sumaGlobal = 0;
        double total;
        for (int i = 0; i < notasInsertar.length; i++) {
            sumaGlobal = sumaGlobal + notasInsertar[i];
        }
        return total = (sumaGlobal / notasInsertar.length);
    }

    /*    Porcentajes de Notas
      ACD = 35%
      AA = 35%
      APE = 30%        
     */
    public void insertarNotas(double[] notasAcd, double[] notasAa, double[] notasApe) {
        this.promAcd = promedioNotaGlobal(notasAcd) * 0.35;
        this.promAa = promedioNotaGlobal(notasAa) * 0.35;
        this.promApe = promedioNotaGlobal(notasApe) * 0.30;
        this.notaFinal = promAcd + promAa + promApe;
    }

    public String presentarNota() {
        DecimalFormat decimal = new DecimalFormat("#.00");
        double notaAcumulado = notaFinal * 0.6;
        double notaAprobar = notaAcumulado + 3.5; // menor a 7 no tiene opción a recuperación
        double notaMinAprobar = (7 - notaAcumulado) * 95 / 35;  //nota minima sobre 10

        if (this.notaFinal >= 7) {
            System.out.println("Estudiante Aprobado\nNota final: " + decimal.format(notaFinal)
                    + "\n**** Detalle notas ***"
                    + "\nACD: " + decimal.format(promAcd) + "\nAA: "
                    + decimal.format(promAa) + "\nAPE: "
                    + decimal.format(promApe));

        } else if (notaAprobar >= 7) {

            System.out.println("Estudiante Reprobado\nNota final: " + decimal.format(notaFinal) + "\n**** Detalle notas ****"
                    + "\nACD: " + decimal.format(promAcd) + "\nAA: "
                    + decimal.format(promAa) + "\nAPE: " + decimal.format(promApe)
                    + "\n**** Nota ***" + "\n Estimado estudiante en base a su nota final de: " + decimal.format(notaFinal)
                    + ". En su examen de recuperacion debe tener una nota minima de " + decimal.format(notaMinAprobar));

        } else if (notaAprobar < 7) {

            System.out.println("Estudiante Reprobado sin opcion a recuperacion\nNota final: "
                    + decimal.format(notaFinal) + "\n**** Detalle notas ****"
                    + "\nACD: " + decimal.format(promAcd) + "\nAA: "
                    + decimal.format(promAa) + "\nAPE: " + decimal.format(promApe));

        }
        return null;

    }
}
