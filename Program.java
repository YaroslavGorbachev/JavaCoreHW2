package ru.geekbrains.core.lesson1.task2;


public class Program {
    private static final int win = 4;

    public static void main(String[] args) {


        char[][] myArray = {{'X', 'O', 'X', '•', '•'},
                            {'X', '•', 'X', '•', '•'},
                            {'•', '•', 'X', '•', '•'},
                            {'X', 'X', 'X', 'X', '•'},
                            {'•', '•', 'X', '•', '•'}
        };
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            int check = 0;
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
                if (myArray[i][j] == 'X') {
                    check++;
                    if (check == 4) {
                        i = myArray.length;
                        break;
                    }
                } else{
                    check = 0;
                }
            }
            System.out.print(" " + check);
            System.out.println();
        }

    }


}
