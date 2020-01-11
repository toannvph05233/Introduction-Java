package class_OOP;

public class StopWatch {
    String startTime, endTime;

    public StopWatch(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public String Star() {
        startTime = String.valueOf(java.time.LocalTime.now());
        return startTime;
    }

    public String End() {
        endTime = String.valueOf(java.time.LocalTime.now());
        return endTime;
    }


}
