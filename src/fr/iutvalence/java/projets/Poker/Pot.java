package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : Pot</p>
 * <p>Description : Gestion du nombre de jetons d'un pot.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Pot
{
	/*
	 * Attributs
	 */

	/**
	 * Au début de chaque manche, la valeur du pot est de 0.
	 */
	public final static int POT_DEFAUT = 0;


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
		this.nbJetonsPot = POT_DEFAUT;
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
