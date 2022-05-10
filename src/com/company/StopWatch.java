package com.company;

import java.util.Scanner;

public class StopWatch {
private long startTime;
private long endTime;

public StopWatch(){
}

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
public long elapsedTime() {
    return (this.endTime - this.startTime)/1000;
}
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 để bắt đầu");
        String start = scanner.next();
        long time1 = System.currentTimeMillis();
        System.out.println("startTime = " + time1);
        System.out.println("0 để kết thúc");
        start = scanner.next();
        long time2 = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(time1,time2);
        System.out.println("time =" + stopWatch.elapsedTime());
    }

}
