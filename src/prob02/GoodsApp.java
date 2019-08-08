package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);
			
			Goods good = new Goods(name, price, countStock);
			goods[i] = good;
		}
		
		for (Goods good : goods) {
			System.out.println(good.getName()+"(가격:"+good.getPrice()+")이 "+good.getCountStock()+"개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}
