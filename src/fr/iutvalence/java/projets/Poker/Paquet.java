package fr.iutvalence.java.projets.Poker;

import java.util.Random;

import fr.iutvalence.java.projets.Poker.Carte;

/**
 * <p>Titre : Paquet</p>
 * <p>Description : Classe permettant de créer un paquet de carte.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Paquet
{
	
	
	public class PlusDeCarteException extends Exception {}
	/*
	 * Attributs
	 */
	
	/**
	 * Tableau représentant les 52 cartes.
	 */
	private Carte[] PaquetDeCarte = new Carte[52];
	
	// TODO Mettre un com'
	/**
	 *
	 */
	private boolean[] CartePrésentes = new boolean[52];
	
	/**
	 * Représente le nombre de cartes qui ont été tirées du paquet.
	 */
	private int CartesTirées;
	
	/**
	 * A la création du paquet, toute les cartes sont présentes.
	 */
	private final static int CartesTirées_DEFAUT = 0; 
			
	//NbCartesPaquet
	
	
	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Initialisation du tableau de carte pour que celui-ci contiennent les 52 cartes.
	 */
	public Paquet()
	{
		this.CartesTirées = this.CartesTirées_DEFAUT;
		int indiceTableau = 0;
		
		for(int i = 0; i <= 3; i++)
		{
			for (int j = 0; j <= 12; j++)
			{
				this.PaquetDeCarte[indiceTableau++] = new Carte (Couleur.values()[i], Valeur.values()[j]);
			}
			
		}
		
		for (int i = 0; i <= 51; i++)
		{
			this.CartePrésentes[i] = true;
		}
	}
	
	
	
	/*
	 * Méthodes
	 */
	
	/**
	 * Retourne une carte aléatoire dans le tableau, et met a jour le tableau de booléen.
	 * @return : Une Carte.
	 */
	public Carte getCarte() throws PlusDeCarteException;
	{
		if (this.CartesTirées < 52)
		{
			int valeur;
			
			do {
				Random r = new Random();
				valeur = r.nextInt(52);
			} while (this.CartePrésentes[valeur] == false);
			
			this.CartePrésentes[valeur] = false;
			
			return (this.PaquetDeCarte[valeur]);
		}
		else
		{
			throws new PlusDeCarteException();
		}
	}
}
