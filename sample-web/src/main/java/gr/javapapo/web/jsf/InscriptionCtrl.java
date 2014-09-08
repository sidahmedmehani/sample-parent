package gr.javapapo.web.jsf;
import gr.javapapo.domain.entities.Personne;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


/**
 * Created by hasni on 06/09/14.
 */
@Named
@RequestScoped
public class InscriptionCtrl implements Serializable
{

    public final static Logger LOG = Logger.getLogger(InscriptionCtrl.class);
    private Personne personne;
    @Inject
    private ApplicationDb applicationDb;


    public InscriptionCtrl(){
        LOG.info("InscriptionCtrl : constructor");
    }

    @PostConstruct
    public void init(){
        LOG.info("Log : InscriptionCtrl init()");
        personne = new Personne();

    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public void createAcount() {


        applicationDb.addPersonne(personne);

    }

}
