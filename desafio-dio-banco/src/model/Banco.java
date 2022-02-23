/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Igor
 */
public class Banco {
    private String nome;
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<Conta>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    
    public void listarCliente(){
        System.out.println("--Lista de Clientes--");
        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i).getCliente().getNome());
        }
    }
}
