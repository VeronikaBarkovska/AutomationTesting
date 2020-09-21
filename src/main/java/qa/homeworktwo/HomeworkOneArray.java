package qa.homeworktwo;
import java.util.Arrays;
import java.lang.*;

public class HomeworkOneArray {
    int arrayLength = 15;
    int[] ourArray = new int[arrayLength];
    int counter = 0;

    public void arrayNew(){
        System.out.println("arrayLength - " + arrayLength);
        System.out.print("{ ");
        for (int i = 0; i<ourArray.length; i++) {
            ourArray[i] = (int) (Math.random() * 10);

            System.out.print(ourArray[i] + " ");

            if (ourArray[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(" }");
        System.out.println("Количество четных элементов: " + counter);
    }

    public void sortArray(int[] ourArray){
        int tmp = 0;
        System.out.print("Неотсортированный массив: { ");
        for (int i = 0; i<ourArray.length; i++) {
            ourArray[i] = (int) (Math.random() * 10);

            System.out.print(ourArray[i] + " ");

            if (ourArray[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(" }");
        for (int i=0; i< ourArray.length; i++){
            for (int j=1; j< ourArray.length-i; j++){
                if(ourArray[j-1]>ourArray[j]){
                    tmp = ourArray[j-1];
                    ourArray[j-1]=ourArray[j];
                    ourArray[j]=tmp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(ourArray));

    }

}
