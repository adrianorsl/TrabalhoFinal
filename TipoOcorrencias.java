
public enum TipoOcorrencias {

	Homicídio ("Homicídio"),
	Feminicídio ("Feminicídio"),
	Assalto ("Assalto"),
	Furto ("Furto"),
	AcidentesDeTrânsito ("Acidentes De Trânsito"),
	MariaDaPenha ("Maria da Penha"),
	ViasDeFato ("Vias de Fato");
	
	private String descrição;
	
	TipoOcorrencias(String descrição){
		this.descrição = descrição;
	}
	
	public String getDescrição() {
		return descrição; 
	}
	
	
}
