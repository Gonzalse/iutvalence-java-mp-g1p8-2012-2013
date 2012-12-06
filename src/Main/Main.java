package Main;

import fr.iutvalence.java.projets.Poker.*;

/**
 * <p>Titre : Main</p>
 * <p>Description : Test de la partie.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Main
{

	/**
	 * @param args
	 * @throws NbDeJoueursException : La condition 2 <= NbJoueurs <= 8 n'est pas respectée.
	 * @throws PlusDeCarteException : Plus de 52 cartes ont été tiré.
	 */
	public static void main(String[] args) throws NbDeJoueursException, PlusDeCarteException
	{
		Partie Poker = new Partie();
		
		JoueurClavier J1 = new JoueurClavier("Hicham");
		JoueurClavier J2 = new JoueurClavier("Seb");
		JoueurClavier J3 = new JoueurClavier("Mahmoud");
		
		Poker.addJoueur(J1);
		Poker.addJoueur(J2);
		Poker.addJoueur(J3);
		
		Poker.demarrer();
	}
}