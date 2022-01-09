package departement;

import java.util.Observable;
public class Demande extends Observable{
	private Departement departement;
	private Long Montant;
	private String Etat;
	
	public Long getMontant() {
		return Montant;
	}
	public void setMontant(Long montant) {
		Montant = montant;
		notifierObservateurs();
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
		notifierObservateurs();
	}
	public Demande(Long montant, String etat) {
		super();
		Montant = montant;
		Etat = etat;
	}
	
	public Demande(Departement departement, Long montant, String etat) {
		super();
		this.departement = departement;
		Montant = montant;
		Etat = etat;
	}
	public void notifierObservateurs() {
		setChanged();
		notifyObservers();
		
		
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	

	

}
