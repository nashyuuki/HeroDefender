package com.example.herodefender;

import com.example.herodefender.config.ImageConfig;
import com.example.herodefender.sprite.MonsterSprite;
import com.example.herodefender.sprite.WallSprite;

import android.content.res.Resources;
import android.graphics.Color;

public class GameConsts
{
	Resources resources;
	public static final int CITYWALL_HP=300;
	public static final int BAT_ATTACK=3;
	public static final int BAT_SPEED=3;
	public static final int HURT_STONE_POSITION=-20;
	public static final int STONE_ATTACK=10;
	public static final int ARROW_ATTACK=3;
	public static final int MONSTER_HP=100;
	public static final int MONSTER_ATTACK=3;
	public static final int HERO_MP=100;
	public static final int AIR_MP=50;
	public static final int ARROW_SPEED=3;
	public static final int AIR_SPEED=3;
	public static final int WOUND_MULTIPLE=20;
	public static final int MONSTER_SPEED=20;
//	public static final int[][] BARRIER_SET=
//		{
//			{3,MonsterSprite.TYPE_WEREWOLVES,0},
//			{8,MonsterSprite.TYPE_WEREWOLVES,1},
//			{13,MonsterSprite.TYPE_WEREWOLVES,2},
//			{18,MonsterSprite.TYPE_ZOMBIE,0},
//			{23,MonsterSprite.TYPE_ZOMBIE,1},
//			{28,MonsterSprite.TYPE_ZOMBIE,2},
//			{33,MonsterSprite.TYPE_VAMPIRE,0},
//			{38,MonsterSprite.TYPE_VAMPIRE,1},
//			{43,MonsterSprite.TYPE_VAMPIRE,2},
//			{48,MonsterSprite.TYPE_VAMPIRE,0},
//			
//		};
	public static final int[][] BARRIER_SET=
		{
			{0,MonsterSprite.TYPE_WEREWOLVES,0},
			{0,MonsterSprite.TYPE_WEREWOLVES,1},
			{0,MonsterSprite.TYPE_WEREWOLVES,2},
			{8,MonsterSprite.TYPE_ZOMBIE,0},
			{8,MonsterSprite.TYPE_ZOMBIE,1},
			{8,MonsterSprite.TYPE_ZOMBIE,2},
			{13,MonsterSprite.TYPE_VAMPIRE,0},
			{13,MonsterSprite.TYPE_VAMPIRE,1},
			{13,MonsterSprite.TYPE_VAMPIRE,2},
			{48,MonsterSprite.TYPE_VAMPIRE,0},
			
		};
//	public static final int[][] BARRIER_SET=
//		{
//			{3,MonsterSprite.TYPE_ZOMBIE,0},
//			{8,MonsterSprite.TYPE_ZOMBIE,1},
//			{13,MonsterSprite.TYPE_ZOMBIE,2},
//			{18,MonsterSprite.TYPE_ZOMBIE,0},
//			{23,MonsterSprite.TYPE_ZOMBIE,1},
//			{28,MonsterSprite.TYPE_ZOMBIE,2},
//			{33,MonsterSprite.TYPE_ZOMBIE,0},
//			{38,MonsterSprite.TYPE_ZOMBIE,1},
//			{43,MonsterSprite.TYPE_ZOMBIE,2},
//			{48,MonsterSprite.TYPE_ZOMBIE,0},
//		};
	public static final int[] MENU_PAUSE_POSITION=
		{
			306,216
		};
	public static final int[] BAR_POSITION=
		{
			0,616
		};
	public static final int[] BUTTON_POSITION=
		{
			87,60
		};
	public static final int[] BUTTON_COLLISION=
		{
			87,60,168,108
		};
	public static final int[] MENU_PAUSE_SCRIPT=
		{
			ImageConfig.MENU_PAUSE01,
			ImageConfig.MENU_PAUSE02,
			ImageConfig.MENU_PAUSE03,
			ImageConfig.MENU_PAUSE04,
		};
	public static final int[] BAR_START_SCRIPT=
		{
			ImageConfig.UI_BAR01,
			ImageConfig.UI_BAR02,
			ImageConfig.UI_BAR03,
			ImageConfig.UI_BAR04,
			ImageConfig.UI_BAR05,
			ImageConfig.UI_BAR06,
			ImageConfig.UI_BAR07,
		};
	public static final int[] BACKGROUND_POSITION={0,0};
	public static final int[] CITYWALL_POSITION={987,-19};
	public static final int[] BAR_TIME_POSITION=
		{
			540,68,248,32,5
		};
	public static final int[] BAR_HP_POSITION=
		{// x,y,width,height,size
			915, 68, 261, 32 ,5
		};
	public static final int[] CITYWALL_STAY_SCRIPT=
		{
			ImageConfig.CITY_WALL_STAY01,
			ImageConfig.CITY_WALL_STAY02,
			ImageConfig.CITY_WALL_STAY03,
			ImageConfig.CITY_WALL_STAY04,
			ImageConfig.CITY_WALL_STAY05,
			ImageConfig.CITY_WALL_STAY06,
			ImageConfig.CITY_WALL_STAY07,
			ImageConfig.CITY_WALL_STAY08,
			ImageConfig.CITY_WALL_STAY09,
		};
	public static final int[] CITYWALL_DESTROY_SCRIPT=
		{
			ImageConfig.CITY_WALL_DESTROY01,
			ImageConfig.CITY_WALL_DESTROY02,
			ImageConfig.CITY_WALL_DESTROY03,
			ImageConfig.CITY_WALL_DESTROY04,
			ImageConfig.CITY_WALL_DESTROY05,
		};
	public static final int[] WALL_LONG_SCRIPT=
		{
			ImageConfig.WALL_LONG01,
			ImageConfig.WALL_LONG02,
			ImageConfig.WALL_LONG03,
			ImageConfig.WALL_LONG04,
			ImageConfig.WALL_LONG05,
		};
	public static final int[] WALL_SCRIPT=
		{
			ImageConfig.WALL01,
			ImageConfig.WALL02,
			ImageConfig.WALL03,
			ImageConfig.WALL04,
			ImageConfig.WALL05,
		};
	public static final int[] MONSTER_MOVE_SCRIPT=
		{
			ImageConfig.MONSTER_MOVE01,
			ImageConfig.MONSTER_MOVE02,
			ImageConfig.MONSTER_MOVE03,
			ImageConfig.MONSTER_MOVE04,
			ImageConfig.MONSTER_MOVE05,
		};
	public static final int[] MONSTER_UP_SCRIPT=
		{
			ImageConfig.MONSTER_UP01,
			ImageConfig.MONSTER_UP02,
			ImageConfig.MONSTER_UP03,
			ImageConfig.MONSTER_UP04,
			ImageConfig.MONSTER_UP05,
		};
	public static final int[] MONSTER_DOWN_SCRIPT=
		{
			ImageConfig.MONSTER_DOWN01,
			ImageConfig.MONSTER_DOWN02,
			ImageConfig.MONSTER_DOWN03,
			ImageConfig.MONSTER_DOWN04,
			ImageConfig.MONSTER_DOWN05,
		};
	public static final int[][] MONSTER_ATTACK_SCRIPT=
		{// ����,�����R�� 1=�R��
			{ImageConfig.MONSTER_ATTACK04,0},
			{ImageConfig.MONSTER_ATTACK05,1},
		};
	public static final int MONSTER_ATTACK_POSITION=900;//950
	public static final int[][] WALL_POSITION=
		{// x,y,layer,state
			{-3,161,0,WallSprite.WALL_LONG},
			{459,161,0,WallSprite.WALL},
			{902,161,0,WallSprite.WALL},
			{-3,395,1,WallSprite.WALL_LONG},
			{459,395,1,WallSprite.WALL},
			{902,395,1,WallSprite.WALL}
		};
	public static final int[] HERO_MP_POSITION=
		{//x,y ,width,height,Stroke width
			188,250,90,10,5
		};
	public static final int[] HERO_STAY_SCRIPT=
		{
			ImageConfig.HERO_STAY01,
			ImageConfig.HERO_STAY02,
			ImageConfig.HERO_STAY03,
			ImageConfig.HERO_STAY04,
		};
	public static final int[] HERO_SHOOT01_SCRIPT=
		{
			ImageConfig.HERO_SHOOT03,
		};
	public static final int[][] HERO_SHOOT02_SCRIPT=
		{
			{ImageConfig.HERO_SHOOT02,-1,37,124},
			{ImageConfig.HERO_SHOOT03,1,45,124},
			{ImageConfig.HERO_SHOOT02,1,56,124},
		};
	public static final int[] HERO_STONE_SCRIPT=
		{
			ImageConfig.HERO_STONE01,
			ImageConfig.HERO_STONE01,
			ImageConfig.HERO_STONE01,
			ImageConfig.HERO_STONE01,
			ImageConfig.HERO_STONE02,
			ImageConfig.HERO_STONE02,
			ImageConfig.HERO_STONE03,
			ImageConfig.HERO_STONE03,
		};
	public static final int[] HERO_COLLISION=
		{
			95,103,312,245
		};
	public static final int[] HERO_BOOM_SCRIPT=
		{
			ImageConfig.HERO_BOOM01,
			ImageConfig.HERO_BOOM02,
			ImageConfig.HERO_BOOM01,
			ImageConfig.HERO_BOOM02,
			ImageConfig.HERO_BOOM03,
			ImageConfig.HERO_BOOM04,
		};
	public static final int[] HERO_BOOM_END_SCRIPT=
		{
			ImageConfig.HERO_BOOM05,
			ImageConfig.HERO_BOOM06,
			ImageConfig.HERO_BOOM07,
			ImageConfig.HERO_BOOM06,
			ImageConfig.HERO_BOOM05,
		};
	public static final int[] HERO_FAULURE_SCRIPT=
		{
			ImageConfig.HERO_FAILURE01,
			ImageConfig.HERO_FAILURE02,
			ImageConfig.HERO_FAILURE03,
			ImageConfig.HERO_FAILURE04,
			ImageConfig.HERO_FAILURE05,
			ImageConfig.HERO_FAILURE06,
			ImageConfig.HERO_FAILURE07,
		};
	public static final int[] HERO_WIN_SCRIPT=
		{
			ImageConfig.HERO_WIN01,
			ImageConfig.HERO_WIN02,
			ImageConfig.HERO_WIN03,
			ImageConfig.HERO_WIN04,
			ImageConfig.HERO_WIN05,
			ImageConfig.HERO_WIN06,
			ImageConfig.HERO_WIN07,
			ImageConfig.HERO_WIN08,
		};
	public static final int[] HERO_BOOM_POSITION=
		{
			-962,0
		};
	public static final int[] MONSTER_DEAD_SCRIPT=
		{
			ImageConfig.MONSTER_DEAD01,
			ImageConfig.MONSTER_DEAD02,
			ImageConfig.MONSTER_DEAD03,
			ImageConfig.MONSTER_DEAD04,
			ImageConfig.MONSTER_DEAD05,
		};
	public static final int[] MONSTER_HURT_SCRIPT=
		{
			ImageConfig.MONSTER_HURT01,
			ImageConfig.MONSTER_HURT02,
			ImageConfig.MONSTER_HURT03,
			ImageConfig.MONSTER_HURT04,
		};
	public static final int[] WEREWOLVES_MOVE_SCRIPT=
		{
			ImageConfig.WEREWOLVES_MOVE01,
			ImageConfig.WEREWOLVES_MOVE02,
			ImageConfig.WEREWOLVES_MOVE03,
			ImageConfig.WEREWOLVES_MOVE04,
		};
	public static final int[] WEREWOLVES_UP_SCRIPT=
		{
			ImageConfig.WEREWOLVES_UP01,
			ImageConfig.WEREWOLVES_UP02,
			ImageConfig.WEREWOLVES_UP03,
			ImageConfig.WEREWOLVES_UP04,
		};
	public static final int[] WEREWOLVES_DOWN_SCRIPT=
		{
			ImageConfig.WEREWOLVES_DOWN01,
			ImageConfig.WEREWOLVES_DOWN02,
			ImageConfig.WEREWOLVES_DOWN03,
			ImageConfig.WEREWOLVES_DOWN04,
		};
	public static final int[][] WEREWOLVES_ATTACK_SCRIPT=
		{
			{ImageConfig.WEREWOLVES_ATTACK01,0},
			{ImageConfig.WEREWOLVES_ATTACK02,0},
			{ImageConfig.WEREWOLVES_ATTACK03,0},
			{ImageConfig.WEREWOLVES_ATTACK04,1},
		};
	public static final int[] WEREWOLVES_DEAD_SCRIPT=
		{
			ImageConfig.WEREWOLVES_DEAD01,
			ImageConfig.WEREWOLVES_DEAD02,
		};
	public static final int[] WEREWOLVES_STONE_SCRIPT=
		{
			ImageConfig.WEREWOLVES_STONE01,
			ImageConfig.WEREWOLVES_STONE02,
		};
	public static final int[] ZOMBIE_MOVE_SCRIPT=
		{
			ImageConfig.ZOMBIE_MOVE01,
			ImageConfig.ZOMBIE_MOVE02,
			ImageConfig.ZOMBIE_MOVE03,
			ImageConfig.ZOMBIE_MOVE04,
		}; 
	public static final int[] ZOMBIE_UP_SCRIPT=
		{
			ImageConfig.ZOMBIE_UP01,
			ImageConfig.ZOMBIE_UP02,
			ImageConfig.ZOMBIE_UP03,
			ImageConfig.ZOMBIE_UP04,
		};
	public static final int[] ZOMBIE_DOWN_SCRIPT=
		{
			ImageConfig.ZOMBIE_DOWN01,
			ImageConfig.ZOMBIE_DOWN02,
			ImageConfig.ZOMBIE_DOWN03,
			ImageConfig.ZOMBIE_DOWN04,
		};
	public static final int[][] ZOMBIE_ATTACK_SCRIPT=
		{
			{ImageConfig.ZOMBIE_ATTACK01,0},
			{ImageConfig.ZOMBIE_ATTACK02,1},
		};
	public static final int[] ZOMBIE_DEAD_SCRIPT=
		{
			ImageConfig.ZOMBIE_DEAD01,
			ImageConfig.ZOMBIE_DEAD02,
			ImageConfig.ZOMBIE_DEAD03,
		};
	public static final int[] ZOMBIE_STONE_SCRIPT=
		{
			ImageConfig.ZOMBIE_STONE01,
			ImageConfig.ZOMBIE_STONE02,
		};
	public static final int[] VAMPIRE_MOVE_SCRIPT=
		{
			ImageConfig.VAMPIRE_MOVE01,
			ImageConfig.VAMPIRE_MOVE02,
			ImageConfig.VAMPIRE_MOVE03,
			ImageConfig.VAMPIRE_MOVE04,
		};
	public static final int[] VAMPIRE_UP_SCRIPT=
		{
			ImageConfig.VAMPIRE_UP01,
			ImageConfig.VAMPIRE_UP02,
			ImageConfig.VAMPIRE_UP03,
			ImageConfig.VAMPIRE_UP04,
		};
	public static final int[] VAMPIRE_DOWN_SCRIPT=
		{
			ImageConfig.VAMPIRE_DOWN01,
			ImageConfig.VAMPIRE_DOWN02,
			ImageConfig.VAMPIRE_DOWN03,
			ImageConfig.VAMPIRE_DOWN04,
		};
	public static final int[] VAMPIRE_DEAD_SCRIPT=
		{
			ImageConfig.VAMPIRE_DEAD01,
			ImageConfig.VAMPIRE_DEAD02,
		};
	public static final int[] VAMPIRE_STONE_SCRIPT=
		{
			ImageConfig.VAMPIRE_STONE01,
			ImageConfig.VAMPIRE_STONE02,
		};
	public static final int[][] VAMPIRE_ATTACK_SCRIPT=
		{
			{ImageConfig.VAMPIRE_SHOOT01,0},
			{ImageConfig.VAMPIRE_SHOOT02,1},
		};
	public static final int[] MONSTER_STAY_SCRIPT=
		{
			ImageConfig.MONSTER_STAY01,
			ImageConfig.MONSTER_STAY02,
			ImageConfig.MONSTER_STAY03,
			ImageConfig.MONSTER_STAY04,
		};
	public static final int[] WEREWOLVES_STAY_SCRIPT=
		{
			ImageConfig.WEREWOLVES_STAY01,
			ImageConfig.WEREWOLVES_STAY02,
		};
	public static final int[] ZOMBIE_STAY_SCRIPT=
		{
			ImageConfig.ZOMBIE_STAY01,
			ImageConfig.ZOMBIE_STAY02,
		};
	public static final int[] VAMPIRE_STAY_SCRIPT=
		{
			ImageConfig.VAMPIRE_STAY01,
			ImageConfig.VAMPIRE_STAY02,
			ImageConfig.VAMPIRE_STAY01,
			ImageConfig.VAMPIRE_STAY02,
		};
	public static final int[][] MONSTER_AIR_SCRIPT=
		{
			{ImageConfig.MONSTER_AIR,ImageConfig.MONSTER_STAY01},
			{ImageConfig.WEREWOLVES_AIR,ImageConfig.WEREWOLVES_STAY01},
			{ImageConfig.ZOMBIE_AIR,ImageConfig.ZOMBIE_STAY01},
			{ImageConfig.VAMPIRE_AIR,ImageConfig.VAMPIRE_STAY01},
		};
	public static final int[][] ARROW_MOVE_SCRIPT=
		{
			{ImageConfig.ARROW_MOVE01,ImageConfig.ARROW_MOVE02},
			{ImageConfig.BULLET_MOVE01,ImageConfig.BULLET_MOVE02},
			{ImageConfig.CROSS_MOVE01,ImageConfig.CROSS_MOVE02,ImageConfig.CROSS_MOVE03},
			{ImageConfig.SYRINGE_MOVE01,ImageConfig.SYRINGE_MOVE02},
			{ImageConfig.BAT_MOVE01,ImageConfig.BAT_MOVE02},
		};
	public static final int[][] ARROW_BROKEN_SCRIPT=
		{
			{ImageConfig.ARROW_BROKEN01,ImageConfig.ARROW_BROKEN02},
			{ImageConfig.BULLET_BROKEN01,ImageConfig.BULLET_BROKEN02},
			{ImageConfig.CROSS_BROKEN01,ImageConfig.CROSS_BROKEN02},
			{ImageConfig.SYRINGE_BROKEN01,ImageConfig.SYRINGE_BROKEN02},
			{ImageConfig.BAT_BROKEN01,ImageConfig.BAT_BROKEN02},
		};
	public static final int[][] ARROW_HIT_SCRIPT=
		{
			{ImageConfig.ARROW_HIT01,ImageConfig.ARROW_HIT02,ImageConfig.ARROW_HIT03},
			{ImageConfig.BULLET_HIT01,ImageConfig.BULLET_HIT02,ImageConfig.BULLET_HIT03},
			{ImageConfig.CROSS_HIT01,ImageConfig.CROSS_HIT02,ImageConfig.CROSS_HIT03},
			{ImageConfig.SYRINGE_HIT01,ImageConfig.SYRINGE_HIT02,ImageConfig.SYRINGE_HIT03},
			{ImageConfig.BAT_HIT01,ImageConfig.BAT_HIT02,ImageConfig.BAT_HIT03},
		};
	public static final int[] ARROW_STAY_SCRIPT=
		{
			ImageConfig.ARROW_STAY,
			ImageConfig.BULLET_STAY,
			ImageConfig.CROSS_STAY,
			ImageConfig.SYRINGE_STAY,
		};
	public static final int[] MONSTER_WOUNDED_SCRIPT=
		{
			ImageConfig.MONSTER_WOUNDED01,
			ImageConfig.MONSTER_WOUNDED02,
		};
	public static final int[] WEREWOLVES_WOUNDED_SCRIPT=
		{
			ImageConfig.WEREWOLVES_WOUNDED01,
			ImageConfig.WEREWOLVES_WOUNDED02,
		};
	public static final int[] ZOMBIE_WOUNDED_SCRIPT=
		{
			ImageConfig.ZOMBIE_WOUNDED01,
			ImageConfig.ZOMBIE_WOUNDED02,
		};
	public static final int[] VAMPIRE_WOUNDED_SCRIPT=
		{
			ImageConfig.VAMPIRE_WOUNDED01,
			ImageConfig.VAMPIRE_WOUNDED02,
		};
	public static final int[] ZOMBIE_CREEP_SCRIPT=
		{
			ImageConfig.ZOMBIE_CREEP01,
			ImageConfig.ZOMBIE_CREEP02,
			ImageConfig.ZOMBIE_CREEP03,
			ImageConfig.ZOMBIE_CREEP04,
		};
	public static final int[] ZOMBIE_CREEP_UP_SCRIPT=
		{
			ImageConfig.ZOMBIE_CREEP_UP01,
			ImageConfig.ZOMBIE_CREEP_UP02,
		};
	public static final int[] ZOMBIE_CREEP_DOWN_SCRIPT=
		{
			ImageConfig.ZOMBIE_CREEP_DOWN01,
			ImageConfig.ZOMBIE_CREEP_DOWN02,
		};
	public static final int[] ZOMBIE_TOPPLE_SCRIPT=
		{
			ImageConfig.ZOMBIE_TOPPLE01,
			ImageConfig.ZOMBIE_TOPPLE02,
			ImageConfig.ZOMBIE_TOPPLE03,
		};
	public static final int BAT_ATTACK_POSITION=1020;
	public static final int[] BAT_POSITION=
		{
			113,45
		};
	public static final int[] BAT_COLLISION=
		{
			11,11,89,81
		};
	public static final int[] MONSTER_HP_POSITION=
		{//x,y ,width,height,Stroke width
			35,150,90,10,5
		};
	public static final int[] ARROW_POSITION=
		{
			83,124
		};
	public static final int[] ARROW_COLLISION=
		{
			21,41,89,61
		};
	
	public static final int[] AIR_SCRIPT=
		{//image,x,y,apha
			185,77,125
		};
	public static final int[][] HERO_AIR_SCRIPT=
		{
//			{105,75,Color.YELLOW,150,50},]
			{15,12,Color.YELLOW,25,255},
			{35,25,Color.YELLOW,50,150},
			{70,50,Color.YELLOW,100,80},
//			{70,50,Color.WHITE,100,100},
		};
	public static final int[][] HERO_POSITION=
		{
			{959,-100},
			{959,135},
			{959,350},
		}; 
	public static final int[][] DOOR_POSITION=
		{
			{224,8,0},
			{667,8,0},
			{224,243,1},
			{667,243,1}
		};
	public static final int[][] DOOR_COLLISION=
		{
			{228,0,257,226},
			{0,157,241,225},
			{218,171,243,401},
		};
	public static final int[][] MONSTER_POSITION=
		{// x,y1,y2
			{-200,-10},//{-77,-19,50},//0
			{-200,220},//{-77,162,285},//230
			{-200,450},//{-77,396,485}//460
		};
	
	public static final int[] DOOR_SET_POSITION=
		{//�P�_�n�έ��Ӫ� x�y�� �϶�
			481,924
		};
	public static final int[] MONSTER_DOOR_COLLISION=
		{//�W�U���ʪ��I x�y��
			259,702
		};
	public static final int[] MONSTER_MID_POSITION=
		{//��V���u �y�� y 
			0,230,460
		};
	public static final int[][] DOOR_SET=
		{//����DOOR_POSITION DOOR_SET_POSITION
			{0,2},
			{1,3},
		};
	public static final int[] LAYER_POSITION=
		{//�]�w�W�U�ϼh y�y��
			70,395//161,395
		};
	public static final int[] UP_MID_DOOR_COLLISION=
		{
			77,53,208,165//99,53,208,207
		};
	public static final int[] DOWN_MID_DOOR_COLLISION=
		{
			66,218,195,325//101,191,221,325
		};
	public static final int[] MONSTER_COLLISION=
		{
			29,32,113,161
		};
	public static final int[] MID_UP_DOOR_SCRIPT=
		{// x1,y1,x2
			129,-11,224
		};
	public static final int[] FLY_UP_DOOR_SCRIPT=
		{//y1,y2
			-60,-150
		};
	public static final int[] UP_MID_DOOR_SCRIPT=
		{//y1
			120,194
		};
	public static final int[] MID_DOWN_DOOR_SCRIPT=
		{//x1,y1,x2
			135,216,224
		};
	public static final int[] FLY_DOWN_DOOR_SCRIPT=
		{//y1,y2
			280,370
		};
	public static final int[] DOWN_MID_DOOR_SCRIPT=
		{//y1,y2
			97,39
		};
	public GameConsts(Resources resources)
	{
		this.resources=resources;
	}
	public int getInt(int id)
	{
		return this.resources.getInteger(id);
	}
	public int[] getArrayInt(int id)
	{
		return this.resources.getIntArray(id);
	}
	public int[][] getArrayInt(int[] id)
	{
		int[][] arrays=new int[id.length][];
		for(int i=0;i<id.length;i++)
		{
			arrays[i]=getArrayInt(id[i]);
		}
		return arrays;
	}
}