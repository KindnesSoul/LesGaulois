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
		return villageois[num];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;}
	
	public String getNom() {
		return nom; }
}
