/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Igor
 */
public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupanca ---");
        super.imprimirInfoComuns();
    }
    
}
