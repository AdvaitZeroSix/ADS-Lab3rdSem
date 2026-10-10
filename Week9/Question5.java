    //5. Consider the points:(2,3)(12,30)(40,50)(5,1)(12,10)(3,4)
//Compute the distance between every pair of points.
//Identify the closest pair. Display the minimum distance.
package Week9;
public class Question5 {
    public static void main(String[] args) {
        int[][] p = {{2, 3}, {12, 30}, {40, 50},
                     {5, 1}, {12, 10}, {3, 4}};
        double min = Double.MAX_VALUE;
        int a = 0, b = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                double d = Math.sqrt(
                    Math.pow(p[i][0] - p[j][0], 2) +
                    Math.pow(p[i][1] - p[j][1], 2));    
                System.out.println("(" + p[i][0] + "," + p[i][1] +
                    ") to (" + p[j][0] + "," + p[j][1] + ") = " + d);
                if (d < min) {
                    min = d;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Closest pair: (" + p[a][0] + "," + p[a][1] +
            ") and (" + p[b][0] + "," + p[b][1] + ")");
        System.out.printf("Minimum distance: %.2f%n", min);
    }
}
