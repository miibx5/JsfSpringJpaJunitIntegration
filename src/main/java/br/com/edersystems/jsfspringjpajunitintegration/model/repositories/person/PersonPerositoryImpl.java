/*
 *  Projeto.......: JsfSpringJpaJunitIntegration
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2016
 *  Criação.......: 09/11/2016, 19:38:17
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2016 - All Rights Reserved
 *  .....................................................................................
 */
package br.com.edersystems.jsfspringjpajunitintegration.model.repositories.person;

import br.com.edersystems.jsfspringjpajunitintegration.base.repository.GenericRepositoryImpl;
import br.com.edersystems.jsfspringjpajunitintegration.model.entities.Person;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luciano
 */
@Repository("personRepository")
public class PersonPerositoryImpl extends GenericRepositoryImpl<Person> implements PersonRepository
{
    private static final long serialVersionUID = 1L;

    public PersonPerositoryImpl()
    {
        super(Person.class);
    }

}
