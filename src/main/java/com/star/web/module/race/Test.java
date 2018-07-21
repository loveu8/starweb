package com.star.web.module.race;

import com.star.web.module.Module;
import com.star.web.module.ModuleCenter;
import com.star.web.module.ModuleCollectType;
import com.star.web.module.race.Finish;
import com.star.web.module.race.Ready;
import com.star.web.module.race.Run;

public class Test {
  public static void main(String[] args) {
    ModuleCenter center = new ModuleCenter();
    center.init(new Module[] {
                  new Ready() , 
                  new Run() , 
                  new Finish()
                } , ModuleCollectType.Race);
    center.action();
  }
}
