
public interface EnemyAttacker {
	
	void fireWeapon();
	void driveForward();
	void assignDriver(String name);

}




class EnemyTank implements EnemyAttacker
{

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		System.out.println("fire tank");
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		System.out.println("Walk tank");
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		System.out.println("im tank driver " + name);
	}
	
}


class EnemyRobot 
{

	
	public void samashWithHands()
	{
		// TODO Auto-generated method stub
		System.out.println("samsh you with my hands");
		
	}

	
	public void walkForward() {
		// TODO Auto-generated method stub
		System.out.println("i can walk with legs");
	}

	
	public void reactToHuman(String name) {
		// TODO Auto-generated method stub
		System.out.println("to Human " + name);
		
	}
	
	
	
}

class EnemyRobotAdapter implements EnemyAttacker
{
		EnemyRobot eR=null;
		public EnemyRobotAdapter(EnemyRobot robot)
		{
			this.eR = robot;
		}
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
			eR.samashWithHands();
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		eR.walkForward();
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		eR.reactToHuman(name);
	}
	
}

class Demo 
{
	public static void main (String[] args)
	{
		EnemyRobot rb = new EnemyRobot();
		EnemyAttacker att = new EnemyRobotAdapter(rb);
		att.driveForward();
		att.fireWeapon();
		att.assignDriver("hunain");
	}
}