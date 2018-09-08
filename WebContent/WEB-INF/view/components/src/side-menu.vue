<template>
    <div class="side-bar-wrap">
        <h2>Picture 1</h2>
        <h2>Picture 2</h2>
    </div>
</template>
<script>
export default {
    name: 'side-menu'
}
</script>
<style lang="scss" scoped>
    .side-bar-wrap {
        background: #dadada;
        width: 250px;
        height: 90vh;
        display: flex;
        flex-direction: column;
        align-items: center;
        border-right: 1px solid #333;
        h2 {
            background: #fafafa;
            padding: .5em 1em;
            border-radius: 3px;
            cursor: pointer;

            &:hover {
                background: white;
            }
        }
    }
</style>
