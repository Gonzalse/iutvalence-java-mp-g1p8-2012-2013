package fr.iutvalence.java.projets.Poker;

/**
 * @author Aftiss - Gonza
 */

public class Pot
{

	/**
	 * Au début de chaque manche, la valeur du pot est de 0.
	 */
	// FIXME respecter les conventions d'écriture
	public final static int pot_DEFAUT = 0;

	/*
	 * Attributs
	 */

	/**
	 * Le pot représente le nombre de jetons misés au cours d'une manche.
	 */
	public int nbJetonsPot;


	/*
	 * Constructeurs
	 */

	/**
	 * On initialise la valeur du pot par la valeur par défaut : pot_DEFAUT = 0.
	 */
	public Pot()
	{
		this.nbJetonsPot = pot_DEFAUT;
	}

	/*
	 * Méthodes
	 */
	/**
	 * On augmente le pot de c jetons.
	 */
	public void augmenterPot(int c)
	{
		this.nbJetonsPot = this.nbJetonsPot + c;
	}

	/**
	 * Renvoi le nombre de jetons contenu dans le pot.
	 */
	public int valeurPot()
	{
		return this.nbJetonsPot;
	}
}
