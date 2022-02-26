package TP2;
import java.util.*;

public class Liste {

    private ArrayList<Object> Liste;
    private Integer Position;

    public Liste()
    {        
        this.Liste = new ArrayList<>();
        this.Position = 0;
    }

    public void Premier() {
        this.Position = 0;
    }

    public void Dernier() {
        this.Position = this.Liste.size();

    }

    public Object Suivant() {

        return this.Liste.get(Position+1);
    }
    public void Supprimer()
    {
        try
        {
            this.Liste.remove(this.Position);

        }catch(Exception e)
        {
            System.out.println("Cette liste est deja vide, il n'est pas possible de supprimer plus d'elements");
        }
    }
    public void Ajouter()
    {
        Object generique = new Object ();
        this.Liste.add(Position, generique);

    }
}
