package top.pcstar.springbootblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.pcstar.springbootblog.domain.Authority;
import top.pcstar.springbootblog.repository.AuthorityRepository;
import top.pcstar.springbootblog.service.AuthorityService;

/**
 * Authority 服务.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年3月30日
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority getAuthorityById(Long id) {
        return authorityRepository.findById(id).get();
    }

}
