package top.pcstar.springbootblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.pcstar.springbootblog.domain.Vote;
import top.pcstar.springbootblog.repository.VoteRepository;
import top.pcstar.springbootblog.service.VoteService;

import javax.transaction.Transactional;

/**
 * Vote 服务.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月9日
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.VoteService#removeVote(java.lang.Long)
     */
    @Override
    @Transactional
    public void removeVote(Long id) {
        voteRepository.deleteById(id);
    }

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findById(id).get();
    }

}
