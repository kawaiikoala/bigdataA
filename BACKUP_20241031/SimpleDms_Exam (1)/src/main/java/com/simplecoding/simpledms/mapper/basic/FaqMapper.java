package com.simplecoding.simpledms.mapper.basic;

import com.simplecoding.simpledms.vo.basic.Faq;
import com.simplecoding.simpledms.vo.common.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * @author : KTE
 * @fileName : FaqMapper
 * @since : 24. 10. 25.
 * description :
 */
@Mapper
public interface FaqMapper {
    public List<?> selectFaqList(Criteria searchVO);

    public int selectFaqListTotCnt(Criteria searchVO);

    public int insert(Faq faq);

    public Optional<Faq> selectFaq(int fno);

    public int update(Faq faq);

    public  int delete(int fno);
}
