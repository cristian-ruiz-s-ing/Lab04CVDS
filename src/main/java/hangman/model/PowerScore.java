package hangman.model;

public class PowerScore implements GameScore {
	/*
	 * @param correctCount	puntos correctos obtenidos.
	 * @param incorrectCount puntos incorrectos obtenidos.
	 * @return entrega puntaje de jugador.   
	 */	 
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
		if (Math.pow(5, correctCount) - incorrectCount*8 <= 0) {
			throw new GameScoreException(GameScoreException.POCOS_PUNTOS_EXCEPTION);
		}
		else if (Math.pow(5, correctCount) - incorrectCount*8 >= 500) {
			throw new GameScoreException(GameScoreException.MUCHOS_PUNTOS_EXCEPTION);
		}
		return (int) (Math.pow(5, correctCount) - incorrectCount*8);
	}
}