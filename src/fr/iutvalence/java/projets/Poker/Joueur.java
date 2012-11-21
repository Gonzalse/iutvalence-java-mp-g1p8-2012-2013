package fr.iutvalence.java.projets.Poker;
/**
 * <p>Titre : Joueur</p>
 * <p>Description : classe permettant de définir un joueur </p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Joueur
{
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
	public final static int NBJETONS_DEFAUT = 3000;
	
	/**
	 * Un joueur possède un nombre de jetons.
	 */
	private int nbJetons;

	/**
	 * Main du joueur composée de 2 cartes.
	 */
	private Carte[] main;

	/**
	 * Booléen qui a pour valeur faux et qui permet d'initialiser le joueur à "non tapis".
	 */
	public final static boolean TAPIS_DEFAUT= false;
	
	/**
	 * Booléen permettant de savoir si le joueur est à tapis ou non.
	 */
	private boolean estTapis;
	
	/**
	 * Booléen qui a pour valeur faux et qui permet d'initialiser le joueur à "non couché".
	 */
	public final static boolean COUCHE_DEFAUT = false;
	
	/**
	 * Booléen indiquant si un joueur est couché ou non.
	 */
	private boolean estCouché;
	
	/**
	 * Booléen qui a pour valeur faux et qui permet d'initialiser le joueur à "non check".
	 */
	public final static boolean CHECK_DEFAUT = false;
	
	/**
	 * Booléen indiquant si un joueur est couché ou non.
	 */
	private boolean check;
	
	/**
	 * Au début de chaque tour, le nombre de jetons misés par le joueur est 0.
	 */
	private final static int NBJETONSMISES_DEFAUT = 0;
	
	/**
	 * Par défaut le joueur n'a pas perdu lorsqu'il rejoint la partie.
	 */
	private final static boolean A_PERDU_DEFAUT = false;
	
	/**
	 * Booléen indiquant si un joueur a perdu ou non la partie.
	 */
	private boolean a_perdu;
	
	/**
	 * Définit le nombre de jetons qu'a misé un joueur au cours d'un tour.
	 */
	private int nbJetonsMisés;
	
	/**
	 * Définit la petite blinde par défaut.
	 */
	private final static int smallBlind_DEFAUT = 20;
	
	/**
	 * Correspond à la petite blinde.
	 */
	private int smallBlind;
	
	/**
	 * Définit la grosse blinde par défaut.
	 */
	private final static int bigBlind_DEFAUT = 40;
	
	/**
	 * Correspond à la grosse blinde.
	 */
	private int bigBlind;
	
	
	
	
	/*
	 * Constructeurs
	 */

	/**
	 * Permet de créer un joueur en indiquant son nom, son nombre de jetons et sa main.
	 * 
	 * @param nomJoueur
	 *            : nom du joueur
	 */
	public Joueur(String nomJoueur)
	{
		// Initialisation du nom du joueur :
		this.nom = nomJoueur;

		// Initialisation du nombre de jetons :
		this.nbJetons = NBJETONS_DEFAUT;

		// Initialisation de la main du joueur
		this.main = new Carte[1];
		
		// Initialisation des booléens du joueur à non tapis, non couché non check et non perdu.
		this.estCouché = COUCHE_DEFAUT;
		this.estTapis = TAPIS_DEFAUT;
		this.check = CHECK_DEFAUT;
		this.nbJetonsMisés = NBJETONSMISES_DEFAUT;
		this.a_perdu = A_PERDU_DEFAUT;
	}

	/*
	 * Méthodes
	 */
	
	/**
	 * Permet d'obtenir le nombre de jeton du joueur.
	 * @return le nombre de jetons du joueur.
	 */
	public String getNom()
	{
		return this.nom;
	}
	
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
	 * Permet d'obtenir les carte en main du joueur.
	 * @return Les cartes en mains du joueur.
	 */
	public Carte[] getCarte()
	{
		return (this.main);
	}
	
	
	
	
	/**
	 * Permet de miser un certain nombre de jetons.
	 * @param j 
	 * @param mise : nombre de jetons que le joueur veut miser.
	 */

	public miser (Joueur j, int mise)
	{
		
		
		if (mise > this.nbJetons)
			/*Si le joueur tente de miser plus que ce qu'il possède, il est tapis.*/
			this.nbJetonsMisés += this.nbJetons;
			this.nbJetons = 0;
			this.estTapis = true;
			//Augmenter le pot !
		else
			/*Si le joueur mise moins que son nombre total de jetons, on déduit sa mise de ses jetons.*/
			this.nbJetonsMisés += mise;
			this.nbJetons = this.nbJetons - mise;
			//Augmenter le pot !
	}

	/**
	 * Permet de relancer un certain nombre de jetons (La relance doit être supérieure à la dernière mise).
	 * @param c : nombre de jetons.
	 */
	public void relancer(int c)
	{
		
	}

	/**
	 * Permet de checker.
	 */
	public void checker()
	{
		this.check = true;
	}

	/**
	 * Permet de se retirer de la manche.
	 */
	public void coucher()
	{
		this.estCouché = true;
	}

	
}
