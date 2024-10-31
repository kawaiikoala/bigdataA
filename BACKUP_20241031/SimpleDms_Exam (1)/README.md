# 종합연습문제 : 수업(총건수 빼기)
# 1) TB_FAQ 테이블을 보고 Faq vo 클래스를 정의하세요 : o
# 2) FaqMapper, Faq.xml(별칭 사용하세요) 코딩하고 전체조회 함수를 만드세요
   - 함수명   : selectFaqList
   - 매개변수 : Criteria searchVO
   - 리턴값   : List<?>
# 3) FaqService 코딩하고 전체조회 함수를 만드세요 : o
   - 함수명   : selectFaqList
   - 매개변수 : Criteria searchVO
   - 리턴값   : List<?>
# 4) FaqController 코딩하고 전체조회 함수를 만드세요
# 단 @RestController 사용하세요, 결과테스트하세요
   - url : /api/basic/faq
   - 함수명 : selectFaqList
   - 매개변수         : Criteria searchVO
   - 리턴값           : ResponseEntity<?>

-----------------------------
2024-10-25 종합 연습 문제
# 5) FaqMapper, Faq.xml 코딩하고 총건수 함수를 만드세요
- 함수명   : selectFaqListTotCnt
- 매개변수 : Criteria searchVO
- 리턴값   : int
# 6) FaqService 코딩하고 총건수 함수를 전체조회함수에 코딩하세요
- 함수명   : selectFaqList
- 매개변수 : Criteria searchVO
- 리턴값   : int
# 7) FaqController 코딩하고 전체조회함수에 총건수 코드를 넣으세요
# 단 ResultDto 객체를 사용하세요, 테스트하세요
- url : /api/basic/faq
- 함수명 : selectFaqList
- 매개변수         : Criteria searchVO
- 리턴값           : ResponseEntity<?>

# 8) FaqMapper, Faq.xml 코딩하고 insert 함수를 만드세요
- 함수명   : insert
- 매개변수 : Dept dept
- 리턴값   : int
# 9) FaqService 코딩하고  insert 코딩하세요
- 함수명   : insert
- 매개변수 : Dept dept
- 리턴값   : void
# 10) FaqController 코딩하고 전체조회함수에 총건수 코드를 넣으세요
# 단 ResultDto 객체를 사용하세요, 테스트하세요
- url     : /api/basic/faq
- 방식     : POST 방식
- 함수명   : insert
- 매개변수 : Dept dept
- 리턴값   : ResponseEntity<?>
   