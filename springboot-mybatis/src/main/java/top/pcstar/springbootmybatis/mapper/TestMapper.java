package top.pcstar.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.pcstar.springbootmybatis.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:31 2018/7/17
 */
@Repository
public interface TestMapper {
    @Select("SELECT * FROM TEST WHERE NAME = #{name}")
    Test findByName(@Param("name") String name);

    @Insert("INSERT INTO TEST(NAME, SEX) VALUES(#{name}, #{sex})")
    int insert(@Param("name") String name, @Param("sex") String sex);
}
