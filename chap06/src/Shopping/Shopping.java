package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		ArrayList goodsList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("1. 상품 등록 2. 종료");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				
				Goods goods = new Goods();
				
				System.out.println("상품 이름 입력");
				String goodsName = scan.next();
				goods.setGoodsName(goodsName);
				
				System.out.println("상품 가격 입력");
				int goodsValue = scan.nextInt();
				goods.setGoodsValue(goodsValue);
				
				goodsList.add(goods);
				
			} else if(menu == 2) {
				break;
			}
			
		}
		

		
//		System.out.println(goodsList.get(1));
		
		Member user = new Member();
		Goods goodsInfo = (Goods)goodsList.get(0);
		
		
//		String a1 = ((Goods)goodsList.get(0)).getGoodsName();
		String goodsName = goodsInfo.getGoodsName();
		int goodsValue = goodsInfo.getGoodsValue();
		
		user.choiGoodsName(goodsName);
		user.choiGoodsValue(goodsValue);
		
	}

}
