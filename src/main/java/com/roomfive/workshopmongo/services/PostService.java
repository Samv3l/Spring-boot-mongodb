package com.roomfive.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomfive.workshopmongo.domain.Post;
import com.roomfive.workshopmongo.repository.PostRepository;
import com.roomfive.workshopmongo.services.exeption.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Obejeto não encontrado"));
	}

}
