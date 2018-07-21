package com.star.web.module.race;

public class ExecRaceData {
  private int readey;
  private int run;
  private int finish;
  private String stat;
  public int getReadey() {
    return readey;
  }
  public void setReadey(int readey) {
    this.readey = readey;
  }
  public int getRun() {
    return run;
  }
  public void setRun(int run) {
    this.run = run;
  }
  public int getFinish() {
    return finish;
  }
  public void setFinish(int finish) {
    this.finish = finish;
  }
  public String getStat() {
    return stat;
  }
  public void setStat(String stat) {
    this.stat = stat;
  }
  public String toString() {
    return "readey : " + readey + " , "+
           "run : " + run + " , " +
           "finish : " + finish + " , " +
           "stat : " + stat;
  }
}
