package com.ty.key_store.service;

import java.util.ArrayList;
import java.util.List;

import com.ty.key_store.dao.KeyStoreDao;
import com.ty.key_store.dto.Key_Store;

public class KeyStoreService {
	
	KeyStoreDao dao = new KeyStoreDao();
	List<Key_Store> list = new ArrayList();
	
	public int saveKeyStore(Key_Store key_Store) {
		return dao.saveKey_Store(key_Store);
	}
	
	public List<Key_Store> getKey_StoreById(Key_Store key_store, int id){
		list = dao.getKey_StoreById(key_store, id);
		return list;
	}
}
