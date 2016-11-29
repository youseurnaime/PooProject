public class Joueur extends Licencie{
	private boolean gardien;
	private int numMaillot;
	
	public Joueur(int licence, String nom, String prenom, Date date, Club club, boolean gardien, int numMaillot){
		super(licence,nom,prenom,date,club);
		this.gardien = gardien;
		this.numMaillot = numMaillot;
	}
	
	public String toString(){
		String s = (super.toString()+" | Numéro de maillot : "+numMaillot);
		if(gardien) return(s+ " Gardien");
		else return s;
	}
	
	public boolean estGardien(){
		return gardien;
	}
	
	public int getNumMaillot(){
		return numMaillot;
	}
	
	public static Joueur creerJoueur(){
		System.out.println("Entrez le numero de licence :");
		int numLicence = Menu.lireValeur();
		System.out.println("Entrez le nom : ");
		String nom = Menu.lireMot();
		System.out.println("Entrez le prénom : ");
		String prenom = Menu.lireMot();
		System.out.println("Entrez la date de validité de la licence (JJ/MM/AAAA)");
		Date date = Menu.lireDate();
		System.out.println("Entrez le nom du club : ");
		String equipe = Menu.lireMot();
		System.out.println("Entrez la ville du club : ");
		String ville = Menu.lireMot();
		Club club = new Club(equipe,ville);
		System.out.println("Est-ce un gardien ? (O/N)");
		boolean gardien = Menu.lireON();
		System.out.println("Entrez le numéro de maillot : ");
		int numMaillot = Menu.lireValeur();
		return(new Joueur(numLicence,nom,prenom,date,club,gardien,numMaillot));		
	}
	
	public static Joueur creerJoueur(Club club){
		System.out.println("Entrez le numero de licence :");
		int numLicence = Menu.lireValeur();
		System.out.println("Entrez le nom : ");
		String nom = Menu.lireMot();
		System.out.println("Entrez le prénom : ");
		String prenom = Menu.lireMot();
		System.out.println("Entrez la date de validité de la licence (JJ/MM/AAAA)");
		Date date = Menu.lireDate();
		System.out.println("Est-ce un gardien ? (O/N)");
		boolean gardien = Menu.lireON();
		System.out.println("Entrez le numéro de maillot : ");
		int numMaillot = Menu.lireValeur();
		return(new Joueur(numLicence,nom,prenom,date,club,gardien,numMaillot));		
	}
	
	public static Joueur creerJoueur(Club club, boolean gardien){
		System.out.println("Entrez le numero de licence :");
		int numLicence = Menu.lireValeur();
		System.out.println("Entrez le nom : ");
		String nom = Menu.lireMot();
		System.out.println("Entrez le prénom : ");
		String prenom = Menu.lireMot();
		System.out.println("Entrez la date de validité de la licence (JJ/MM/AAAA)");
		Date date = Menu.lireDate();
		System.out.println("Entrez le numéro de maillot : ");
		int numMaillot = Menu.lireValeur();
		return(new Joueur(numLicence,nom,prenom,date,club,gardien,numMaillot));		
	}
	
	/*public static Joueur selectionner(File f, Club club) throws ClubIncorrectException{
		ArrayList<Licencie> al = charger(f);
		int taille = al.size();
		for(int i = 0 ; i < taille ; i++){
			System.out.println(i+" : "+al.get(i).toString());
		}
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do{
			choix = sc.nextInt();
			if(choix < 0 || choix > taille) System.out.println("Choix incorrect");
		}while(choix < 0 && choix > taille);
		Joueur j = (Joueur) al.get(choix);
		if(j.getClub()!=club) throw new ClubIncorrectException();
		al.remove(choix);
		sauver(f,al);
		return(j);
	}
*/
	
}
