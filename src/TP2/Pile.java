package TP2;


public abstract class Pile  {
    protected Liste UneListe;

    public Pile()
    {
        this.UneListe = new Liste();
    }
  
    public void Empiler(Object Object_a_empiler)
    {   

       this.UneListe.Dernier(); // On positionne la liste sur la dernière position
        this.UneListe.Ajouter(Object_a_empiler); // Puis on ajoute un objet

    }
    public Object Depiler()
    {
        this.UneListe.Dernier();//On se positionne sur la dernière position de la liste
        Object intermediaire = this.UneListe.Objet_position();
        this.UneListe.Supprimer();
        return intermediaire;
       
        
    }
    public void afficher()  
    {
        this.UneListe.Afficher();
    }  
}
