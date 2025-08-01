package lang.math.test;

public class LottoGenerateMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        for(int i : lottoNumbers){
            System.out.print(i+" ");
        }
    }

}
