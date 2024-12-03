package Lecture32;
public class Graph_Implementation {

	public static void main(String[] args) {
		GraphsClass g = new GraphsClass(5);

		g.AddEdge(1, 4, 1);
		g.AddEdge(1, 5, 6);
		g.AddEdge(1, 3, 3);
		g.AddEdge(3, 1, 3);
		g.AddEdge(3, 2, 7);
		g.AddEdge(3, 5, 5);
		g.AddEdge(2, 4, 2);
		g.AddEdge(2, 3, 7);
		g.AddEdge(2, 5, 8);
		g.AddEdge(4, 1, 1);
		g.AddEdge(4, 2, 2);
		g.AddEdge(4, 5, 4);
		g.AddEdge(5, 2, 8);
		g.AddEdge(5, 4, 4);
		g.AddEdge(5, 1, 6);
		g.AddEdge(5, 3, 5);
		g.display();
		// System.out.println(g.noofEdge());
		// g.removeEdge(4, 5);
		// g.removevertex(4);
		// g.display();
		// System.out.println(g.hashpath(1, 6, new HashSet<>()));
		// g.printallpath(1,  6, new HashSet<>(), "");

	}
}
