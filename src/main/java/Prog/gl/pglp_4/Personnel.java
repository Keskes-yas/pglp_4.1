package Prog.gl.pglp_4;


import java.time.LocalDate;



import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Personnel  implements InterfacePersonnel{

	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate dateNaissance;
	private final ArrayList<Integer> numerosTelephone;
	
	public static class PersonnelBuilder {
		
		// Requis
		private final String nom;
		private final String prenom;
		private final String fonction;
		
		// Optionnel
		private LocalDate dateNaissance = null;
		private ArrayList<Integer> numerosTelephone = new ArrayList<Integer>();
		
		public PersonnelBuilder(String nom, String prenom, String fonction) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonction = fonction;
		}
		
		public PersonnelBuilder dateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
			return this;
		}
		
		public PersonnelBuilder addNumeroTelephone(Integer numeroTelephone) {
			this.numerosTelephone.add(numeroTelephone);
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(PersonnelBuilder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		dateNaissance = builder.dateNaissance;
		numerosTelephone = builder.numerosTelephone;
	}

	


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public String getFonction() {
		return fonction;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public List<Integer> getNumerosTelephone() {
		return numerosTelephone;
	}




	public void print() {
		System.out.println("Nom :"+  nom + "Prenom : " + prenom + "fonction : " + fonction);
		
	}
	
	
	
	
	


}

