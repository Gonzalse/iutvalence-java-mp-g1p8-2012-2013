package Main;

import fr.iutvalence.java.projets.Poker.*;

/**
 * <p>Titre : TestPaquet</p>
 * <p>Description : Classe de tests pour la classe Paquet.</p>
 * @author Gonzalez Aftiss
 * @version 1.0
 */

public class TestPaquet
{

	
	/**
	 * Programme permettant de tester les exceptions de la classe paquet.
	 * @param args : Arguments.
	 */
	public static void main(String[] args)
	{
		Paquet p = new Paquet();
		for (int i = 0; i < 53; i++)
		{
			try
			{
				Carte a = p.getCarte();
				System.out.println(a);
			}
			catch (PlusDeCarteException e) {
				System.out.println("Toutes les cartes ont été tirées !");
			}
		}
	}

}
