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
	private int nbJoueurs_DEFAUT = 2;
	
	/**
	 *  
	 */
	private Joueur[] joueurs;
	
	/**
	 * 
	 */
	private Donneur donneur;
	
	
	/**
	 * Nombre de cartes d'un jeu de cartes.
	 */
	private static int nbCartes=52;
	
	/**
	 * Nombre de jetons par défaut.
	 */
	public final static int nbJetons_DEFAUT=3000;
	private int jetons;
	
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
		
		//Initialisation du nombre de jetons :
		if ((nbJetons < 500) || (nbJetons > 10000))
			this.jetons = nbJetons_DEFAUT;
		else
			this.jetons = nbJetons;
		
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
