package com.diogofernando.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diogofernando.crud.data.vo.ProdutoVO;
import com.diogofernando.crud.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public ProdutoVO create(ProdutoVO produtoVO) {
		return null;
	}
	
	

}