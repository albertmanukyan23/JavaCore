package homework.homework8;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        System.err.println("\nWrong Index in getByIndex! ");
        return -1;
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        if (size == 0) {
            System.err.println("Your Array is empty! ");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //ջնջել մասիվի էլեմենտը ինդեքսով
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.err.println("\nWrong index! ");
            return;
        }
        int[] newArray = new int[--size];
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index) {
                newArray[i] = array[i + 1];
                continue;
            }
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // ջնջել միջակայքի հատվածով
    public void split(int leftBoard, int rightBoard) {
        if (leftBoard < rightBoard) {
            int changedSize = rightBoard - leftBoard;
            int[] newArray = new int[changedSize];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            size = changedSize;
        } else {
            System.err.println("\nIndexes are incorrect! ");
        }
    }
}
