package com.leyou.search.client;

import com.leyou.item.pojo.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description TODO
 * @Author TT Hun
 * @Data 2020/3/29 20:53
 */
@FeignClient("item-service")
public interface CategoryClient {

    @GetMapping("category/list/ids")
     List<Category> queryCategoryByIds(@RequestParam("ids")List<Long> ids );
}
