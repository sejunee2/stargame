package star;

public abstract class tril {
	protected int mineral,id;
	
	public tril(int mineral,int i) {
		this.mineral = mineral;
		this.id = i;
	}
	
	public abstract void attack();
	public abstract int reso();
	public abstract int calcEnergy();
	@Override
	public String toString() {
		return " ���ֹ�ȣ="+id+ " �ڿ�=" + mineral;
	}

}
