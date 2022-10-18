package personnages;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans lam�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
			+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		System.out.println("Merci Druide, je sens que ma force est "+ forcePotion +" fois décuplée. ");
		this.effetPotion = forcePotion;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("asterix est là c'est la bagarre !");
		Romain romain = new Romain("romain",-1);
		asterix.frapper(romain);
		asterix.toString();
	}
}
