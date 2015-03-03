import java.util.LinkedList;
import java.util.Scanner;
public class Search {

    private static final String START = "A";
    private static final String END = "E";

    public static void main(String[] args) {
        // this graph is directional
        Graph graph = new Graph();
        Scanner scanIn = new Scanner(System.in);
        String cont="n";
        do{

            System.out.println("Enter start and end vertex");
            String str1 = scanIn.nextLine();
            String str2 = scanIn.nextLine();

            graph.addEdge(str1, str2);

            System.out.println("Add another? (y / n) :");
            cont=scanIn.nextLine();

        }while(cont.equals("y"));


        // graph.addEdge("A", "B");
        // graph.addEdge("A", "C");
        // graph.addEdge("B", "A");
        // graph.addEdge("B", "D");
        // graph.addEdge("B", "E"); // this is the only one-way connection
        // graph.addEdge("B", "F");
        // graph.addEdge("C", "A");
        // graph.addEdge("C", "E");
        // graph.addEdge("C", "F");
        // graph.addEdge("D", "B");
        // graph.addEdge("E", "C");
        // graph.addEdge("E", "F");
        // graph.addEdge("F", "B");
        // graph.addEdge("F", "C");
        // graph.addEdge("F", "E");
        LinkedList<String> visited = new LinkedList<String>();
        visited.add(START);
        new Search().breadthFirst(graph, visited);
    }

    private void breadthFirst(Graph graph, LinkedList<String> visited) {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(END)) {
                visited.add(node);
                printPath(visited);
                visited.removeLast();
                break;
            }
        }
        // in breadth-first, recursion needs to come after visiting adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node) || node.equals(END)) {
                continue;
            }
            visited.addLast(node);
            breadthFirst(graph, visited);
            visited.removeLast();
        }
    }

    private void printPath(LinkedList<String> visited) {
        for (String node : visited) {
            System.out.print(node);
            System.out.print(" ");
        }
        System.out.println();
    }
}