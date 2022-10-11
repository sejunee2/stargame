package star;
import java.util.ArrayList;

public class Team {
	private ArrayList<tril> team1 = new ArrayList<tril>();
	private int total1=0,total2=0;
	public void addMembers(tril s) {
		team1.add(s);
	}
	public int print() {
		for(tril s : team1) {
			System.out.println(s.toString());
			System.out.print("에너지 = "+s.calcEnergy()+" ");
			s.attack();
			total1 += s.calcEnergy();
		}
		System.out.println("Team1의 에너지 총합="+total1);
		return total1;
	}
	
	private ArrayList<tril> team2 = new ArrayList<tril>();
	
	public void addMembers2(tril s) {
		team2.add(s);
	}
	public int print2() {
		for(tril s : team2) {
			System.out.println(s.toString());
			System.out.print("에너지 = "+s.calcEnergy()+" ");
			s.attack();
			total2 += s.calcEnergy();
		}
		System.out.println("Team2의 에너지 총합="+total2);
		return total2;
	}
}
