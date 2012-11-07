package fr.iutvalence.java.projets.Poker;

import fr.iutvalence.java.projets.Poker.Carte;

/**
 * <p>Titre : Paquet</p>
 * <p>Description : Classe permettant de créer un paquet de carte.</p>
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
	private Carte[] PaquetDeCarte = new Carte[52];
	
	
	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Initialisation du tableau de carte pour que celui-ci contiennent les 52 cartes.
	 */
	public Paquet()
	{
		int indiceTableau = 0;
		
		for(int i = 0; i <= 3; i++)
		{
			for (int j = 0; j <= 12; j++)
			{
				this.PaquetDeCarte[indiceTableau++] = new Carte (Couleur.values()[i], Valeur.values()[j]);
			}
			
		}
	}
	
	
	
	/*
	 * Méthodes
	 */
	
	/**
	 * @param indice : Un indice du tableau paquetDeCarte.
	 * @return : Une Carte.
	 */
	public Carte getCarte(int indice)
	{
		return (this.PaquetDeCarte[indice]);
	}
}
