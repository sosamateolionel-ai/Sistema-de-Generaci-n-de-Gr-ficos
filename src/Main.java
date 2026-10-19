import java.util.ArrayList;
import java.util.List;

void main() {

    double[] ventas = {120, 80, 150, 60, 100};

    List<GeneradorGrafico> graficos = new ArrayList<>();
    graficos.add(new GraficoBarras("Ventas por trimestre (barras)"));
    graficos.add(new GraficoCircular("Ventas por trimestre (circular)"));
    graficos.add(new GraficoLineal("Ventas por trimestre (lineal)"));

    for (GeneradorGrafico g : graficos) {
        for (double v : ventas) {
            g.agregarDato(v);
        }
    }

    for (GeneradorGrafico g : graficos) {
        g.renderizar();
    }

    System.out.println("\n===== Casos inválidos =====");

    GeneradorGrafico vacio = new GraficoBarras("Gráfico sin datos");
    vacio.renderizar();

    GeneradorGrafico negativo = new GraficoCircular("Gráfico con negativos");
    negativo.agregarDato(50);
    negativo.agregarDato(-10);
    negativo.renderizar();

}
