package hangman.model;

public class GameScoreException extends Exception {

	public static String POCOS_PUNTOS_EXCEPTION="El puntaje debe ser mayor o igual a cero";
	public static String MUCHOS_PUNTOS_EXCEPTION="El puntaje debe ser menor o igual a quinientos";
	public GameScoreException (String ex) {
		return;		
	}
}
