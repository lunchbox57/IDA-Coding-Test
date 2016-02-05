import java.util.*;

public class IDATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rounds,size,count,max=0;
		LinkedList<Integer>  ll;
		ArrayList<Integer> al;
		Scanner in = new Scanner(System.in);
		rounds = in.nextInt();
		if(rounds>1000)
			return;
		for (int i=0;i<rounds;i++){
			ll = new LinkedList<Integer>();
			al = new ArrayList<Integer>();
			size = in.nextInt();
			if(size>100)
				return;
			for (int j=0;j<size;j++){
				ll.add(in.nextInt());
			}
			
			for (int j=0;j<size;j++){
				count=0;
				for(int k=0;k<size;k++){
					if(ll.get(k)==(k+1))
						count++;
				}
				if(count>max)
					max=count;
				al.add(count);
				rotate(ll);
			}
			for(int k=0;k<al.indexOf(max);k++){
				rotate(ll);
			}
			printlist(size, ll);
		}
		in.close();
	}
	public static void printlist(int size, LinkedList<Integer> ll){
		for(int i=0;i<size;i++){
			System.out.print(ll.get(i)+" ");
		}
		System.out.print('\n');
	}
	public static void rotate(LinkedList<Integer> ll){
		int temp;
		temp= ll.pop();
		ll.add(temp);
	}
}
