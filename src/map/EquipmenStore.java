package map;

public class EquipmenStore extends Map{
	
	int sword = 50;
	int shield = 50;
	int bow = 30;
	
	
	public int show (int money, int num) {
		
		name = "장비 상점";
		System.out.println(name + "에서 물건을 구매 중입니다.");
		
		// 장비 칼
		if (num == 1) {
			if (sword <= money) {
				return money - sword;
			}
		}
		
		// 장비 방패
		if (num == 2) {
			if (shield <= money) {
				return money - shield;
			}
		}
		
		// 장비 활
		if (num == 3) {
			if (bow <= money) {
				return money - bow;
			}
		}
		return money;
		
	}
	
	
	
	
	
	
	
}
