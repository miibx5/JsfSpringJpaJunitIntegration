/*
 *  Projeto.......: JsfSpringJpaJunitIntegration
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2016
 *  Criação.......: 09/11/2016, 19:21:33
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2016 - All Rights Reserved
 *  .....................................................................................
 */
package br.com.edersystems.jsfspringjpajunitintegration.model.services;

import br.com.edersystems.jsfspringjpajunitintegration.model.entities.Person;
import br.com.edersystems.jsfspringjpajunitintegration.model.repositories.person.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciano
 */
@Service
public class PersonService implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @Autowired
    private PersonRepository repository;

    public Person savePerson(Person p)
    {
        return this.repository.savePojo(p);
    }

    public List<Person> getPersons()
    {
        return this.repository.getALL();
    }

}
