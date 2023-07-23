package ss4_oop.exercise.stop_watch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start(){
        startTime = (new Date()).getTime();
    }

    public void stop(){
        endTime = (new Date()).getTime();
    }

    public long elapseTime(){
        return endTime - startTime;
    }


}
