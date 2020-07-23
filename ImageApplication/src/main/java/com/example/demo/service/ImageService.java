package com.example.demo.service;

import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Image;

public interface ImageService {
	public Iterable<Image> getAllImage();
	public Optional<Image> createImage(Image image); 
	public Optional<Image> updateImage(UUID id, String url);
	public Optional<Image> deleteImage(UUID id);
	
}