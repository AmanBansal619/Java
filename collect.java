import java.util.*;
public class collect
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<>();
		LinkedList<Integer> l=new LinkedList<>();
		Vector<Integer> v=new Vector<>();
		Stack<Integer> s=new Stack<>();
		Queue<Integer> q=new PriorityQueue<>();
		Queue<Integer> d=new ArrayDeque<>();
		HashSet<Integer> h=new HashSet<>();
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		TreeSet<Integer> t=new TreeSet<>();
		HashMap<Integer,Integer> hm=new HashMap<>();
		LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<>();
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		hm.put(1,4);
		lm.put(1,4);
		tm.put(1,4);
		System.out.println(hm.get(1));
		h.add(123);
		lh.add(452);
		t.add(4566);
		q.add(456);
		v.add(15);
		l.add(41);
		a.add(16);
		s.add(155);
		a.set(0, 42);
		v.set(0, 48);
		l.set(0,45);
		s.set(0, 49);
		d.add(468);
		System.out.println(a.contains(42));
		System.out.println(v.size()+" "+a.size()+" "+l.size()+" "+s.size()+" "+q.size()+" "+v.get(0)+" "+q.peek()+" "+l.get(0)+" "+s.get(0)+" "+a.get(0)+" ");
	}
}
