<template>
    <div class="header-wrap">
        <h3 class="title">
            Picture Photo Dashboard
        </h3>
        <a href="/"><h3>
            Home
        </h3></a>
        <a href="/my-pictures"><h3>
            My Pictures
        </h3></a>
        <router-link to="/add-picture"><a href="/add-picture"><h3>
            Add Picture
        </h3></a></router-link>
        <router-link to="/login"><a href="/login"><h3>
            Login
        </h3></a></router-link>
        <router-link to="/register"><a href="/register"><h3>
            Register
        </h3></a></router-link>
    </div>
</template>
<script>
export default {
    name: 'siteHeader'
}
</script>
<style lang="scss" scoped>
    .title {
        text-decoration: underline;
        background: #015249;
        color: #fafafa; 
        padding: 1em;
        border-radius: 3px;
    }
    .header-wrap {
        top: 0;
        left: 0;
        background: gray;
        border-bottom: 1px solid #333;
        height: 10vh;
        color: #015249;
        background-image: linear-gradient(to right, #77C9D4 , #57BC90);
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0 4em 0 1em;

        h3 {
            cursor: pointer;
            &:hover {
                text-decoration: underline;
            }
        }
    }
</style>
