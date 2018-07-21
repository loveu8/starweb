package com.star.web.module.race;

import com.star.web.module.Module;
import com.star.web.module.Utils_Module;

public class Run extends Module {
  public void exec() {
    ExecRaceData data = (ExecRaceData) Utils_Module.un.getObject();
    data.setRun(2);
    System.out.println("Run");
  }
}
