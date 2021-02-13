package hangman.model;

public interface GameScore {
	
	/*
	 * @param correctCount	puntos correctos obtenidos.
	 * @param incorrectCount puntos incorrectos obtenidos.
	 * @return entrega puntaje de jugador.   
	 */	  
	public int calculateScore(int correctCount, int incorrectCount);
}
