public class GraficoCircular extends GeneradorGrafico {

    public GraficoCircular(String titulo) {
        super(titulo);
    }

    @Override
    protected void renderizarGrafico() {

        double total = calcularTotal();

        if (total == 0) {
            System.out.println("[Circular] Todos los valores son 0, no hay sectores que dibujar.");
            return;
        }

        System.out.println("(  Gráfico circular: cada sector es un porcentaje del total  )");

        for (int i = 0; i < datos.size(); i++) {
            double porcentaje = datos.get(i) / total * 100;
            System.out.printf("Sector %d: %6.2f%% (%.1f de %.1f)%n", i + 1, porcentaje, datos.get(i), total);
        }
    }
}