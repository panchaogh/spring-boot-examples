package top.pcstar.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.pcstar.springbootmybatis.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:31 2018/7/17
 */
@Repository
public interface Test1Mapper {
    Test findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("sex") String sex);
}
