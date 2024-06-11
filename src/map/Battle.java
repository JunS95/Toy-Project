package map;

import java.util.Scanner;

public class Battle {
	public void SelectAction(Character ch, Monster monster, Town town) {
		int choice;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("(1) 전투 (2) 마을 (3) 도주");
		
		choice = sc.nextInt();
		if (choice == 1)
		{
			Battle(ch, monster);
		}
		else if (choice == 2)
		{
			town.EnterTown(ch);
		}
		else 
		{
			return;
		}
	}
	
	public void Battle(Character ch, Monster monster) {
		while(true) 
		{
			int damage = ch.att - monster.def;
			if(damage < 0) {
				damage = 0;
			}
			
			// 선 공격
			monster.hp = monster.hp - damage;
			
			System.out.println(monster.mt + "에게 " + damage + "만큼 피해 줌!");
			
			if(monster.hp < 0) {
				monster.hp = 0;
			}
			
			System.out.println(monster.mt+ "의 남은체력 " + monster.hp);

			
			if(monster.hp == 0) {
				System.out.println(monster.mt + "를 처치했습니다.");
				// 드래곤을 처치시 엔딩
				if(monster.mt == monster.mt.DRAGON) {
					Ending();
				}
				// 레벨업 및 남은 경험치량
				ch.currentExp = ch.currentExp + monster.dropExp;
				while(ch.currentExp >= ch.requireExp) {
					LevelUp(ch);
				}
				return;
			}
			// 적 데미지 연산
			damage = monster.att - ch.def;
			if(damage < 0) {
				damage = 0;
			}
			// 공격 당함
			ch.hp = ch.hp - damage;
			
			if(ch.hp < 0) {
				ch.hp = 0;
			}
			System.out.println(ch.job + "은 " + monster.mt + "에게 " + damage + "피해 입음");
			System.out.println(ch.job + "의 남은체력 " + ch.hp);
			
			if(ch.hp == 0) {
				System.out.println("당신은 사망 하였습니다.");
				return;
			}
		}
	}
	
	void LevelUp(Character ch) {			// 캐릭터 레벨업에 따른 스텟수치 배분
		ch.currentExp = ch.currentExp - ch.requireExp;
		ch.level = ch.level + 1;
		ch.maxHp = ch.maxHp + 5;
		ch.maxMp = ch.maxMp + 2;
		ch.att = ch.att + 2;
		ch.def = ch.def + 1;
		ch.requireExp = ch.requireExp + 10;
	}
	
	void Ending()
	{
		System.out.println("축하합니다 게임을 클리어 했습니다.");
		System.exit(0);            // 콘솔창 정상 종료
	}
	
}
