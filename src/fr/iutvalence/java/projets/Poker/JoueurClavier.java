package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : Joueur</p>
 * <p>Description : classe permettant de définir un joueur </p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class JoueurClavier
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
	private Carte[] mainJoueur;

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
	public JoueurClavier(String nomJoueur)
	{
		// Initialisation du nom du joueur :
		this.nom = nomJoueur;

		// Initialisation du nombre de jetons :
		this.nbJetons = NBJETONS_DEFAUT;

		// Initialisation de la main du joueur
		this.mainJoueur = new Carte[2];
		
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
		return (this.mainJoueur);
	}
	
	
	/**
	 * Permet de donner deux cartes à un joueur.
	 * @param premiereCarte : La première carte en main du joueur.
	 * @param deuxiemeCarte : La deuxième carte en main du joueur.
	 */
	public void setCarte(Carte premiereCarte, Carte deuxiemeCarte)
	{
		this.mainJoueur[0] = premiereCarte;
		this.mainJoueur[1] = deuxiemeCarte;		
	}
	
	
	/**
	 * Permet à un joueur de miser un certain nombre de jetons.
	 * @param mise : nombre de jetons que le joueur veut miser.
	 * @return : le nombre de jetons à ajouter au pot (Correspond au nombre de jetons du joueur si celui-ci n'a pas assez pour suivre).
	 */

	public int suivre (int mise) //TODO Void ou autre ?
	{
		
		
		if (mise > this.nbJetons)
		{
			/*Si le joueur tente de miser plus que ce qu'il possède, il est tapis.*/
			this.nbJetonsMisés += this.nbJetons;
			this.nbJetons = 0;
			this.estTapis = true;
			return this.nbJetons;
		}
		else
		{
			/*Si le joueur mise moins que son nombre total de jetons, on déduit sa mise de ses jetons.*/
			this.nbJetonsMisés += mise;
			this.nbJetons = this.nbJetons - mise;
			return mise;
		}
	}
	
	
	/**
	 * Renvoi le nombre de jeton misé par le joueur.
	 * @return : Le nombre de jeton misé.
	 */
	public int getNbJetonsMises()
	{
		return this.nbJetonsMisés;
	}
	
	/**
	 * Renvoi le nombre de jeton misé par le joueur.
	 */
	public void reinitialiserNbJetonsMises()
	{
		this.nbJetonsMisés = 0;
	}
	
	

	/**
	 * Permet de relancer un certain nombre de jetons (La relance doit être supérieure à la dernière mise).
	 * @param relance : Le nombre de jetons (> à la dernière mise).
	 * @return : Le nombre de jetons à ajouter au pot.
	 */
	public int relancer(int relance)
	{
		
		if (relance > this.nbJetons)
		{
			/*Si le joueur tente de miser plus que ce qu'il possède, il est tapis.*/
			this.nbJetonsMisés += this.nbJetons;
			this.nbJetons = 0;
			this.estTapis = true;
			return this.nbJetons;
		}
		else
		{
			/*Si le joueur relance moins que son nombre total de jetons, on déduit sa relance de ses jetons.*/
			this.nbJetonsMisés += relance;
			this.nbJetons -= relance;
			return relance;
		}
	}

	/**
	 * Permet de checker.
	 * @param b : Booléen permettant d'indiquer si un joueur a checké ou non.
	 */
	public void setChecker(boolean b)
	{
		this.check = b;
	}

	/**
	 * Permet de se retirer de la manche.
	 * @param b : Booléen permettant d'indiquer si un joueur est couché ou non.
	 */
	public void setCoucher(boolean b)
	{
		this.estCouché = b;
	}
	
	/**
	 * Permet de savoir si un joueur est couché ou non.
	 * @return : Un booléen indiquant si le joueur est couché (vrai) ou non (faux).
	 */
	public boolean getCoucher()
	{
		return this.estCouché;
	}
	
	
	/**
	 * Permet de déclarer un joueur comme perdant.
	 * @param b : Un booléen indiquant si le joueur perd ou non.
	 */
	public void setPerdu(boolean b)
	{
		this.a_perdu = b;
	}

	
	/**
	 * Permet de savoir si un joueur a perdu ou non.
	 * @return : Un booléen indiquant si le joueur a perdu (vrai) ou non (faux).
	 */
	public boolean getPerdu()
	{
		return this.a_perdu;
	}
}
