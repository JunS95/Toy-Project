package map;

import java.io.IOException;
import java.util.Random;

enum MonsterType{
	SLIME, ORC, SKELETON, DRAGON, GHOST
}

public class Monster {
	MonsterType mt; // 멤버 변수
	int hp;
	int maxHp;
	int att;
	int def;
	int dropExp;
	
	public Monster() {
		mt = MonsterType.SLIME;		// 기본 생성자 초기값 설정
		this.hp = 10;
		this.maxHp = 10;
		this.att = 2;
		this.def = 0;
		this.dropExp = 15;
	}
	// 멤버 함수
	public void SpawnMonster() {
		Random random = new Random();		// 랜덤 객체 생성
		random.setSeed(System.currentTimeMillis()); // 완전한 랜덤성 부여
		
		int num = random.nextInt(5);     	// 0~4사이에 랜덤한 숫자 생성
		// 몬스터 스텟 수치
		switch(num) {
			case 0 : // Slime
				mt = MonsterType.SLIME;
				this.hp = 10;
				this.maxHp = 10;
				this.att = 2;
				this.def = 0;
				this.dropExp = 15;
				//System.out.println(mt + "를 만났다.");
				break;
			case 1 : // Orc
				mt = MonsterType.ORC;
				this.hp = 50;
				this.maxHp = 50;
				this.att = 5;
				this.def = 2;
				this.dropExp = 50;
				//System.out.println(mt + "를 만났다.");
				break;
			case 2 : // Skeleton
				mt = MonsterType.SKELETON;
				this.hp = 30;
				this.maxHp = 30;
				this.att = 10;
				this.def = 1;
				this.dropExp = 80;
				//System.out.println(mt + "를 만났다.");
				break;
			case 3 : // Dragon
				mt = MonsterType.DRAGON;
				this.hp = 100;
				this.maxHp = 100;
				this.att = 25;
				this.def = 15;
				this.dropExp = 150;
				//System.out.println(mt + "를 만났다.");
				break;
			case 4 : // Ghost
				mt = MonsterType.GHOST;
				this.hp = 66;
				this.maxHp = 66;
				this.att = 6;
				this.def = 6;
				this.dropExp = 66;
				//System.out.println(mt + "를 만났다.");
				break;
				
			default: // Exception Handling; spawn Slime
				mt = MonsterType.SLIME;
				this.hp = 10;
				this.att = 2;
				this.def = 0;
				this.dropExp = 15;
				//System.out.println(mt + "를 만났다.");
				break;
		}
	}
	public void ShowMonsterStat() {
		System.out.println(mt + "를 만났다.");
		System.out.println("몬스터 체력 " + hp + "/" + maxHp);
		System.out.println("몬스터 공격력 " + att);
		System.out.println("몬스터 방어력 " + def);
		System.out.println("------------------------");
	}
}
