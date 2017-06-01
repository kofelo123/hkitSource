package com.inter._0518;

public class FighterTest {

	public static void main(String[] args) {
		ChildFighter f = new ChildFighter();
		
		
		if(f instanceof Fighter){
			System.out.println("f�� FighterŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Unit){
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable){
			System.out.println("f�� FightableŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Movable){
			System.out.println("f�� MovableŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Attackable){
			System.out.println("f�� AttackableŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Object){
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
	}
}

class ChildFighter extends Fighter{
	
}

class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
}

class Unit2{
	int currentHP;
	int x;
	int y;
}


interface Fightable extends Movable,Attackable{}
interface Movable{void move(int x, int y);}
interface Attackable { void attack(Unit u);}