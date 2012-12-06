package fr.iutvalence.java.projets.Poker;

import java.util.Random;

import fr.iutvalence.java.projets.Poker.Carte;

/**
 * <p>
 * Titre : Paquet
 * </p>
 * <p>
 * Description : Classe permettant de créer un paquet de carte.
 * </p>
 * 
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Paquet
{

	/*
	 * Attributs
	 */

	/**
	 * Tableau représentant les 52 cartes.
	 */
	private Carte[] paquetDeCarte = new Carte[52];

	// TODO Mettre un com'
	/**
	 *
	 */
	private boolean[] cartePresentes = new boolean[52];

	/**
	 * Représente le nombre de cartes qui ont été tirées du paquet.
	 */
	private int nbCartesTirees;

	
	// NbCartesPaquet

	/*
	 * Constructeurs
	 */

	/**
	 * Initialisation du tableau de carte pour que celui-ci contiennent les 52 cartes.
	 */
	public Paquet()
	{
		this.nbCartesTirees = 0;

		for (int i = 0; i <= 3; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				this.paquetDeCarte[(i*13)+j] = new Carte(Couleur.values()[i], Valeur.values()[j]);
				this.cartePresentes[(i*13)+j] = true;
			}

		}
	}

	/*
	 * Méthodes
	 */

	/**
	 * Retourne une carte aléatoire dans le tableau, et met a jour le tableau de booléen.
	 * @return : Une Carte.
	 * @throws PlusDeCarteException : Toutes les cartes ont été tirées.
	 */
	public Carte getCarte() throws PlusDeCarteException
	{

		if (this.nbCartesTirees == 52)
			throw new PlusDeCarteException();
		
		int valeur;
		do
		{
			Random r = new Random();
			valeur = r.nextInt(52);
		}
		while (this.cartePresentes[valeur] == false);

		this.cartePresentes[valeur] = false;
		this.nbCartesTirees++;

		return (this.paquetDeCarte[valeur]);

	}
	
	
	/**
	 * On considère que les cartes sont remises dans le paquet.
	 */
	public void reinitialiserCarte()
	{
		this.nbCartesTirees = 0;
		
		for (int i = 0; i < 52; i++)
		{
			this.cartePresentes[i] = true;
		}
	}
}
