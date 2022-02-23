/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.dio.banco;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 *
 * @author Igor
 */
public class DesafioDioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.setNome("Maria");
        cliente2.setNome("Antônio");
        
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        cc.setCliente(cliente1);
        cp.setCliente(cliente2);
        
        banco.addConta(cc);
        banco.addConta(cp);
        
        cc.depositar(500);
        cc.sacar(200);
        cc.transferir(100, cp);
        
        cp.sacar(50);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
        banco.listarCliente();
    }
    
}
