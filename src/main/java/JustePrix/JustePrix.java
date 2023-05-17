package JustePrix;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {


    int nombreDeVie = 10;

    boolean partie = true;

    public int nombreATrouver(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public void nombreDeVie(){
        nombreDeVie -= 1;
        System.out.println("Il vous reste " + nombreDeVie + " tentatives.");
        if (nombreDeVie <= 0) {
            partie = false;
            System.out.println("Vous avez perdu.");
            }
    }

    public void jeux(){
        int nombreRecherchePourLaPartie = nombreATrouver();
        while (partie) {
            tentative(nombreRecherchePourLaPartie);
        }
    }

    public void tentative(int nombreATrouver){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre compris entre 0 et 100 :");
        int tentative =  scanner.nextInt();
        if (tentative == nombreATrouver){
            System.out.println(" Vous avez trouvé la bonne réponse ! Bravo !");
            partie = false;
        } else if (tentative > nombreATrouver) {
            System.out.println("Le nombre recherché est plus petit que " + tentative);
            nombreDeVie();
        } else if (tentative < nombreATrouver) {
            System.out.println("Le nombre recherché est plus grand que " + tentative);
            nombreDeVie();
        } else {
            System.out.println("Il y a une erreur.");
        }
    }
}

