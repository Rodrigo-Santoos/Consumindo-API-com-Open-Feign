package com.feing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // criando getters e setters
@AllArgsConstructor // criando o construtor com argumentos
@NoArgsConstructor // criando o construtor sem argumentos
@Builder(toBuilder = true) //criar os nosso objetos de uma maneira facil
public class PostModel {

	private Integer userId;
	
	private Integer id;
	
	private String title;
	
	private String body;
}
