package map;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		//SelectPlayer();
		
		Character ch = new Character();
		Monster monster = new Monster();
		Town town = new Town();
		
		Battle bt = new Battle();
		
		ch.SelectPlayer(); 			// 캐릭터 선택
		
		
		while(true)
		{
			monster.SpawnMonster();		// 몬스터 스폰
			
			ch.ShowPlayerStat();		// 캐릭터 선택시 스탯
			monster.ShowMonsterStat();  // 몬스터 스폰시 스탯
			
			bt.SelectAction(ch, monster, town); // 행동 선택
			
			if (ch.hp == 0)				// 캐릭터 사망시(체력이 0이 될시) 게임 종료
			{
				break;
			}
		}
		
		
		
		
	}


}
