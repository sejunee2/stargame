package star;
import java.util.Random;

public class jerg extends tril {

	public jerg(int mineral,int i) {
		super(mineral, i);
	}
	
	@Override
	public void attack() {
		System.out.println("도끼 공격");
	}

	@Override
	public int reso() {
		return mineral;
	}

	@Override
	public int calcEnergy() {
		int att=0;
		for(int i=1;i<=mineral;i++) {
			att=mineral*mineral;
		}
		return att;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "종족=jerg" + super.toString();
	}

}
