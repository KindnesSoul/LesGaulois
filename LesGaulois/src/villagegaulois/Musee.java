package villagegaulois;
import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private int nbtrophees;
	private Equipement[] musee= new Equipement[200];
	
	
	
	 public void donnerTrophee(Gaulois gaulois, Equipement[] musee) {
		 musee=gaulois.getTrophe();
	 }
	
	 public String faireUneDonnation(Gaulois gaulois , Equipement[] musee ) {
			return("le gaulois"+gaulois.getNom()+"a fais don de"+musee);
		
		
	}
}
