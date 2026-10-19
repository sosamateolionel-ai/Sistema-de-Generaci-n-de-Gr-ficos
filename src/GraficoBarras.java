public class GraficoBarras extends GeneradorGrafico {

    private static final int ANCHO_MAXIMO = 30;

    public GraficoBarras(String titulo) {
        super(titulo);
    }

    @Override
    protected void renderizarGrafico() {

        double max = calcularMaximo();

        for (int i = 0; i < datos.size(); i++) {
            int largo = (max == 0) ? 0 : (int) Math.round(datos.get(i) / max * ANCHO_MAXIMO);
            System.out.printf("Dato %d | %s %.1f%n", i + 1, "#".repeat(largo), datos.get(i));
        }
    }
}