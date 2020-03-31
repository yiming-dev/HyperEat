package com.hyperEat.feign;

import com.hyperEat.entity.Menu;
import com.hyperEat.entity.MenuVO;
import com.hyperEat.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "menu")
@Repository
public interface MenuFeign {
    @GetMapping("/menu/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
    public List<Type> findTypes();

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    public Menu findByid(@PathVariable("id") long id);

    @PutMapping("/menu/update")
    public void update(Menu menu);

}
