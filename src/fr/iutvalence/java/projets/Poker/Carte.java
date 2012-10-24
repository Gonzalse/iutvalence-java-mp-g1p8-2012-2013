package fr.iutvalence.java.projets.Poker;

// FIXME (FIXED) respecter la syntaxe JavaDoc, compléter
/**
 * <p>Titre : Carte</p>
 * <p>Description : classe permettant de définir une carte</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class Carte
{
	/**
	 * Une carte est définie par sa valeur.
	 */
	private Valeur valeur;

	/**
	 * Une carte est aussi définie par sa couleur.
	 */
	private Couleur couleur;
	
	// FIXME (FIXED) redéfinir les 4 constantes via une énumération (à discuter)

	
	// FIXME (FIXED) écrire un commentaire
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

	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet d'obtenir la valeur d'une carte.
	 * @return la valeur de la carte.
	 */
	public Valeur getValeur()
	{
		return this.valeur;
	}

	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet d'obtenir la couleur d'une carte.
	 * @return la couleur de la carte.
	 */
	public Couleur getCouleur()
	{
		return this.couleur;
	}

	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet d'attribuer une valeur à une carte.
	 * @param c : valeur que l'on veut donner à la carte.
	 */
	public void setValeur(Valeur v)
	{
		this.valeur = v;
	}

	// FIXME (FIXED) écrire un commentaire
	/**
	 * Permet d'attribuer une couleur à une carte. 
	 * @param c : couleur que l'on veut donner à la carte.
	 */
	public void setCouleur(Couleur c)
	{
		this.couleur = c;
	}


	// FIXME redéfinir equals et hashCode
	// FIXME redéfinir toString
	/**
	 * Permet de comparer deux cartes.
	 * @param c : la carte que l'on veut comparer.
	 * @return vrai si la carte et celle placée en paramètre sont identiques, sinon faux.
	 */
	public boolean equals (Carte c)
	{
		return ((this.valeur == c.getValeur()) && (this.couleur == c.getCouleur()));
	}
	
	public int hashCode ()
	{
		return this.valeur.hashCode()+this.couleur.hashCode();
	}

}
