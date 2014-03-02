package browserautomation.impl;

public enum EnumOperation {
	
	OUVRIR_NAVIGATEUR ("OUVRIR_NAVIGATEUR"),
	GO_TOURL("GO_TOURL"),
	ECRIRE ("ECRIRE"),
	LANCER_RECHERCHE ("LANCER_RECHERCHE");
	
	private EnumOperation(String n) {
		this.name = n;
	}
	
	private String name;
	
	String getName(){
		return name;
	}
}
