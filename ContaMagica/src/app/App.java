package app;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    private static Cliente cliente;
    private static ContaMagica conta;
    

    public static void main(String[] args) {
    	
    	int operacao;
    	String aux;
    	String nome;
    	int idade;
    	BigDecimal valor;
    	
    	
    	Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operacao que deseja efetuar: ");
        System.out.println("1 - Cadastrar Conta ");
        System.out.println("2 - Cadastrar Cliente ");
        System.out.println("3 - Verificar Saldo ");
        System.out.println("4 - Efetuar Deposito ");
        System.out.println("5 - Efetuar Saque");
        System.out.println("6 - Sair");

        aux = entrada.next();
        operacao = Integer.parseInt(aux);

        while (operacao > 0 && operacao <=5) {

            switch (operacao) {
                case 1:
                	
                	System.out.println("Informe um nome");
                	System.out.println("");
                	aux=entrada.next();
                	conta = new ContaMagica(aux);
                               
                    System.out.println("");
                    System.out.println("Digite a operacao que deseja efetuar: ");
                    System.out.println("1 - Cadastrar Conta ");
                    System.out.println("2 - Cadastrar Cliente ");
                    System.out.println("3 - Verificar Saldo ");
                    System.out.println("4 - Efetuar Deposito ");
                    System.out.println("5 - Efetuar Saque");
                    System.out.println("6 - Sair");
                    
                    aux = entrada.next();
                    operacao = Integer.parseInt(aux);

                    break;
                case 2:
                	
                	  System.out.println("Informe o nome do cliente!");
                      nome = entrada.next();
                      System.out.println("Informe a idade do cliente");
                      idade = entrada.nextInt();
                	
                      cliente = new Cliente(idade, nome);

                    System.out.println("Digite a operacao que deseja efetuar: ");
                    System.out.println("1 - Cadastrar Conta ");
                    System.out.println("2 - Cadastrar Cliente ");
                    System.out.println("3 - Verificar Saldo ");
                    System.out.println("4 - Efetuar Deposito ");
                    System.out.println("5 - Efetuar Saque");
                    System.out.println("6 - Sair");
                    
                    aux = entrada.next();
                    operacao = Integer.parseInt(aux);

                    break;

                case 3:
                	
                	System.out.println(" O seu saldo é: " + conta.getSaldo());

                    System.out.println("Digite a operacao que deseja efetuar: ");
                    System.out.println("1 - Cadastrar Conta ");
                    System.out.println("2 - Cadastrar Cliente ");
                    System.out.println("3 - Verificar Saldo ");
                    System.out.println("4 - Efetuar Deposito ");
                    System.out.println("5 - Efetuar Saque");
                    System.out.println("6 - Sair");
                    
                    aux = entrada.next();
                    operacao = Integer.parseInt(aux);
                    
                    break;
                
                case 4:
                	
                System.out.println("Informe o valor a ser depositado");
                valor = entrada.nextBigDecimal();
                
                	
                conta.deposito(valor);
                
                System.out.println("Digite a operacao que deseja efetuar: ");
                System.out.println("1 - Cadastrar Conta ");
                System.out.println("2 - Cadastrar Cliente ");
                System.out.println("3 - Verificar Saldo ");
                System.out.println("4 - Efetuar Deposito ");
                System.out.println("5 - Efetuar Saque");
                System.out.println("6 - Sair");
                
                aux = entrada.next();
                operacao = Integer.parseInt(aux);
               
                break;
                
                case 5:
                	
                	 System.out.println("Informe o valor a ser sacado");
                     valor = entrada.nextBigDecimal();
                     	
                     conta.retirada(valor);
                     
                     System.out.println("Digite a operacao que deseja efetuar: ");
                     System.out.println("1 - Cadastrar Conta ");
                     System.out.println("2 - Cadastrar Cliente ");
                     System.out.println("3 - Verificar Saldo ");
                     System.out.println("4 - Efetuar Deposito ");
                     System.out.println("5 - Efetuar Saque");
                     System.out.println("6 - Sair");
                     
                     aux = entrada.next();
                     operacao = Integer.parseInt(aux);
                
                
                default:
                    break;
            }

        }

    }

}
