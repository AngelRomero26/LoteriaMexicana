package Colecciones;


import java.util.ArrayList;

public class LoteriaMexicana {
    public static void main(String[] args) {
        final int TOTAL_CARTAS = 54;

        // ArraySet para almacenar las cartas de la lotería mexicana
        ArraySet<Carta> cartasLoteria = new ArraySet<>();
        Carta carta;

        // Crear las 54 cartas de la lotería mexicana y agregarlas al conjunto
        for (int i = 1; i <= TOTAL_CARTAS; i++) {
            carta = new Carta(i);
            cartasLoteria.add(carta);
        }

        // Mostrar todas las cartas al inicio
        System.out.println("Cartas de la Lotería Mexicana:");
        System.out.println(cartasLoteria);
        System.out.println("Total de cartas: " + cartasLoteria.size());
        System.out.println("\nComenzando a sacar cartas de forma aleatoria...\n");

        // Sacar y mostrar las cartas de forma aleatoria
        for (int i = 1; i <= TOTAL_CARTAS; i++) {
            carta = cartasLoteria.removeRandom();
            System.out.println("Carta #"  + carta);
            //System.out.println("Carta #" + i + ": " + carta);
        }

        System.out.println("\n¡Todas las cartas han sido sacadas!\n!!Loteriaaa");
    }
}

// Clase Carta para representar cada carta de la lotería mexicana
class Carta {
    private final int numero;  
    private final String nombre;

    // Lista con los nombres de las 54 cartas de la lotería mexicana
    private static final String[] NOMBRES_CARTAS = {
        "El Gallo", "El Diablo", "La Dama", "El Catrín", "El Paraguas",
        "La Sirena", "La Escalera", "La Botella", "El Barril", "El arbol",
        "El Melón", "El Valiente", "El Gorrito", "La Muerte", "La Pera",
        "La Bandera", "El Bandolón", "El Violoncello", "La Garza", "El Pájaro",
        "La Mano", "La Bota", "La Luna", "El Cotorro", "El Borracho",
        "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
        "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella",
        "El Cazo", "El Mundo", "El Apache", "El Nopal", "El Alacrán",
        "La Rosa", "La Calavera", "La Campana", "El Cantarito", "El Venado",
        "El Sol", "La Corona", "La Chalupa", "El Pino", "El Pescado",
        "La Palma", "La Maceta", "El Arpa", "La Rana"
    };

    public Carta(int numero) {
        // Asignar el nombre correspondiente basado en el número
        this.numero = numero;
            this.nombre = NOMBRES_CARTAS[numero - 1];
    }

    @Override
    public String toString() {
        return numero + ". " + nombre;
   }

}

