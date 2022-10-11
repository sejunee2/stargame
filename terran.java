package star;

public class terran extends tril {

	public terran(int mineral,int i) {
		super(mineral,i);
	}

	@Override
	public void attack() {
		System.out.println("불공격");
		
	}

	@Override
	public int reso() {
		
		return mineral;
	}

	@Override
	public int calcEnergy() {
		int att=1;
		for(int i=1;i<=mineral;i++) {
			att=att*i;
		}
		return att;
	}

	@Override
	public String toString() {
		
		return "종족=terran" + super.toString();
	}
	
}
