package com.star.web.module.race;

import com.star.web.module.Module;
import com.star.web.module.Utils_Module;
import com.star.web.service.RunRaceService;

public class FinalStat extends Module {
  private RunRaceService raceService;
  public FinalStat(RunRaceService raceService) {
    this.raceService = raceService;
  }
  public void exec() {
    ExecRaceData data = (ExecRaceData) Utils_Module.un.getObject();
    data.setFinish(3);
    data.setStat(raceService.stat());
    System.out.println("COMPILE");
    System.out.println(data);
  }
}
