export default class ApiService {
    _prefix = 'http://localhost:8081';
    _urls = {
        inspiration: this._prefix + '/inspiration',
        home: this._prefix + '/home',
        education: this._prefix + '/education',
        editsoft: this._prefix + '/editsoft',
        stocks: this._prefix + '/stocks',
        clouds: this._prefix + '/clouds'
    }

    async _request(url) {
        return await fetch(url)
            .then(res => res.json())
    }

    async getInspiration() {
        return await this._request(this._urls["inspiration"])
    }

    async getHome() {
        return await this._request(this._urls["home"])
    }

    async getEducation() {
        return await this._request(this._urls["education"])
    }

    async getEditsoft() {
        return await this._request(this._urls["editsoft"])
    }

    async getStocks() {
        return await this._request(this._urls["stocks"])
    }

    async getClouds() {
        return await this._request(this._urls["clouds"])
    }
}
