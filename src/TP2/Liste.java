package TP2;
import java.util.*;

public class Liste {

    private ArrayList<Object> Liste;
    private Integer Position;

    public Liste() // Initialisation de la fonction
    {        
        this.Liste = new ArrayList<>(); 
        this.Position = -1; // On part de -1 pour pouvoir faire +1 à ajouter pour que ça marche au début et quand la liste à déjà des élements
    }

    public void Premier() { //Remet la postition du tableau au début
        this.Position = 0;
    }

    public void Dernier() {
        this.Position = this.Liste.size()-1; // ON fait -1 parce que l'index commence a 0

    }

    public Object Suivant() {

        
        return this.Liste.get(Position+1);
    }
    public void Supprimer()
    {
        try
        {
            int tata = this.Position; // Utilisation d'une variable intermediaire car remove ne veut pas remove le dernier de la liste si la valeur est mise en Integer en non en int
           this.Liste.remove(tata);
           
           
            

        }catch(Exception e)
        {
            System.out.println("Cette liste est deja vide, il n'est pas possible de supprimer plus d'elements");
        }
    }
    public void Ajouter(Object generique)
    {
        this.Position ++;
        this.Liste.add(this.Position, generique);
        
    }
    public Object Objet_position()
    { 
        return this.Liste.get(Position);
    }
    public void Afficher()
    {
        for (int i =0 ;i<this.Liste.size();i++)
        {
            System.out.print(this.Liste.get(i)+ " ");        }
            System.out.println();

    }
}
