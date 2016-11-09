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
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciano
 */
@Service
public class PersonService implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    public Person savePerson(Person p)
    {
        System.out.println("Person Saved With Success!!!!");
        return null;
    }

}
