import java.io.InputStream;
import java.util.Scanner;
import java.util.TreeMap;

//23/02/20
public class Battle {

//	TreeMap<String, Pokemon> mPoke = new TreeMap<String, Pokemon>();
//	Pokemon p = new Pokemon("af","a","a",1,1,1,1,1,"a","a","a","a");
//	mPoke.put(p.getNome(),p);

	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("D-BATTLE POKEMON");
		System.out.println("-----------------");
		
//		int dom =0;
//		dom =(((((2*50)/5)+2)*90*(115/121))/50)+2;
//		int dom2 = 0;
//		//dom2 = dom*0.85*1.5;
//		System.out.println(dom+"  e "+dom2);
//		
//		double pol = 0;
//		double polmin= 0.5;
//		double polmax = 0.5;
//		for(int i=0; i<10000; i++) {
//			pol = Math.random()*1.1;
//			if(pol<polmin)
//				polmin = pol;
//			if(pol>polmax)
//				polmax = pol;
//		}
//		System.out.println(polmin+" -- "+polmax);
		
		

		TreeMap<String, Pokemon> mPoke = new TreeMap<String, Pokemon>();
		
		TreeMap<String, Mossa> mMosse = new TreeMap<String, Mossa>();

		TreeMap<String, Pokemon> mSquad1 = new TreeMap<String, Pokemon>();
		TreeMap<String, Pokemon> mSquad2 = new TreeMap<String, Pokemon>();//per i pokemon ho deciso che iv a 31 ecc attk, e no evs

		Pokemon p = new Pokemon("EMPOLEON", "Acqua", "Acciaio", 159, 91, 108, 131, 121, 80, "Idrovampata", "Raggio_d'Acciaio",
				"Geloraggio", "Sbadiglio");
		mPoke.put(p.getNome(), p);
		p = new Pokemon("CHARIZARD", "Fuoco", "Volante", 153, 89, 98, 129, 105, 120, "Lanciafiamme", "Eterelama",
				"Focalcolpo", "Solaraggio");
		mPoke.put(p.getNome(), p);
		p = new Pokemon("KURINOKI", "Erba", "Lotta", 163, 132, 100, 115, 115, 80, "Triplodardo", "Fendifoglia",
				"Baldeali", "Protezione");
		mPoke.put(p.getNome(), p);
		
		
		Mossa m = new Mossa("Lanciafiamme", "Fuoco", "speciale", 90, 100, 10);
		mMosse.put(m.getNomeMossa(), m);

		m = new Mossa("Idrovampata", "Acqua", "speciale", 80, 100, 30);
		mMosse.put(m.getNomeMossa(), m);
		
		m = new Mossa("Raggio_d'Acciaio", "Acciaio", "speciale", 140, 95, 0);
		mMosse.put(m.getNomeMossa(), m);
		
		m = new Mossa("Fendifoglia", "Erba", "fisico", 90, 100, 0);
		mMosse.put(m.getNomeMossa(), m);
		
//		Pokemon s = mPoke.get("EMPOLEON");
//		s.descriviti();
//		s = mPoke.get("CHARIZARD");
//		s.descriviti();

		// Generale g = new Generale();

		System.out.println("GIOCATORE 1: Scegli un pokemon");
		Scanner input = new Scanner(System.in);
		String po1 = input.next();
		System.out.println("Hai scelto " + po1);
		Pokemon p1 = mPoke.get(po1);
		System.out.println("");
		p1.descriviti();
		mSquad1.put(p1.getNome(),p1);

		System.out.println("GIOCATORE 2: Scegli un pokemon");
		Scanner input2 = new Scanner(System.in);
		String po2 = input.next();
		System.out.println("Hai scelto " + po2);
		Pokemon p2 = mPoke.get(po2);
		System.out.println("");
		p2.descriviti();
		mSquad2.put(p2.getNome(),p2);
		
		System.out.println("---THE BATTLE BEGINS---\n");
		boolean alive1 = false;
		boolean alive2 = false;
		int turno = 0;
		String mossa1="";
		String mossa2="";
		do {
			alive1=false;
			alive2=false;
			int first = 0;
			turno++;
			double danno=0;//Va bene double?
			//int dannoM=0;
			double c = 0;
			System.out.println("-------------------------\n\nTURNO "+turno+"\n");
			//Scelta mosse
			System.out.println("GIOCATORE 1\nWhat will "+p1.getNome()+" do?");
			Scanner inputmossa1 = new Scanner(System.in);
			mossa1 = inputmossa1.next();
			Mossa m1 = mMosse.get(mossa1);
		    System.out.println("GIOCATORE 2\nWhat will "+p2.getNome()+" do?");
		    Scanner inputmossa2 = new Scanner(System.in);
			mossa2 = inputmossa2.next();
			Mossa m2 = mMosse.get(mossa2);
			
			
			//Creo vettore velocità
			if(p1.getSpe()>p2.getSpe())
				first=1;
			else
				first=2;
			//Combattimento
			if(first==1)
			{
				System.out.println("\n"+p1.getNome()+" usa "+m1.getNomeMossa());
				if(m1.getDanno()!=0) {
					if(oddsPrecisione(m1.getPrecisione()))
						usoMossa(p1, m1, p2);
					else
						System.out.println("Cazzo! L'attacco non va a segno!");
				
					}
				System.out.println("\n"+p2.getNome()+" usa "+m2.getNomeMossa());
				if(m2.getDanno()!=0) {
					if(oddsPrecisione(m2.getPrecisione()))
						usoMossa(p2, m2, p1);
					else
						System.out.println("Cazzo! L'attacco non va a segno!");
			}
			}
					else
					{
						System.out.println("\n"+p2.getNome()+" usa "+m2.getNomeMossa());
						if(m2.getDanno()!=0) {
							if(oddsPrecisione(m2.getPrecisione()))
								usoMossa(p2, m2, p1);
							else
								System.out.println("Cazzo! L'attacco non va a segno!");
//						
					}
					System.out.println("\n"+p1.getNome()+" usa "+m1.getNomeMossa());
					if(m1.getDanno()!=0) {
						if(oddsPrecisione(m1.getPrecisione()))
							usoMossa(p1, m1, p2);
						else
							System.out.println("Cazzo! L'attacco non va a segno!");
				}
						
					
			
			}
			
			//Controllo se sono rimasti pokemon in vita
			for(Pokemon end : mSquad1.values()) 
				if(end.getHp()>0)
					alive1=true;
			for(Pokemon end : mSquad2.values()) 
				if(end.getHp()>0)
					alive2=true;
		} while(alive1&&alive2);//TOGLIERE !
		if(alive1)
			System.out.println("Fine Game! GIOCATORE 1 vince!!!!! :D");
		else if (alive2)
			System.out.println("Fine Game! GIOCATORE 2 vince!!!!! :D");
		
		//Bisognerebbe aggiustare if first 1, mettendo nuovi oggetti pokemon e mosse per vitare 4 versioni del codice
		

	}
	
	private static boolean oddsPrecisione(int precisione) {
	// TODO Auto-generated method stub
		double p = 0;
		p = Math.random()*101;
		int pr = (int) p;
		System.out.println("\nPrecisione: "+precisione+"  odds:"+ pr);
		if(precisione>= pr)
			return true;
	return false;
}

	public static void usoMossa (Pokemon p1, Mossa m1, Pokemon p2) {
		double danno=0;//Va bene double?
		double c = 0;
		int att = 0;
		int def = 0;
		//System.out.println("\n"+p1.getNome()+" usa "+m1.getNomeMossa());
		if(m1.getStato()=="speciale") {
			att=p1.getSpatk();
			def=p2.getSpdef();
		}else if(m1.getStato()=="fisico") {
			att=p1.getAtk();
			def=p2.getDef();
		}
			//System.out.println(m1.getStato());//flag
			danno=(((((2*50)/5)+2)*m1.getDanno()*(att/def))/50)+2;
			System.out.println("Danno mossa="+m1.getDanno()+" attacco "+att+" difesa "+def+"\n");//flag debug
			System.out.println(danno);//flag
			//Ora ho bisogno di calcolare il modificatore
			//Stab
			if (m1.getTipo()==p1.getTipo1()||m1.getTipo()==p1.getTipo2())
				danno = danno*1.5;
			System.out.println(danno);//flag
			//controllo l'efficacia dei tipi
			double e = 1;
			double effTipi = efficaciaTipi( e, m1, p2);
			danno=danno*effTipi;
			//RNG
			do 
				c = Math.random();
			 while(c<0.85);
			System.out.println(c);//flag
			danno = danno*c;
			System.out.println(danno);//flag
			//Comincio le cose alternative al danno normale
			
			
			
			
			//Ora applico il danno
			int hp = p2.getHp()-(int) danno;
			//System.out.println(p2.getNome()+" rimane con"+p2.getHp()+"la variabile hp vale"+hp);
			p2.setHp(hp);
			//Controllo che il pokemon non sia deceduto
			if(p2.getHp()<=0) {
				System.out.println(p2.getNome()+" è esausto!");
			}else {
				System.out.println(p2.getNome()+" rimane con "+p2.getHp());
			}
		
	

}

	private static double efficaciaTipi(double e, Mossa m, Pokemon t) {
		// TODO Auto-generated method stub
		
		final double[][] tTipi = {
				//	{1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18},
					{1, 1, 1, 1, 1, 0.5, 1, 0, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1},//1 Normale
					{2, 1, 0.5, 0.5, 1, 2, 0.5, 0, 2, 1, 1, 1, 1, 0.5, 2, 1, 2, 0.5},//2 Lotta
					{1, 2, 1, 1, 1, 0.5, 2, 1, 0.5, 1, 1, 2, 0.5, 1, 1, 1, 1, 1},//3 Volante
					{1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2},//4 Veleno
					{1, 1, 0, 2, 1, 2, 0.5, 1, 2, 2, 1, 0.5, 2, 1, 1, 1, 1, 1},//5 Terra
					{1, 0.5, 2, 1, 0.5, 1, 2, 1, 0.5, 2, 1, 1, 1, 1, 2, 1, 1, 1},//6 Roccia
					{1, 0.5, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 0.5, 1, 2, 1, 2, 1, 1, 2, 0.5},//7 Coleottero
					{0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1},//8 Spettro
					{1, 1, 1, 1, 1, 2, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 1, 1, 2},//9 Acciaio
					{1, 1, 1, 1, 1, 0.5, 2, 1, 2, 0.5, 0.5, 2, 1, 1, 2, 0.5, 1, 1},//10 Fuoco
					{1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0.5, 0.5, 1, 1, 1, 0.5, 1, 1},//11 Acqua
					{1, 1, 0.5, 0.5, 2, 2, 0.5, 1, 0.5, 0.5, 2, 0.5, 1, 1, 1, 0.5, 1, 1},//12 Erba
					{1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1},//13 Elettro
					{1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 1, 0, 1},//14 Psico
					{1, 1, 2, 1, 2, 1, 1, 1, 0.5, 0.5, 0.5, 2, 1, 1, 0.5, 2, 1, 1},//15 Ghiaccio
					{1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 2, 1, 0},//16 Drago
					{1, 0.5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 0.5},//17 Buio
					{1, 2, 1, 0.5, 1, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 2, 2, 1},//18 Fata
			};
			
			//tipi = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		String[] tipi = {"Normale", "Lotta", "Volante", "Veleno", "Terra", "Roccia", "Coleottero", "Spettro", "Acciaio", "Fuoco", "Acqua", "Erba", "Elettro", "Psico", "Ghiaccio", "Drago", "Buio", "Folletto"};
		
		//System.out.println("La funzione è stata chiamata corretamente");	//flag
		
		for(int i = 0; i<18 ; i++) {
			//System.out.println(i);//flag
			if(tipi[i].equals(m.getTipo())) {
				System.out.println("i = "+i+" Attacante ="+m.getTipo());	//flag
				for(int j = 0; j<18 ; j++) {
					if(tipi[j].equals(t.getTipo1())||tipi[j].equals(t.getTipo2())) {
						System.out.println("j = "+j+"Difensore ="+t.getTipo1()+" o "+t.getTipo2());	//flag
						e=e*tTipi[i][j];
						System.out.println("Matrice: "+tTipi[i][j]);//flag
			}
		//System.out.println("aaah");	//flag		
		}
	
	
				return e;
	}
			
	}
		return 0;
	}
}
