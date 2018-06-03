package top.pcstar.springbootelasticsearch.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.pcstar.springbootelasticsearch.domain.EsBlog;

/**
 * @Author: PanChao
 * @Description: EsBlogRepository接口
 * @Date: Created in 10:41 2018/6/3
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {
    /**
     * 分页查询博客
     * @param title
     * @param summary
     * @param content
     * @param pageable
     * @return
     */
    Page<EsBlog> findDistinctByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content, Pageable pageable);
}
