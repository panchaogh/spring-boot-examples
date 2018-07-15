package top.pcstar.springboothelloworld.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.pcstar.springboothelloworld.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 22:05 2018/7/15
 */
public interface TestDao extends JpaRepository<Test,Integer> {
}
