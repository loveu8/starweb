package com.star.web.module;

import java.lang.reflect.Type;
import com.star.web.module.race.ExecRaceData;

/**
 * 模組根據不同類型，只使用一個物件收集資料 
 */
public enum ModuleCollectType {
  
  Race(ExecRaceData.class);
  
  private Type type;
  
  ModuleCollectType(Type type) {
    this.type = type;
  }
  public Type geType() { 
    return type;
  }
}
