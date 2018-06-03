package top.pcstar.springbootelasticsearch.Repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import top.pcstar.springbootelasticsearch.domain.EsBlog;

/**
 * @Author: PanChao
 * @Description: EsBlogRepository接口测试用例
 * @Date: Created in 10:55 2018/6/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTest {
    @Autowired
    private EsBlogRepository esBlogRepository;

    @Before
    public void initRepositoryData() {
        esBlogRepository.deleteAll();//清除所有数据
        esBlogRepository.save(new EsBlog("登鹳雀楼", "王之涣的登鹳雀楼", "白日依山尽，黄河入海流。欲穷千里目，更上一层楼。"));
        esBlogRepository.save(new EsBlog("静夜思", "李白的静夜思", "床前明月光，疑是地上霜。举头望明月，低头思故乡。"));
        esBlogRepository.save(new EsBlog("相思", "王维的相思", "红豆生南国，春来发几枝。愿君多采撷，此物最相思。"));
    }

    @Test
    public void testFindDistinctByTitleContainingOrSummaryContainingOrContentContaining() {
        Pageable pageable = PageRequest.of(0, 20);
        String title = "思";
        String summary = "相思";
        String content = "相思";
        Page<EsBlog> page = esBlogRepository.findDistinctByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        Assert.assertEquals(2L, page.getTotalElements());
        System.out.println("----------start 1----------");
        for (EsBlog blog : page.getContent()) {
            System.out.println(blog.toString());
        }
        System.out.println("----------end 1----------");
        title = "相";
        page = esBlogRepository.findDistinctByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        Assert.assertEquals(1L, page.getTotalElements());
        System.out.println("----------start 2----------");
        for (EsBlog blog : page.getContent()) {
            System.out.println(blog.toString());
        }
        System.out.println("----------end 2----------");

    }
}