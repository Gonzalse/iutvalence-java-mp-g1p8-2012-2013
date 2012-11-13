package fr.iutvalence.java.projets.Poker;
/**
 * <p>Titre : Joueur</p>
 * <p>Description : classe permettant de définir un joueur </p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Joueur
{
	/**
	 * Nombre de jetons par défaut.
	 */
	public final static int NBJETONS_DEFAUT = 3000;

	/**
	 * Booléen qui a pour valeur faux et qui permet d'initialiser le joueur a "non tapis".
	 */
	public final static boolean TAPIS_DEFAUT= false;

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

	/**
	 * Main du joueur composée de 2 cartes.
	 */
	private Carte[] main;

	/**
	 * Booléen permettant de savoir si le joueur est à tapis ou non.
	 */
	private boolean estTapis;
	
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
			this.nbJetons = NBJETONS_DEFAUT;
		else
			this.nbJetons = jetons;

		// Initialisation de la main du joueur
		this.main = new Carte[1];
	}

	/*
	 * Méthodes
	 */
	
	/**
	 * Permet d'obtenir le nombre de jeton du joueur.
	 * @return le nombre de jetons du joueur.
	 */
	public int getNbJetons()
	{
		return this.nbJetons;
	}
	
	
	/**
	 * Permet d'attribuer un nombre de jetons à un joueur.
	 * @param jetons : le nombre de jetons à attribuer.
	 */
	public void setNbJetons(int jetons)
	{
		this.nbJetons = jetons;
	}
	
	
	/**
	 * Permet d'obtenir le nom d'un joueur.
	 * @return le nom du joueur.
	 */
	public String getNomJoueur()
	{
		return this.nom;
	}
	
	
	/**
	 * Permet d'attribuer un nom à un joueur.
	 * @param nom : le nom à attribuer au joueur.
	 */
	public void setNomJoueur(String nom)
	{
		this.nom = nom;
	}
	
	
	/**
	 * Permet de changer les cartes en main d'un joueur.
	 */
	public void newCarte()
	{
		this.main = new Carte[1];
	}
	
	
}
