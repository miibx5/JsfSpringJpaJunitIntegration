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

    public ListPersonsController()
    {
    }

    public String doListPersons()
    {
        return "listPersons";
    }

    public void savePerson()
    {
        this.service.savePerson(null);
    }

}
