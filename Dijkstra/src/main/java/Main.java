import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {

                                     //0  1  2
        int[][] graph = new int[][] { {0, 10, 5},   //0
                                      {10, 0, 15},  //1
                                      {5, 15, 0} }; //2

        int v = graph.length;
        System.out.println("v: " + v);

        Calculator calculator = new Calculator();
        calculator.calculate(graph, 0);
    }
}

class Calculator {
    int distance = 0;
    public void calculate(int[][] graph, int source) {
        for (int i = 0; i < graph.length; i++) {
            for (int y = 0; y < graph.length; y++) {
                System.out.println(graph[i][y]);
            }
        }
    }
}




