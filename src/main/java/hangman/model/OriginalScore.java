package hangman.model;

public class OriginalScore implements GameScore {
	/*
	 * @param correctCount	puntos correctos obtenidos.
	 * @param incorrectCount puntos incorrectos obtenidos.
	 * @return entrega puntaje de jugador.   
	 */	 
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		if (incorrectCount>10) {
			throw new GameScoreException(GameScoreException.POCOS_PUNTOS_EXCEPTION);
		}
		return 100-incorrectCount*10;
	}
	public int reset() {
		return 100;
	}
}