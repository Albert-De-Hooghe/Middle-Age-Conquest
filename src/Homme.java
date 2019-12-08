
public class Homme {
	
	/** Point de vie */ 
	private int vie;
	
	/** Point d'attaque */
	private int attaque;
	
	/** Tics sans nouriture avant perte de vie */
	private int reserve;
	
	
	/** Donne le type d'homme (soldat, paysan, moine) */
	private char type;
	
	
	public Homme(int pt_vie, int pt_attaque, int pt_reserve, char fonction) {
		vie = pt_vie; 
		attaque = pt_attaque;
		reserve = pt_reserve;
		type = fonction;
	}

}
