package fr.iutvalence.java.projets.Poker;

/*
 * @author Hicham & Gonza
 * @version 1 
 */


public class Joueur {
	
	
	/*
	 * Attributs
	 */
	
	/**
	 * Nom du joueur.
	 */
	private String nom;

	
	/**
	 * Nombre de jetons par défaut.
	 */
	public final static int nbJetons_DEFAUT=3000;
	private int nbJetons;
	
	
	/**
	 * Main du joueur composée de 2 cartes.
	 */
	public Carte[] main;
	
	
	/**
	 * Booléen permettant de savoir si le joueur est à tapis ou non.
	 */
	public Boolean estTapis;
	public Boolean estTapis_DEFAUT = false;
	
	
	/**
	 * 
	 */
	
	
	
	
	
	/*
	 * Constructeurs
	 */
	
	public Joueur (String nomJoueur, int jetons, Carte[] mainJoueur)
	{
		//Initialisation du nom du joueur :
		this.nom = nomJoueur;
		
		//Initialisation du nombre de jetons :
		if ((nbJetons < 500) || (nbJetons > 10000))
			this.nbJetons = nbJetons_DEFAUT;
		else
			this.nbJetons = jetons;
		
		//Initialisation de la main du joueur
		this.main = new Carte[1];
	}
	
	
	
	/*
	 * Méthodes
	 */
	
	/**
	 * 
	 */
	public int Miser (int mise)
	{
		// Si le joueur tente de miser plus que ce qu'il possède, il est tapis.
		if (c > this.nbJetons)
			this.nbJetons = 0;
			this.estTapis = true;
			//Augmenter le pot !
		else
			this.nbJetons = this.nbJetons - mise;
			//Augmenter le pot !
	}
	
	public int Relance (int c)
	{
		
	}
	
	public int Check()
	{
		
	}
	
	public int Couche()
	{
		
	}
	
}
