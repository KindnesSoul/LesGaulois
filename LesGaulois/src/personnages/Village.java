package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];}
	
	public void ajouterHabitant(Gaulois leNouveau) {
		if (nbVillageois<villageois.length) {
			villageois[nbVillageois++];
		}
	}
	public void trouverHabitant(int num) {
		if num <villageois.length{
			return villageois[num];}
		}
	
	public void setChef(Chef chef) {
		this.chef = chef;}
	public void afficherVillageois(villageois) {
		System.out.println(" Dans le village de  " + Chef.getNom()+"il y a les villageois :");
		for (int i=0;i<villageois.lenght;i++) {
			System.out.println(villageois[i].getNom());
			}
	}
	
	
	public String getNom() {
		return nom; }
}
public static void main(String[] args) {
	Village village = new Village("Village des Irréductibles",30);
	/// Gaulois gaulois = village.trouverHabitant(30);///
	Gaulois asterix = new Gaulois("asterix",8);
	Gaulois obelix = new Gaulois("obelix",25);
	Chef chef = new Chef("Abraracourcix",6,village);
	ajouterHabitant(asterix);
	ajouterHabitant(set);
	ajouterHabitant(obelix);
	///Gaulois gaulois = village.trouverHabitant(1);///
	///System.out.println(gaulois);///
}