<template>
    <div class="content-wrap">
        <h1>
            New Profile
        </h1>
        <form class="login-form" method="GET" action="/register-new-profile">
            <div>
                Name
            </div>
            <input name="name" type="text" />
            <div>
                Username
            </div>
            <input name="username" type="text" />
            <div>
                Password
            </div>
            <input name="password" type="password" />
            <div>
                Profile Picture URL(100 Char Max)
            </div>
            <input name="profilePicture" type="text" />
            <div>
                Email
            </div>
            <input name="email" type="text" />
            <button type="submit">
                Create Profile
            </button>
            <button type="button">
                Existing User
            </button>
        </form>
    </div>
</template>
<script>
export default {
    name: 'new-profile'
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

