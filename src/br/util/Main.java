
package br.util;

import br.dao.AlunoDAO;
import br.dao.DAO;
import br.entidades.Aluno;


public class Main {
    public static void main(String[] args){
        HibernateUtil.getSessionFactory().openSession();
        Aluno a = new Aluno();
        a.setCpf("11111111111");
        a.setEndereco("Rua B");
        a.setNome("Keven");
        
        DAO dAluno = new AlunoDAO();
        dAluno.salvar(a);
    }
}
