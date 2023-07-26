public class Exercise {

    static int findMissingNumberInArray(int[] arr,int arrayLength) {

        int originalSum = 0;
        int sum = 0;
        int newArrayLength = 0;
        int missingNumber=0;
        newArrayLength = arrayLength + 1;
        originalSum = (newArrayLength * (newArrayLength + 1))/2;
        for (int oldsum:arr){
            sum = oldsum + sum;
        }

        missingNumber = originalSum - sum;
        System.out.println("The missing number is " + missingNumber);
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] array =  new int[]{1,2,3,4,5,6,7,8,10};
        Exercise exercise = new Exercise( );
        exercise.findMissingNumberInArray(array,array.length);


    }
}
