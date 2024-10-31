package com.simplecoding.simpledms.controller.basic;

import com.simplecoding.simpledms.service.basic.FaqService;
import com.simplecoding.simpledms.vo.basic.Faq;
import com.simplecoding.simpledms.vo.common.Criteria;
import com.simplecoding.simpledms.vo.dto.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author : KTE
 * @fileName : FaqController
 * @since : 24. 10. 25.
 * description : TODO: @RestController
 *                 결과 : json (js 객체배열 형태)
 */
@RestController
@RequiredArgsConstructor
public class FaqController {
    private final FaqService faqService;

//    전체 조회
    @GetMapping("/api/basic/faq")
    public ResponseEntity<?> selectFaqList(Criteria searchVO) {
        List<?> faqs = faqService.selectFaqList(searchVO);

        ResultDto resultDto = new ResultDto(faqs, searchVO.getTotalItems());

        return new ResponseEntity<>(resultDto, HttpStatus.OK);
    }
    @PostMapping("/api/basic/faq")
    public ResponseEntity<?>insert(@RequestBody  Faq faq){
        faqService.insert(faq);
        return new ResponseEntity<>(faq,HttpStatus.OK);
    }

    @GetMapping("/api/basic/faq/{fno}")
    public ResponseEntity<?> selectFaq(@PathVariable int fno){
        Optional<Faq> faq = faqService.selectFaq(fno);
//      오류처리 (NULL)
        if (faq.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(faq.get(), HttpStatus.OK);
    }

    @PutMapping("/api/basic/faq/{fno}")
    public ResponseEntity<?> update(@PathVariable int fno,
                                    @RequestBody Faq faq){ //RequsetBodt == modelAddattiribute
        faqService.update(faq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/api/basic/faq/{fno}")
    public ResponseEntity<?> delete(@PathVariable int fno){
        faqService.delete(fno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
