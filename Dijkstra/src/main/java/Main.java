import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {

                                     //0  1  2
        int[][] graph = new int[][] { {0, 10, 20},  //0
                                      {10, 0, 5},   //1
                                      {20, 5, 0} }; //2

        int v = graph.length;
        System.out.println("v: " + v);

        Calculator calculator = new Calculator();
        calculator.calculate(graph, 0);
    }
}

class Calculator {

    public void calculate(int[][] graph, int source) {
        int indexNull = 0;
        int indexOne = 1;
        int indexTwo = 2;

            for (int y = 0; y < graph.length; y++) {
                int vertex = 0;
                int distance = 0;
                if ()
                if (distance < graph[source][y]) {
                    distance += graph[source][y];
                    System.out.println(source + " : " + y + " : "  + "distance: " + distance);
                }
            }

//            for (int y = 0; y < graph.length; y++) {
//
//                System.out.println(graph[i][y]);
//            }

    }
}




