package star;
import java.util.Random;

public class protoss extends tril {

	public protoss(int mineral,int i) {
		super(mineral,i);
	}

	@Override
	public void attack() {
		System.out.println("활 공격");
	}

	@Override
	public int reso() {
		return mineral;
	}

	@Override
	public int calcEnergy() {
		int att=1;
		att =(int)(Math.pow(mineral, mineral));
		return att;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "종족=protoss"+super.toString();
	}
	
}
