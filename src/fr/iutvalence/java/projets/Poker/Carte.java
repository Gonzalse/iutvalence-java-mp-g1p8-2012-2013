package fr.iutvalence.java.projets.Poker;

// FIXME respecter la syntaxe JavaDoc, compléter
/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Carte {
	
	/*
	 * Attributs
	 */
	
	// FIXME (FIXED) un commentaire par attribut
	// FIXME (FIXED) ne pas utiliser String pour le type des constantes
    /**
     * Une carte est définie par sa valeur.
     */
	private int valeur;
	
	/**
	 * Une carte est aussi définie par sa couleur.
	 */
	private int couleur;
	
	// FIXME (FIXED) un commentaire par définition
	// FIXME (FIXED) définir de vraies constantes
	// FIXME (FIXED) ne pas utiliser String pour le type des constantes
	/**
	 * On définit la couleur carreau en lui associant l'entier 0.
	 */
	private final static int CARREAU = 0;
	
	/**
	 * On définit la couleur trèfle en lui associant l'entier 1.
	 */
    private final static int TREFLE = 1;
    
    /**
     * On définit la couleur coeur en lui associant l'entier 2.
     */
    private final static int COEUR = 2;
    
    /**
     * On définit la couleur pique en lui associant l'entier 3.
     */
    private final static int PIQUE = 3;
	
	// FIXME (FIXED)un commentaire par définition
	// FIXME (FIXED) définir de vraies constantes
	// FIXME (FIXED) ne pas utiliser String pour le type des constantes
    /**
     * On définit la valeur deux en lui associant l'entier 2.
     */
    private final static int DEUX = 2;
    
    /**
     * On définit la valeur trois en lui associant l'entier 3.
     */
    private final static int TROIS = 3;
    
    /**
     * On définit la valeur quatre en lui associant l'entier 4.
     */
    private final static int QUATRE = 4;
    
    /**
     * On définit la valeur cinq en lui associant l'entier 5.
     */
    private final static int CINQ = 5;
    
    /**
     * On définit la valeur six en lui associant l'entier 6.
     */
    private final static int SIX = 6;
    
    /**
     * On définit la valeur sept en lui associant l'entier 7.
     */
    private final static int SEPT = 7;
    
    /**
     * On définit la valeur huit en lui associant l'entier 8.
     */
    private final static int HUIT = 8;
    
    /**
     * On définit la valeur neuf en lui associant l'entier 9.
     */
    private final static int NEUF = 9;
    
    /**
     * On définit la valeur dix en lui associant l'entier 10.
     */
    private final static int DIX = 10;
    
    /**
     * On définit la valeur valet en lui associant l'entier 11.
     */
    private final static int VALET = 11;
    
    /**
     * On définit la valeur dame en lui associant l'entier 12.
     */
    private final static int DAME = 12;
    
    /**
     * On définit la valeur roi en lui associant l'entier 13.
     */
    private final static int ROI = 13;
    
    /**
     * On définit la valeur as en lui associant l'entier 14.
     */
    private final static int AS = 14;
	
	
	
	/*
	 * Constructeurs
	 */
	
	public Carte (couleur c, valeur v)
	{
		this.valeur = v;
		this.couleur = c;
	}
	
	
	/*
	 * Méthodes
	 */
	
	public String getValeur()
	{
		return this.valeur;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public void setValeur(String c)
	{
		this.valeur = c;
	}
	
	public void setCouleur(String c)
	{
		this.couleur = c;
	}
	
}
