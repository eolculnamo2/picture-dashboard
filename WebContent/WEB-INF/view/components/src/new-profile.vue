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
    name: 'login',
    /* data: function(){
        return {
            authentication: {
                username: '',
                password: ''
            }
        } 
    },*/
    methods: {
   /*      submitForm(){
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
        } */
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

