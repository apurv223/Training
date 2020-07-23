package com.example.demo.service;


import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;
@Service
@EnableTransactionManagement
public class ImageServiceImpl implements ImageService{
	private ImageDao imageDao;

	@Autowired
	public ImageServiceImpl(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	
	
	@Override
	@Transactional
	public Optional<Image> createImage(Image image) {
		imageDao.save(image);
		return Optional.of(image);
	}
	

	@Override
	@Transactional
	public Iterable<Image> getAllImage() {
		// TODO Auto-generated method stub
		return imageDao.findAll();
	}
	
	
	@Override
	@Transactional
	public Optional<Image> updateImage(UUID id,String imageUrl)
	{
		Optional<Image> img = imageDao.findById(id);
		Image img1 = img.get();
		img1.setImageUrl(imageUrl);
		return Optional.of(img1);
	}
	
	@Override
	@Transactional
	public Optional<Image> deleteImage(UUID id)
	{
		Optional<Image> img = imageDao.findById(id);
		Image img1 = img.get();
		imageDao.delete(img1);
		return Optional.of(img1);
	}
}