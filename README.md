
# Conversor de Monedas

Desarrollado como parte del Challenge Conversor de Monedas, propuesto por Alura Latam en colaboración con Oracle en el programa ONE, como parte de la especialización Back-End.

## Descripción 

Es un proyecto de Conversor de Monedas desarrollado en Java que permite convertir diferentes divisas utilizando una API de tasas de cambio en tiempo real. Con este conversor, se pueden realizar solicitudes a la API, analizar la respuesta JSON, filtrar las monedas de interés y mostrar los resultados a los usuarios de manera clara y concisa. Además, la aplicación guarda un historial de conversiones que incluye una marca de tiempo para cada consulta lo que permite al usuario realizar un seguimiento de sus conversiones anteriores y ver cuándo y a qué hora se realizaron.

## Tecnologías Utilizadas 

- **Lenguaje de Programación:** Java
- **API de Tasas de Cambio:** Se utilizó una API de tasas de cambio en tiempo real para obtener las tasas de conversión entre diferentes divisas.
- **Biblioteca Gson:** Gson se empleó para analizar la respuesta JSON de la API y convertirla en objetos Java para su manipulación.
- **Control de Versiones:** Git/GitHub se usaron para el control de versiones del proyecto y la colaboración en equipo.
- **Entorno de Desarrollo Integrado (IDE):** IntelliJ IDEA fue el entorno de desarrollo utilizado.

## Clases y Funcionalidades 

### Calculos.java

En esta clase se maneja la lógica relacionada con las conversiones de moneda. Se definen métodos para almacenar valores de moneda, realizar conversiones y obtener mensajes de respuesta.

### ConsultaConversion.java

Con esta clase se realizan consultas a una API externa para obtener las tasas de cambio entre diferentes monedas.

### GeneradorDeArchivos.java

Esta clase guarda el historial de consultas en un archivo de texto.

### Principal.java

Es la clase de entrada principal del programa donde se maneja la interacción con el usuario a través de la consola mostrando un menú de opciones y gestionando las conversiones de moneda.

## Desarrollado por
- Leonardo German Zelarayan


