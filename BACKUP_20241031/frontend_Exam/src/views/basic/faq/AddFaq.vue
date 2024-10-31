<template>
    <div>
         <!-- title -->
        <div class="form-floating mb-3">
            <input type="text" 
                   class="form-control" 
                   id="title" 
                   placeholder="title"
                   v-model= "faq.title">

            <label for="ename">title</label>
        </div>
        <!-- content -->
          <div class="form-floating mb-3">
            <input type="text" 
                   class="form-control" 
                   id="content" 
                   placeholder="content"
                   v-model= "faq.content">

            <label for="content">content</label>
        </div>

        <!-- 버튼 -->
        <button type="button" 
                class="btn btn-primary"
                @click= "save">저장</button>


    </div>
</template>
<script>
import FaqService from '@/services/basic/FaqService';
export default {
    data() {
        return {
            faq:{
                title:"",
                content:""
            }
        }
    },  
    methods: {
        async save(){
            try {
                let response = await FaqService.insert(this.faq);
                console.log(response.data);
                this.$router.push("/faq")
            } catch (error) {
                console.log(error);
            }
        }
    },
}
</script>
<style>
    
</style>