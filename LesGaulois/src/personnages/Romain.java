package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[2] equipement;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement)
        case 0: {
            nbEquipements++;
            System.out.println("le soldat "+Romain.getNom()+" s'equipe avec un "+equipement);
            equipements[0] = equipement
            break;}
        }
        case 1:{
        	if (equipements[0] == equipement || equipements[1] == equipement) {
                System.out.println("le soldat "+Romain.getNom()+" a déjà un "+equipement);
            }
            else {
            	if (nbEquipements != 2) {
                    if (equipements[0]==null)
                        equipements[0] = equipement;
                    else
                        equipements[1] = equipement;
                    nbEquipements++;
                    System.out.println("le soldat "+Romain.getNom()+" s'equipe avec un "+equipement);
            break;}
        case 2:
        	 System.out.println("le soldat "+Romain.getNom()+" est déjà bien protégé");
             break;
        }
    }

	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
	}
	}
	public static void main(String[] args) {
		Romain romain = new Romain("romain",1);
		romain.parler("Je suis ROMAIN");
		romain.recevoirCoup(2);
	}
}