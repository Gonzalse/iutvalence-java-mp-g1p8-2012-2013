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
     * Une carte est définie par sa valeur ainsi que sa couleur.
     */
    private String couleur;
	private String valeur;
	
	/**
	 * On énumère les 4 couleurs des cartes :
	 */
	private static String CARREAU = "CARREAU";
    private static String TREFLE = "TREFLE";
    private static String COEUR = "COEUR";
    private static String PIQUE = "PIQUE";
	
    /**
     * On énumère les différentes valeurs des cartes :
     */
    private static String DEUX = "DEUX";
    private static String TROIS = "TROIS";
    private static String QUATRE = "QUATRE";
    private static String CINQ = "CINQ";
    private static String SIX = "SIX";
    private static String SEPT = "SEPT";
    private static String HUIT = "HUIT";
    private static String NEUF = "NEUF";
    private static String DIX = "DIX";
    private static String VALET = "VALET";
    private static String DAME = "DAME";
    private static String ROI = "ROI";
    private static String AS = "AS";
	
	
	
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
