import java.util.*;


public abstract class Ville {
	
	/** Défense de la vile */
	private int muraille;
	
	/** Quantitée d'or de la ville */
	private int or;
	
	/** Quantitée de nourriture de la ville */
	private int nourriture;
	
	/** Foi de la ville */
	private int foi;
	
	/** Liste des hommes de la ville */
	private LinkedList<Homme> habitants;
	
	/** Position de la ville */
	private Tuple position;
	
	/** Nombre de soldats */
	private int nb_soldat;
	
	/** Nombre de paysans */
	private int nb_paysan;

	/** Nombre de moines */
	private int nb_moine;
	
	/** Pays d'appartenance */
	private Pays pays;
	
	public Ville(int pt_or, int pt_nourriture, int pt_foi, int x, int y, int pt_defense, Pays pays_appartenance) {
		or = pt_or;
		nourriture = pt_nourriture;
		foi = pt_foi;
		position = new Tuple(x,y);
		muraille = pt_defense;
		pays = pays_appartenance;
	}
	
	/** Permet de commercer avec une autre ville pour gagner de l'or */
	public void commerce(Ville ville) {
		
	}
	
	/** Permet d'attaquer une autre ville */
	public void attaquer(Ville ville, int nb_soldat_atk) {
		if (nb_soldat_atk > this.nb_soldat)
		{
			System.err.println("La ville ne peut pas attaquer avec plus de soldats qu'elle n'en possède !");
		}
		if (ville.muraille + ville.nb_soldat < nb_soldat_atk)
		{
			ville.pays = this.pays;
			ville.nb_soldat = nb_soldat_atk - ville.nb_soldat - ville.muraille;
			ville.muraille = 0;
			this.nb_soldat = this.nb_soldat - nb_soldat_atk;
		}
	}
	
	/** La ville produit un nouveau soldat */
	public void nv_soldat() {
		habitants.add(new Homme(5, 5, 5, 'S')); /** STATISTIQUES A DETERMINER ! */
		nb_soldat++;
	}
	
	/** La ville produit un nouveau paysan */
	public void nv_paysan() {
		habitants.add(new Homme(5, 5, 5, 'P')); /** STATISTIQUES A DETERMINER ! */
		nb_paysan++;
	}
	
	/** La ville produit un nouveau moine */
	public void nv_moine() {
		habitants.add(new Homme(5, 5, 5, 'M')); /** STATISTIQUES A DETERMINER ! */
		nb_moine++;
	}
	
	/** La ville augmente ses défenses */
	public void up_muraille() {
		muraille++;
	}
	
	
}
