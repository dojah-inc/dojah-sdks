## dojah-typescript-sdk@1.0.0

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
npm install dojah-typescript-sdk@1.0.0 --save
```

### Getting Started

```typescript

import { Configuration, AMLApi, GetScreeningInfoResponse } from "dojah-typescript-sdk";

const apiKey = process.env.API_KEY;
const config = new Configuration({ apiKey });

const api = new AMLApi(config);

const referenceId: string = "c574a3c8-dc27-4013-8bbc-462e7ed87d55";

const request = api.getScreeningInfo(referenceId);
request.then(result => {
    console.log(result)
})

```
