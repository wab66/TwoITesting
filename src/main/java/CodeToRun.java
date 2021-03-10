public class CodeToRun {
    public static void main(String[] args) {
        int [] numbersToUse = {7,8,9};
        int numberToStartAt = numbersToUse[0];
        int numberToEndAt = 0;
        int numberToEndAtIncrement = 100;

        System.out.println("---------- Begin ---------- " );
        for(int num : numbersToUse ){
            int i = 0;
            int c = 0;
            int saveI = 0;
            numberToEndAt = numberToEndAt + numberToEndAtIncrement;
            System.out.println("---------- " + num + "'s ---------- " );
            for( i = numberToStartAt; i <= numberToEndAt; i = i + num ){
                c++;
                System.out.println(c + ". " + i);
            }
            numberToStartAt = i + 1;
        }
    }
}
