//package 알고리즘_테스트_lv1;
//
//public class 동영상재생기 {
//    // 문자열 시간("mm:ss")을 초 단위로 변환하는 함수
//    private int timeToSeconds(String time) {
//        String[] parts = time.split(":");
//        int minutes = Integer.parseInt(parts[0]);
//        int seconds = Integer.parseInt(parts[1]);
//        return minutes * 60 + seconds;
//    }
//
//    // 초 단위를 "mm:ss" 형식으로 변환하는 함수
//    private String secondsToTime(int totalSeconds) {
//        int minutes = totalSeconds / 60;
//        int seconds = totalSeconds % 60;
//        return String.format("%02d:%02d", minutes, seconds);
//    }
//
//    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
//        // 입력값을 초로 변환
//        int videoLenSec = timeToSeconds(video_len);
//        int currentPosSec = timeToSeconds(pos);
//        int opStartSec = timeToSeconds(op_start);
//        int opEndSec = timeToSeconds(op_end);
//
//        // 명령어 처리
//        for (String command : commands) {
//            if (command.equals("prev")) {
//                // 10초 전으로 이동
//                currentPosSec = Math.max(currentPosSec - 10, 0);
//            } else if (command.equals("next")) {
//                // 10초 후로 이동
//                currentPosSec = Math.min(currentPosSec + 10, videoLenSec);
//            }
//
//            // 오프닝 구간에 있는지 확인하고, 있으면 오프닝 끝으로 이동
//            if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
//                currentPosSec = opEndSec;
//            }
//        }
//
//        // 결과를 "mm:ss" 형식으로 변환
//        return secondsToTime(currentPosSec);
//    }
//
//    public static void main(String[] args) {
//        동영상재생기 solution = new 동영상재생기();
//        System.out.println(solution.solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"});
//    }
//}
