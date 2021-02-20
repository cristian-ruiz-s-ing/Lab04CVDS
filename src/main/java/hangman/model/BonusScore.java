package hangman.model;

public class BonusScore implements GameScore {
	/*
	 * @param correctCount	puntos correctos obtenidos.
	 * @param incorrectCount puntos incorrectos obtenidos.
	 * @return entrega puntaje de jugador.   
	 */	
	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException {
		if (correctCount*10 - incorrectCount*5 <= 0) {
			throw new GameScoreException(GameScoreException.POCOS_PUNTOS_EXCEPTION);
		}
		return correctCount*10 - incorrectCount*5;
	}
	public int reset() {
		return 0;
	}
}
