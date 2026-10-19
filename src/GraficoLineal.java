public class GraficoLineal extends GeneradorGrafico {

    public GraficoLineal(String titulo) {
        super(titulo);
    }

    @Override
    protected void renderizarGrafico() {

        double max = calcularMaximo();
        int alto = 5;

        // Se dibuja de arriba hacia abajo: cada fila es un nivel
        for (int nivel = alto; nivel >= 1; nivel--) {
            StringBuilder fila = new StringBuilder();

            for (double d : datos) {
                int altura = (max == 0) ? 0 : (int) Math.round(d / max * alto);
                fila.append(altura >= nivel ? " *  " : "    ");
            }

            System.out.println("|" + fila);
        }

        System.out.println("+" + "----".repeat(datos.size()));

        StringBuilder ejeX = new StringBuilder(" ");
        for (int i = 1; i <= datos.size(); i++) {
            ejeX.append(String.format("%-4d", i));
        }
        System.out.println(ejeX);
    }
}