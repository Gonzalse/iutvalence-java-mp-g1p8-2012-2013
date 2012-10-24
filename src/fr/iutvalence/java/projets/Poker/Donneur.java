package fr.iutvalence.java.projets.Poker;
//FIXME respecter la syntaxe JavaDoc, compléter
/*
 * @author Hicham & Gonza
 * @version 1 
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
	public String getNom()
	{
		return this.nomDonneur;
	}
}
