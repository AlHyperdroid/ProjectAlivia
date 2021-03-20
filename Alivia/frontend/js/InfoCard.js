export default class InfoCard {

    constructor(container, componentConfig) {
        this.container = document.getElementById("content-body");
        Object.assign(this, componentConfig);
        this._render();
    }

    _render() {
        const div = document.createElement('div');
        div.innerHTML = this._template().trim();
        this.rootElement = div.firstElementChild;
        this.container.appendChild(this.rootElement);
    }

    _template() {
        return `<div class="item features-image сol-12 col-md-6 col-lg-3 active">
           <div class="item-wrapper">
        <div class="item-img">
          <img src=${this.img} alt="" title="" data-slide-to="1">
          </div>
             <div class="item-content">
              <h5 class="item-title mbr-fonts-style display-5">
                <strong>${this.source_name}</strong>
             </h5>
              <p class="mbr-text mbr-fonts-style mt-3 display-7">${this.description}</p>
            </div>
           <div class="mbr-section-btn item-footer mt-2"><a href=${this.url} class="btn item-btn btn-black display-7" target="_blank">Go to &gt;</a></div>
          </div>
        </div>`;
    }
}