package arreglos;

public class ArregloAnidado {
    public static void main(String[] args) {
        int arr[][] = new int [2][2];

        arr[0][0] = 20;
        arr[0][1] = 21;
        arr[1][0] = 22;
        arr[1][1] = 23;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
