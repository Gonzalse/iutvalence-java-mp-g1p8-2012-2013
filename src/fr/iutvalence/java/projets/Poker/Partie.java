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
	 * Nombre de joueurs présents dans la partie (Ayant perdu ou non).
	 */
	private int nbJoueurs;
	
	/**
	 * 
	 */

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
	 * @param j : Le nom du joueur à rajouter dans la partie.
	 * @throws NbDeJoueursException : Nombre max de joueurs atteint.
	 */
	public void addJoueur (Joueur j) throws NbDeJoueursException
	{
		// Cas d'erreur : le nombre max de joueurs est atteint.
		if (this.nbJoueurs > NB_JOUEURS_MAX)
			throw new NbDeJoueursException();
		
		// Cas normal : ajout du joueur, incrémentation du nombre de joueur.
		this.joueurs[this.nbJoueurs] = j;
		this.nbJoueurs++;
		
	}
	
	// TODO Décomposer en nombre de tour, etc.
	/**
	 * Permet de démarrer la partie de poker.
	 * @throws NbDeJoueursException : Nb de joueurs insuffisant ou trop élevé.
	 */
	void demarrer() throws NbJoueursException
	{
		// Si le nombre de joueur est insuffisant ou trop élevé, on soulève une exception.
		if ((this.nbJoueurs < 2) || (this.nbJoueurs > 8))
			throw new PasAssezDeJoueursException();
		
		boolean gagnant = false;
		int tour = 0;
		
		while (gagnant == false)
			// Tant qu'il reste au moins deux joueurs, on continue la partie.
		{
			//TODO Donner 2 cartes à chaque joueurs.
			
			while (tour != 4)
				// tour = 1 : Pre-flop (3 cartes)
				// tour = 2 : Flop (+ 1 carte)
				// tour = 3 : Turn (+ 1 carte)
				// tour = 4 : River (+ 1 carte)
			{
				//TODO Fonction tourDeMise().
				//TODO Fonction addCarte(tour).
				
				tour++;
			}
			
			//TODO Répartir le/les pots.
			//TODO Eliminer les joueurs n'ayant plus de jetons + incrémenter le nombre de joueurs ayant perdu.
			
			
			tour = 0;
			
			
		}
		
	}
	
	
}
