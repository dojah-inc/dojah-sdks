## dojah-typescript-sdk@1.2.0

This generator creates TypeScript/JavaScript client that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

Environment
* Node.js
* Webpack
* Browserify

Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

Module system
* CommonJS
* ES6 module system

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

navigate to the folder of your consuming project and run the following command.

```
npm install dojah-typescript-sdk@1.2.0 --save
```

### Getting Started

```typescript
import { Configuration, GHKYCApi } from "dojah-typescript-sdk";
const configuration = new Configuration({
  apiKey: (name) => {
    if (name === "Authorization") return process.env.DOJAH_API_KEY;
    if (name === "AppId") return process.env.DOJAH_APP_ID;
    throw Error();
  },
  // Uncomment the below configuration to use sandbox environment
  // basePath: "https://sandbox.dojah.io",
});
const api = new GHKYCApi(configuration);
const request = api.getDriversLicense("V0000000", "John Doe", "1988-09-01");
request.then((result) => {
  console.log(result);
});

```
