package fr.iutvalence.java.projets.Poker;
/**
 * <p>Titre : Donneur</p>
 * <p>Description : classe permettant de définir un donneur</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Donneur
{

	/**
	 * Le nom du donneur par défaut est Javier.
	 */
	private final static String nom_DEFAUT = "Javier";

	
	/*
	 * Attributs
	 */

	/**
	 * Le donneur est identifié par son nom.
	 */
	private final String nomDonneur;

	
	/*
	 * Constructeurs
	 */

	/**
	 * Sans paramètre, on donne un nom par défaut au donneur.
	 */
	public Donneur()
	{
		this.nomDonneur = nom_DEFAUT;
	}

	/**
	 * Le donneur prend le nom placé en paramètre.
	 * 
	 * @param choixNom
	 *            : sert à donner un nom au donneur.
	 */
	public Donneur(String choixNom)
	{
		this.nomDonneur = choixNom;
	}

	/*
	 * Méthodes
	 */

	/**
	 * Renvoi le nom du donneur.
	 */
	// FIXME compléter le commentaire
	public String getNom()
	{
		return this.nomDonneur;
	}
}
