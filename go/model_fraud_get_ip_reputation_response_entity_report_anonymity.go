/*
DOJAH Publilc APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"encoding/json"
)

// FraudGetIpReputationResponseEntityReportAnonymity struct for FraudGetIpReputationResponseEntityReportAnonymity
type FraudGetIpReputationResponseEntityReportAnonymity struct {
	IsProxy *bool `json:"is_proxy,omitempty"`
	IsWebproxy *bool `json:"is_webproxy,omitempty"`
	IsVpn *bool `json:"is_vpn,omitempty"`
	IsHosting *bool `json:"is_hosting,omitempty"`
	IsTor *bool `json:"is_tor,omitempty"`
}

// NewFraudGetIpReputationResponseEntityReportAnonymity instantiates a new FraudGetIpReputationResponseEntityReportAnonymity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFraudGetIpReputationResponseEntityReportAnonymity() *FraudGetIpReputationResponseEntityReportAnonymity {
	this := FraudGetIpReputationResponseEntityReportAnonymity{}
	return &this
}

// NewFraudGetIpReputationResponseEntityReportAnonymityWithDefaults instantiates a new FraudGetIpReputationResponseEntityReportAnonymity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFraudGetIpReputationResponseEntityReportAnonymityWithDefaults() *FraudGetIpReputationResponseEntityReportAnonymity {
	this := FraudGetIpReputationResponseEntityReportAnonymity{}
	return &this
}

// GetIsProxy returns the IsProxy field value if set, zero value otherwise.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsProxy() bool {
	if o == nil || isNil(o.IsProxy) {
		var ret bool
		return ret
	}
	return *o.IsProxy
}

// GetIsProxyOk returns a tuple with the IsProxy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsProxyOk() (*bool, bool) {
	if o == nil || isNil(o.IsProxy) {
    return nil, false
	}
	return o.IsProxy, true
}

// HasIsProxy returns a boolean if a field has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) HasIsProxy() bool {
	if o != nil && !isNil(o.IsProxy) {
		return true
	}

	return false
}

// SetIsProxy gets a reference to the given bool and assigns it to the IsProxy field.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) SetIsProxy(v bool) {
	o.IsProxy = &v
}

// GetIsWebproxy returns the IsWebproxy field value if set, zero value otherwise.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsWebproxy() bool {
	if o == nil || isNil(o.IsWebproxy) {
		var ret bool
		return ret
	}
	return *o.IsWebproxy
}

// GetIsWebproxyOk returns a tuple with the IsWebproxy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsWebproxyOk() (*bool, bool) {
	if o == nil || isNil(o.IsWebproxy) {
    return nil, false
	}
	return o.IsWebproxy, true
}

// HasIsWebproxy returns a boolean if a field has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) HasIsWebproxy() bool {
	if o != nil && !isNil(o.IsWebproxy) {
		return true
	}

	return false
}

// SetIsWebproxy gets a reference to the given bool and assigns it to the IsWebproxy field.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) SetIsWebproxy(v bool) {
	o.IsWebproxy = &v
}

// GetIsVpn returns the IsVpn field value if set, zero value otherwise.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsVpn() bool {
	if o == nil || isNil(o.IsVpn) {
		var ret bool
		return ret
	}
	return *o.IsVpn
}

// GetIsVpnOk returns a tuple with the IsVpn field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsVpnOk() (*bool, bool) {
	if o == nil || isNil(o.IsVpn) {
    return nil, false
	}
	return o.IsVpn, true
}

// HasIsVpn returns a boolean if a field has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) HasIsVpn() bool {
	if o != nil && !isNil(o.IsVpn) {
		return true
	}

	return false
}

// SetIsVpn gets a reference to the given bool and assigns it to the IsVpn field.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) SetIsVpn(v bool) {
	o.IsVpn = &v
}

// GetIsHosting returns the IsHosting field value if set, zero value otherwise.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsHosting() bool {
	if o == nil || isNil(o.IsHosting) {
		var ret bool
		return ret
	}
	return *o.IsHosting
}

// GetIsHostingOk returns a tuple with the IsHosting field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsHostingOk() (*bool, bool) {
	if o == nil || isNil(o.IsHosting) {
    return nil, false
	}
	return o.IsHosting, true
}

// HasIsHosting returns a boolean if a field has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) HasIsHosting() bool {
	if o != nil && !isNil(o.IsHosting) {
		return true
	}

	return false
}

// SetIsHosting gets a reference to the given bool and assigns it to the IsHosting field.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) SetIsHosting(v bool) {
	o.IsHosting = &v
}

// GetIsTor returns the IsTor field value if set, zero value otherwise.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsTor() bool {
	if o == nil || isNil(o.IsTor) {
		var ret bool
		return ret
	}
	return *o.IsTor
}

// GetIsTorOk returns a tuple with the IsTor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) GetIsTorOk() (*bool, bool) {
	if o == nil || isNil(o.IsTor) {
    return nil, false
	}
	return o.IsTor, true
}

// HasIsTor returns a boolean if a field has been set.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) HasIsTor() bool {
	if o != nil && !isNil(o.IsTor) {
		return true
	}

	return false
}

// SetIsTor gets a reference to the given bool and assigns it to the IsTor field.
func (o *FraudGetIpReputationResponseEntityReportAnonymity) SetIsTor(v bool) {
	o.IsTor = &v
}

func (o FraudGetIpReputationResponseEntityReportAnonymity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.IsProxy) {
		toSerialize["is_proxy"] = o.IsProxy
	}
	if !isNil(o.IsWebproxy) {
		toSerialize["is_webproxy"] = o.IsWebproxy
	}
	if !isNil(o.IsVpn) {
		toSerialize["is_vpn"] = o.IsVpn
	}
	if !isNil(o.IsHosting) {
		toSerialize["is_hosting"] = o.IsHosting
	}
	if !isNil(o.IsTor) {
		toSerialize["is_tor"] = o.IsTor
	}
	return json.Marshal(toSerialize)
}

type NullableFraudGetIpReputationResponseEntityReportAnonymity struct {
	value *FraudGetIpReputationResponseEntityReportAnonymity
	isSet bool
}

func (v NullableFraudGetIpReputationResponseEntityReportAnonymity) Get() *FraudGetIpReputationResponseEntityReportAnonymity {
	return v.value
}

func (v *NullableFraudGetIpReputationResponseEntityReportAnonymity) Set(val *FraudGetIpReputationResponseEntityReportAnonymity) {
	v.value = val
	v.isSet = true
}

func (v NullableFraudGetIpReputationResponseEntityReportAnonymity) IsSet() bool {
	return v.isSet
}

func (v *NullableFraudGetIpReputationResponseEntityReportAnonymity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFraudGetIpReputationResponseEntityReportAnonymity(val *FraudGetIpReputationResponseEntityReportAnonymity) *NullableFraudGetIpReputationResponseEntityReportAnonymity {
	return &NullableFraudGetIpReputationResponseEntityReportAnonymity{value: val, isSet: true}
}

func (v NullableFraudGetIpReputationResponseEntityReportAnonymity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFraudGetIpReputationResponseEntityReportAnonymity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


