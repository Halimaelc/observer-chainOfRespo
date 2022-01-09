package departement;

public class Departement {
	long id;
	Budget budget;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Departement(long id, Budget budget) {
		super();
		this.id = id;
		this.budget = budget;
	}

	public Departement(Budget budget) {
		super();
		this.budget = budget;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	
	/*
	 * public void acheter(Demande demande , int Montant, Budget budget) {
	 * 
	 * 
	 * }
	 */
}
