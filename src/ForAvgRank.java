import java.util.*;


// 반평균 점수 내기
public class ForAvgRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;

        System.out.println("**********************");
        System.out.println("*       반평균         *");
        System.out.println("**********************\n");

        // 반 개수 입력
        int form, student;
        do {
            if (cnt++ != 0)
                System.out.println("\n[ 입력 가능한 반은 2~4반입니다. 다시 입력해주세요. ]");
            System.out.print("입력받을 반의 개수 (2~4) ==> ");
            form = scan.nextInt();
        } while (form < 2 || form > 4);
        cnt = 0;
        do {
            if (cnt++ != 0)
                System.out.println("\n[ 입력 가능한 학생 수는 2~4명입니다. 다시 입력해주세요. ]");
            System.out.print("입력받을 학생 수 (2~4) ==> ");
            student = scan.nextInt();
        } while (student < 2 || student > 4);
        System.out.println("\n[ 총 " + form + "개의 반이 존재합니다. ]");
        System.out.println("[ 각 학급별 학생 수는 "+student+"명 입니다. ]\n");

        // 각 반별 학생 점수 입력 && 평균을 구하기 위한 합계 저장
        int[] scores = new int[form * student];
        int[] sum = new int[form];
        for (int i = 0; i < scores.length; i++) {
            cnt = 0;
            do {
                if (cnt++ != 0)
                    System.out.println("\n[ 잘못된 범위의 점수가 입력되었습니다. 다시 입력해주세요. ]");
                System.out.print("[" + (i + 1) + "] " + ((i % form) + 1) + "반 학생 점수 입력 (0~100) ==> ");
                scores[i] = scan.nextInt();
            } while (scores[i] < 0 || scores[i] > 100);
            sum[i % form] += scores[i];
        }
        System.out.println();

        // 평균 구하기
        double[] avg = new double[form];
        for ( int i = 0; i < avg.length; i++) {
            avg[i] = sum[i] / (double)(student);
        }

        // 최대/최소 평균과 해당 반을 찾자
        double maxAvg = avg[0], minAvg = avg[0];
        int maxForm = 1, minForm = 1;
        for (int i = 1; i < sum.length; i++) {
            if (avg[i] > maxAvg) {
                maxAvg = avg[i];
                maxForm = (i + 1);
            } else if (avg[i] <= minAvg) {
                minAvg = avg[i];
                minForm = (i + 1);
            }
        }

        // 랭킹 초기화
        int[] rank = new int[form];
        for ( int i = 0; i < rank.length; i++) {
            rank[i]++;
        }

        // 랭킹 구하기
        for ( int i = 0; i < rank.length; i++) {
            for ( int j = 0; j < rank.length; j++) {
                if ( avg[i] < avg[j] ) {
                    rank[i]++;
                }
            }
        }

        // 출력
        for ( int i = 0; i < rank.length; i++) {
            System.out.printf("[%d반] 점수: %.2f - [%d등]\n",(i+1), avg[i], rank[i]);
        }

        System.out.printf("\n[ 제일 잘한 반은 %d반이며, %d반의 평균 점수는 %.2f점으로, 제일 점수가 낮은 %d반의 평균인 %.2f점보다 %.2f점 높습니다.", maxForm,
                maxForm, maxAvg, minForm, minAvg, (maxAvg - minAvg));
    }
}
