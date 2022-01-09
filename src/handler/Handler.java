package handler;

import departement.Demande;

public abstract class Handler {
	
	public abstract void TraiterCommande(Demande demande);
	protected Handler nextHandler;
	public Handler getNextHandler() {
		return nextHandler;
	}
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	

}
