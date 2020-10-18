package com.seeyon.consumer.client;



import com.seeyon.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * //声明当前类是一个Feign客户端，指定服务名为user-service
 */
@FeignClient(value = "user-service")
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);
}
