package github.freeseawind.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import github.freeseawind.service.IDemoService;

/** 
 * @author freeseawind   
 */
@Service(timeout = 5000)
public class DemoServiceImpl implements IDemoService
{
    @Override
    public String sayHello(String name)
    {
        return "Hello ,whuang," + name;
    }
}
