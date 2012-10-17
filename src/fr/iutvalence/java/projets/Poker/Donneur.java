package fr.iutvalence.java.projets.Poker;

/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Donneur {
	
	/*
	 * Attributs
	 */
	
	/**
	 * Le donneur est identifié par son nom.
	 */
	private final String nomDonneur;
	
	/**
	 * Le nom du donneur par défaut est Javier.
	 */
	private final static String nom_DEFAUT = "Javier";
	
	
	
	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Sans paramètre, on donne un nom par défaut au donneur.
	 */
	public Donneur ()
	{
		this.nomDonneur = nom_DEFAUT;
	}
	
	// FIXME (FIXED) autre constructeur ?
	/**
	 * Le donneur prend le nom placé en paramètre.
	 * @param choixNom : sert à donner un nom au donneur.
	 */
	public Donneur (String choixNom)
	{
		this.nomDonneur = choixNom;
	}
	// FIXME (FIXED) méthodes ?
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
