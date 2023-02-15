/*
DOJAH APIs

Testing GeneralApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package dojah

import (
    "os"
    "context"
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    dojah "github.com/konfig-dev/dojah-sdks/go"
)

func Test_dojah_GeneralApiService(t *testing.T) {

    configuration := dojah.NewConfiguration()
    
    apiKey := os.Getenv("API_KEY")
    configuration.Context = context.WithValue(configuration.Context, dojah.ContextAPIKeys, map[string]dojah.APIKey{
        "apikeyAuth": {Key: apiKey},
    })
    
    apiClient := dojah.NewAPIClient(configuration)

    t.Run("Test GeneralApiService GetBanks", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.GetBanks().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService GetBin", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.GetBin().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService GetDataPlans", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.GetDataPlans().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService GetNuban", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.GetNuban().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService GetWalletBalance", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.GetWalletBalance().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService PurchaseAirtime", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.PurchaseAirtime().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test GeneralApiService PurchaseData", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.GeneralApi.PurchaseData().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
