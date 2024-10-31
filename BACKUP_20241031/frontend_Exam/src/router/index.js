import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    component: () => import('../views/HomeView.vue')
  },
  {
    path: '/faq',
    component: () => import('../views/basic/faq/FaqView.vue')
  },
  {
    path: '/add-faq',
    component: () => import('../views/basic/faq/AddFaq.vue')
  },
  {
    path: '/faq/:fno',
    component: () => import('../views/basic/faq/FaqDetail.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
