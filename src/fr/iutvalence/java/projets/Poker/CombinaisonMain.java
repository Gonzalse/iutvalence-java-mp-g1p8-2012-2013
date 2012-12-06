package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : CombinaisonMain</p>
 * <p>Description : Enumération des différentes combinaisons possibles au poker.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public enum CombinaisonMain
{
	/**
	 * Représente la combinaison : hauteur ( = Aucune autre combinaison).
	 */
	HAUTEUR,
	
	/**
	 * Représente la combinaison : paire ( = Deux cartes de même valeur).
	 */
	PAIRE,
	
	/**
	 * Représente la combinaison : double paire ( = Deux paires).
	 */
	DOUBLEPAIRE,
	
	/**
	 * Représente la combinaison : brelan ( = Trois cartes de même valeur).
	 */
	BRELAN,
	
	/**
	 * Représente la combinaison : suite ( = Cinq cartes dont les valeurs se suivent).
	 */
	SUITE,
	
	/**
	 * Représente la combinaison : couleur ( = Cinq cartes ayant la même couleur).
	 */
	COULEUR,
	
	/**
	 * Représente la combinaison : fullhouse ( = Un brelan et une paire).
	 */
	FULLHOUSE,
	
	/**
	 * Représente la combinaison : carré ( = Quatre cartes de même valeur).
	 */
	CARRE,
	
	/**
	 * Représente la combinaison : quinte flush ( = Cinq cartes dont les valeurs se suivent & de la même couleur (Sauf 10-J-Q-K-A)).
	 */
	QUINTEFLUSH,
	
	/**
	 * Représente la combinaison : quinte flush royale ( = Les cinq cartes 10-J-Q-K-A de la même couleur).
	 */
	QUINTEFLUSHROYALE;
}
