package map;

import java.util.Scanner;

// 직업(묶음)
enum Job{
	WARRIOR, MAGE, ARCHER;
}

public class Character {
	// 멤버 변수
	Job job;        //직업
	String name;	//이름
	int maxHp;		//최대체력
	int maxMp;		//최대마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int currentExp;	//현재 경험치
	int level;		//레벨
	int requireExp; //레벨업시 필요한 경험치
	
	public Character() {
		job = Job.WARRIOR;
		this.hp = 150;                  // 기본 생성자 초기값 설정
		this.maxHp = 150;
		this.mp = 50;
		this.maxMp = 50;
		this.att = 10;
		this.def = 5;
		this.level = 1;
		this.currentExp = 0;
		this.requireExp = 20;
	}
	// 멤버 함수
	public void SelectPlayer() {
		while(true)
		{
			System.out.println("------------------------");
			System.out.println("직업을 선택해주세요");
			System.out.println("(1)전사 (2)마법사 (3)궁수");
			
			int choice;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					job = Job.WARRIOR;
					this.hp = 150;                  // 캐릭터 스텟
					this.maxHp = 150;
					this.mp = 50;
					this.maxMp = 50;
					this.att = 10;
					this.def = 5;
					this.level = 1;
					this.currentExp = 0;
					this.requireExp = 20;
					System.out.println(job + "을 생성 했습니다!");
					return;
				case 2 :
					job = Job.MAGE;
					this.hp = 100;					// 캐릭터 스텟
					this.maxHp = 100;
					this.mp = 90;
					this.maxMp = 90;
					this.att = 20;
					this.def = 0;
					this.level = 1;
					this.currentExp = 0;
					this.requireExp = 20;
					System.out.println(job + "을 생성 했습니다!");
					return;
				case 3 :
					job = Job.ARCHER;
					this.hp = 120;					// 캐릭터 스텟
					this.maxHp = 120;
					this.mp = 70;
					this.maxMp = 70;
					this.att = 15;
					this.def = 3;
					this.level = 1;
					this.currentExp = 0;
					this.requireExp = 20;
					System.out.println(job + "을 생성 했습니다!");
					return;
					
				default:
					System.out.println("숫자 1~3중 하나를 입력하세요");
					break;
			}
		}
		
	}
	public void ShowPlayerStat() {
		System.out.println("------------------------");
		System.out.println("플레이어 레벨 " + level);
		System.out.println("플레이어 경험치 " + currentExp + "/" + requireExp);
		System.out.println("플레이어 체력 " + hp + "/" + maxHp);
		System.out.println("플레이어 마나 " + mp + "/" + maxMp);
		System.out.println("플레이어 공격력 " + att);
		System.out.println("플레이어 방어력 " + def);
		System.out.println("------------------------");
	}
	
	
	
}
