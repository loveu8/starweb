package com.star.web.module;

import java.lang.reflect.Type;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模組資料收集工具 
 */
public enum Utils_Module {
  
  un;
  
  private ConcurrentHashMap<String, Object> collector;
  
  // 初始化模組後，產生唯一threadName，並把模組收集物件，提升到共用
  public void init(Type type) {
    if(collector == null) {
      collector = new ConcurrentHashMap<>();
    }
    try {
      Class<?> genericsType = Class.forName(type.getTypeName());
      genericsType.newInstance();
      String threadName = UUID.randomUUID().toString().replace("-", "") + 
                          "_" + System.currentTimeMillis();
      Thread.currentThread().setName(threadName);
      collector.put(Thread.currentThread().getName() , genericsType.newInstance());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public Object getObject() {
    return collector.get(Thread.currentThread().getName());
  }

  public void finish() {
    if(collector!=null) {
      collector.remove(Thread.currentThread().getName());
    }
  }
  
}