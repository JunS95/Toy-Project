package map;

public class Town {
	// 기본 생성자
	public Town() {
		
	}
	public void EnterTown(Character ch) {
		System.out.println("-----------------------");
		System.out.println("마을에 도착 했습니다.");
		ch.hp = ch.maxHp;
		System.out.println("체력을 회복했습니다." + ch.hp + "/" + ch.maxHp);		// 마을 생성 및 방문시 체력 회복
		ch.mp = ch.maxMp;
		System.out.println("체력을 회복했습니다." + ch.mp + "/" + ch.maxMp);		// 마을 생성 및 방문시 마나 회복
	}
	
	
	
	
}
