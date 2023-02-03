import { Configuration, GHKYCApi } from "dojah-typescript-sdk";
const configuration = new Configuration({
  apiKey: (name) => {
    if (name === "Authorization") return process.env.DOJAH_API_KEY;
    if (name === "AppId") return process.env.DOJAH_APP_ID;
    throw Error();
  },
  basePath: "https://api.dojah.io",
});
const api = new GHKYCApi(configuration);
const request = api.getDriversLicense("V0000000", "John Doe", "1988-09-01");
request.then((result) => {
  console.log(result);
});
