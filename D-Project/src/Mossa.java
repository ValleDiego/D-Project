
public class Mossa {
	
	private String nomeMossa;
	
	private String tipo;
	
	private String stato;
	
	private int danno;
	private int precisione;
	
	
	private int scottatura;
	
	
	public Mossa( String nomeMossa, String tipo, String stato, int danno, int precisione, int scottatura) {
		this.nomeMossa = nomeMossa;
		this.tipo = tipo;
		this.stato = stato;
		this.danno = danno;
		this.precisione = precisione;
		this.scottatura = scottatura;
	}
	
	
	public String getNomeMossa() {
		return nomeMossa;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getStato() {
		return stato;
	}
	public int getDanno() {
		return danno;
	}
	public int getPrecisione() {
		return precisione;
	}
	public int getScottatura() {
		return scottatura;
	}
	

}
