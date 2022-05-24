package com.ty.key_store.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.key_store.dto.Key_Store;
import com.ty.key_store.service.KeyStoreService;

public class TestKeyStore {
	public static void main(String[] args) {
		List<Key_Store> list = new ArrayList();
		Key_Store k = new Key_Store();
		
//		k.setUid(1);
//		k.setComment("Remember this password");
//		k.setDescription("Gmail");
//		k.setKey("chetu554@gmail.com");
//		k.setValue("chetan414");
		
		KeyStoreService service = new KeyStoreService();
		
//		int res = service.saveKeyStore(k);
//		if(res > 0) {
//			System.out.println("Data is inserted successfully");
//		}
//		else
//			System.out.println("No data is Exist");
//		
		list=service.getKey_StoreById(k, 1);
		System.out.println(list);
	}
}

