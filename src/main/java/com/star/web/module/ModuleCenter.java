package com.star.web.module;

import com.star.web.module.Utils_Module;

/**
 * 模組中心 
 */
public class ModuleCenter {
  
  // 預計要執行的模組
  private Module[] modules;
  
  // 模組收集類別
  private ModuleCollectType type;
  
  // 初始化
  public void init(Module[] modules , ModuleCollectType type) {
    Utils_Module.un.init(type.geType());
    this.modules = modules;
    this.type = type;
  }
  
  public ModuleCollectType getType() {
    return type;
  }
  
  public void action() {
    for(Action ac : modules) {
      ac.exec();
    }
  }
  
}
