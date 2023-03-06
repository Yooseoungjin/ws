package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.AdminService;

public class AdminApp {

	public static void main(String[] args) {
		Service<String, AdminDTO> s=new AdminService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input Admin ID to regist..");
				String id = sc.next();
				System.out.println("Input Admin PW to regist..");
				String pwd = sc.next();
				System.out.println("Input Admin NAME to regist..");
				String name = sc.next();
				AdminDTO Admin = new AdminDTO(id, pwd, name);
				s.register(Admin);

			} else if (cmd.equals("d")) {
				System.out.println("Input ID to remove..");
				String id = sc.next();
				s.remove(id); // ??? 클래스 안의 id로 해당 클래스 선택?

			} else if (cmd.equals("u")) {
				System.out.println("Input ID to modify..");
				String id = sc.next();
				System.out.println("Input PW to modify..");
				String pwd = sc.next();
				System.out.println("Input NAME to modify..");
				String name = sc.next();
				AdminDTO admin = new AdminDTO(id, pwd, name);
				s.modify(admin);

			}
		}
		sc.close();
	}

}
