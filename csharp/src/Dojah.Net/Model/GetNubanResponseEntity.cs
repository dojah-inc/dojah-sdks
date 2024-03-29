/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetNubanResponseEntity
    /// </summary>
    [DataContract(Name = "GetNubanResponse_entity")]
    public partial class GetNubanResponseEntity : IEquatable<GetNubanResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetNubanResponseEntity" /> class.
        /// </summary>
        /// <param name="accountCurrency">accountCurrency.</param>
        /// <param name="accountName">accountName.</param>
        /// <param name="accountNumber">accountNumber.</param>
        /// <param name="accountType">accountType.</param>
        /// <param name="address1">address1.</param>
        /// <param name="address2">address2.</param>
        /// <param name="city">city.</param>
        /// <param name="countryCode">countryCode.</param>
        /// <param name="countryOfBirth">countryOfBirth.</param>
        /// <param name="countryOfIssue">countryOfIssue.</param>
        /// <param name="dob">dob.</param>
        /// <param name="expiryDate">expiryDate.</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="identityNumber">identityNumber.</param>
        /// <param name="identityType">identityType.</param>
        /// <param name="lastName">lastName.</param>
        /// <param name="nationality">nationality.</param>
        /// <param name="otherNames">otherNames.</param>
        /// <param name="phone">phone.</param>
        /// <param name="postalCode">postalCode.</param>
        /// <param name="reference">reference.</param>
        /// <param name="stateCode">stateCode.</param>
        public GetNubanResponseEntity(string accountCurrency = default(string), string accountName = default(string), string accountNumber = default(string), string accountType = default(string), string address1 = default(string), string address2 = default(string), string city = default(string), string countryCode = default(string), string countryOfBirth = default(string), string countryOfIssue = default(string), string dob = default(string), string expiryDate = default(string), string firstName = default(string), string identityNumber = default(string), string identityType = default(string), string lastName = default(string), string nationality = default(string), string otherNames = default(string), string phone = default(string), string postalCode = default(string), string reference = default(string), string stateCode = default(string))
        {
            this.AccountCurrency = accountCurrency;
            this.AccountName = accountName;
            this.AccountNumber = accountNumber;
            this.AccountType = accountType;
            this.Address1 = address1;
            this.Address2 = address2;
            this.City = city;
            this.CountryCode = countryCode;
            this.CountryOfBirth = countryOfBirth;
            this.CountryOfIssue = countryOfIssue;
            this.Dob = dob;
            this.ExpiryDate = expiryDate;
            this.FirstName = firstName;
            this.IdentityNumber = identityNumber;
            this.IdentityType = identityType;
            this.LastName = lastName;
            this.Nationality = nationality;
            this.OtherNames = otherNames;
            this.Phone = phone;
            this.PostalCode = postalCode;
            this.Reference = reference;
            this.StateCode = stateCode;
        }

        /// <summary>
        /// Gets or Sets AccountCurrency
        /// </summary>
        [DataMember(Name = "account_currency", EmitDefaultValue = false)]
        public string AccountCurrency { get; set; }

        /// <summary>
        /// Gets or Sets AccountName
        /// </summary>
        [DataMember(Name = "account_name", EmitDefaultValue = false)]
        public string AccountName { get; set; }

        /// <summary>
        /// Gets or Sets AccountNumber
        /// </summary>
        [DataMember(Name = "account_number", EmitDefaultValue = false)]
        public string AccountNumber { get; set; }

        /// <summary>
        /// Gets or Sets AccountType
        /// </summary>
        [DataMember(Name = "account_type", EmitDefaultValue = false)]
        public string AccountType { get; set; }

        /// <summary>
        /// Gets or Sets Address1
        /// </summary>
        [DataMember(Name = "address_1", EmitDefaultValue = false)]
        public string Address1 { get; set; }

        /// <summary>
        /// Gets or Sets Address2
        /// </summary>
        [DataMember(Name = "address_2", EmitDefaultValue = false)]
        public string Address2 { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name = "city", EmitDefaultValue = false)]
        public string City { get; set; }

        /// <summary>
        /// Gets or Sets CountryCode
        /// </summary>
        [DataMember(Name = "country_code", EmitDefaultValue = false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Gets or Sets CountryOfBirth
        /// </summary>
        [DataMember(Name = "country_of_birth", EmitDefaultValue = false)]
        public string CountryOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets CountryOfIssue
        /// </summary>
        [DataMember(Name = "country_of_issue", EmitDefaultValue = false)]
        public string CountryOfIssue { get; set; }

        /// <summary>
        /// Gets or Sets Dob
        /// </summary>
        [DataMember(Name = "dob", EmitDefaultValue = false)]
        public string Dob { get; set; }

        /// <summary>
        /// Gets or Sets ExpiryDate
        /// </summary>
        [DataMember(Name = "expiry_date", EmitDefaultValue = false)]
        public string ExpiryDate { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets IdentityNumber
        /// </summary>
        [DataMember(Name = "identity_number", EmitDefaultValue = false)]
        public string IdentityNumber { get; set; }

        /// <summary>
        /// Gets or Sets IdentityType
        /// </summary>
        [DataMember(Name = "identity_type", EmitDefaultValue = false)]
        public string IdentityType { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "last_name", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets Nationality
        /// </summary>
        [DataMember(Name = "nationality", EmitDefaultValue = false)]
        public string Nationality { get; set; }

        /// <summary>
        /// Gets or Sets OtherNames
        /// </summary>
        [DataMember(Name = "other_names", EmitDefaultValue = false)]
        public string OtherNames { get; set; }

        /// <summary>
        /// Gets or Sets Phone
        /// </summary>
        [DataMember(Name = "phone", EmitDefaultValue = false)]
        public string Phone { get; set; }

        /// <summary>
        /// Gets or Sets PostalCode
        /// </summary>
        [DataMember(Name = "postal_code", EmitDefaultValue = false)]
        public string PostalCode { get; set; }

        /// <summary>
        /// Gets or Sets Reference
        /// </summary>
        [DataMember(Name = "reference", EmitDefaultValue = false)]
        public string Reference { get; set; }

        /// <summary>
        /// Gets or Sets StateCode
        /// </summary>
        [DataMember(Name = "state_code", EmitDefaultValue = false)]
        public string StateCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetNubanResponseEntity {\n");
            sb.Append("  AccountCurrency: ").Append(AccountCurrency).Append("\n");
            sb.Append("  AccountName: ").Append(AccountName).Append("\n");
            sb.Append("  AccountNumber: ").Append(AccountNumber).Append("\n");
            sb.Append("  AccountType: ").Append(AccountType).Append("\n");
            sb.Append("  Address1: ").Append(Address1).Append("\n");
            sb.Append("  Address2: ").Append(Address2).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  CountryOfBirth: ").Append(CountryOfBirth).Append("\n");
            sb.Append("  CountryOfIssue: ").Append(CountryOfIssue).Append("\n");
            sb.Append("  Dob: ").Append(Dob).Append("\n");
            sb.Append("  ExpiryDate: ").Append(ExpiryDate).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  IdentityNumber: ").Append(IdentityNumber).Append("\n");
            sb.Append("  IdentityType: ").Append(IdentityType).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Nationality: ").Append(Nationality).Append("\n");
            sb.Append("  OtherNames: ").Append(OtherNames).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  Reference: ").Append(Reference).Append("\n");
            sb.Append("  StateCode: ").Append(StateCode).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetNubanResponseEntity);
        }

        /// <summary>
        /// Returns true if GetNubanResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetNubanResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetNubanResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AccountCurrency == input.AccountCurrency ||
                    (this.AccountCurrency != null &&
                    this.AccountCurrency.Equals(input.AccountCurrency))
                ) && 
                (
                    this.AccountName == input.AccountName ||
                    (this.AccountName != null &&
                    this.AccountName.Equals(input.AccountName))
                ) && 
                (
                    this.AccountNumber == input.AccountNumber ||
                    (this.AccountNumber != null &&
                    this.AccountNumber.Equals(input.AccountNumber))
                ) && 
                (
                    this.AccountType == input.AccountType ||
                    (this.AccountType != null &&
                    this.AccountType.Equals(input.AccountType))
                ) && 
                (
                    this.Address1 == input.Address1 ||
                    (this.Address1 != null &&
                    this.Address1.Equals(input.Address1))
                ) && 
                (
                    this.Address2 == input.Address2 ||
                    (this.Address2 != null &&
                    this.Address2.Equals(input.Address2))
                ) && 
                (
                    this.City == input.City ||
                    (this.City != null &&
                    this.City.Equals(input.City))
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.CountryOfBirth == input.CountryOfBirth ||
                    (this.CountryOfBirth != null &&
                    this.CountryOfBirth.Equals(input.CountryOfBirth))
                ) && 
                (
                    this.CountryOfIssue == input.CountryOfIssue ||
                    (this.CountryOfIssue != null &&
                    this.CountryOfIssue.Equals(input.CountryOfIssue))
                ) && 
                (
                    this.Dob == input.Dob ||
                    (this.Dob != null &&
                    this.Dob.Equals(input.Dob))
                ) && 
                (
                    this.ExpiryDate == input.ExpiryDate ||
                    (this.ExpiryDate != null &&
                    this.ExpiryDate.Equals(input.ExpiryDate))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.IdentityNumber == input.IdentityNumber ||
                    (this.IdentityNumber != null &&
                    this.IdentityNumber.Equals(input.IdentityNumber))
                ) && 
                (
                    this.IdentityType == input.IdentityType ||
                    (this.IdentityType != null &&
                    this.IdentityType.Equals(input.IdentityType))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.Nationality == input.Nationality ||
                    (this.Nationality != null &&
                    this.Nationality.Equals(input.Nationality))
                ) && 
                (
                    this.OtherNames == input.OtherNames ||
                    (this.OtherNames != null &&
                    this.OtherNames.Equals(input.OtherNames))
                ) && 
                (
                    this.Phone == input.Phone ||
                    (this.Phone != null &&
                    this.Phone.Equals(input.Phone))
                ) && 
                (
                    this.PostalCode == input.PostalCode ||
                    (this.PostalCode != null &&
                    this.PostalCode.Equals(input.PostalCode))
                ) && 
                (
                    this.Reference == input.Reference ||
                    (this.Reference != null &&
                    this.Reference.Equals(input.Reference))
                ) && 
                (
                    this.StateCode == input.StateCode ||
                    (this.StateCode != null &&
                    this.StateCode.Equals(input.StateCode))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AccountCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.AccountCurrency.GetHashCode();
                }
                if (this.AccountName != null)
                {
                    hashCode = (hashCode * 59) + this.AccountName.GetHashCode();
                }
                if (this.AccountNumber != null)
                {
                    hashCode = (hashCode * 59) + this.AccountNumber.GetHashCode();
                }
                if (this.AccountType != null)
                {
                    hashCode = (hashCode * 59) + this.AccountType.GetHashCode();
                }
                if (this.Address1 != null)
                {
                    hashCode = (hashCode * 59) + this.Address1.GetHashCode();
                }
                if (this.Address2 != null)
                {
                    hashCode = (hashCode * 59) + this.Address2.GetHashCode();
                }
                if (this.City != null)
                {
                    hashCode = (hashCode * 59) + this.City.GetHashCode();
                }
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
                }
                if (this.CountryOfBirth != null)
                {
                    hashCode = (hashCode * 59) + this.CountryOfBirth.GetHashCode();
                }
                if (this.CountryOfIssue != null)
                {
                    hashCode = (hashCode * 59) + this.CountryOfIssue.GetHashCode();
                }
                if (this.Dob != null)
                {
                    hashCode = (hashCode * 59) + this.Dob.GetHashCode();
                }
                if (this.ExpiryDate != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiryDate.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.IdentityNumber != null)
                {
                    hashCode = (hashCode * 59) + this.IdentityNumber.GetHashCode();
                }
                if (this.IdentityType != null)
                {
                    hashCode = (hashCode * 59) + this.IdentityType.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.Nationality != null)
                {
                    hashCode = (hashCode * 59) + this.Nationality.GetHashCode();
                }
                if (this.OtherNames != null)
                {
                    hashCode = (hashCode * 59) + this.OtherNames.GetHashCode();
                }
                if (this.Phone != null)
                {
                    hashCode = (hashCode * 59) + this.Phone.GetHashCode();
                }
                if (this.PostalCode != null)
                {
                    hashCode = (hashCode * 59) + this.PostalCode.GetHashCode();
                }
                if (this.Reference != null)
                {
                    hashCode = (hashCode * 59) + this.Reference.GetHashCode();
                }
                if (this.StateCode != null)
                {
                    hashCode = (hashCode * 59) + this.StateCode.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
