package com.bitcamp.app.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class FoodBean implements Serializable{
	private String foodSeq, menu, price, count;

	@Override
	public String toString() {
		return "메뉴 [상품명 : " + menu + ", 가격 : " + price + "원, 수량 : " + count + "]";
	}
	
}
