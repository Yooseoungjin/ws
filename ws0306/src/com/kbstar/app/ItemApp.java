package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class ItemApp {

	public static void main(String[] args) {
		Service<String, ItemDTO> service = new ItemService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input q, i, d, u");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("C U NexTime!!!");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ItemName...");
				String itemName = sc.next();
				System.out.println("Input SerialNo...");
				String serialNo = sc.next();
				System.out.println("Input Price...");
				Double price = Double.parseDouble(sc.next());
				ItemDTO item = new ItemDTO(itemName, serialNo, price);
				service.register(item);
			} else if (cmd.equals("d")) {
				System.out.println("Input ItemName...");
				String itemName = sc.next();
				service.remove(itemName);
			} else if (cmd.equals("u")) {
				System.out.println("Input ItemName...");
				String itemName = sc.next();
				System.out.println("Input SerialNo...");
				String serialNo = sc.next();
				System.out.println("Input Price...");
				Double price = Double.parseDouble(sc.next());
				ItemDTO item = new ItemDTO(itemName, serialNo, price);
				service.modify(item);
			}
		}
		sc.close();
	}

}
