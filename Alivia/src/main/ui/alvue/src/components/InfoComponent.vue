<template>
  <div class="item features-image сol-12 col-md-6 col-lg-3 active">
    <div class="item-wrapper">
      <div class="item-img">
        <img :src=imgPath alt="" title="" data-slide-to="1">
      </div>
      <div class="item-content">
        <h5 class="item-title mbr-fonts-style display-5">
          <strong>{{name}}</strong>
        </h5>
        <p class="mbr-text mbr-fonts-style mt-3 display-7">{{description}}</p>
      </div>
      <div class="mbr-section-btn item-footer mt-2"><a :href=destinationURL class="btn item-btn btn-black display-7" target="_blank">Go to &gt;</a></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "InfoComponent",
  props: {
    name: String,
    imgPath: String,
    description: String,
    destinationURL: String
  }
}
</script>

<style scoped>

</style>