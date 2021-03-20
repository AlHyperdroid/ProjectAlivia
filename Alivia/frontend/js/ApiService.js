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
        return await fetch(url,
            {
                headers: {
                    method: 'GET',
                    mode: 'no-cors',
                    'Access-Control-Allow-Origin': '*',
                    'Content-Type': 'application/json'
                }
            })
            .then(res => res.json())
    }

    inspiration = async () => {
        return await this._request(this._urls["inspiration"])
    }

    home = async () => {
        return await this._request(this._urls["home"])
    }

    education = async () => {
        return await this._request(this._urls["education"])
    }

    soft = async () => {
        return await this._request(this._urls["editsoft"])
    }

    stocks = async () => {
        return await this._request(this._urls["stocks"])
    }

    clouds = async () => {
        return await this._request(this._urls["clouds"])
    }
}
