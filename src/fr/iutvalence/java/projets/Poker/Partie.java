package fr.iutvalence.java.projets.Poker;

import java.util.Scanner;

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
	 * Nombre de joueurs minimum pour débuter une partie.
	 */
	private final static int NB_JOUEURS_MIN = 2;
	
	/**
	 * Nombre de joueurs maximum dans la partie.
	 */
	private final static int NB_JOUEURS_MAX = 6;

	/**
	 * Les joueurs de la partie seront stocké dans un tableau de joueurs.
	 */
	private JoueurClavier[] joueurs;
	
	/**
	 * Nombre de joueurs présents dans la partie (Ayant perdu ou non).
	 */
	private int nbJoueurs;
	
	/**
	 * Représente les cartes de la street (Cartes avec lesquelles un joueur forme son jeu).
	 */
	private Carte[] street;


	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Initialise la partie de poker.
	 */
	
	public Partie ()
	{
		//Initialisation du tableau de joueur :
		this.joueurs = new JoueurClavier[NB_JOUEURS_MAX];
		
		//Initialisation du nombre de joueur :
		this.nbJoueurs = 0;
		
		//Initialisation du tableau représentant la street.
		this.street = new Carte[5];
	}

	/*
	 * Méthodes
	 */
	
	/**
	 * Permet d'ajouter un joueur dans la partie.
	 * @param j : Le nom du joueur à rajouter dans la partie.
	 * @throws NbDeJoueursException : Nombre max de joueurs atteint.
	 */
	public void addJoueur (JoueurClavier j) throws NbDeJoueursException
	{
		// Cas d'erreur : le nombre max de joueurs est atteint.
		if (this.nbJoueurs > NB_JOUEURS_MAX)
			throw new NbDeJoueursException();
		
		// Cas normal : ajout du joueur, incrémentation du nombre de joueur.
		this.joueurs[this.nbJoueurs] = j;
		this.nbJoueurs++;
		
	}

	
	/**
	 * Permet de démarrer la partie de poker.
	 * @throws NbDeJoueursException : Nb de joueurs insuffisant ou trop élevé.
	 * @throws PlusDeCarteException :  
	 */
	public void demarrer() throws NbDeJoueursException, PlusDeCarteException
	{
		// Si le nombre de joueur est insuffisant ou trop élevé, on soulève une exception.
		if ((this.nbJoueurs < NB_JOUEURS_MIN) || (this.nbJoueurs > NB_JOUEURS_MAX))
			throw new NbDeJoueursException();
		
		int nbPerdants = 0;
		int tour;
		
		Paquet paq = new Paquet();
		
		while (nbPerdants != (this.nbJoueurs- 1))
			// Tant qu'il reste au moins deux joueurs, on continue la partie.
		{
			for (int i = 0; i < this.nbJoueurs; i++)
			// On distribue deux cartes a chacun des joueurs qui n'ont pas encore perdu.
			{
				if (this.joueurs[i].getPerdu() == false)
				{
					this.joueurs[i].setCarte(paq.getCarte(), paq.getCarte());
					System.out.println("Le joueur " + this.joueurs[i].getNomJoueur() + " possède les cartes suivantes :\n" +
									   this.joueurs[i].getCarte()[0] + "\n" +
									   this.joueurs[i].getCarte()[1] + "\n");
				}
			}
			
			tour = 0;
			
			while (tour < 4)
			{
				
				if (tour == 0)
				// Pre-flop : aucune carte n'est présente sur la street.
				{
					tourDeMise();
					
					// On réinitialise le nombre de jetons misés entre chaque tour.
					for (int i = 0; i < this.nbJoueurs ; i++)
					{
						this.joueurs[i].reinitialiserNbJetonsMises();
					}
				}
			
				if (tour == 1)
				// Flop : ajout des 3 premières cartes sur la street.
				{
					this.street[0] = paq.getCarte();
					this.street[1] = paq.getCarte();
					this.street[2] = paq.getCarte();
					
					System.out.println("----------------- FLOP -----------------");
					System.out.println(this.street[0]);
					System.out.println(this.street[1]);
					System.out.println(this.street[2]);
					
					System.out.println("-----------------------------------------");
					
					tourDeMise();
					
					// On réinitialise le nombre de jetons misés entre chaque tour.
					for (int i = 0; i < this.nbJoueurs ; i++)
					{
						this.joueurs[i].reinitialiserNbJetonsMises();
					}
				}
				
				if (tour == 2)
				// Turn : ajout de la quatrième carte sur la street.
				{
					this.street[3] = paq.getCarte();
					
					System.out.println("----------------- TURN -----------------");
					System.out.println(this.street[0]);
					System.out.println(this.street[1]);
					System.out.println(this.street[2]);
					System.out.println(this.street[3]);
					
					System.out.println("-----------------------------------------");

					tourDeMise();
					
					// On réinitialise le nombre de jetons misés entre chaque tour.
					for (int i = 0; i < this.nbJoueurs ; i++)
					{
						this.joueurs[i].reinitialiserNbJetonsMises();
					}
				}
				
				if (tour == 3)
				// River : ajout de la cinquième carte sur la street.
				{
					this.street[4] = paq.getCarte();
					
					System.out.println("----------------- RIVER -----------------");
					
					System.out.println(this.street[0]);
					System.out.println(this.street[1]);
					System.out.println(this.street[2]);
					System.out.println(this.street[3]);
					System.out.println(this.street[4]);
					
					System.out.println("-----------------------------------------");
					
					
					tourDeMise();
					
					// On réinitialise le nombre de jetons misés entre chaque tour.
					for (int i = 0; i < this.nbJoueurs ; i++)
					{
						this.joueurs[i].reinitialiserNbJetonsMises();
					}
				}
				
				tour++;
			}
				
			//TODO Répartir le pot.
			System.out.println("Le joueur " + "REMPLACER PAR LE GAGNANT" + " remporte le pot de :" + "REMPLACER PAR LA VALEUR DU POT");
			
			for (int i = 0; i < this.nbJoueurs; i++)
			{
				if (this.joueurs[i].getPerdu() == false)
				// Cas ou le joueur n'a pas encore perdu.
				{
					if (this.joueurs[i].getNbJetons() == 0)
					// Cas ou le joueur n'a plus de jetons.
					{
						this.joueurs[i].setPerdu(true);
						nbPerdants++;
					}
				}
			}
			//TODO Eliminer les joueurs n'ayant plus de jetons + incrémenter le nombre de joueurs ayant perdu.
			// Si après répartition un joueur a 0 jetons, il a perdu.
			
			
			for (int i = 0; i < this.nbJoueurs; i++)
			{
				this.joueurs[i].setChecker(false);
				this.joueurs[i].setCoucher(false);
			}
			
			
			// REINITIALISATION ///////////////////////////////////////////////
			
			// Réinitialisation de l'indice tour.
			tour = 0;
			
			// On réinitialise le paquet de carte.
			paq.reinitialiserCarte();
			
			////////////////////////////////////////////////////////////////////
		}
		
		for (int i = 0; i < this.nbJoueurs; i++)
		{
			if (this.joueurs[i].getPerdu() == false)
			{
				System.out.println("VAINQUEUR : " + this.joueurs[i].getNomJoueur());
			}
		}
			
			
	}
	
	
	
	/**
	 * Correspond à un tour de mise au poker.
	 */
	public void tourDeMise()
	{
	int plusGrosseMise = 10; //TODO A modifier si ajout de small et big blind.
	int pot = 0;
	
	
	boolean misesEgales = false;
	
		while (misesEgales == false)
		{
			misesEgales = true;
			
			for (int j = 0; j < this.nbJoueurs; j++)
			// On parcourt le tableau de joueur pour vérifier si tout les joueurs ont mis la même mise ou non.
			{
				if ((this.joueurs[j].getPerdu() == false) && (this.joueurs[j].getCoucher() == false))
				// On exclue du calcul les joueurs couchés.
				{
					if (this.joueurs[j].getNbJetonsMises() != plusGrosseMise)
					// Si un joueur à une mise différente de la plus grosse mise, le tour continue.
					{
						misesEgales = false;
						
						// TODO Traiter le cas du check (boucle infinie si mise départ = 0).
						
						
						Scanner sc = new Scanner(System.in);
						System.out.println("Il vous reste " + this.joueurs[j].getNbJetons() + " jetons.");
						System.out.println(this.joueurs[j].getNomJoueur() +", quelle action voulez vous réaliser ?\n" +
										   //"	1 - Check" +
										   "	2 - Suivre : miser " + (plusGrosseMise - this.joueurs[j].getNbJetonsMises()) +
										   "	3 - Relancer de 200"+
										   "	4 - Coucher");
						int rep = sc.nextInt();
						
						while (/*rep != "1" &*/ rep != 2 & rep != 3 & rep != 4)
						{
							rep = sc.nextInt();
						}
						
						int ajoutPot = 0;
						
						if (rep == 2)
						{
							ajoutPot = this.joueurs[j].suivre(plusGrosseMise - this.joueurs[j].getNbJetonsMises());
							pot += ajoutPot;
						}
						
						if (rep == 3)
						{
							int relance = 200;
							
							if (plusGrosseMise + relance - this.joueurs[j].getNbJetonsMises() > this.joueurs[j].getNbJetons())
							// Si le joueur n'a pas assez pour relancer, on ajoute ses jetons restants au pots (Il est tapis).
							{
								pot += this.joueurs[j].getNbJetons(); // On ajoute les jetons restant au joueur au pot.
								plusGrosseMise = this.joueurs[j].getNbJetonsMises() + this.joueurs[j].getNbJetons();
								this.joueurs[j].relancer(plusGrosseMise - this.joueurs[j].getNbJetonsMises() + relance);
							}
							else
							{
								ajoutPot = this.joueurs[j].relancer(plusGrosseMise - this.joueurs[j].getNbJetonsMises() + relance);
								plusGrosseMise += relance;
								pot += ajoutPot;	
							}
							
							
							
						}
						
						if (rep == 4)
						{
							this.joueurs[j].setCoucher(true);
						}
						System.out.println("La plus grosse mise est de " + plusGrosseMise);
						System.out.println (this.joueurs[j].getNomJoueur() + " a misé un total de " + this.joueurs[j].getNbJetonsMises() + " jetons et en possède désormais " + this.joueurs[j].getNbJetons());
						System.out.println("Le pot s'élève désormais à " + pot + "\n");
						
					}
					else
					// Cas ou le joueur à une mise égale à la plus grosse mise.
					{
						misesEgales = true;
					}
				}
			}
		}
	}
	
}
