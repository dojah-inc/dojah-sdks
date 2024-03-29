/*
DOJAH Publilc APIs

Testing WebHooksApiService

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

func Test_dojah_WebHooksApiService(t *testing.T) {

    configuration := dojah.NewConfiguration()
    
    apiKey := os.Getenv("API_KEY")
    configuration.Context = context.WithValue(configuration.Context, dojah.ContextAPIKeys, map[string]dojah.APIKey{
        "apikeyAuth": {Key: apiKey},
    })
    
    apiClient := dojah.NewAPIClient(configuration)

    t.Run("Test WebHooksApiService DeleteWebhook", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WebHooksApi.DeleteWebhook().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WebHooksApiService GetWebhooks", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WebHooksApi.GetWebhooks().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WebHooksApiService NotifyWebhook", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WebHooksApi.NotifyWebhook().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test WebHooksApiService SubscribeService", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.WebHooksApi.SubscribeService().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
