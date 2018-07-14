package top.pcstar.springbootblog.service;

import top.pcstar.springbootblog.domain.Authority;

/**
 * Authority 服务接口.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年3月18日
 */
public interface AuthorityService {


    /**
     * 根据id获取 Authority
     * @param id
     * @return
     */
    Authority getAuthorityById(Long id);
}
