/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.service;

import br.com.oportunidades.dao.PessoaDAO;
import br.com.oportunidades.modelo.Pessoa;
import javax.faces.model.ListDataModel;

/**
 *
 * @author user
 */
public class LoginService {
    PessoaDAO pessoaDAO ;

    public Pessoa buscarPessoa(Pessoa pessoa){
        pessoaDAO = new PessoaDAO();
        return pessoaDAO.buscarPessoa(pessoa);
    }

    public void inserirPessoa(Pessoa pessoa) {
        pessoaDAO = new PessoaDAO();
        pessoaDAO.inserirPessoa(pessoa);
    }

    public ListDataModel listarPessoas(){
        pessoaDAO = new PessoaDAO();
        return new ListDataModel(pessoaDAO.listarTodos());
    }

}
