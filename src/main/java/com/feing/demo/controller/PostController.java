package com.feing.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feing.demo.Interface.ClientePost;
import com.feing.demo.model.PostModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("posts") //rota posts no localhost:8080/posts
public class PostController {

	private ClientePost clientePost;
	
	@GetMapping
	public List<PostModel> getAllPosts(){
		return clientePost.getAllPost();
	}
}
