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
        this.person = new Person(null, "Teste Person", null, "teste@teste.com.br");
    }

    public void savePerson()
    {
        this.doCreatePerson();
        this.service.savePerson(this.person);
        System.out.println("\n\n\nThe person saved is: " + this.person.getId() + " - " + this.person.getName());
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

}
