package fr.iutvalence.java.projets.Poker;

/**
 * @author Aftiss - Gonza
 */


public class Pot {

	/*
	 * Attributs
	 */
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Le pot représente le nombre de jetons misés au cours d'une manche.
	 */
	public int nbJetonsPot;
	
	// FIXME (FIXED) définir une "vraie" constante
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Au début de chaque manche, la valeur du pot est de 0.
	 */
	public final static int pot_DEFAUT = 0;
	
	
	// FIXME (FIXED) écrire un commentaire
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
	// FIXME (FIXED) écrire un commentaire
	/**
	 * On augmente le pot de c jetons.
	 */
	public void augmenterPot(int c)
	{
		this.nbJetonsPot = this.nbJetonsPot + c;
	}
	
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Renvoi le nombre de jetons contenu dans le pot.
	 */
	public int valeurPot()
	{
		return this.nbJetonsPot;
	}
}
