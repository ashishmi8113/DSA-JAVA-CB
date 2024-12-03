package Lecture33;
import java.util.*;
public class GraphClass2 {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public GraphClass2(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public boolean BFS(int src, int dis) { // it works breadth wise means Node ke neighbour wise traverse se
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		qq.add(src);
		while (!qq.isEmpty()) {
			// remove
			int r = qq.remove();
			// Ignore if Already Visited
			if (visited.contains(r)) { // ye check isliye kyuki agar mai iss 'r' ko pehle visit kar chuka hu to aab dubara check kyu karu isse, iska matlab pehle kabhi ye aaya tha, mene visit kiya isse, aur ye mera destination nhi nikla too iss bar bhi dubara check karne ka kya fayda aab bhi ye destination nhi niklega so just skip below part i.e continue
				continue;
			}
			// visited mark
			visited.add(r); // if it comes first time so add in visit
			// work
			if (r == dis) {
				return true;
			}
			// nbrs add krna
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) { // ye check isliye ki jo bhi 'r' ka neighbour hoga wo agar pehle visit ho chuka hua hai to aab usse queue mai kyu dalu, queue mai dalne ka matlab abhi tak ye particular node visit mhi hua hai to isse queue mai daal do taaki future mai visit ho paye.
					qq.add(nbrs);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// remove
			int r = st.pop();
			// Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}
			// visited mark
			visited.add(r);
			// work
			if (r == dis) {
				return true;
			}
			// nbrs add krna
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {

		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : map.keySet()) { // ye outer loop isliye kyuki agar koi diconnected node hai graph mai to wo bhi traverse ho paye, wo chuth na jaye isliye ye loop lagaya
			if (visited.contains(src)) { // agar ek bhi diconected node nhi hua graph mai to iska matlab hum sare nods ko traverse kar chuke honge to ye sabhi traversed node ko skip karwa dege taaki revisit na hi jaye
				continue;
			}
			
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
			
		}

	}

	public void DFT() {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int r = st.pop();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}

	}

	public boolean isCycle() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		// count =0; For counting the Cycles
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				System.out.println("r"+r);
				System.out.println("keyset:"+map.get(r).keySet());
				System.out.println("queue:"+qq);
				System.out.println("visited:"+visited);
				// Ignore if Already Visited
				if (visited.contains(r)) { // agar mai kisi node ko visit kar chuka hu and wo agaain aaya mere samne ki mujhe bhi visit karo, to iska matlab yaha ek cycle hai, kyuki mai iss node ko visit kar chuka tha aur ye node dubara kisi aur node ka neighbour ban ke aaya aur keh rha hai visit karne ke liye iska matlab mai ghoom phir ke wapis wahi aa gya that means there is a cycle, matlab ek node tak jaane ke 2 (or more) raste hai, so 2 raste hai aur same node pe jaa rhe hai so that means there is a cycle
				

					return true; // Do count++ and break for counting the no. of Cycles
				}
				// visited mark
				visited.add(r);

				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return false; // Return count for Counting the Cycles

	}

	public boolean isConneted() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);

				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return count == 1;

	}

}
