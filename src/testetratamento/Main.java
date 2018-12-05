/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetratamento;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double recebe;

        try{
            recebe = media();
            int valor;
            System.out.println("Digite um valor inteiro");
            valor = ler.nextInt();
            if(valor != 0){
            throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Valor incorreto");
            System.out.println("O erro está em: " + e);
            System.out.println("Testando messenge:" + e.getMessage());
        }
        finally{
            System.exit(0);
        }
        
    }
    
    public static double media()throws Exception{
        Scanner ler = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o valor 1:");
        a = ler.nextInt();
        System.out.println("Digite o valor 2:");
        b = ler.nextInt();
        return (a+b)/2;
    }
    
}
