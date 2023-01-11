package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startCount = 0;
        int endCount = 0;
        //գտնում ենք թե քանի բացատ կա մասիվի սկզբից մինչև առարջին սինվոլը
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                break;
            }
            startCount++;
        }
        // գտնում ենք թե քանի բացատ կա վերջից մինչև առաջին հանդիպող սինվոլը
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' ') {
                break;
            }
            endCount++;
        }
        char[] result = new char[spaceArray.length - (startCount + endCount)];
        System.out.print("result: ");

        for (int j = 0; j < result.length; j++) {
            result[j] = spaceArray[startCount++];
            System.out.print(result[j]);
        }

    }

}

