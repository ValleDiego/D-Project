
public class Pokemon {
	
	private String nome;
	
	private String tipo1;
	private String tipo2;
	
	private int hp;
	private int atk;
	private int def;
	private int spatk;
	private int spdef;
	private int spe;
	
	private String mossa1;
	private String mossa2;
	private String mossa3;
	private String mossa4;
	
	public Pokemon(String nome, String tipo1, String tipo2, int hp, int atk, int def, int spatk, int spdef, int spe,
			String mossa1, String mossa2, String mossa3, String mossa4) {
		this.nome = nome;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.hp=hp;
		this.atk = atk;
		this.def = def;
		this.spatk = spatk;
		this.spdef = spdef;
		this.spe = spe;
		this.mossa1 = mossa1;
		this.mossa2 = mossa2;
		this.mossa3 = mossa3;
		this.mossa4 = mossa4;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo1() {
		return tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}
	
	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpatk() {
		return spatk;
	}

	public int getSpdef() {
		return spdef;
	}

	public int getSpe() {
		return spe;
	}

	public String getMossa1() {
		return mossa1;
	}

	public String getMossa2() {
		return mossa2;
	}

	public String getMossa3() {
		return mossa3;
	}

	public String getMossa4() {
		return mossa4;
	}
	
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void descriviti() {
		System.out.println(nome+": "+tipo1+"-"+tipo2);
		System.out.println(mossa1);
		System.out.println(mossa2);
		System.out.println(mossa3);
		System.out.println(mossa4);
		System.out.println(" ");
	}
	
	

}
/*da 66 a 56, ovvero da 93 a 103
 * Empoleon 159
 * 
 * 99
 * 95
 * 102
 * 95
 * 99
 * 95
 * 101
 * 101
 * 
 * mentre
 * 61.5 e 52.275000000000006
 * 62 e 52, ovvero da 97 e 107
 * 
 * risultato: il mio codice è sbagliato di poco nella formula, le stat dovrebbero essere giuste
 * 
 * CASO H DECIDUYE
 * 3.0 e 2.55
 * ma esce 2.0
 *da calcolatrice 39.63 e 33.69
 *
 *
 *CREDO DI AVERE CAPITO
 *considera la divisione 115/121 0 *LAVORACI */
