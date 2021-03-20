import PageLoader from "./PageLoader.js";

$(document).ready(function () {
    const title = document.title.toLowerCase();
    new PageLoader().load(title);
});