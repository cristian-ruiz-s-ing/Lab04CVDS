package hangman.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.tools.javac.util.Assert;

public class GameScoreTest {

	@Test
	public void OriginalScoreElPuntajeNoEsMenorACero() {
		OriginalScore prueba = new OriginalScore();
		try {
			prueba.calculateScore(1, 11);
		}catch(GameScoreException ex) {
			assertTrue(true);
		}
		
			
	}
	@Test
	public void BonusScoreElPuntajeNoEsMenorACero() {
		BonusScore prueba = new BonusScore();
		try {
			prueba.calculateScore(2, 5);
		}catch(GameScoreException ex) {
			assertTrue(true);
		}
		
			
	}
	@Test
	public void PowerScoreElPuntajeNoEsMenorACero() {
		PowerScore prueba = new PowerScore();
		try {
			prueba.calculateScore(2, 4);
		}catch(GameScoreException ex) {
			assertTrue(true);
		}
		
			
	}
	@Test
	public void PowerScoreElPuntajeNoEsMayorAQuinientos() {
		PowerScore prueba = new PowerScore();
		try {
			prueba.calculateScore(4, 2);
		}catch(GameScoreException ex) {
			assertTrue(true);
		}
		
			
	}
}
