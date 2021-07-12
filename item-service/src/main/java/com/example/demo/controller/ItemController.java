package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ItemDto;
import com.example.demo.service.ItemService;
import com.example.demo.ui.ItemRequestModel;
import com.example.demo.ui.ItemResponseModel;
@RestController
@RequestMapping("/items")
public class ItemController {
	
	private ItemService itemService;
	private ModelMapper modelMapper;
	private Environment environment;
	@Autowired
	public ItemController(ItemService itemService, ModelMapper modelMapper,Environment environment) {
		this.itemService = itemService;
		this.modelMapper = modelMapper;
		this.environment=environment;
	}
	@GetMapping("/status")
	public ResponseEntity<String> getStatuc()
	{
		return ResponseEntity.ok("application running port:"+environment.getProperty("local.server.port"));
	}
	
	@PostMapping
	public ResponseEntity<ItemResponseModel> createItem(@RequestBody ItemRequestModel itemDetails)
	{
		System.out.println(itemDetails);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ItemDto dto=modelMapper.map(itemDetails, ItemDto.class);
		System.out.println(dto);
		dto.setItemNumber(UUID.randomUUID().toString());
		ItemResponseModel model=itemService.createItem(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
		
	}
	@GetMapping
	public ResponseEntity<List<ItemResponseModel>> getAllItems()
	{
		return ResponseEntity.status(HttpStatus.OK).body(itemService.getAllItems());
	}

	@GetMapping("/find/{itemName}")
	public ResponseEntity<List<ItemResponseModel>> getByItemname(@PathVariable("itemName") String itemName)
	{
		return ResponseEntity.ok(itemService.findByItemName(itemName));
	}
	@GetMapping("/{itemNumber}")
	public ResponseEntity<ItemResponseModel> getByItemNumber(@PathVariable("itemNumber") String itemNumber)
	{
		return ResponseEntity.ok(itemService.findByItemNumber(itemNumber));
	}
}