package ru.example.springcourse.controllers.house;

public class House {

    public static void main(String[] args) {

        int [] array = {3,22,1,13,4,6,16,5};

        for (int i = 0; i< array.length; i++){
            if (array[i]%2 == 0){
                System.out.print(array[i]+" ");
            }
        }

        System.out.println();

        for (int i = 0; i<array.length; i++){
            if (array[i]>9){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        int max= array[0];
        for (int i = 0; i<array.length; i++){
            if (array[i]>max) {
                max= array[i];
            }
        }
        System.out.println(max);

        int sum= array[0];
        for (int i = 0; i<array.length; i++){
                sum += array[i];
        }
        System.out.println(sum);

        int [] arrayTwo = new int [array.length];
        int j = 0;
        for (int i = array.length-1; i>=0; i--){
           // System.out.print(array[i]+" ");
            arrayTwo[j] = array[i];
            j++;
        }
        for (int i = 0; i<arrayTwo.length; i++){
            System.out.print(arrayTwo[i]+" ");
        }







//        System.out.println("___________'\"__");
//        System.out.println("______/\\__|_|_|_");
//        System.out.println("_____/__\\_|_|_|_");
//        System.out.println("____/____\\|_|_|_");
//        System.out.println("___/______\\_|_|_");
//        System.out.println("__/__[__]__\\|_|_");
//        System.out.println("_/|________|\\_|_");
//        System.out.println("__|___---__|_____");
//        System.out.println("__|__|   |_|_____");
//
//
//    String city = "Мариупль";
//    float people = 3.5F;
//    byte notWork = 5;
//
//        System.out.println(city + " " +  people + " " + notWork);
}
}
