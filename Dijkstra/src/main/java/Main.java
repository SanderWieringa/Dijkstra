import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int[] graph = new int[] { 2, 1, 3 } ;
        int minimum = 0;
        for (int i = 0; i < graph.length; i++) {
            if (graph[i]  < graph[i + 1]) {
                minimum = graph[i];
            }

        }
        System.out.println(minimum);
    }
}
