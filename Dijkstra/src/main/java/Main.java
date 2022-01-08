public class Main {

    static int size = 9;

    //The set sptSet is initially empty
    static Boolean[] shortestPathSet = new Boolean[size];

    static int[] distanceSet = new int[size];

    public static void main(String[] args)
    {
                                     //0  1  2   3   4   5   6  7  8
        int[][] graph = new int[][] { {0, 4, 0,  0,  0,  0,  0, 8, 0},   //0
                                      {0, 0, 12, 0,  0,  0,  0, 0, 0},   //1
                                      {0, 4, 0,  19, 0,  0,  0, 0, 14},  //2
                                      {0, 0, 19, 0,  0,  0,  0, 0, 0},   //3
                                      {0, 0, 0,  0,  0,  21, 0, 0, 0},   //4
                                      {0, 0, 0,  0,  21, 0,  9, 0, 0},   //5
                                      {0, 0, 0,  0,  0,  11, 0, 8, 0},   //6
                                      {0, 0, 0,  0,  0,  0,  9, 0, 0},   //7
                                      {0, 0, 14, 0,  0,  0,  0, 0, 0},}; //8

        //distances assigned to vertices are {0, INF, INF, INF, INF, INF, INF, INF}
        //where INF indicates infinite
        for (int i = 0; i < size; i++) {
            distanceSet[i] = Integer.MAX_VALUE;
            shortestPathSet[i] = false;
        }

        Main main = new Main();
        main.calculateSolution(graph, 0);

    }

    void calculateSolution(int[][] graph, int source) {
        //Assign distance value as 0 for the source vertex so that it is picked first.
        distanceSet[source] = 0;

        for (int i = 0; i < size - 1; i++) {
            int updatedDistanceIndex = minimalDistanceIndex(distanceSet, shortestPathSet);

            shortestPathSet[updatedDistanceIndex] = true;

            //After including 0 to sptSet, update distance values of its adjacent vertices
            for (int y = 0; y < size; y++) {
                //For every adjacent vertex v, if the sum of distance value of u (from source)
                //and weight of edge u-v, is less than the distance value of v, then update the distance value of v.
                if (
                    !shortestPathSet[y]
                    && graph[i][y] != 0
                    && distanceSet[updatedDistanceIndex] != Integer.MAX_VALUE
                    && distanceSet[updatedDistanceIndex] + graph[updatedDistanceIndex][y] < distanceSet[y]
                ) {
                    distanceSet[y] = distanceSet[updatedDistanceIndex] + graph[updatedDistanceIndex][y];
                }
            }
        }

        printSolution(distanceSet);
    }

    int minimalDistanceIndex(int[] distanceSet, Boolean[] shortestPathSet) {
        int minimalDistance = Integer.MAX_VALUE;
        int minimalIndex = -1;

        //Now pick the vertex with a minimum distance value. The vertex 0 is picked,
        //include it in sptSet. So sptSet becomes {0}
        for (int i = 0; i < size; i++) {
            if (!shortestPathSet[i] && distanceSet[i] <= minimalDistance) {
                minimalDistance = distanceSet[i];
                minimalIndex = i;
            }
        }
        return minimalIndex;
    }

    //copied from example
    void printSolution(int[] distanceSet)
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < size; i++)
            System.out.println(i + " \t\t " + distanceSet[i]);
    }
}






