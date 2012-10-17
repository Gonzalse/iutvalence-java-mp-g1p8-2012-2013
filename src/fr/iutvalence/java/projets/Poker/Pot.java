package fr.iutvalence.java.projets.Poker;

/**
 * @author Aftiss - Gonza
 */


public class Pot {

	/*
	 * Attributs
	 */
	// FIXME écrire un commentaire
	public int pot;
	
	// FIXME définir une "vraie" constante
	// FIXME écrire un commentaire
	public int pot_DEFAUT = 0;
	
	
	// FIXME écrire un commentaire
	/*
	 * Constructeurs
	 */
	public Pot()
	{
		this.pot = pot_DEFAUT;
	}
	
	/*
	 * Méthodes
	 */
	// FIXME écrire un commentaire
	public void augmenterPot(int c)
	{
		this.pot = this.pot + c;
	}
	
	// FIXME écrire un commentaire
	public int valeurPot()
	{
		return this.pot;
	}
}
