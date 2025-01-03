package Lecture34;
import java.util.*;

public class KruskalClass {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public KruskalClass(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public class EdgePair {

		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.cost = cost;
			this.e1 = e1;
			this.e2 = e2;
		}

		@Override
		public String toString() {
			return e1 + " - " + e2 + " @ " + cost;
		}
	}

	public ArrayList<EdgePair> getalledge() {
		ArrayList<EdgePair> list = new ArrayList<>();

		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {

				EdgePair eg = new EdgePair(e1, e2, map.get(e1).get(e2)); // EdgePair Class Invoked
				list.add(eg);

			}

		}
		return list;
	}

	public void KruskalsAlgorithm() {
		int ans = 0; //counting cost of the MST
		DisjointSet ds = new DisjointSet();   // A Disjoint Set (Union-Find) data structure is created to help in cycle detection.
		for (int k : map.keySet()) 
			ds.CreateSet(k);

		ArrayList<EdgePair> ll = getalledge();
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				return o1.cost - o2.cost;
			}
		});
		for (EdgePair edge : ll) {
			int e1 = edge.e1;
			int e2 = edge.e2;

			int re1 = ds.find(e1); // e1 ka jo root node hoga uski value aayegi
			int re2 = ds.find(e2); // e2 ka jo root node hoga uski value aayegi

			if (re1 == re2) { // checking for cycle, if dono node ke rootnode same hai to agar inko connect kar diya to cycle ban jaegi, so do nothing if they are equal
				// Same root element do nothing
			} else {
				System.out.println(edge);
				ans += edge.cost;
				ds.union(re1, re2);
			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //nodes
		KruskalClass ks = new KruskalClass(n);
		int m = sc.nextInt(); //edges
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.addEdge(v1, v2, cost);
		}
		ks.KruskalsAlgorithm();
		sc.close();
	}


}

/*
4 5 
1 2 3
2 3 4
3 4 1
4 2 8
1 4 5
 */
