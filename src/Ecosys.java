
import java.util.*;
import java.lang.Math;

public class Ecosys {
	public LinkedList<Ville> villes;// STATIC VRAIMENT NEGRO
	Pays pays1;
	Pays pays2;
	Pays pays3;
	Pays pays4;
	
	
	
	int nbTours;
	
	public static Random alea = new Random();
	
	public Ecosys(int nbvilles, int tours, int xMax, int yMax) {
		nbTours = tours;
		villes = new LinkedList<Ville>() ;
		char [] tableauLettres = {'F','A','E','O'};
		
		for (int i = 0 ; i < nbvilles ; i++) {
			int x = alea.nextInt(xMax);
			int y = alea.nextInt(yMax);
			int z =  alea.nextInt(tableauLettres.length);
			char zi = tableauLettres[z];
			
			villes.add(new Ville(100,100,100,x,y,zi));
			
		}
	}
	
	public void simuleUnTour() {
		
		for (Ville ville : villes  ) {
			ville.nv_paysan();
			ville.or += 5;
			commerce(ville);
			ville.nourriture -=  (ville.nb_paysan + ville.nb_moine + ville.nb_soldat);
			//villes.add(new Ville(100,100,100,0,200,'F'));
			
			System.out.println(ville.pays);
			System.out.println(ville.or);
			
			
			
	
			
			
		}
	
	}


	/** Permet de commercer avec une autre ville pour gagner de l'or */
	public void commerce(Ville ville) {
		for (Ville voisine : villes  ) {
			if (voisine.pays == (ville.pays) & (Math.abs(voisine.position.x - ville.position.x) < 3) & (Math.abs(voisine.position.y - ville.position.y)<3) & voisine.position != ville.position){
				ville.or += 2;
			}
			
		}
		
	}
	
	
	
	public void main() {
		for (int i = 0 ; i < nbTours ; i++) {
			simuleUnTour();
			System.out.println(villes);
		//Fenetre.start(villes);
		}
	}

	
	

}
