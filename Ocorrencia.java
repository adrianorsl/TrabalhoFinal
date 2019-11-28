import java.util.Date;

/**
 * @author Adriano Zimmermann
 *
 */

public class Ocorrencia   {

	
	private String autor;
	private Date data;
	private TipoOcorrencias tipo;
	private Bairros local;
	
	public Ocorrencia() {	
	}
	
	public Ocorrencia(String autor, Date data, TipoOcorrencias tipo, Bairros local) {
		this.autor = autor;
		
		this.data = data;
		this.tipo = tipo;
		this.local = local;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoOcorrencias getTipo() {
		return tipo;
	}
	public void setTipo(TipoOcorrencias tipo) {
		this.tipo = tipo;
	}
	public Bairros getLocal() {
		return local;
	}
	public void setLocal(Bairros local) {
		this.local = local;
	}
	
	
	
	@Override
	public String toString() {
		return "Ocorrencia [autor=" + autor + ", data=" + data + ", tipo=" + tipo + ", local="
				+ local + "]";
	}


}
