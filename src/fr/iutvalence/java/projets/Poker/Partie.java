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
	// FIXME (FIXED) définir une "vraie" constante
	private final static int nbJoueurs_DEFAUT = 2;
	
	// FIXME (FIXED) compléter le commentaire
	/**
	 *  Les joueurs de la partie seront stocké dans un tableau de joueurs.
	 */
	private Joueur[] joueurs;
	
	// FIXME (FIXED) compléter le commentaire
	/**
	 * La partie contient un donneur chargé de distribuer les cartes.
	 */
	private Donneur donneur;
	
	// FIXME (FIXED) définir une "vraie" constante	
	/**
	 * Nombre de cartes d'un jeu de cartes.
	 */
	private final static int nbCartes=52;

	
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
	// FIXME (FIXED) compléter le commentaire
	/**
	 * Permet de miser un certain nombre de jetons.
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	public int miser (int mise)
	{
		
		if (c > this.nbJetons)
			/*Si le joueur tente de miser plus que ce qu'il possède, il est tapis.*/
			this.nbJetons = 0;
			this.estTapis = true;
			//Augmenter le pot !
		else
			/*Si le joueur mise moins que son nombre total de jetons, on déduit sa mise de ses jetons.*/
			this.nbJetons = this.nbJetons - mise;
			//Augmenter le pot !
	}
	
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet de relancer un certain nombre de jetons (La relance doit être supérieure à la dernière mise).
	 * @param c : nombre de jetons.
	 * @return le nombre de jetons ajouté a la mise.
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	public int relancer (int c)
	{
		
	}
	
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet de checker.
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	public checker()
	{
		
	}
	
	// FIXME (FIXED) écrire un commentaire
	// FIXME (FIXED) respecter les conventions d'écriture

	/**
	 * Permet de se retirer de la manche.
	 */
	public coucher()
	{
		
	}


}
