package fr.iutvalence.java.projets.Poker;

/*
 * @author Hicham & Gonza
 * @version 1 
 */

public class Carte {
	
	/*
	 * Attributs
	 */
	
	/**
	 * On énumère les 4 couleurs des cartes :
	 */
	private static String CARREAU = "CARREAU";
    private static String TREFLE = "TREFLE";
    private static String COEUR = "COEUR";
    private static String PIQUE = "PIQUE";
	
    /**
     * Une carte est définie par sa valeur ainsi que sa couleur.
     */
    private String couleur;
	private String valeur;
	
	
	
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
	
	
	
	
}
