public class ArrayExample {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3,4,5,6},{5,6,7,5,4,45}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                for(int k = j + 1; k < arr[i].length; k++) {
                    if(arr[i][j] == arr[i][k]) {
                        arr[i][k] = 0;
                    }
                }

                if(arr[i][j] != 0) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println();
        
        }
    }
}
