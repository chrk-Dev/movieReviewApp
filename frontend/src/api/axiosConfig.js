import axios from "axios";

//axio api base config
export default axios.create({
    baseURL: "http://127.0.0.1:8080",
    headers: {"ngrok-skip-browser-warning": "true"}

});
