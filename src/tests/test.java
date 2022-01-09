package tests;

import departement.Budget;
import departement.Demande;
import departement.Departement;
import handler.Handler;
import handler.ServiceComptable;
import handler.ServiceGestionPatrimoine;

public class test {

		public static void main(String[] args) {
		Budget budget= new Budget(9000L,0L);
		Departement departement = new Departement(budget);
		Demande demande = new Demande(departement,1500L,"traited");

		  Handler serviceComptable = new ServiceComptable();
		  Handler serviceGestionPatrimoine = new ServiceGestionPatrimoine();
		          
		  serviceComptable.setNextHandler(serviceGestionPatrimoine);
		          
		  serviceComptable.TraiterCommande(demande);
		}
		}



