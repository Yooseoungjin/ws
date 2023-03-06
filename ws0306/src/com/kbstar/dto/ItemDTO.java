package com.kbstar.dto;

public class ItemDTO {
	private String itemName;
	private String serialNo;
	private double price;
	
	public ItemDTO() {
		super();
	}

	public ItemDTO(String itemName, String serialNo, double price) {
		super();
		this.itemName = itemName;
		this.serialNo = serialNo;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemName=" + itemName + ", serialNo=" + serialNo + ", price=" + price + "]";
	}
}