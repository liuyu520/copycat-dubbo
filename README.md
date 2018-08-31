## springboot 整合dubbo

### maven 多模块管理
1. 父模块 :copycat-dubbo
2. 子模块: copycat-dubbo-example,copycat-my-dubbo ;
3. 参考: [https://www.baeldung.com/spring-boot-dependency-management-custom-parent](https://www.baeldung.com/spring-boot-dependency-management-custom-parent)


### 配置项
#### 如何指定profile
![这里写链接内容](./md/2018-08-31_10-35-00.jpg)

```
--spring.profiles.active=customer
```

## 启动程序
1. 配置copycat-dubbo-example 中消费者的端口号,避免报错:端口占用;
2. 修改github.freeseawind.springboot.helloworld.consumer.ConsumerConf 和github.freeseawind.springboot.helloworld.provider.ProviderConf 中的zk 配置

```java
@Bean
    public RegistryConfig registryConfig()
    {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://129.23.220.89:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }
```
