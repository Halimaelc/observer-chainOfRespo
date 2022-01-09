package handler;

import departement.Demande;

public class ServiceGestionPatrimoine extends Handler{

	@Override
	public void TraiterCommande(Demande demande) {
		Long budget=demande.getDepartement().getBudget().getBudgetGlobal();
		if(demande.getEtat()=="traited") {
			budget=budget-demande.getMontant();
			demande.setEtat("Terminer");
			System.out.println("terminer");
		}else if(demande.getEtat()=="nonTraited") {
			System.out.println("le montant demandee depasse le budget ");
		}
	}
}
