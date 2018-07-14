package top.pcstar.springbootblog.service;

import top.pcstar.springbootblog.domain.Catalog;
import top.pcstar.springbootblog.domain.User;

import java.util.List;

/**
 * Catalog 服务接口.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月10日
 */
public interface CatalogService {
    /**
     * 保存Catalog
     *
     * @param catalog
     * @return
     */
    Catalog saveCatalog(Catalog catalog);

    /**
     * 删除Catalog
     *
     * @param id
     * @return
     */
    void removeCatalog(Long id);

    /**
     * 根据id获取Catalog
     *
     * @param id
     * @return
     */
    Catalog getCatalogById(Long id);

    /**
     * 获取Catalog列表
     *
     * @return
     */
    List<Catalog> listCatalogs(User user);
}
