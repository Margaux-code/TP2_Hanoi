import TP2.*;
import java.util.*;

public class Hanoi {
    // Toutes mes classes m'ont fait mettre des statics
    public  int selection_nombre_entiers() 
    {
        int n;
        System.out.println("Rentrer un entier positif, il representera le nombre de disque des tours d'hanoi :  ");
        Scanner in = null;
        in = new Scanner(System.in);
        do{
            
            n = in.nextInt();
            if (n<=0)
            {
                System.out.println("Erreur nombre negatif ou nul, rentrez un nombre positif");
            }
        }while(n <= 0);
       
        in.close();

        return n;
    }
   
    public  void  Remplissage(PileEntiers P, int n)
    {
        for (int i =0; i< n;i++)
        {
            P.Empiler(n-i);
        }
    }
    public static  void deplacement (int n, PileEntiers Depart, PileEntiers Arrivee)
    {
        Arrivee.Empiler(Depart.Depiler());
        Depart.afficher();
        Arrivee.afficher();

    }
    public  void ToursHanoi (int n, PileEntiers P1, PileEntiers P2,PileEntiers P3)
    {
        try{
          /*  if  (n == 1)
            {
                deplacement(n,P1,P3);
     
            }*/
             if( n != 0)
             {
                 ToursHanoi(n-1, P1,P3,P2);
                 deplacement(n,P1,P2);
                 ToursHanoi(n-1, P3,P2,P1);
                 //deplacement(n,P3,P2);
             }

        }catch(Exception e)
        {
          return;
        }

      


    }
    public static void main(String[] args) throws Exception {
        PileEntiers P2 = new PileEntiers("P2"), P3 = new PileEntiers("P3");
        PileEntiers P1 = new PileEntiers ("P1");

        Hanoi H = new Hanoi();
        int n = H.selection_nombre_entiers();
        H.Remplissage(P1,n);
        System.out.println("Au depart : ");
        P1.afficher();
        P2.afficher();
        P3.afficher();
        System.out.println("Les disques vont faire ces deplacements : ");
        H.ToursHanoi(n,P1, P2, P3);
        System.out.println("Finalement : ");
        P1.afficher();
        P2.afficher();
        P3.afficher();

        
        
    

    }
  

    
}
