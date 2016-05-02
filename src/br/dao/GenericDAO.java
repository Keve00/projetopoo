
package br.dao;

import br.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDAO<T> implements DAO<T>{
    
    private Session sessao;
    private Transaction transacao;
    
    @Override
    public boolean salvar(T t) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(t);
            transacao.commit();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }finally{
            sessao.close();
        }
        return true;
    }

    @Override
    public boolean editar(T t) {
       return false;
    }

    @Override
    public boolean excluir(T t) {
        return false;
    }

    @Override
    public List<T> listar() {
        return null;
    }
    
}
