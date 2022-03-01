package TP2;

import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        PileEntiers P1 = new PileEntiers("P1"),P2 = new PileEntiers("P2"),P3 = new PileEntiers("P3");
        PileEntiers Sauvegarde = new  PileEntiers("Sauvegarde"); // Permet de garder la pile P1 vu qu'on va la dépiler
        System.out.println("Les nombres de P1 au depart sont : ");
        for (Integer i =0; i<5;i++) // On remplie la pile P1 avec 5 entiers aléatoires 
        {   
            int a =(int) (Math.random()*100); // Attention le cast doit se faire avec un int et non un Integer sinon ca ne marche pas
            System.out.print(a+ " ");
           
            P1.Empiler(a); // Creation d'un nombre aleatoire entre 0 et 99
            Sauvegarde.Empiler(a);
            
        }
        System.out.println();
        
        System.out.println("Maintenant on va depiler P1 et placer chaque nombre dans P2 ou P3 ");

    for (Integer i = 0; i<5;i++)
    {
        Integer intermediaire = Sauvegarde.Depiler();
        System.out.println("Le nombre : " + intermediaire);
        if (intermediaire %2 ==0) // Si le nombre est pair il va dans P2
        {
            System.out.println("Il est pair il va dans P2");
            P2.Empiler(intermediaire);
        }else // Sinon il va dans P3
        {
            P3.Empiler(intermediaire);
            System.out.println("Il est impair il va dans P3"); 
        }
        

    }

System.out.print(" P1 : ");
P1.afficher();
System.out.println();
System.out.print(" P2 : ");
P2.afficher();
System.out.println();
System.out.print(" P3 : ");
P3.afficher();
System.out.println();

       
    }
}
