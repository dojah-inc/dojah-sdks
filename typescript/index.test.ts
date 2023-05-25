import { Configuration, GhKycApi, KycApi } from "./";
const configuration = new Configuration({
  apiKey: (name) => {
    if (name === "Authorization") return process.env.DOJAH_API_KEY;
    if (name === "AppId") return process.env.DOJAH_APP_ID;
    throw Error();
  },
  basePath: "https://sandbox.dojah.io",
});

describe("gh kyc", () => {
  const api = new GhKycApi(configuration);
  it("get drivers license", async () => {
    const response = await api.getDriversLicense({
      id: "V0000000",
      fullName: "John Doe",
      dateOfBirth: "1988-09-01"
    });
    expect(response).not.toBeNull();
    expect(response.status).toEqual(200);
    expect(response.data.entity?.id).not.toBeNull();
  });
  it("get passport", async () => {
    const response = await api.getPassport({
      id: "V0000000",
      firstName: "John",
      lastName: "Doe",
      middleName: "",
      dateOfBirth: "1988-09-01"
    });
    expect(response).not.toBeNull();
    expect(response.status).toEqual(200);
  });
});

describe("kyc", () => {
  const api = new KycApi(configuration);
  it("get nuban", async () => {
    const response = await api.getNuban({ bankCode: 123, accountNumber: 123 });
    expect(response).not.toBeNull();
    expect(response.status).toEqual(200);
    expect(response.data?.entity?.account_number).not.toBeNull();
  });
});
