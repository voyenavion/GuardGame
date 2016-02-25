import java.util.ArrayList;

/**
 * Created by shaungould on 2/25/16.
 */
public class GuardGame {


    public ArrayList<Integer> changeLongIntoArrayOfSingleDigits(long inputNumber){
        String longToString = Long.toString(inputNumber);
        String[] stringArray = longToString.split("");
        ArrayList<Integer> intAL = new ArrayList<Integer>(stringArray.length);
        for(int i=0;i<stringArray.length;i++){
            intAL.add(Integer.parseInt(stringArray[i]));

        }
        return intAL;
    }

    public int sumIntArrayList(ArrayList<Integer> intAL){
        int sumOfIntArrayList = 0;
        for(int i=0;i<intAL.size();i++){
            sumOfIntArrayList+=intAL.get(i);
        }

        return sumOfIntArrayList;
    }

    public int answerGuardGame(long input){

        ArrayList<Integer> intAL = changeLongIntoArrayOfSingleDigits(input);
        while(intAL.size()>1){
            long inputNumber = (long)sumIntArrayList(intAL);
            intAL = changeLongIntoArrayOfSingleDigits(inputNumber);
        }

        return sumIntArrayList(intAL);
    }









}
