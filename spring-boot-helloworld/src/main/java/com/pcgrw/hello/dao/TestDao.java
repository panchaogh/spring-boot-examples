package com.pcgrw.hello.dao;

import com.pcgrw.hello.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 22:05 2018/7/15
 */
public interface TestDao extends JpaRepository<Test,Integer> {
}
