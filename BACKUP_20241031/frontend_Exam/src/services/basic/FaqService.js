import axios from "axios";

const baseURL="http://localhost:8000/api"

const getAll=(searchKeyword, pageIndex, recordCountPerPage)=>{
    return axios
    .get(baseURL+`/basic/faq?searchKeyword=${searchKeyword}&pageIndex=${pageIndex}&recordCountPerPage=${recordCountPerPage}`);
}

const insert = (data) =>{
    console.log("Requset data :", data);
    return axios.post(baseURL+"/basic/faq", data);
}

const get = (fno) =>{
    return axios.get(baseURL+`/basic/faq/${fno}`);
}

const FaqService={
    getAll,
    insert,
    get
}

export default FaqService;