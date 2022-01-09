package handler;
import departement.Demande;

public class ServiceComptable extends Handler {

	@Override
	public void TraiterCommande(Demande demande) {
		Long budget=demande.getDepartement().getBudget().getBudgetGlobal();
		if(demande.getMontant()<budget) {
			demande.setEtat("traited");
			nextHandler.TraiterCommande(demande);
		}
		else {
			demande.setEtat("nonTraited");
		}
	}

}
