package star;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		final int Terran =0;
		final int Jerg =1;
		final int Protoss=2;
		int kind;
		int unit;
		int mineral;
		Team a =new Team();
		Random r =new Random();
	
		
		unit = r.nextInt(5)+5;
		System.out.println("Team1의 구성원");
		for(int i=1;i<=unit;i++) {
			
			kind = r.nextInt(3);
			tril s =null;
			if(kind==Terran) {mineral = r.nextInt(5)+1; s=new terran(mineral,i);}
			else if(kind==Jerg) {mineral = r.nextInt(10)+1; s=new jerg(mineral,i);}
			else if(kind==Protoss) {mineral = r.nextInt(5)+1;s =new protoss(mineral,i);}
			a.addMembers(s);
			
		}
		int t1=a.print();
		
		unit = r.nextInt(5)+5;
		System.out.println();
		System.out.println("Team2의 구성원");
		for(int i=1;i<=unit;i++) {
			mineral = r.nextInt(5)+1;
			kind = r.nextInt(3);
			tril s =null;
			if(kind==Terran) s=new terran(mineral,i);
			else if(kind==Jerg) s=new jerg(mineral,i);
			else if(kind==Protoss) s =new protoss(mineral,i);
			a.addMembers2(s);
			
		}
		int t2=a.print2();
		
		if(t1<t2)System.out.println("Team2가 승리하였습니다.");
		else if (t1>t2)System.out.println("Team1이 승리하였습니다");
		else System.out.println("무승부입니다.");
	}
	
}
