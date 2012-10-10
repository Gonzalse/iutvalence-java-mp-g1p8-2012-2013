package fr.iutvalence.java.projets.Poker;

/**
 * @author Aftiss - Gonza
 */


public class Pot {

	/*
	 * Attributs
	 */
	public int pot;
	public int pot_DEFAUT = 0;
	
	
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
	public void augmenterPot(int c)
	{
		this.pot = this.pot + c;
	}
	
	public int valeurPot()
	{
		return this.pot;
	}
}
