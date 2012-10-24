package fr.iutvalence.java.projets.Poker;

/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Partie
{

	/**
	 * Nombre de cartes d'un jeu de cartes.
	 */
	private final static int nbCartes = 52;

	// FIXME (FIXED) respecter les conventions d'écriture
	/**
	 * Nombre de joueurs présents dans la partie.
	 */
	private final static int NBJOUEURS_DEFAUT = 2;

	/*
	 * Attributs
	 */

	/**
	 * Les joueurs de la partie seront stocké dans un tableau de joueurs.
	 */
	private Joueur[] joueurs;

	/**
	 * La partie contient un donneur chargé de distribuer les cartes.
	 */
	private Donneur donneur;


	/*
	 * Constructeurs
	 */
	public Partie (int nbJoueur, int nbJetons)
	{
		//Initialisation du nombre de joueur :
		if ((nbJoueur < 2) || (nbJoueur > 6))
			this.joueurs = new Joueur[NBJOUEURS_DEFAUT];
		else
			this.joueurs = new Joueur[nbJoueur];
		
		//Initialisation du donneur :
		this.donneur = new Donneur();
		
		//Initialisation des cartes :

	}

	/*
	 * Méthodes
	 */
	
	/**
	 * Permet de miser un certain nombre de jetons.
	 */

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

	/**
	 * Permet de relancer un certain nombre de jetons (La relance doit être supérieure à la dernière mise).
	 * 
	 * @param c
	 *            : nombre de jetons.
	 * @return le nombre de jetons ajouté a la mise.
	 */
	public int relancer(int c)
	{

	}

	/**
	 * Permet de checker.
	 */
	public checker()
	{

	}

	/**
	 * Permet de se retirer de la manche.
	 */
	public coucher()
	{

	}

}
