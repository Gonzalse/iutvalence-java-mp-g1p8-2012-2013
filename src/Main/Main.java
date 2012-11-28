package Main;

import java.util.Scanner;

import fr.iutvalence.java.projets.Poker.*;


public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Partie Poker = new Partie();
		Paquet p = new Paquet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nom :");
		String str = sc.nextLine();

		Joueur j1 = new Joueur(str);
		Joueur j2 = new Joueur("Hicham");
		Poker.addJoueur(j1);
		Poker.addJoueur(j2);
		System.out.println("Le joueur " + j1.getNom() + " possède " + j1.getNbJetons() + " jetons. ");
		System.out.println("Le joueur " + j2.getNom() + " possède " + j2.getNbJetons() + " jetons. ");
		
		

		
		}
		
		
	

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
