import { Dojah } from "./";

const dojah = new Dojah({
  basePath: "https://sandbox.dojah.io",
  authorization: process.env.DOJAH_API_KEY,
  appId: process.env.DOJAH_APP_ID,
});

describe("gh kyc", () => {
  it("get drivers license", async () => {
    const response = await dojah.ghKyc.getDriversLicense({
      id: "V0000000",
      fullName: "John Doe",
      dateOfBirth: "1988-09-01"
    });
    expect(response).not.toBeNull();
    expect(response.status).toEqual(200);
    expect(response.data.entity?.id).not.toBeNull();
  });
  it("get passport", async () => {
    const response = await dojah.ghKyc.getPassport({
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
  it.skip("get nuban", async () => {
    const response = await dojah.general.getNuban({ bankCode: 123, accountNumber: 123 });
    expect(response).not.toBeNull();
    expect(response.status).toEqual(200);
    expect(response.data?.entity?.account_number).not.toBeNull();
  });
});
