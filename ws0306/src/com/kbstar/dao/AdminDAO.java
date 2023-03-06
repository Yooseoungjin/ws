package com.kbstar.dao;

import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.DAO;

public class AdminDAO implements DAO<String, AdminDTO>{ //interface에서 선언한 generic을 초기화.

	@Override
	public void insert(AdminDTO v) {
		System.out.println("Admin "+v.getAid()+"님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println("Admin "+k+"님이 삭제되었습니다.");
		
	}

	@Override
	public void update(AdminDTO v) {
		System.out.println("Admin "+v.getAid()+"님의 정보가 갱신되었습니다.");
		
	}


}
