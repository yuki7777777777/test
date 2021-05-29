package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CardinfoService {

	@Autowired
	CardinfoRepository cardinfoRepository;

	/**
	 * レコードを全件取得する。
	 * 
	 * @return
	 */
	public List<Cardinfo> findAllCardinfoData() {

		return cardinfoRepository.findAll();
	}

}
