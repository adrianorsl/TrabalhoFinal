
public enum TipoOcorrencias {

	Homic�dio ("Homic�dio"),
	Feminic�dio ("Feminic�dio"),
	Assalto ("Assalto"),
	Furto ("Furto"),
	AcidentesDeTr�nsito ("Acidentes De Tr�nsito"),
	MariaDaPenha ("Maria da Penha"),
	ViasDeFato ("Vias de Fato");
	
	private String descri��o;
	
	TipoOcorrencias(String descri��o){
		this.descri��o = descri��o;
	}
	
	public String getDescri��o() {
		return descri��o; 
	}
	
	
}
