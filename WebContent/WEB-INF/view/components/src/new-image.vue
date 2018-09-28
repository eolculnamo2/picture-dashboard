<template>
    <div class="content-wrap">
        <h1>
            New Profile
        </h1>
        <form class="login-form" method="GET" action="/create-new-image">
            <div>
                Image Name
            </div>
            <input name="name" type="text" />
            <div>
                Caption
            </div>
            <input name="description" type="text" />
            <div>
                Stable Image URL
            </div>
            <input name="image-url" type="text" />
            <div>
                Creator
            </div>
            <input name="creator" type="text" />
            <button type="submit">
                Create Image
            </button>
        </form>
    </div>
</template>
<script>
export default {
    name: 'new-image'
}
</script>
<style lang="scss" scoped>
.login-form{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    button {
        margin: .25em 0;
    }
}
</style>

