package fr.iutvalence.java.projets.Poker;

/**
 * <p>Titre : PlusDeCarteException</p>
 * <p>Description : Exception - Toutes les cartes ont été tirées.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class PlusDeCarteException extends Exception
{


	public PlusDeCarteException()
	{
		super();
	}

		
	public PlusDeCarteException(String message)
	{
		super(message);
	}

}
