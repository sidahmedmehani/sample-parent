package gr.javapapo.web.jsf;

import gr.javapapo.domain.entities.Personne;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasni on 07/09/14.
 */
@Named
@ApplicationScoped
public class ApplicationDb {

    private  List<Personne> personnes = new ArrayList<Personne>();
    private Personne personne;



    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public void addPersonne(Personne personne){

        personnes.add(personne);


    }



}
