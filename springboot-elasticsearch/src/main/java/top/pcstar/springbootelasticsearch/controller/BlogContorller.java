package top.pcstar.springbootelasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.pcstar.springbootelasticsearch.Repository.EsBlogRepository;
import top.pcstar.springbootelasticsearch.domain.EsBlog;

import java.util.List;

/**
 * @Author: PanChao
 * @Description: Blog控制器
 * @Date: Created in 12:37 2018/6/3
 */
@RestController
@RequestMapping("/blogs")
public class BlogContorller {

    @Autowired
    private EsBlogRepository esBlogRepository;
    @GetMapping
    public List<EsBlog> list(@RequestParam(value = "title",required = false) String title,
                             @RequestParam(value = "summary",required = false) String summary,
                             @RequestParam(value = "content",required = false) String content,
                             @RequestParam(value = "pageIndex",defaultValue = "0") int pageIndex,
                             @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {
        //数据是在测试用例中初始化的，需要线运行测试用例
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        Page<EsBlog> page = esBlogRepository.findDistinctByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        return page.getContent();
    }
}
