package TP2;
import java.util.*;

public class Pile {
    protected Liste UneListe;
    public Pile()
    {
        this.UneListe = new Liste();
    }
    public void Empiler(Object Object_a_empiler)
    {   
       
        this.UneListe.Ajouter();

    }
    public Object Depiler()
    {
        Object Object_a_depiler = new Object();
        return Object_a_depiler;
    }
}
