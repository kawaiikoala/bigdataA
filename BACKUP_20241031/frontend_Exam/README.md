# 2024-10-30 종합예제 : Faq
# 0) 아래 명령어로 node_modules 폴더 생성하고 코딩하세요(명령프롬프트)
   npm i
# 1) basic/faq/FaqView.vue 메뉴 등록하세요
  path : /faq
  component : FaqView.vue
# 2) services/basic/FaqService.js 에 axios 전체조회 함수를 구현하고 export 하세요
  - baseURL : http://localhost:8000/api
  - get()
    (1) 매개변수 : searchKeyword, pageIndex, recordCountPerPage
    (2) url : baseURL+`/basic/faq?searchKeyword=${searchKeyword}&pageIndex=${pageIndex}&recordCountPerPage=${recordCountPerPage}
# 3) basic/faq/FaqView.vue 페이지 디자인하고 전체조회 기능을 구현하세요
  - 검색어 기능
  - 반복문 출력
  - 페이징 기능