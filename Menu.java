import java.io.*;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		menuPrincipal();
	}
	
	public static void menuPrincipal(){
		System.out.println("----- MENU PRINCIPAL -----");
		System.out.println("Que souhaitez vous faire ?");
		System.out.println("1 : Gestion des équipes");
		System.out.println("2 : Démarrer un tournoi");
		int choix = 0;
		do{
			choix = lireValeur();
		}while(choix < 1 || choix > 2);
		
		switch(choix){
		case 1: 
			gestionEquipes();
			break;
		case 2:
			break;
		}
	}
	
	public static void gestionEquipes(){
		int choix = 0;
		ArrayList<Equipe> lesEquipes = Equipe.charger();
		
		do{
			System.out.println("----- GESTION EQUIPES -----");
			System.out.println("Que souhaitez vous faire ?");
			System.out.println("1 : Nouvelle équipe");
			System.out.println("2 : Supprimer équipe");
			System.out.println("3 : Voir les équipes");
			System.out.println("4 : Retour");
			try{
				do{
					choix = lireValeur();
				}while(choix < 1 || choix > 4);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			switch(choix){
			case 1: 
				lesEquipes.add(Equipe.creerEquipe());
				break;
			case 2:
				System.out.println("Sélectionnez celle que vous voulez supprimer : ");
				lesEquipes.remove(Equipe.selectionner(lesEquipes));
				break;
			case 3:
				for(Equipe j: lesEquipes){
					System.out.println(j.toString());
				}
				attendre();
				break;
			case 4:
				Equipe.sauver(lesEquipes);
				menuPrincipal();
				break;
			}
		}while(true);
	}
	
	/*public static void gestionLicencies(){
		System.out.println("----- GESTION LICENCIES -----");
		System.out.println("Que souhaitez vous faire ?");
		System.out.println("1 : Gestion des joueurs");
		System.out.println("2 : Gestion des entraineurs");
		System.out.println("3 : Gestion des arbitres");
		System.out.println("4 : Retour");
		int choix = 0;
		do{
			choix = lireValeur();
		}while(choix < 1 || choix > 4);
		
		switch(choix){
		case 1: 
			gestionJoueurs();
			break;
		case 2:
			gestionEntraineurs();
			break;
		case 3:
			gestionArbitres();
			break;
		case 4:
			menuPrincipal();
			break;
		}
	}
	
	public static void gestionJoueurs(){
		int choix = 0;
		File f = new File("joueurs.txt");
		ArrayList<Licencie> lesJoueurs = Licencie.charger(f);
		
		do{
			System.out.println("----- GESTION JOUEURS -----");
			System.out.println("Que souhaitez vous faire ?");
			System.out.println("1 : Nouveau joueur");
			System.out.println("2 : Supprimer joueur");
			System.out.println("3 : Voir les joueurs");
			System.out.println("4 : Retour");
			try{
				do{
					choix = lireValeur();
				}while(choix < 1 || choix > 4);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			switch(choix){
			case 1: 
				lesJoueurs.add(Joueur.creerJoueur());
				break;
			case 2:
				System.out.println("Sélectionnez celui que vous voulez supprimer : ");
				lesJoueurs.remove(Licencie.selectionner(lesJoueurs));
				break;
			case 3:
				for(Licencie j: lesJoueurs){
					System.out.println(j.toString());
				}
				attendre();
				break;
			case 4:
				Licencie.sauver(f, lesJoueurs);
				gestionLicencies();
				break;
			}
		}while(true);
	}
	
	public static void gestionEntraineurs(){
		int choix = 0;
		File f = new File("entraineurs.txt");
		ArrayList<Licencie> lesEntraineurs = Licencie.charger(f);
		
		do{
			System.out.println("----- GESTION ENTRAINEURS -----");
			System.out.println("Que souhaitez vous faire ?");
			System.out.println("1 : Nouvel entraineur");
			System.out.println("2 : Supprimer entraineur");
			System.out.println("3 : Voir les entraineurs");
			System.out.println("4 : Retour");
			try{
				do{
					choix = lireValeur();
				}while(choix < 1 || choix > 4);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			switch(choix){
			case 1: 
				lesEntraineurs.add(Entraineur.creerEntraineur());
				break;
			case 2:
				System.out.println("Sélectionnez celui que vous voulez supprimer : ");
				lesEntraineurs.remove(Licencie.selectionner(lesEntraineurs));
				break;
			case 3:
				int taille = lesEntraineurs.size();
				for(int i = 0 ; i < taille ; i++){
					System.out.println(i+" : "+lesEntraineurs.get(i).toString());
				}
				attendre();
				break;
			case 4:
				Licencie.sauver(f, lesEntraineurs);
				gestionLicencies();
				break;
			}
		}while(true);
	}
	
	public static void gestionArbitres(){
		int choix = 0;
		File f = new File("arbitres.txt");
		ArrayList<Licencie> lesArbitres = Licencie.charger(f);
		
		do{
			System.out.println("----- GESTION ARBITRES -----");
			System.out.println("Que souhaitez vous faire ?");
			System.out.println("1 : Nouvel arbitre");
			System.out.println("2 : Supprimer arbitre");
			System.out.println("3 : Voir les arbitres");
			System.out.println("4 : Retour");
			try{
				do{
					choix = lireValeur();
				}while(choix < 1 || choix > 4);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			switch(choix){
			case 1: 
				lesArbitres.add(Arbitre.creerArbitre());
				break;
			case 2:
				System.out.println("Sélectionnez celui que vous voulez supprimer : ");
				lesArbitres.remove(Licencie.selectionner(lesArbitres));
				break;
			case 3:
				int taille = lesArbitres.size();
				for(int i = 0 ; i < taille ; i++){
					System.out.println(i+" : "+lesArbitres.get(i).toString());
				}
				attendre();
				break;
			case 4:
				Licencie.sauver(f, lesArbitres);
				gestionLicencies();
				break;
			}
		}while(true);
	}*/
	
	public static void attendre(){
		System.out.println("Entrez une valeur pour continuer...");
		try{
			Scanner sc = new Scanner(System.in);
			sc.nextInt();
			sc.close();
		}catch(Exception e){}
	}
	
	public static String lireMot(){
		Scanner sc = new Scanner(System.in);
		String s = "";
		do{
			try{
				s = sc.next();
				return s;
			}catch(Exception e){
				System.out.println("Valeur incorrecte !");
				return lireMot();
			}
		}while(true);
	}
	
	public static int lireValeur(){
		Scanner sc = new Scanner(System.in);
		int val;
		try{
			val = sc.nextInt();
			return val;
		}catch(Exception e){
			System.out.println("Valeur incorrecte !");
			return lireValeur();
		}
	}
	
	public static boolean lireON(){
		Scanner sc = new Scanner(System.in);
		String choix ="";
		do{
			try{
				choix = sc.next();
				return(choix.equals("o")||choix.equals("O"));
			}catch(Exception e){
				System.out.println("Valeur incorrecte !");
				return lireON();
			}
		}while(true);
	}
	
	public static Date lireDate(){
		Scanner sc = new Scanner(System.in);
		Date date = Calendar.getInstance().getTime();
		StringTokenizer st;
		int jour,mois,annee;
		do{
			try{
				st = new StringTokenizer(sc.next(),"/");
				jour = Integer.parseInt(st.nextToken());
				mois = Integer.parseInt(st.nextToken());
				annee = Integer.parseInt(st.nextToken());
				date.setDate(jour);
				date.setMonth(mois);
				date.setYear(annee);
				return date;
			}catch(Exception e){
				System.out.println("Mauvais format de date !");
				return lireDate();
			}
		}while(true);
	}
}
