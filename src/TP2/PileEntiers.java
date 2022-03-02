package TP2;

public class PileEntiers extends Pile {

  private String m_nom;

    public PileEntiers(String nom)
    {
      m_nom = nom;
      super.UneListe = new Liste();
    }
      public void Empiler(Integer Object_a_empiler)
      {
        super.UneListe.Dernier(); // On positionne la liste sur la dernière position
        super.UneListe.Ajouter(Object_a_empiler); // Puis on ajoute un objet

      }
      public Integer Depiler()
      {
        this.UneListe.Dernier();//On se positionne sur la dernière position de la liste
        Integer intermediaire = (Integer)this.UneListe.Objet_position();
        this.UneListe.Supprimer();
        return intermediaire;
       
        
          
      }
      public void afficher()  
      {
        System.out.print (m_nom + " : ");
          this.UneListe.Afficher();
      } 
      public void afficher_inverse()
      {
        System.out.print (m_nom + " : ");
          this.UneListe.afficher_inverse();

      }

    }
    


