package com.klaytonramires.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klaytonramires.workshopmongo.domain.Post;
import com.klaytonramires.workshopmongo.repository.PostRepository;
import com.klaytonramires.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Optional<Post> findById(String id) {
		Optional<Post> user = repository.findById(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
}
