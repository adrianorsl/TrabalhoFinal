import java.util.Arrays;
import java.util.Random;

/**
 * @author Adriano Zimmermann
 *
 */

public class Gerador {
	
    private int numero;
	private int quantasOcor;
	int[] tiposOcor;
	int a;
	public int hom = 0;
	int fem = 0;
	int ass = 0;
	int fur = 0;
	int acidenteT = 0;
	int mariaP = 0;
	int viasDeF = 0;

	public int quantasOcor() {
		Random gerador = new Random();
		a = gerador.nextInt(60) + 30;
		return quantasOcor = a;
	}
	
	public int numero() {
		tiposOcor = new int[a];
		Random gerador = new Random();
		for (int i = 0; i < a; i ++) {
		
			tiposOcor[i] = gerador.nextInt(17) + 1;	
		}
		
		for(int i = 0; i < a; i++) {
			switch (tiposOcor[i]) {
			  case 1:
				  hom += 1;
				  break;
			  case 2:
				  fem += 1;
				  break;
			  case 3:
				  ass += 1;
				  break;
			  case 4:
				  ass += 1;
				  break;
			  case 5:
				  fur += 1;
				  break;
			  case 6:
				  fur += 1;
				  break;
			  case 7:
				  fur += 1;
				  break;
			  case 8:
				  fur += 1;
				  break;
			  case 9:
				  acidenteT += 1;
				  break;  
			  case 10:
				  acidenteT += 1;
				  break;  
			  case 11:
				  acidenteT += 1;
				  break;  
			  case 12:
				  acidenteT += 1;
				  break;
			  case 13:
				  acidenteT += 1;
				  break;
			  case 14:
				  mariaP += 1;
				  break; 
			  case 15:
				  mariaP += 1;
				  break;
			  case 16:
				  viasDeF += 1;
				  break;
			  case 17:
				  viasDeF += 1;
				  break; 	  
			}	
		}
		
		return numero;
	}
	
	
	
	public int getQuantasOcor() {
		return quantasOcor;
	}
	public void setQuantasOcor(int quantasOcor) {
		this.quantasOcor = quantasOcor;
	}
	public int[] getTiposOcor() {
		return tiposOcor;
	}

	public void setTiposOcor(int[] tiposOcor) {
		this.tiposOcor = tiposOcor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Gerador [Quantas Ocorrencias=" + quantasOcor() + ", Numero Ocorrencias=" + numero() + ", tiposOcor="
				+ Arrays.toString(tiposOcor) + ", hom=" + hom + ", fem=" + fem + ", ass=" + ass + ", fur="
				+ fur + ", acidenteT=" + acidenteT + ", mariaP=" + mariaP + ", viasDeF=" + viasDeF + "]";
	}

	
	
	
	
}
