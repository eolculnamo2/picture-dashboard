<template>
    <div class="content-wrap">
        <h1>
            Login
        </h1>
        <form class="login-form" method="GET" action="/loginUser">
            <div>
                Login
            </div>
            <input v-model="authentication.username" name="username" type="text" />
            <div>
                Password
            </div>
            <input v-model="authentication.password" name="password" type="password" />
            <button type="submit">
                Login
            </button>
            <button type="button">
                New User
            </button>
        </form>
    </div>
</template>
<script>
export default {
    name: 'login',
    data: function(){
        return {
            authentication: {
                username: '',
                password: ''
            }
        }
    },
    methods: {
        submitForm(){
            console.log(this.authentication)
            fetch('/loginUser',{
            method: "POST",
            body: JSON.stringify(this.authentication),
            headers: { "Content-Type": "application/json" },
            credentials: "same-origin"
            })
            .then( res => res.json())
            .then( data => {
                if (data.data !== false) {
                    this.setState({userProfile: data.data})
                }
                else {
                    window.location.replace("https://www.sword-point.com/")
                }
            })
        }
    }
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

