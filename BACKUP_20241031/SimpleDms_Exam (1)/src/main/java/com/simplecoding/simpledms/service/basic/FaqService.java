package com.simplecoding.simpledms.service.basic;

import com.simplecoding.simpledms.mapper.basic.FaqMapper;
import com.simplecoding.simpledms.vo.basic.Faq;
import com.simplecoding.simpledms.vo.common.Criteria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

/**
 * @author : KTE
 * @fileName : FaqService
 * @since : 24. 10. 25.
 * description :
 */
@Service
@RequiredArgsConstructor
public class FaqService {
    private final FaqMapper faqMapper; // 생성자 DI

//    전체 조회 + 총건수추가!
    public List<?> selectFaqList(Criteria searchVO)  {
        List<?> page = faqMapper.selectFaqList(searchVO);
//      총건수 저장 : criteria의 totalItems
        int count = faqMapper.selectFaqListTotCnt(searchVO);
        searchVO.setTotalItems(count);
        return page;
    }

//  INSERT ==>POSTMAPPING(CONTROLLER)
    public int insert(Faq faq){
        return faqMapper.insert(faq);
    }

//    SELECTFAQ
    public Optional<Faq> selectFaq(int fno){
        return faqMapper.selectFaq(fno);
    }

//    UPDATE
    public void update(Faq faq){
        faqMapper.update(faq);
    }

//    DELETE
    public void delete(int fno){
        faqMapper.delete(fno);
    }


}
