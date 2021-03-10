package dominio;
/**
 * Esta clase es responsable de leer el tablero de un
 * fichero en forma de ceros y unos, ir transitando de
 * estados e ir mostrando dichos estados.
 */
public class Tablero{
    private static int DIMENSION = 30;
    private int[][] estadoActual; //matriz que representa el
    // estado actual.
    private int[][] estadoSiguiente  = new int[DIMENSION][DIMENSION];
/********************************************************
* Lee el estado inicial de un fichero llamado ‘matriz‘.
********************************************************/
    public void leerEstadoActual(){}
// La secuencia de ceros y unos del fichero es guardada
// en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos
// correspondientes en ‘estadoSiguiente‘.
    /********************************************************
     * Genera un estado inicial aleatorio. Para cada celda
     * genera un número aleatorio en el intervalo [0, 1). Si
     * el número es menor que 0,5, entonces la celda está
     * inicialmente viva. En caso contrario, está muerta.
     *******************************************************/
    public void generarEstadoActualPorMontecarlo(){}
// La secuencia de ceros y unos generada es guardada
// en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos
// correspondientes en ‘estadoSiguiente‘.
    /********************************************************
     * Transita al estado siguiente según las reglas del
     * juego de la vida.
     ********************************************************/
    public void transitarAlEstadoSiguiente(){}
// La variable ‘estadoActual‘ pasa a tener el contenido
// de ‘estadoSiguiente‘ y, éste útimo atributo pasar a
// reflejar el siguiente estado.
    /*******************************************************
     * Devuelve, en modo texto, el estado actual.
     * @return el estado actual.
     *******************************************************/
    @Override
    public String toString(){
        return ""; // Esta línea hay que modificarla.
    }
}