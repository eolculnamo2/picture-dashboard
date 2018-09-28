<template>
    <div class="content-wrap">
        <h1>
            All Pictures
        </h1>
        <div class="photos-container">
            <div :key="x+i" v-for="(x,i) in this.imageData">
                <img class="photo" :src="x.map.imageUrl"/>
                <h4>{{x.map.name}}</h4>
                <p>
                    {{x.map.description}}
                </p>
            </div>
        </div>
       
    </div>
</template>
<script>
export default {
    name: 'view-pictures',
    data() {
        return {
            imageData: []
        }
    },
    mounted() {
        fetch('/get-all-images/')
        .then(res => res.json())
        .then((data) => {
            console.log(JSON.stringify(data.myArrayList))
            this.imageData = data.myArrayList
            ;
        })
    }
}
</script>
<style lang="scss" scoped>
.photos-container {
    display: flex;
    justify-content: space-between;
    
}
.photo {
   width: 300px;
   border: 2px solid #333;

}
</style>

