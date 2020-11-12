package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class RibbonConfig {
   @Bean
   public IRule ribbonRule() { // 其中IRule就是所有规则的标准
       return new RandomRule(); // 随机的访问策略
   }
}