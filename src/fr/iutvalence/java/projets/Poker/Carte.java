package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : Carte</p>
 * <p>Description : classe permettant de définir une carte.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Carte
{
	
	/*
	 * Attributs
	 */
	
	/**
	 * Une carte est définie par sa valeur.
	 */
	private final Valeur valeur;

	/**
	 * Une carte est aussi définie par sa couleur.
	 */
	private final Couleur couleur;
	

	
	/*
	 * Constructeurs
	 */
	
	/**
	 * Permet de créer une carte en indiquant sa couleur et sa valeur.
	 * @param c : couleur de la carte.
	 * @param v : valeur de la carte.
	 */
	public Carte(Couleur c, Valeur v)
	{
		this.valeur = v;
		this.couleur = c;
	}

	
	
	/*
	 * Méthodes
	 */
	
	/**
	 * Permet d'obtenir la valeur d'une carte.
	 * @return la valeur de la carte.
	 */
	public Valeur getValeur()
	{
		return this.valeur;
	}

	/**
	 * Permet d'obtenir la couleur d'une carte.
	 * @return la couleur de la carte.
	 */
	public Couleur getCouleur()
	{
		return this.couleur;
	}


	/**
	 * Permet de comparer deux cartes.
	 * @param c : la carte que l'on veut comparer.
	 * @return vrai si la carte et celle placée en paramètre sont identiques, sinon faux.
	 */
	public boolean equals (Object c)
	{
		return ((this.valeur == c.getValeur()) && (this.couleur == c.getCouleur()));
	}
	
	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode ()
	{
		return this.valeur.hashCode()+this.couleur.hashCode();
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Valeur : " + this.valeur + " Couleur : " + this.couleur;
	}

}
