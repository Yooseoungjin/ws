package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO>{
	DAO<String, ItemDTO> dao;

	@Override
	public void insert(ItemDTO v) {
		System.out.println(v.getItemName() + "건이 저장되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "건이 삭제되었습니다.");
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v.getItemName() + "건이 업데이트되었습니다.");
	}

}
