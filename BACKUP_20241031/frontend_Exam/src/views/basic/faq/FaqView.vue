<template>
    <div>
       <!-- TODO : 폼 입력값 -->
        <div class="input-group mb-3">
            <input type="text" 
            class="form-control" 
            placeholder="Recipient's username" 
            v-model= "searchKeyword">

            <button class="btn btn-outline-secondary" 
            type="button" 
            id="button-addon2"
            @click = "getFaq">SEARCH</button>
        </div>
        
       <!-- TODO : 테이블 -->
        <table class="table">
            <thead>
                <tr>
                <th scope="col">FNO</th>
                <th scope="col">TITLE</th>
                <th scope="col">CONTENT</th>
                <th scope="col">ACTION</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="(data,index) in faqs" :key="index">
                <td>{{data.fno}}</td>
                <td>{{data.title}}</td>
                <td>{{data.content}}</td>
                <td>
                <!-- router-lint to 변수사용시 :붙이기 -->
                <router-link :to='"/faq/"+data.fno'>
                <span class="badge rounded-pill text-bg-success">update</span>
                </router-link>
                </td>
                </tr>
            </tbody>
        </table>
       <!-- TODO : 페이징 -->
        <div class="mt-3">
       <b-pagination
        v-model="pageIndex"
        :total-rows="totalCount"
        :per-page="recordCountPerPage"
        @click = "getFaq"
      ></b-pagination>
        </div>


    </div>
</template>
<script>
import FaqService from "@/services/basic/FaqService"
export default {
    data() {
        return {
         pageIndex: 1,          // 현재페이지번호
         totalCount: 0,         // 전체개수
         recordCountPerPage: 3, // 화면에보일개수 
         searchKeyword: "",     // 검색어
         faqs:[],
        }
    },
    methods: {
       async getFaq(){
            try {
                let response = await FaqService.getAll(
                    this.searchKeyword,
                    this.pageIndex-1,
                    this.recordCountPerPage
                );
                // TODO: 벡엔드 전송되는것: results(배열), totalCount(총개수)
                const { results, totalCount }= response.data;
                console.log(response.data);
                this.faqs = results;
                this.totalCount = totalCount;

                    
                
            } catch (error) {
                console.log(error)     
            }
        }
    },
    mounted() {
        this.getFaq();
    },
}
</script>
<style>
    
</style>