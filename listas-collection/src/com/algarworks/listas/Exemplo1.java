package com.algarworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1{
	
	public static void main (String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Jos�");
		nomes.add("Maria");
		nomes.add("Jo�o");
		
//		nomes.remove("Jo�o");
//		System.out.println(nomes);
//		
		
//		for (int i = 0; i < nomes.size(); i++) {
//			
//			System.out.println("nome: " + nomes.get(i));
//		}

//		for (String nome : nomes) {
//			System.out.println("nome: " + nome);
//		}
//		

//	nomes.forEach(new Consumer<String>() {
//
//		@Override
//		public void accept(String t) {
//			System.out.println(t);
//			
//		}
//	});
	
//		nomes.forEach(nome -> System.out.println(nome));
		
		nomes.forEach(System.out::println);
		
	}
	
}
