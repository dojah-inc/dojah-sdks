/*
DOJAH APIs

Testing WalletApiService

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

func Test_dojah_WalletApiService(t *testing.T) {

    configuration := dojah.NewConfiguration()
    
    apiKey := os.Getenv("API_KEY")
    configuration.Context = context.WithValue(configuration.Context, dojah.ContextAPIKeys, map[string]dojah.APIKey{
        "apikeyAuth": {Key: apiKey},
    })
    
    apiClient := dojah.NewAPIClient(configuration)

    t.Run("Test WalletApiService CreateWallet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.CreateWallet().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WalletApiService CreditSubwallet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.CreditSubwallet().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WalletApiService GetTransaction", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.GetTransaction().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WalletApiService GetWallet", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.GetWallet().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WalletApiService GetWallets", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.GetWallets().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WalletApiService TransferFunds", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WalletApi.TransferFunds().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
