package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : Partie</p>
 * <p>Description : Gestion de la partie.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Partie
{
	/*
	 * Attributs
	 */
	
	/**
	 * Nombre de cartes d'un jeu de cartes.
	 */
	private final static int nbCartes = 52;
	
	/**
	 * Nombre de joueurs maximum dans la partie.
	 */
	private final static int NB_JOUEURS_MAX = 6;

	/**
	 * Les joueurs de la partie seront stocké dans un tableau de joueurs.
	 */
	private Joueur[] joueurs;
	
	/**
	 * Nombre de joueurs présents dans la partie.
	 */
	private int nbJoueurs;

	/**
	 * La partie contient un donneur chargé de distribuer les cartes.
	 */
	private Donneur donneur;


	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Initialise la partie de poker.
	 */
	
	public Partie ()
	{
		//Initialisation du tableau de joueur :
		this.joueurs = new Joueur[NB_JOUEURS_MAX];
		
		//Initialisation du nombre de joueur :
		this.nbJoueurs = 0;
		
		//Initialisation du donneur :
		this.donneur = new Donneur();
	}

	/*
	 * Méthodes
	 */
	
	/**
	 * Permet d'ajouter un joueur dans la partie.
	 * @param j : Le joueur à rajouter dans la partie.
	 */
	void addJoueur (Joueur j)
	{
		if (this.nbJoueurs < NB_JOUEURS_MAX)
		{
			this.joueurs[this.nbJoueurs] = j;
			this.nbJoueurs++;
		}
		else
		{
			// TODO Message !
		}
	}
	
	// TODO Décomposer en nombre de tour, etc.
	void demarrer()
	{
		if (this.nbJoueurs < 2)
		{
			// TODO Erreur nombre de joueur
		}
		else
		{
			
		}
		
	}
}
