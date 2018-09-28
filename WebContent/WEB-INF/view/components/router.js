import Login from './src/login.vue'
import NewProfile from './src/new-profile.vue'
import AddPicture from './src/new-image.vue'
import ViewPictures from './src/view-pictures.vue'

export default [
    {path: '/login', component: Login,},
    {path: '/register', component: NewProfile},
    {path: '/add-picture', component: AddPicture},
    {path: '/my-pictures', component: ViewPictures}
]