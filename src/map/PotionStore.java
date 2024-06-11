package map;

public class PotionStore extends Map{
	
	int powerPotion = 20;            // 힘 물약
	int defensePotion = 20;          // 방어 물약
	int experiencePotion = 60;       // 경험치 물약
	int hpPotion = 10;               // 회복 물약
	int mpPotion = 10;               // 마나 물약
	
	
	public int show(int money, int num) {
		
		name = "약물 상점";
		System.out.println(name + "에서 물건을 구매 중입니다.");
		
		if(num == 1) {
			if(powerPotion <= money) {
				return money = powerPotion;
			}
		}
		
		if(num == 2) {
			if(defensePotion <= money) {
				return money = defensePotion;
			}
		}
		
		if(num == 3) {
			if(experiencePotion <= money) {
				return money = experiencePotion;
			}
		}
		
		if(num == 4) {
			if(hpPotion <= money) {
				return money = hpPotion;
			}
		}
		
		if(num == 5) {
			if(mpPotion <= money) {
				return money = mpPotion;
			}
		}
		return money;
	}
	
	
}
