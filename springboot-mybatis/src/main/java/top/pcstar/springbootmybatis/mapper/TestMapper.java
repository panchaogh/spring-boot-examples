package top.pcstar.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import top.pcstar.springbootmybatis.entity.Test;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:31 2018/7/17
 */
@Repository
@CacheConfig(cacheNames = "baseCache")
public interface TestMapper {
    @Cacheable
    @Select("SELECT * FROM TEST WHERE NAME = #{name}")
    Test findByName(@Param("name") String name);

    @Insert("INSERT INTO TEST(NAME, SEX) VALUES(#{name}, #{sex})")
    int insert(@Param("name") String name, @Param("sex") String sex);
}
