import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;

        ConsultaConversion consulta = new ConsultaConversion();

        Calculos calculos = new Calculos(consulta);
        GeneradorDeArchivos generador = new GeneradorDeArchivos();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n******************************************************
                ********                                     *********
                ******** Bienvenido al Conversor de Monedas  *********
                ********                                     *********
                ******************************************************
                1) Peso Argentino ==>> Dólar Estadounidense
                2) Peso Argentino ==>> Euro
                3) Peso Argentino ==>> Libra Esterlina
                4) Dólar Estadounidense ==>> Peso Argentino
                5) Euro ==>> Peso Argentino
                6) Libra Esterlina ==>> Peso Argentino
                
                7) Otra opción de conversión
                
                8) Salir
                ******************************************************
                ******************************************************
                """;

        while (opcionElegida != 8) {
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());

                // Obtener la marca de tiempo actual
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter
                        .ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcionElegida) {
                    case 1:
                        calculos.almacenarValores("ARS", "USD");
                        respuestas.add(formattedDate + " - " + calculos
                                .obtenerMensajeRespuesta());
                        break;
                    case 2:
                        calculos.almacenarValores("ARS", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 3:
                        calculos.almacenarValores("ARS", "GBP");
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 4:
                        calculos.almacenarValores("USD", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 5:
                        calculos.almacenarValores("EUR", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 6:
                        calculos.almacenarValores("GBP", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 7:
                        calculos.almacenarValoresPersonalizados();
                        respuestas.add(formattedDate + " - " + calculos.
                                obtenerMensajeRespuesta());
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda válidos.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }
        generador.guardarJson(respuestas);

        System.out.println("Finalizando programa");
    }
}