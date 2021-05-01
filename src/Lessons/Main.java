package Lessons;

import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args) throws  MyArrayDataException, MyArraySizeException{
        String arrStr[][] = {{"2", "5", "2"}, {"1", "2", "4", "3"}, {"1", "2", "3", "2"}, {"1", "2", "4", "3"}};
        String arrStr1[][] = {{"2", "new", "arr", "array"}, {"array", "NEW", "ARR", "3"}, {"new", "arr", "array", "2"}, {"array", "NEW", "ARR", "3"}};
        String arrStr2[][] = {{"new", "arr", "array", "2"}, {"array", "NEW", "ARR", "3", "sss"}, {"new", "arr", "array", "2"}, {"array", "NEW", "ARR", "3"}};



        getSum(arrStr);
//        System.out.println("Сумма элементов массива равна: " + a);
        getSum(arrStr1);
//        System.out.println("Сумма элементов массива равна: " + b);
        getSum(arrStr2);
//        System.out.println("Сумма элементов массива равна: " + c);


    }


    public static int getSum(String array[][]) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;



            try {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (array[i].length !=4 || array[j].length !=4) {
                            throw new MyArraySizeException("Размер массива не 4*4!");

                        }

                    }

                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Размер массива не 4*4!");
            }


                for (int i = 0; i < array.length; i++) {

                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            String x = array[i][j];
                            try {
                                Integer.parseInt(array[i][j]);
                                throw new MyArrayDataException("Ошибка в ячейке " + i + " * " + j);
                            } catch (NumberFormatException exx) {
                                System.out.println("Ошибка в ячейке " + i + " * " + j);
                            }




                            Integer.parseInt(array[i][j]);

                            sum = sum + Integer.parseInt(array[i][j]);

                        } catch (NumberFormatException e) {
//                            throw new MyArrayDataException("Ошибка в ячейке " + i + " * " + j);
                        }

                    }
                } System.out.println("Сумма элементов массива = " + sum);
        return sum;



        }


    }






