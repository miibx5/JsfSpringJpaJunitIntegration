/*
 *  Projeto.......: JsfSpringJpaJunitIntegration
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2016
 *  Criação.......: 09/11/2016, 19:24:08
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2016 - All Rights Reserved
 *  .....................................................................................
 */
package br.com.edersystems.jsfspringjpajunitintegration.controllers.person;

import br.com.edersystems.jsfspringjpajunitintegration.model.entities.Person;
import br.com.edersystems.jsfspringjpajunitintegration.model.services.PersonService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Luciano
 */
@Controller
public class ListPersonsController implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    private static final String PERSON__SAVED__WITH__SUCCESS = "Person Saved With Success!!!";

    @Autowired
    private PersonService service;

    private Person person;

    public ListPersonsController()
    {
    }

    public String doListPersons()
    {
        return "listPersons";
    }

    public final void doCreatePerson()
    {
        this.person = new Person();
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public List<Person> getPersons()
    {
        return this.service.getPersons();
    }

    public void savePerson()
    {
        this.service.savePerson(this.person);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, PERSON__SAVED__WITH__SUCCESS, PERSON__SAVED__WITH__SUCCESS));
    }
}
