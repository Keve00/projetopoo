
package br.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //anotação para que o JPA crie as entidades no banco

public class Aluno {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length = 100, nullable = false)
    private String  nome;
    
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    
    private String endereco;
    
    // SETTERS
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //GETTERS
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
