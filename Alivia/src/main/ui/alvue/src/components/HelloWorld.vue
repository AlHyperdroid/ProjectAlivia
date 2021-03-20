<template>
 <InfoComponent
     name="National Geographic Photography"
     description="Stunning wildlife photography"
     img-path="assets/images/ng-logo-807x319.jpg"
     destination-u-r-l="https://www.nationalgeographic.com/photography/"
 />
</template>

<script>
import InfoComponent from "@/components/InfoComponent";
export default {
  name: 'HelloWorld',
  components: {InfoComponent}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
