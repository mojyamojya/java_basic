public class Main {
    public static void main(String[] args) {
        int[] scoresA = {80, 75, 60};
        int sumA = 0;
        for (int i = 0; i < scoresA.length; i++) {
            sumA += scoresA[i];
        }
        System.out.println("Aさんの点数の合計は" + sumA + "点です。");

        int[] scoresB = {80, 75, 60, 100, 50};
        int sumB = 0;
        for (int i = 0; i < scoresB.length; i++) {
            sumB += scoresB[i];
        }
        System.out.println("Bさんの点数の合計は" + sumB + "点です。");
    }
}