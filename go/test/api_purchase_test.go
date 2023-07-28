/*
DOJAH Publilc APIs

Testing PurchaseApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package dojah

import (
    "os"
    "context"
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    dojah "github.com/dojah-inc/dojah-sdks/go"
)

func Test_dojah_PurchaseApiService(t *testing.T) {

    configuration := dojah.NewConfiguration()
    
    apiKey := os.Getenv("API_KEY")
    configuration.Context = context.WithValue(configuration.Context, dojah.ContextAPIKeys, map[string]dojah.APIKey{
        "apikeyAuth": {Key: apiKey},
    })
    
    apiClient := dojah.NewAPIClient(configuration)

    t.Run("Test PurchaseApiService SendAirtime", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.PurchaseApi.SendAirtime().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}