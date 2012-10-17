package fr.iutvalence.java.projets.Poker;

/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Partie {
	
	/*
	 * Attributs
	 */
	
	
	/**
	 * Nombre de joueurs présents dans la partie.
	 */
	// FIXME définir une "vraie" constante
	private int nbJoueurs_DEFAUT = 2;
	
	// FIXME compléter le commentaire
	/**
	 *  
	 */
	private Joueur[] joueurs;
	
	// FIXME compléter le commentaire
	/**
	 * 
	 */
	private Donneur donneur;
	
	// FIXME définir une "vraie" constante	
	/**
	 * Nombre de cartes d'un jeu de cartes.
	 */
	private static int nbCartes=52;

	
	/*
	 * Constructeurs
	 */
	public Partie (int nbJoueur, int nbJetons)
	{
		//Initialisation du nombre de joueur :
		if ((nbJoueur < 2) || (nbJoueur > 6))
			this.joueurs = new Joueur[nbJoueurs_DEFAUT];
		else
			this.joueurs = new Joueur[nbJoueur];
		
		//Initialisation du donneur :
		this.donneur = new Donneur();
		
		//Initialisation des cartes :
		this.
	}
	
	
	/*
	 * Méthodes
	 */
	//FIXME  méthodes ?
	
	
}
