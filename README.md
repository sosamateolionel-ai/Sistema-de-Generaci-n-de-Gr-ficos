# Sistema de Generación de Gráficos

## Descripción

Este proyecto implementa un sistema de generación de gráficos en consola utilizando Java y programación orientada a objetos. Permite representar un conjunto de datos mediante tres estilos diferentes: gráfico de barras, gráfico circular y gráfico lineal.

## Funcionamiento

El programa utiliza una clase abstracta llamada `GeneradorGrafico`, que almacena el título y los datos de cada gráfico. También contiene métodos compartidos para calcular el total y el valor máximo, además de validar los datos antes de renderizarlos.

Se implementan tres tipos de gráficos:

* **Gráfico de barras:** representa cada valor mediante una barra de caracteres `#`, cuya longitud es proporcional al valor máximo.
* **Gráfico circular:** calcula el porcentaje que representa cada valor respecto del total. Si todos los valores son cero, informa que no hay sectores para dibujar.
* **Gráfico lineal:** representa los valores mediante puntos `*` distribuidos en diferentes niveles de altura.

El programa utiliza un conjunto de ventas de ejemplo: 120, 80, 150, 60 y 100. También prueba casos inválidos, como un gráfico sin datos y otro que contiene un valor negativo.

Antes de renderizar, el sistema comprueba que existan datos y que ninguno sea negativo. Si alguna validación falla, muestra un mensaje de error y no genera el gráfico.

## Clases principales

### `GeneradorGrafico`

Clase abstracta que define los atributos `titulo` y `datos`. Incluye métodos para agregar datos, calcular el total, obtener el máximo y validar la información mediante `renderizar()`. Declara el método abstracto `renderizarGrafico()`, que cada subclase implementa según su estilo.

### `GraficoBarras`

Hereda de `GeneradorGrafico` y representa los valores mediante barras de caracteres `#`, con una longitud máxima de 30 caracteres.

### `GraficoCircular`

Hereda de `GeneradorGrafico` y calcula el porcentaje de cada valor sobre el total. Controla el caso en el que todos los valores son cero.

### `GraficoLineal`

Hereda de `GeneradorGrafico` y representa los datos en una estructura de niveles utilizando caracteres `*` para mostrar sus alturas relativas.

### `Main`

Crea una lista de gráficos, carga los mismos datos en cada uno y ejecuta su renderizado. Finalmente, prueba las validaciones con datos inválidos.

## Conceptos de programación utilizados

* **Abstracción:** la clase `GeneradorGrafico` establece una estructura común para los distintos estilos.
* **Herencia:** las clases concretas heredan los atributos y métodos compartidos.
* **Polimorfismo:** una lista de tipo `GeneradorGrafico` permite trabajar con diferentes gráficos mediante una misma referencia.
* **Sobrescritura de métodos:** cada subclase implementa su propia versión de `renderizarGrafico()`.
* **Encapsulamiento:** se utilizan atributos protegidos y métodos públicos para gestionar los datos.
* **Colecciones:** se utiliza `ArrayList` para almacenar los valores y los gráficos.
* **Validación de datos:** se comprueba que la lista no esté vacía y que no contenga valores negativos.
* **Procesamiento de datos:** se aplican cálculos de sumatoria, máximo y porcentajes.
* **Salida por consola:** se utilizan caracteres y formato de texto para representar visualmente los gráficos.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).
* Colecciones de Java (`ArrayList` y `List`).

## Ejecución

<img width="640" height="647" alt="image" src="https://github.com/user-attachments/assets/abb9486c-c2b2-47e9-9470-b2f96d847746" />
<img width="632" height="260" alt="image" src="https://github.com/user-attachments/assets/4392e173-a443-4a04-9652-fccd42713ba2" />

## Objetivo del ejercicio

Aplicar abstracción, herencia y polimorfismo para desarrollar diferentes formas de representación de un mismo conjunto de datos. También se busca practicar el uso de clases abstractas, colecciones, métodos sobrescritos y validaciones.

## Consideraciones

Los gráficos se representan exclusivamente mediante texto en la consola. No se utilizan bibliotecas gráficas ni se generan imágenes. La representación lineal muestra alturas relativas, no una escala numérica completa en el eje vertical.
