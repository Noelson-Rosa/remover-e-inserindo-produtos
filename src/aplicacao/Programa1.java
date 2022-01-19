package aplicacao;

import java.util.Scanner;

import entity.Produtos;

public class Programa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.print("enter product data: ");
		
		System.out.print("entre com o nome:");
		produto.name = sc.nextLine();
		
		System.out.println("preço: ");
		produto.price = sc.nextDouble();
		
		System.out.println(" quantidade no estoque: ");
		produto.quantity = sc.nextInt();
		
		/*System.out.println(produto.name + ", " + produto.price + "," + produto.quantity);*/
		
		System.out.println(produto);
		
		System.out.println("adicionar produtos no estoque: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println("atualização no estoque: " + produto); 
		
		System.out.println("produtos a serem removidos do estoque:  ");
		 quantity = sc.nextInt();
		 produto.removeProducts(quantity);
		 System.out.println("quantidade de produtos removidos foram:" + produto);
		
		
		
		sc.close();
	}

}
