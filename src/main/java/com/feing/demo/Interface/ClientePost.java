package com.feing.demo.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feing.demo.model.PostModel;

//name = "post" - é o nome do nosso feighClient
//-------------------------------------------------------------
//url = "https://jsonplaceholder.typicode.com" - é a url que vamos consumir
//-------------------------------------------------------------
//link da API = (https://jsonplaceholder.typicode.com/posts)
//-------------------------------------------------------------
@FeignClient(name = "post", url = "https://jsonplaceholder.typicode.com")
public interface ClientePost {

	//metodo que retornando a lista do POST
	
	@GetMapping(value = "/posts")
	List<PostModel> getAllPost();
}
