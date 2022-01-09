package departement;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Budget implements Observer {
	private Long budgetGlobal;
	private Long Blocked;

	public Budget(Long budgetGlobal, Long blocked) {
		super();
		this.budgetGlobal = budgetGlobal;
		Blocked = blocked;
	}

	public Long getBudgetGlobal() {
		return budgetGlobal;
	}

	public void setBudgetGlobal(Long budgetGlobal) {
		this.budgetGlobal = budgetGlobal;
	}

	public Long getBlocked() {
		return Blocked;
	}

	public void setBlocked(Long blocked) {
		Blocked = blocked;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Demande) {
			Demande d=(Demande) o;
			if(d.getEtat()=="traited") {
					Blocked=d.getMontant();
			}else if(d.getEtat()=="Terminer") {
				Blocked=0L;
			}
			
			affiche(Blocked);

	}}

	private Long affiche(Long blocked) {
		return blocked;
		// TODO Auto-generated method stub
		
	}

}
