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
	 * @param o : la carte que l'on veut comparer.
	 * @return vrai si la carte et celle placée en paramètre sont identiques, sinon faux.
	 */
	public boolean equals (Object o)
	{	
		if (o instanceof Carte)
		{
			Carte c = (Carte) o;
			return ((this.valeur == c.getValeur()) && (this.couleur == c.getCouleur()));
		}
		return false;
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
		Couleur c = this.getCouleur();
		Valeur v = this.getValeur();
		
		String val = null;
		String coul = null;
		
		String s;
		
		switch (v)
		{
			case DEUX: val = "2";
					break;
			case TROIS: val = "3";
					break;
			case QUATRE: val = "4";
					break;
			case CINQ: val = "5";
					break;
			case SIX: val = "6";
					break;
			case SEPT: val = "7";
					break;
			case HUIT: val = "8";
					break;
			case NEUF: val = "9";
					break;
			case DIX: val = "10";
					break;
			case VALET: val = "J";
					break;
			case DAME: val = "Q";
					break;
			case ROI: val = "K";
					break;
			case AS: val = "A";
					break;
		}
		
		
		switch (c)
		{
			case PIQUE: coul = "♠";
			break;
			case CARREAU: coul = "♦";
			break;
			case COEUR: coul = "♥";
			break;
			case TREFLE: coul = "♣";
			break;
		}
		
		if (val == "10")
		{
			s = 	" _________ \n" +
					"|         |\n" +
					"|"+val+coul+"      |\n" +
					"|         |\n" +
					"|         |\n" +
					"|      "+val+coul+"|\n" +
					"|_________|\n";
		}
		else
		{
			s = 	" _________ \n" +
					"|         |\n" +
					"|"+val+coul+"       |\n" +
					"|         |\n" +
					"|         |\n" +
					"|       "+val+coul+"|\n" +
					"|_________|\n";
		}
		return s;
	}

}
