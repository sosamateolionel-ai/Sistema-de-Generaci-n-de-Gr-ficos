import java.util.ArrayList;
import java.util.List;

public abstract class GeneradorGrafico {

    protected String titulo;
    protected List<Double> datos;

    public GeneradorGrafico(String titulo) {
        this.titulo = titulo;
        this.datos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregarDato(double valor) {
        datos.add(valor);
    }

    // Lógica común: suma de todos los valores
    protected double calcularTotal() {
        double total = 0;
        for (double d : datos) {
            total += d;
        }
        return total;
    }

    protected double calcularMaximo() {
        double max = datos.get(0);
        for (double d : datos) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    // Punto de entrada: valida siempre y luego delega
    public boolean renderizar() {

        System.out.println("\n=== " + titulo + " ===");

        if (datos.isEmpty()) {
            System.out.println("[Gráfico] Error: no hay datos para renderizar.");
            return false;
        }

        for (double d : datos) {
            if (d < 0) {
                System.out.println("[Gráfico] Error: hay valores negativos, no se puede graficar.");
                return false;
            }
        }

        renderizarGrafico();
        return true;
    }

    // Cada estilo define cómo dibuja los datos
    protected abstract void renderizarGrafico();
}