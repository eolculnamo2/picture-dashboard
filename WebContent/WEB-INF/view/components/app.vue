<template>
<div>
    <site-header></site-header>
    <div class="main-wrap">
        <side-menu></side-menu>
        <router-view></router-view>
    </div>
</div>
</template>
<script>
import siteHeader from './src/header.vue';
import sideMenu from './src/side-menu.vue';
export default {
    name: 'App',
    components: { siteHeader, sideMenu }
}
</script>
<style lang="scss">
/*
#77C9D4 blue
#57BC90 light green
#015249 dark green
#A5A5AF grayish
*/
    body{
        background: #A5A5AF;
        margin: 0;
        padding: 0;
    }
    a {
        color: inherit;
        text-decoration: inherit;
    }
    .main-wrap {
        display: flex;
    }
    .content-wrap {
        padding: 1em;
        margin: 2em;
        background: #dadada;
        width: 80%;
    }
</style>
