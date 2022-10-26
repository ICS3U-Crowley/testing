import java.util.Scanner;

class AFewErrors
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.console().reader() );
        String nom;
        String valeur;
        
        // invite de commandes
        System.out.print( "Avant de commencer, quel est votre nom?\n> ");
        // entrée
        nom = console.nextLine();
        
        // accueil
        System.out.print( "\nBonjour, " + nom);
        System.out.println( ", et bienvenue à cette pratique!\n")

        System.out.println( "Ce programme calcule la somme de 50 et d'un nombre" );
        System.out.println( "entier que vous spécifiez.\n");

        // invite de commande
        System.out.print( "Entrer un nombre entier\n> ");
        // entrée
        valeur = console.next();

        //
        // traitement des données (on va le faire directement dans l'affichage)
        //

        // sortie
        System.out.print( "La somme de 50 et " + valeur + " est : ");
        System.out.println( 50 + valeur );

    }
}