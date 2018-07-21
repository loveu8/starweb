package com.star.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.star.web.module.race.ExecRaceData;
import com.star.web.module.race.FinalStat;
import com.star.web.module.race.Finish;
import com.star.web.module.race.Ready;
import com.star.web.module.race.Run;
import com.star.web.module.Utils_Module;
import com.star.web.module.Module;
import com.star.web.module.ModuleCenter;
import com.star.web.module.ModuleCollectType;
import com.star.web.service.RunRaceService;

@RestController
public class WebController {
  
  @Autowired
  RunRaceService runRaceService;
  
  @RequestMapping("/helloworld")
  public String hello(){
      return "Hello World!";
  }
  
  @RequestMapping("/module-test")
  public Object test() {
    try {
      ModuleCenter center = new ModuleCenter();
      center.init(new Module[] {
                    new Ready() , 
                    new Run() , 
                    new Finish() , 
                    new FinalStat(runRaceService)
                  } , ModuleCollectType.Race);
      center.action();
      return Utils_Module.un.getObject();
    } catch (Exception e) {
      return new ExecRaceData();
    } finally {
      Utils_Module.un.finish();
    }
    
  }
}
