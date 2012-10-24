package fr.iutvalence.java.projets.Poker;
//FIXME respecter la syntaxe JavaDoc, compléter
/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Joueur
{
	/**
	 * Nombre de jetons par défaut.
	 */
	public final static int nbJetons_DEFAUT = 3000;

	/**
	 * Booléen qui a pour valeur faux et qui permet d'initialiser le joueur a "non tapis".
	 */
	// FIXME définir comme une constante
	// FIXME respecter les conventions d'écriture
	public boolean estTapis_DEFAUT = false;

	/*
	 * Attributs
	 */

	/**
	 * Nom du joueur.
	 */
	private String nom;

	
	/**
	 * Un joueur possède un nombre de jetons.
	 */
	private int nbJetons;

	// FIXME définir en private
	/**
	 * Main du joueur composée de 2 cartes.
	 */
	public Carte[] main;

	/**
	 * Booléen permettant de savoir si le joueur est à tapis ou non.
	 */
	// FIXME définir en private
	public boolean estTapis;
	
	/*
	 * Constructeurs
	 */

	/**
	 * Permet de créer un joueur en indiquant son nom, son nombre de jetons et sa main.
	 * 
	 * @param nomJoueur
	 *            : nom du joueur
	 * @param jetons
	 *            : nombre de jetons du joueur
	 * @param mainJoueur
	 *            : main (2 cartes) du joueur.
	 */
	public Joueur(String nomJoueur, int jetons, Carte[] mainJoueur)
	{
		// Initialisation du nom du joueur :
		this.nom = nomJoueur;

		// Initialisation du nombre de jetons :
		if ((nbJetons < 500) || (nbJetons > 10000))
			this.nbJetons = nbJetons_DEFAUT;
		else
			this.nbJetons = jetons;

		// Initialisation de la main du joueur
		this.main = new Carte[1];
	}

	// FIXME Méthodes ?
	/*
	 * Méthodes
	 */

}
