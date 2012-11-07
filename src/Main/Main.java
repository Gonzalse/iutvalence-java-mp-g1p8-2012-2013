package Main;

import fr.iutvalence.java.projets.Poker.Carte;
import fr.iutvalence.java.projets.Poker.Couleur;
import fr.iutvalence.java.projets.Poker.Paquet;
import fr.iutvalence.java.projets.Poker.Partie;
import fr.iutvalence.java.projets.Poker.Pot;
import fr.iutvalence.java.projets.Poker.Valeur;


public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Partie Poker = new Partie(2, 2000);
		
		
		
	}
	/*	Carte C = new Carte(Couleur.TREFLE,Valeur.TROIS);
		Carte D = new Carte(Couleur.CARREAU,Valeur.DAME);
		Carte E = new Carte(Couleur.PIQUE,Valeur.AS);
		System.out.print(C+"\n");
		System.out.print(C.hashCode()+ "\n");
		System.out.print(D.hashCode()+ "\n");
		System.out.print(E.hashCode()+ "\n");
		
		Paquet P = new Paquet();
	
		for(int i = 0; i < 52; i++)
		{
			System.out.print(P.getCarte(i) + "\n");
		}
		
		Pot Po = new Pot();
		{
			System.out.print(Po.nbJetonsPot + "\n");
			Po.augmenterPot(80);
			System.out.print(Po.nbJetonsPot);
		}
	}*/

}
