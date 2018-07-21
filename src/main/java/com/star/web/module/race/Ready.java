package com.star.web.module.race;

import com.star.web.module.Module;
import com.star.web.module.Utils_Module;

public class Ready extends Module {
  public void exec() {
    ExecRaceData data = (ExecRaceData) Utils_Module.un.getObject();
    data.setReadey(1);
    System.out.println("Ready");
  }
}
