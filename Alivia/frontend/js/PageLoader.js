import InfoCard from "./InfoCard.js";
import ApiService from "./ApiService.js";

export default class PageLoader {
    load(title) {
        const apiService = new ApiService();
        const parent = document.getElementById("content-body");

        apiService[title]()
            .then(data => {
                data.forEach(element => {
                    new InfoCard(parent, element)
                })
            });
    }
}